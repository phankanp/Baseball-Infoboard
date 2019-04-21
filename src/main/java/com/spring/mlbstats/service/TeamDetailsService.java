package com.spring.mlbstats.service;

import com.spring.mlbstats.model.DailySchedule;
import com.spring.mlbstats.model.Stadium;
import com.spring.mlbstats.model.TeamDetail.*;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TeamDetailsService {

    public RestTemplate generateRestTemplate() {
        RestTemplate restTemplate = new RestTemplate();

        return restTemplate;
    }

    public TeamRow getTeam(Long teamId) {
        String getTeamUrl  = "http://lookup-service-prod.mlb.com/json/named.team_all_season.bam?sport_code=" +
                "'mlb'&all_star_sw='N'&sort_order=name_asc&season='2019'";

        TeamBodyWrapper teamBodyWrapper = generateRestTemplate().getForObject(getTeamUrl, TeamBodyWrapper.class);

        TeamRow teamRow = new TeamRow();

        for (TeamRow tr : teamBodyWrapper.getTeamAllSeason().getQueryResults().getRow()) {
            if (tr.getMlbOrgId().equals(teamId.toString())) {
                teamRow = tr;
            }
        }

        return teamRow;
    }

    public List<TeamRosterRow> getTeamRoster(Long teamId) {
        String getRosterUrl = "http://lookup-service-prod.mlb.com/json/named.roster_40.bam?team_id=" + teamId;

        // Get team 40 man roster
        TeamRosterWrapper teamRosterWrapper = generateRestTemplate().getForObject(getRosterUrl, TeamRosterWrapper.class);

        List<TeamRosterRow> roster = teamRosterWrapper.getRoster40().getQueryResults().getRow();

        return roster;
    }

    public  List<DailySchedule> getUpcomingTeamSchedule(String teamCode, HttpHeaders httpHeaders) {
        String getSchedule = "https://api.fantasydata.net/v3/mlb/scores/JSON/Games/2019";

        String getStadiums = "https://api.fantasydata.net/v3/mlb/scores/json/Stadiums";

        HttpHeaders headers = httpHeaders;

        HttpEntity<?> entity = new HttpEntity<>(headers);

        // Get teams next 12 regular season games
        ResponseEntity<List<DailySchedule>> teamScheduleResponse = generateRestTemplate().exchange(
                getSchedule,
                HttpMethod.GET,
                entity,
                new ParameterizedTypeReference<List<DailySchedule>>(){}
        );

        List<DailySchedule> scheduleResponseBody = teamScheduleResponse.getBody();

        List<DailySchedule> nextTwelveGames = new ArrayList<>();

        int gameCount = 0;

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        DateFormat timeDF = new SimpleDateFormat("HH:mm");
        DateFormat outputTimeDF = new SimpleDateFormat("hh:mm");

        Date time = null;

        for (DailySchedule ds : scheduleResponseBody) {
            if (gameCount >= 12) {
                break;
            } else if (ds.getDay().compareTo(dateFormat.format(date)) < 0) {
                continue;
            } else if (teamCode.equals(ds.getAwayTeam()) || teamCode.equals(ds.getHomeTeam())) {
                try {
                    time = timeDF.parse(ds.getDateTime().substring(11, 16));
                    ds.setStartTime(outputTimeDF.format(time));
                } catch(ParseException pe){
                    pe.printStackTrace();
                }
                nextTwelveGames.add(ds);
                gameCount++;
            }
        }

        // Get list of stadiums
        ResponseEntity<List<Stadium>> stadiumsResponse = generateRestTemplate().exchange(
                getStadiums,
                HttpMethod.GET,
                entity,
                new ParameterizedTypeReference<List<Stadium>>(){}
        );

        List<Stadium> stadiumsResponseBody = stadiumsResponse.getBody();

        for (DailySchedule ds : nextTwelveGames) {
            for (Stadium st : stadiumsResponseBody) {
                if (ds.getStadiumID() == st.getStadiumID()) {
                    ds.setStadiumName(st.getName());
                }
            }
        }

        return nextTwelveGames;
    }

    public TeamStat getTeamStats(String teamCode, HttpHeaders httpHeaders) {
        HttpHeaders headers = httpHeaders;

        HttpEntity<?> entity = new HttpEntity<>(headers);

        String getTeamStats = "https://api.fantasydata.net/v3/mlb/scores/JSON/TeamSeasonStats/2018";

        // Get stats by team
        ResponseEntity<List<TeamStat>> teamStatsResponse = generateRestTemplate().exchange(
                getTeamStats,
                HttpMethod.GET,
                entity,
                new ParameterizedTypeReference<List<TeamStat>>(){}
        );

        List<TeamStat> teamStatsResponseBody = teamStatsResponse.getBody();

        TeamStat teamStats = new TeamStat();

        for (TeamStat ts : teamStatsResponseBody) {
            if (ts.getTeam().equals(teamCode)) {
                teamStats = ts;
            }
        }

        return teamStats;
    }
}

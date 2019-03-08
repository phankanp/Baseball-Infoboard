package com.spring.mlbstats;

import com.spring.mlbstats.model.DailySchedule;
import com.spring.mlbstats.model.News;
import com.spring.mlbstats.model.Stadium;
import com.spring.mlbstats.model.Standing;
import com.spring.mlbstats.model.TeamDetail.*;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import javax.persistence.criteria.CriteriaBuilder;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class DashboardController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/dailyschedule")
    public ResponseEntity<?> dailySchedule(){

        RestTemplate restTemplate = new RestTemplate();

        DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
        Date date = new Date();

        String url = "https://api.fantasydata.net/v3/mlb/scores/JSON/GamesByDate/" + dateFormat.format(date);

        HttpHeaders headers = new HttpHeaders();

        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Ocp-Apim-Subscription-Key", "b3572283c9474a0386ead523d82c99f8");

        HttpEntity<?> entity = new HttpEntity<>(headers);


        ResponseEntity<List<DailySchedule>> responseEntity = restTemplate.exchange(
                url,
                HttpMethod.GET,
                entity,
                new ParameterizedTypeReference<List<DailySchedule>>(){}
        );

        List<DailySchedule> dailySchedule = responseEntity.getBody();

        return new ResponseEntity<>(dailySchedule, HttpStatus.OK);
    }

    @GetMapping("/stadiums")
    public ResponseEntity<?> stadiums(){

        RestTemplate restTemplate = new RestTemplate();

        String url = "https://api.fantasydata.net/v3/mlb/scores/json/Stadiums";

        HttpHeaders headers = new HttpHeaders();

        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Ocp-Apim-Subscription-Key", "b3572283c9474a0386ead523d82c99f8");

        HttpEntity<?> entity = new HttpEntity<>(headers);


        ResponseEntity<List<Stadium>> responseEntity = restTemplate.exchange(
                url,
                HttpMethod.GET,
                entity,
                new ParameterizedTypeReference<List<Stadium>>(){}
        );

        List<Stadium> stadiums = responseEntity.getBody();

        return new ResponseEntity<>(stadiums, HttpStatus.OK);
    }

    @GetMapping("/standings")
    public ResponseEntity<?> standings(){

        RestTemplate restTemplate = new RestTemplate();

        String url = "https://api.fantasydata.net/v3/mlb/scores/JSON/Standings/2018";

        HttpHeaders headers = new HttpHeaders();

        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Ocp-Apim-Subscription-Key", "b3572283c9474a0386ead523d82c99f8");

        HttpEntity<?> entity = new HttpEntity<>(headers);


        ResponseEntity<List<Standing>> responseEntity = restTemplate.exchange(
                url,
                HttpMethod.GET,
                entity,
                new ParameterizedTypeReference<List<Standing>>(){}
        );

        List<Standing> standings = responseEntity.getBody();

        return new ResponseEntity<>(standings, HttpStatus.OK);
    }

    @GetMapping("/news")
    public ResponseEntity<?> news(){

        RestTemplate restTemplate = new RestTemplate();

        String url = "https://api.fantasydata.net/v3/mlb/scores/JSON/News";

        HttpHeaders headers = new HttpHeaders();

        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Ocp-Apim-Subscription-Key", "b3572283c9474a0386ead523d82c99f8");

        HttpEntity<?> entity = new HttpEntity<>(headers);


        ResponseEntity<List<News>> responseEntity = restTemplate.exchange(
                url,
                HttpMethod.GET,
                entity,
                new ParameterizedTypeReference<List<News>>(){}
        );

        List<News> news = responseEntity.getBody();

        return new ResponseEntity<>(news, HttpStatus.OK);
    }

    @GetMapping("/team/{teamCode}/{teamId}")
    public String teamDetails(@PathVariable String teamCode, @PathVariable Long teamId, Model model){
        RestTemplate restTemplate = new RestTemplate();

        String url  = "http://lookup-service-prod.mlb.com/json/named.team_all_season.bam?sport_code=" +
                "'mlb'&all_star_sw='N'&sort_order=name_asc&season='2018'";

        String getRosterUrl = "http://lookup-service-prod.mlb.com/json/named.roster_40.bam?team_id=" + teamId;

        String getSchedule = "https://api.fantasydata.net/v3/mlb/scores/JSON/Games/2019";

        String getStadiums = "https://api.fantasydata.net/v3/mlb/scores/json/Stadiums";

        String getTeamStats = "https://api.fantasydata.net/v3/mlb/scores/JSON/TeamSeasonStats/2018";

        HttpHeaders headers = new HttpHeaders();

        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Ocp-Apim-Subscription-Key", "b3572283c9474a0386ead523d82c99f8");

        HttpEntity<?> entity = new HttpEntity<>(headers);

        // Gets single team info
        TeamBodyWrapper teamBodyWrapper = restTemplate.getForObject(url, TeamBodyWrapper.class);

        TeamRow teamRow = new TeamRow();

        for (TeamRow tr : teamBodyWrapper.getTeamAllSeason().getQueryResults().getRow()) {
            if (tr.getMlbOrgId().equals(teamId.toString())) {
               teamRow = tr;
            }
        }

        // Get team 40 man roster
        TeamRosterWrapper teamRosterWrapper = restTemplate.getForObject(getRosterUrl, TeamRosterWrapper.class);

        List<TeamRosterRow> roster = teamRosterWrapper.getRoster40().getQueryResults().getRow();

        // Get teams next 12 regular season games
        ResponseEntity<List<DailySchedule>> teamScheduleResponse = restTemplate.exchange(
                getSchedule,
                HttpMethod.GET,
                entity,
                new ParameterizedTypeReference<List<DailySchedule>>(){}
        );

        List<DailySchedule> scheduleResponseBody = teamScheduleResponse.getBody();

        List<DailySchedule> nextTwelveGames = new ArrayList<>();

        int gameCount = 0;

        for (DailySchedule ds : scheduleResponseBody) {
            if (gameCount >= 12) {
                break;
            } else if (teamCode.equals(ds.getAwayTeam()) || teamCode.equals(ds.getHomeTeam())) {
                nextTwelveGames.add(ds);
                gameCount++;
            }
        }

        // Get list of stadiums
        ResponseEntity<List<Stadium>> stadiumsResponse = restTemplate.exchange(
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

       // Get stats by team
        ResponseEntity<List<TeamStat>> teamStatsResponse = restTemplate.exchange(
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

        model.addAttribute("team", teamRow);
        model.addAttribute("roster", roster);
        model.addAttribute("nextTwelveGames", nextTwelveGames);
        model.addAttribute("teamStats", teamStats);

        return "team_page";
    }
}

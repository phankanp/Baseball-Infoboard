package com.spring.mlbstats;

import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.spring.mlbstats.model.DailySchedule;
import com.spring.mlbstats.model.LeagueLeaders.HittingLeaders.LeaderHittingRow;
import com.spring.mlbstats.model.LeagueLeaders.HittingLeaders.LeaderHittingWrapper;
import com.spring.mlbstats.model.LeagueLeaders.PitchingLeaders.LeaderPitchingRow;
import com.spring.mlbstats.model.LeagueLeaders.PitchingLeaders.LeaderPitchingWrapper;
import com.spring.mlbstats.model.News;
import com.spring.mlbstats.model.PlayerDetail.CareerHittingStats.CareerHittingStatsRow;
import com.spring.mlbstats.model.PlayerDetail.CareerHittingStats.CareerHittingStatsWrapper;
import com.spring.mlbstats.model.PlayerDetail.CareerPitchingStats.CareerPitchingStats;
import com.spring.mlbstats.model.PlayerDetail.CareerPitchingStats.CareerPitchingStatsRow;
import com.spring.mlbstats.model.PlayerDetail.CareerPitchingStats.CareerPitchingStatsWrapper;
import com.spring.mlbstats.model.PlayerDetail.PlayerRow;
import com.spring.mlbstats.model.PlayerDetail.PlayerWrapper;
import com.spring.mlbstats.model.PlayerDetail.ProjectedHittingStats.ProjectedHittingStatsRow;
import com.spring.mlbstats.model.PlayerDetail.ProjectedHittingStats.ProjectedHittingStatsWrapper;
import com.spring.mlbstats.model.PlayerDetail.ProjectedPitchingStats.ProjectedPitchingStatsRow;
import com.spring.mlbstats.model.PlayerDetail.ProjectedPitchingStats.ProjectedPitchingStatsWrapper;
import com.spring.mlbstats.model.PlayerDetail.SeasonHittingStats.SeasonHittingStatsRow;
import com.spring.mlbstats.model.PlayerDetail.SeasonHittingStats.SeasonHittingStatsWrapper;
import com.spring.mlbstats.model.PlayerDetail.SeasonPitchingStats.SeasonPitchingStatsRow;
import com.spring.mlbstats.model.PlayerDetail.SeasonPitchingStats.SeasonPitchingStatsWrapper;
import com.spring.mlbstats.model.PlayerSearch.PlayerSearchWrapper;
import com.spring.mlbstats.model.PlayerSearch.QueryResults;
import com.spring.mlbstats.model.PlayerSearch.Row;
import com.spring.mlbstats.model.Stadium;
import com.spring.mlbstats.model.Standing;
import com.spring.mlbstats.model.TeamDetail.*;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;

@Controller
public class DashboardController {

    public HttpHeaders generateHeaders(){
        HttpHeaders headers = new HttpHeaders();

        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Ocp-Apim-Subscription-Key", "b3572283c9474a0386ead523d82c99f8");

        return headers;
    }

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

        HttpHeaders headers = generateHeaders();

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

        HttpHeaders headers = generateHeaders();

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

        HttpHeaders headers = generateHeaders();

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

        HttpHeaders headers = generateHeaders();

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

        String getTeamUrl  = "http://lookup-service-prod.mlb.com/json/named.team_all_season.bam?sport_code=" +
                "'mlb'&all_star_sw='N'&sort_order=name_asc&season='2018'";

        String getRosterUrl = "http://lookup-service-prod.mlb.com/json/named.roster_40.bam?team_id=" + teamId;

        String getSchedule = "https://api.fantasydata.net/v3/mlb/scores/JSON/Games/2019";

        String getStadiums = "https://api.fantasydata.net/v3/mlb/scores/json/Stadiums";

        String getTeamStats = "https://api.fantasydata.net/v3/mlb/scores/JSON/TeamSeasonStats/2018";

        HttpHeaders headers = generateHeaders();

        HttpEntity<?> entity = new HttpEntity<>(headers);

        // Gets single team info
        TeamBodyWrapper teamBodyWrapper = restTemplate.getForObject(getTeamUrl, TeamBodyWrapper.class);

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

    @GetMapping("/player/hitter/{playerId}")
    public String hitterDetails(@PathVariable Long playerId, Model model){

        RestTemplate restTemplate = new RestTemplate();

        String getPlayer  = "http://lookup-service-prod.mlb.com/json/named.player_info.bam?sport_code='mlb'&player_id=" + playerId;
        String getProjectedHittingStats = "http://lookup-service-prod.mlb.com/json/named.proj_pecota_batting.bam?season='2019'&player_id=" +playerId;
        String getSeasonHittingStats = "http://lookup-service-prod.mlb.com/json/named.sport_hitting_tm.bam?league_list_id='mlb'&game_type='R'&season='2018'&player_id=" +playerId;
        String getCareerHittingStats = "http://lookup-service-prod.mlb.com/json/named.sport_career_hitting.bam?league_list_id='mlb'&game_type='R'&player_id=" +playerId;

        PlayerWrapper player = restTemplate.getForObject(getPlayer, PlayerWrapper.class);
        ProjectedHittingStatsWrapper projected = restTemplate.getForObject(getProjectedHittingStats, ProjectedHittingStatsWrapper.class);
        SeasonHittingStatsWrapper season = restTemplate.getForObject(getSeasonHittingStats, SeasonHittingStatsWrapper.class);
        CareerHittingStatsWrapper career = restTemplate.getForObject(getCareerHittingStats, CareerHittingStatsWrapper.class);

        PlayerRow playerDetail  = player.getPlayerInfo().getQueryResults().getRow();
        ProjectedHittingStatsRow projectedHittingStatsRow = projected.getProjPecotaBatting().getQueryResults().getRow();
        List<SeasonHittingStatsRow> seasonHittingStatsRow = season.getSeasonHittingStats().getQueryResults().getRow();
        CareerHittingStatsRow careerHittingStatsRow = career.getCareerHittingStats().getQueryResults().getRow();

        ProjectedHittingStatsRow projectedHittingStats = new ProjectedHittingStatsRow();

        if (projectedHittingStatsRow == null) {
            projectedHittingStats.setG("0");
            projectedHittingStats.setAb("0");
            projectedHittingStats.setH("0");
            projectedHittingStats.setS("0");
            projectedHittingStats.setD("0");
            projectedHittingStats.setT("0");
            projectedHittingStats.setHr("0");
            projectedHittingStats.setRbi("0");
            projectedHittingStats.setAvg("0");
            projectedHittingStats.setSlg("0");
            projectedHittingStats.setOps("0");
            projectedHittingStats.setObp("0");
            projectedHittingStats.setSb("0");
            projectedHittingStats.setCs("0");
            projectedHittingStats.setSo("0");
            projectedHittingStats.setBb("0");
        } else {
            projectedHittingStats = projectedHittingStatsRow;
        }

        SeasonHittingStatsRow seasonHittingStats = new SeasonHittingStatsRow();

        try{
            if (seasonHittingStatsRow.size() > 1) {
                seasonHittingStats = seasonHittingStatsRow.get(seasonHittingStatsRow.size() - 1);
            } else if (seasonHittingStatsRow.size() == 1){
                seasonHittingStats = seasonHittingStatsRow.get(0);
            }
        } catch (NullPointerException ex) {
            seasonHittingStats.setG("0");
            seasonHittingStats.setAb("0");
            seasonHittingStats.setH("0");
            seasonHittingStats.setSingles(0);
            seasonHittingStats.setD("0");
            seasonHittingStats.setT("0");
            seasonHittingStats.setHr("0");
            seasonHittingStats.setRbi("0");
            seasonHittingStats.setAvg("0");
            seasonHittingStats.setSlg("0");
            seasonHittingStats.setOps("0");
            seasonHittingStats.setObp("0");
            seasonHittingStats.setSb("0");
            seasonHittingStats.setCs("0");
            seasonHittingStats.setSo("0");
            seasonHittingStats.setBb("0");
            seasonHittingStats.setXbh("0");
        }

        CareerHittingStatsRow careerHittingStats = new CareerHittingStatsRow();

        if (careerHittingStatsRow == null) {
            careerHittingStats.setG("0");
            careerHittingStats.setAb("0");
            careerHittingStats.setH("0");
            careerHittingStats.setSingles(0);
            careerHittingStats.setD("0");
            careerHittingStats.setT("0");
            careerHittingStats.setHr("0");
            careerHittingStats.setRbi("0");
            careerHittingStats.setAvg("0");
            careerHittingStats.setSlg("0");
            careerHittingStats.setOps("0");
            careerHittingStats.setObp("0");
            careerHittingStats.setSb("0");
            careerHittingStats.setCs("0");
            careerHittingStats.setSo("0");
            careerHittingStats.setBb("0");
            careerHittingStats.setXbh("0");
        } else {
            careerHittingStats = careerHittingStatsRow;
        }

        model.addAttribute("player", playerDetail);
        model.addAttribute("projectedHittingStats", projectedHittingStats);
        model.addAttribute("seasonHittingStats", seasonHittingStats);
        model.addAttribute("careerHittingStats", careerHittingStats);

        return "hitter_player_page";
    }

    @GetMapping("/player/pitcher/{playerId}")
    public String pitcherDetails(@PathVariable Long playerId, Model model){

        RestTemplate restTemplate = new RestTemplate();

        String getPlayer  = "http://lookup-service-prod.mlb.com/json/named.player_info.bam?sport_code='mlb'&player_id=" + playerId;
        String getProjectedPitchingStats = "http://lookup-service-prod.mlb.com/json/named.proj_pecota_pitching.bam?season='2019'&player_id=" +playerId;
        String getSeasonPitchingStats = "http://lookup-service-prod.mlb.com/json/named.sport_pitching_tm.bam?league_list_id='mlb'&game_type='R'&season='2018'&player_id=" +playerId;
        String getCareerPitchingStats = "http://lookup-service-prod.mlb.com/json/named.sport_career_pitching.bam?league_list_id='mlb'&game_type='R'&player_id=" +playerId;

        PlayerWrapper playerWrapper = restTemplate.getForObject(getPlayer, PlayerWrapper.class);
        ProjectedPitchingStatsWrapper projected = restTemplate.getForObject(getProjectedPitchingStats, ProjectedPitchingStatsWrapper.class);
        SeasonPitchingStatsWrapper season = restTemplate.getForObject(getSeasonPitchingStats, SeasonPitchingStatsWrapper.class);
        CareerPitchingStatsWrapper career = restTemplate.getForObject(getCareerPitchingStats, CareerPitchingStatsWrapper.class);

        PlayerRow player  = playerWrapper.getPlayerInfo().getQueryResults().getRow();
        ProjectedPitchingStatsRow projectedPitchingStatsRow = projected.getProjPecotaPitching().getQueryResults().getRow();
        List<SeasonPitchingStatsRow> seasonPitchingStatsRow = season.getSeasonPitchingStats().getQueryResults().getRow();
        CareerPitchingStatsRow careerPitchingStatsRow = career.getCareerPitchingStats().getQueryResults().getRow();

        ProjectedPitchingStatsRow projectedPitchingStats = new ProjectedPitchingStatsRow();

        if (projectedPitchingStatsRow == null) {
            projectedPitchingStats.setG("0");
            projectedPitchingStats.setCg("0");
            projectedPitchingStats.setIp("0");
            projectedPitchingStats.setW("0");
            projectedPitchingStats.setL("0");
            projectedPitchingStats.setEra("0");
            projectedPitchingStats.setEr("0");
            projectedPitchingStats.setWhip("0");
            projectedPitchingStats.setH("0");
            projectedPitchingStats.setSo("0");
            projectedPitchingStats.setBb("0");
            projectedPitchingStats.setSv("0");
            projectedPitchingStats.setBsv("0");
        } else {
            projectedPitchingStats = projectedPitchingStatsRow;
        }

        SeasonPitchingStatsRow seasonPitchingStats = new SeasonPitchingStatsRow();

        try{
            if (seasonPitchingStatsRow.size() > 1) {
                seasonPitchingStats = seasonPitchingStatsRow.get(seasonPitchingStatsRow.size() - 1);
            } else if (seasonPitchingStatsRow.size() == 1){
                seasonPitchingStats = seasonPitchingStatsRow.get(0);
            }
        } catch (NullPointerException ex) {
            seasonPitchingStats.setG("0");
            seasonPitchingStats.setCg("0");
            seasonPitchingStats.setIp("0");
            seasonPitchingStats.setW("0");
            seasonPitchingStats.setL("0");
            seasonPitchingStats.setEra("0");
            seasonPitchingStats.setEr("0");
            seasonPitchingStats.setWhip("0");
            seasonPitchingStats.setH("0");
            seasonPitchingStats.setSo("0");
            seasonPitchingStats.setBb("0");
            seasonPitchingStats.setSv("0");
        }

        CareerPitchingStatsRow careerPitchingStats = new CareerPitchingStatsRow();

        if (careerPitchingStatsRow == null) {
            careerPitchingStats.setG("0");
            careerPitchingStats.setCg("0");
            careerPitchingStats.setIp("0");
            careerPitchingStats.setW("0");
            careerPitchingStats.setL("0");
            careerPitchingStats.setWpct("0");
            careerPitchingStats.setEra("0");
            careerPitchingStats.setEr("0");
            careerPitchingStats.setWhip("0");
            careerPitchingStats.setH("0");
            careerPitchingStats.setSo("0");
            careerPitchingStats.setK9("0");
            careerPitchingStats.setBb("0");
            careerPitchingStats.setBb9("0");
            careerPitchingStats.setSv("0");
        } else {
            careerPitchingStats = careerPitchingStatsRow;
        }

        model.addAttribute("player", player);
        model.addAttribute("projectedPitchingStats", projectedPitchingStats);
        model.addAttribute("seasonPitchingStats", seasonPitchingStats);
        model.addAttribute("careerPitchingStats", careerPitchingStats);

        return "pitcher_player_page";
    }

    @GetMapping("/leagueleaders/hitting/{stat}")
    public ResponseEntity<?> leagueLeadersHitting(@PathVariable String stat) {

        RestTemplate restTemplate = new RestTemplate();

        String getStats = "http://lookup-service-prod.mlb.com/json/named.leader_hitting_repeater.bam?sport_code='mlb'&" +
                "results=5&game_type='R'&season='2018'&sort_column=" + stat + "&leader_hitting_repeater.col_in=" + stat +
                "&leader_hitting_repeater.col_in=name_display_first_last&leader_hitting_repeater.col_in=team_name&leader_hitting_repeater.col_in=player_id";

        LeaderHittingWrapper leaderHittingWrapper = restTemplate.getForObject(getStats, LeaderHittingWrapper.class);

        List<LeaderHittingRow> hittingLeaders = leaderHittingWrapper.getLeaderHittingRepeater().getLeaderHittingMux().getQueryResults().getRow();
        return new ResponseEntity<>(hittingLeaders, HttpStatus.OK);
    }

    @GetMapping("/leagueleaders/pitching/{stat}")
    public ResponseEntity<?> leagueLeadersPitching(@PathVariable String stat) {

        RestTemplate restTemplate = new RestTemplate();

        String getStats = "http://lookup-service-prod.mlb.com/json/named.leader_pitching_repeater.bam?sport_code='mlb'" +
                "&results=5&game_type='R'&season='2018'&sort_column=" + stat + "&leader_pitching_repeater.col_in=" + stat +
                "&leader_pitching_repeater.col_in=name_display_first_last&leader_pitching_repeater.col_in=team_name&leader_pitching_repeater.col_in=player_id";

        LeaderPitchingWrapper leaderPitchingWrapper = restTemplate.getForObject(getStats, LeaderPitchingWrapper.class);

        List<LeaderPitchingRow> pitchingLeaders = leaderPitchingWrapper.getLeaderPitchingRepeater().getLeaderPitchingMux().getQueryResults().getRow();
        return new ResponseEntity<>(pitchingLeaders, HttpStatus.OK);
    }

    @GetMapping("/playersearch")
    public String playerSearch(@RequestParam (value = "search", required = false) String player, Model model) {

        RestTemplate restTemplate = new RestTemplate();

        String getPlayerUrl = "http://lookup-service-prod.mlb.com/json/named.search_player_all.bam?sport_code='mlb'&active_sw='Y'&name_part='" + player + "'";

        PlayerSearchWrapper playerSearchWrapper = restTemplate.getForObject(getPlayerUrl, PlayerSearchWrapper.class);

        List<Row> players = playerSearchWrapper.getSearchPlayerAll().getQueryResults().getRow();

        model.addAttribute("players", players);

        return "player_search_results";
    }
}

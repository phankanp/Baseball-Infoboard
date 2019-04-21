package com.spring.mlbstats;

import com.spring.mlbstats.model.*;
import com.spring.mlbstats.model.GameWeather.Weather;
import com.spring.mlbstats.model.GameWeather.WeatherWrapper;
import com.spring.mlbstats.model.LeagueLeaders.HittingLeaders.LeaderHittingRow;
import com.spring.mlbstats.model.LeagueLeaders.HittingLeaders.LeaderHittingWrapper;
import com.spring.mlbstats.model.LeagueLeaders.PitchingLeaders.LeaderPitchingRow;
import com.spring.mlbstats.model.LeagueLeaders.PitchingLeaders.LeaderPitchingWrapper;
import com.spring.mlbstats.model.PlayerDetail.CareerHittingStats.CareerHittingStatsRow;
import com.spring.mlbstats.model.PlayerDetail.CareerHittingStats.CareerHittingStatsWrapper;
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
import com.spring.mlbstats.model.PlayerDetail.SeasonPitchingStats.SeasonPitchingStats;
import com.spring.mlbstats.model.PlayerDetail.SeasonPitchingStats.SeasonPitchingStatsRow;
import com.spring.mlbstats.model.PlayerDetail.SeasonPitchingStats.SeasonPitchingStatsWrapper;
import com.spring.mlbstats.model.PlayerSearch.PlayerSearchWrapper;
import com.spring.mlbstats.model.PlayerSearch.Row;
import com.spring.mlbstats.model.TeamDetail.*;
import com.spring.mlbstats.service.DailyScheduleService;
import com.spring.mlbstats.service.HitterDetailsService;
import com.spring.mlbstats.service.PitcherDetailsService;
import com.spring.mlbstats.service.TeamDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.env.Environment;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.NoHandlerFoundException;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@PropertySource("classpath:project.properties")
public class DashboardController {

    @Autowired
    private Environment env;

    @Autowired
    PitcherDetailsService pitcherDetailsService;

    @Autowired
    HitterDetailsService hitterDetailsService;

    @Autowired
    TeamDetailsService teamDetailsService;

    @Autowired
    DailyScheduleService dailyScheduleService;

    public HttpHeaders generateHeaders(){
        HttpHeaders headers = new HttpHeaders();
        String apiKey = env.getProperty("sports.api.key");
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Ocp-Apim-Subscription-Key", apiKey);

        return headers;
    }

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/dailyschedule")
    public ResponseEntity<?> dailySchedule(){

        List<DailySchedule> dailySchedule = dailyScheduleService.getDailySchedule(generateHeaders());

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

        String url = "https://api.fantasydata.net/v3/mlb/scores/JSON/Standings/2019";

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

        TeamRow teamRow = teamDetailsService.getTeam(teamId);
        List<TeamRosterRow> roster = teamDetailsService.getTeamRoster(teamId);
        List<DailySchedule> nextTwelveGames = teamDetailsService.getUpcomingTeamSchedule(teamCode, generateHeaders());
        TeamStat teamStats = teamDetailsService.getTeamStats(teamCode, generateHeaders());

        model.addAttribute("team", teamRow);
        model.addAttribute("roster", roster);
        model.addAttribute("nextTwelveGames", nextTwelveGames);
        model.addAttribute("teamStats", teamStats);

        return "team_page";
    }

    @GetMapping("/player/hitter/{playerId}")
    public String hitterDetails(@PathVariable Long playerId, Model model){

        PlayerRow player = hitterDetailsService.getHitter(playerId);
        ProjectedHittingStatsRow projectedHittingStats = hitterDetailsService.getProjectedHittingStats(playerId);
        SeasonHittingStatsRow seasonHittingStats = hitterDetailsService.getSeasonHittingStats(playerId);
        CareerHittingStatsRow careerHittingStats = hitterDetailsService.getCareerHittingStats(playerId);

        model.addAttribute("player", player);
        model.addAttribute("projectedHittingStats", projectedHittingStats);
        model.addAttribute("seasonHittingStats", seasonHittingStats);
        model.addAttribute("careerHittingStats", careerHittingStats);

        return "hitter_player_page";
    }

    @GetMapping("/player/pitcher/{playerId}")
    public String pitcherDetails(@PathVariable Long playerId, Model model){

        PlayerRow player = pitcherDetailsService.getPitcher(playerId);
        ProjectedPitchingStatsRow projectedPitchingStats = pitcherDetailsService.getProjectedPitchingStats(playerId);
        SeasonPitchingStatsRow seasonPitchingStats = pitcherDetailsService.getSeasonPitchingStats(playerId);
        CareerPitchingStatsRow careerPitchingStats = pitcherDetailsService.getCareerPitchingStats(playerId);

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
                "results=5&game_type='R'&season='2019'&sort_column=" + stat + "&leader_hitting_repeater.col_in=" + stat +
                "&leader_hitting_repeater.col_in=name_display_first_last&leader_hitting_repeater.col_in=team_name&leader_hitting_repeater.col_in=player_id";

        LeaderHittingWrapper leaderHittingWrapper = restTemplate.getForObject(getStats, LeaderHittingWrapper.class);

        List<LeaderHittingRow> hittingLeaders = leaderHittingWrapper.getLeaderHittingRepeater().getLeaderHittingMux().getQueryResults().getRow();
        return new ResponseEntity<>(hittingLeaders, HttpStatus.OK);
    }

    @GetMapping("/leagueleaders/pitching/{stat}")
    public ResponseEntity<?> leagueLeadersPitching(@PathVariable String stat) {

        RestTemplate restTemplate = new RestTemplate();

        String getStats = "http://lookup-service-prod.mlb.com/json/named.leader_pitching_repeater.bam?sport_code='mlb'" +
                "&results=5&game_type='R'&season='2019'&sort_column=" + stat + "&leader_pitching_repeater.col_in=" + stat +
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

    @GetMapping("/weather/{zipCode}")
    public ResponseEntity<?> getWeather(@PathVariable String zipCode) {
        RestTemplate restTemplate = new RestTemplate();

        String getWeather = "http://api.openweathermap.org/data/2.5/weather?q=" + zipCode + "&APPID=" + env.getProperty("weather.api.key");

        WeatherWrapper weatherWrapper = restTemplate.getForObject(getWeather, WeatherWrapper.class);

        List<Weather> weather = weatherWrapper.getWeather();

        return new ResponseEntity<>(weather.get(0), HttpStatus.OK);
    }

    @ExceptionHandler(NoHandlerFoundException.class)
    public String handle(Exception ex) {

        return "error";
    }
}

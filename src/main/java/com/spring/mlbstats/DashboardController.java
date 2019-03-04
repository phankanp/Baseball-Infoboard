package com.spring.mlbstats;

import com.spring.mlbstats.model.DailySchedule;
import com.spring.mlbstats.model.News;
import com.spring.mlbstats.model.Stadium;
import com.spring.mlbstats.model.Standing;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
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
        headers.set("Ocp-Apim-Subscription-Key", "48558a4a258f4b838c0766999d3ada31");

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
        headers.set("Ocp-Apim-Subscription-Key", "48558a4a258f4b838c0766999d3ada31");

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
        headers.set("Ocp-Apim-Subscription-Key", "48558a4a258f4b838c0766999d3ada31");

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
        headers.set("Ocp-Apim-Subscription-Key", "48558a4a258f4b838c0766999d3ada31");

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
}

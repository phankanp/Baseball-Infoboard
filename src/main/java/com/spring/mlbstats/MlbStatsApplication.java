package com.spring.mlbstats;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.spring.mlbstats.model.*;
import com.sun.deploy.net.HttpResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.util.CollectionUtils;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;


import java.io.IOException;
import java.net.URI;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

@SpringBootApplication
public class MlbStatsApplication {

    public static void main(String[] args) throws IOException {

        SpringApplication.run(MlbStatsApplication.class, args);

        RestTemplate restTemplate = new RestTemplate();

        DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
        Date date = new Date();

        String url = "https://api.fantasydata.net/v3/mlb/scores/JSON/GamesByDate/" + dateFormat.format(date);
//
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
//
//        Player[] players = responseEntity.getBody();
//
//        for (Player p : players) {
//            System.out.println(p.getFirstName() + " " + p.getLastName());
//        }

        List<DailySchedule> dailySchedule = responseEntity.getBody();

        for (DailySchedule ds : dailySchedule) {
            System.out.println(ds.getAwayTeam() + " - " + ds.getHomeTeam());
        }



    }
}

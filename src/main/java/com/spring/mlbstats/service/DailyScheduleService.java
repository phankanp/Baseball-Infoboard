package com.spring.mlbstats.service;

import com.spring.mlbstats.model.DailySchedule;
import com.spring.mlbstats.model.Stadium;
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
import java.util.Date;
import java.util.List;

@Service
public class DailyScheduleService {

    public RestTemplate generateRestTemplate() {
        RestTemplate restTemplate = new RestTemplate();

        return restTemplate;
    }

    public List<DailySchedule> convertGameTime(List<DailySchedule> dailySchedule) {
        DateFormat timeDF = new SimpleDateFormat("HH:mm");
        DateFormat outputTimeDF = new SimpleDateFormat("hh:mm");

        Date time = null;

        for (DailySchedule ds : dailySchedule) {
            if (ds.getStatus().equals("InProgress")) {
                ds.setStatus("In Progress");
            }
            try {
                time = timeDF.parse(ds.getDateTime().substring(11, 16));
                ds.setStartTime(outputTimeDF.format(time));
            } catch(ParseException pe){
                pe.printStackTrace();
            }
        }

        return dailySchedule;
    }

    public List<DailySchedule> addStadiumNameAndCity(List<DailySchedule> dailySchedule, HttpHeaders httpHeaders) {
        HttpHeaders headers = httpHeaders;

        HttpEntity<?> entity = new HttpEntity<>(headers);

        String stadiumUrl = "https://api.fantasydata.net/v3/mlb/scores/json/Stadiums";

        ResponseEntity<List<Stadium>> responseEntityStadiumList = generateRestTemplate().exchange(
                stadiumUrl,
                HttpMethod.GET,
                entity,
                new ParameterizedTypeReference<List<Stadium>>(){}
        );

        List<Stadium> stadiums = responseEntityStadiumList.getBody();

        for (DailySchedule ds : dailySchedule) {
            for (Stadium stadium : stadiums) {
                if (ds.getStadiumID() == stadium.getStadiumID()) {
                    ds.setStadiumName(stadium.getName());
                    ds.setStadiumCity(stadium.getCity());
                }
            }
        }

        return dailySchedule;
    }

    public List<DailySchedule> getDailySchedule(HttpHeaders httpHeaders) {
        HttpHeaders headers = httpHeaders;

        HttpEntity<?> entity = new HttpEntity<>(headers);

        DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
        Date date = new Date();

        String url = "https://api.fantasydata.net/v3/mlb/scores/JSON/GamesByDate/" + dateFormat.format(date);

        ResponseEntity<List<DailySchedule>> responseEntity = generateRestTemplate().exchange(
                url,
                HttpMethod.GET,
                entity,
                new ParameterizedTypeReference<List<DailySchedule>>(){}
        );

        List<DailySchedule> dailySchedule = responseEntity.getBody();

        convertGameTime(dailySchedule);

        addStadiumNameAndCity(dailySchedule, httpHeaders);

        return dailySchedule;
    }
}

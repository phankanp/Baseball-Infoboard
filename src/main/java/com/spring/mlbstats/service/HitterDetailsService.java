package com.spring.mlbstats.service;

import com.spring.mlbstats.model.PlayerDetail.CareerHittingStats.CareerHittingStatsRow;
import com.spring.mlbstats.model.PlayerDetail.CareerHittingStats.CareerHittingStatsWrapper;
import com.spring.mlbstats.model.PlayerDetail.PlayerRow;
import com.spring.mlbstats.model.PlayerDetail.PlayerWrapper;
import com.spring.mlbstats.model.PlayerDetail.ProjectedHittingStats.ProjectedHittingStatsRow;
import com.spring.mlbstats.model.PlayerDetail.ProjectedHittingStats.ProjectedHittingStatsWrapper;
import com.spring.mlbstats.model.PlayerDetail.ProjectedPitchingStats.ProjectedPitchingStatsRow;
import com.spring.mlbstats.model.PlayerDetail.ProjectedPitchingStats.ProjectedPitchingStatsWrapper;
import com.spring.mlbstats.model.PlayerDetail.SeasonHittingStats.SeasonHittingStatsRow;
import com.spring.mlbstats.model.PlayerDetail.SeasonHittingStats.SeasonHittingStatsWrapper;
import com.spring.mlbstats.model.PlayerDetail.SeasonPitchingStats.SeasonPitchingStatsRow;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class HitterDetailsService {

    public RestTemplate generateRestTemplate() {
        RestTemplate restTemplate = new RestTemplate();

        return restTemplate;
    }

    public PlayerRow getHitter(Long playerId) {
        String getPlayer  = "http://lookup-service-prod.mlb.com/json/named.player_info.bam?sport_code='mlb'&player_id=" + playerId;

        PlayerWrapper playerWrapper = generateRestTemplate().getForObject(getPlayer, PlayerWrapper.class);

        PlayerRow player  = playerWrapper.getPlayerInfo().getQueryResults().getRow();

        return player;
    }

    public ProjectedHittingStatsRow getProjectedHittingStats(Long playerId) {
        String getProjectedHittingStats = "http://lookup-service-prod.mlb.com/json/named.proj_pecota_batting.bam?season='2019'&player_id=" + playerId;

        ProjectedHittingStatsWrapper projected = generateRestTemplate().getForObject(getProjectedHittingStats, ProjectedHittingStatsWrapper.class);

        ProjectedHittingStatsRow projectedHittingStatsRow = projected.getProjPecotaBatting().getQueryResults().getRow();

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

        return projectedHittingStats;
    }

    public SeasonHittingStatsRow getSeasonHittingStats(Long playerId) {
        String getSeasonHittingStats = "http://lookup-service-prod.mlb.com/json/named.sport_hitting_tm.bam?league_list_id='mlb'&game_type='R'&season='2018'&player_id=" + playerId;

        SeasonHittingStatsWrapper season = generateRestTemplate().getForObject(getSeasonHittingStats, SeasonHittingStatsWrapper.class);

        List<SeasonHittingStatsRow> seasonHittingStatsRow = season.getSeasonHittingStats().getQueryResults().getRow();

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

        return seasonHittingStats;
    }

    public CareerHittingStatsRow getCareerHittingStats(Long playerId) {
        String getCareerHittingStats = "http://lookup-service-prod.mlb.com/json/named.sport_career_hitting.bam?league_list_id='mlb'&game_type='R'&player_id=" +playerId;

        CareerHittingStatsWrapper career = generateRestTemplate().getForObject(getCareerHittingStats, CareerHittingStatsWrapper.class);

        CareerHittingStatsRow careerHittingStatsRow = career.getCareerHittingStats().getQueryResults().getRow();

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

        return careerHittingStats;
    }
}

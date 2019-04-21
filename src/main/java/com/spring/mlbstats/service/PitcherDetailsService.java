package com.spring.mlbstats.service;

import com.spring.mlbstats.model.Player;
import com.spring.mlbstats.model.PlayerDetail.CareerPitchingStats.CareerPitchingStatsRow;
import com.spring.mlbstats.model.PlayerDetail.CareerPitchingStats.CareerPitchingStatsWrapper;
import com.spring.mlbstats.model.PlayerDetail.PlayerRow;
import com.spring.mlbstats.model.PlayerDetail.PlayerWrapper;
import com.spring.mlbstats.model.PlayerDetail.ProjectedPitchingStats.ProjectedPitchingStatsRow;
import com.spring.mlbstats.model.PlayerDetail.ProjectedPitchingStats.ProjectedPitchingStatsWrapper;
import com.spring.mlbstats.model.PlayerDetail.SeasonPitchingStats.SeasonPitchingStatsRow;
import com.spring.mlbstats.model.PlayerDetail.SeasonPitchingStats.SeasonPitchingStatsWrapper;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class PitcherDetailsService {

    public RestTemplate generateRestTemplate() {
        RestTemplate restTemplate = new RestTemplate();

        return restTemplate;
    }

    public PlayerRow getPitcher(Long playerId) {
        String getPlayer  = "http://lookup-service-prod.mlb.com/json/named.player_info.bam?sport_code='mlb'&player_id=" + playerId;

        PlayerWrapper playerWrapper = generateRestTemplate().getForObject(getPlayer, PlayerWrapper.class);

        PlayerRow player  = playerWrapper.getPlayerInfo().getQueryResults().getRow();

        return player;
    }

    public ProjectedPitchingStatsRow getProjectedPitchingStats(Long playerId) {
        String getProjectedPitchingStats = "http://lookup-service-prod.mlb.com/json/named.proj_pecota_pitching.bam?season='2019'&player_id=" + playerId;

        ProjectedPitchingStatsWrapper projected = generateRestTemplate().getForObject(getProjectedPitchingStats, ProjectedPitchingStatsWrapper.class);

        ProjectedPitchingStatsRow projectedPitchingStatsRow = projected.getProjPecotaPitching().getQueryResults().getRow();

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

        return projectedPitchingStats;
    }

    public SeasonPitchingStatsRow getSeasonPitchingStats(Long playerId) {
        String getSeasonPitchingStats = "http://lookup-service-prod.mlb.com/json/named.sport_pitching_tm.bam?league_list_id='mlb'&game_type='R'&season='2018'&player_id=" + playerId;

        SeasonPitchingStatsWrapper season = generateRestTemplate().getForObject(getSeasonPitchingStats, SeasonPitchingStatsWrapper.class);

        List<SeasonPitchingStatsRow> seasonPitchingStatsRow = season.getSeasonPitchingStats().getQueryResults().getRow();

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

        return seasonPitchingStats;
    }

    public CareerPitchingStatsRow getCareerPitchingStats(Long playerId) {
        String getCareerPitchingStats = "http://lookup-service-prod.mlb.com/json/named.sport_career_pitching.bam?league_list_id='mlb'&game_type='R'&player_id=" + playerId;

        CareerPitchingStatsWrapper career = generateRestTemplate().getForObject(getCareerPitchingStats, CareerPitchingStatsWrapper.class);

        CareerPitchingStatsRow careerPitchingStatsRow = career.getCareerPitchingStats().getQueryResults().getRow();

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

        return careerPitchingStats;
    }
}

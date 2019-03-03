package com.spring.mlbstats.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Season",
        "SeasonType",
        "TeamID",
        "Key",
        "City",
        "Name",
        "League",
        "Division",
        "Wins",
        "Losses",
        "Percentage",
        "DivisionWins",
        "DivisionLosses",
        "GamesBehind",
        "LastTenGamesWins",
        "LastTenGamesLosses",
        "Streak",
        "WildCardRank",
        "WildCardGamesBehind",
        "HomeWins",
        "HomeLosses",
        "AwayWins",
        "AwayLosses",
        "DayWins",
        "DayLosses",
        "NightWins",
        "NightLosses",
        "RunsScored",
        "RunsAgainst"
})
public class Standing {

    @JsonProperty("Season")
    private Integer season;
    @JsonProperty("SeasonType")
    private Integer seasonType;
    @JsonProperty("TeamID")
    private Integer teamID;
    @JsonProperty("Key")
    private String key;
    @JsonProperty("City")
    private String city;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("League")
    private String league;
    @JsonProperty("Division")
    private String division;
    @JsonProperty("Wins")
    private Integer wins;
    @JsonProperty("Losses")
    private Integer losses;
    @JsonProperty("Percentage")
    private Double percentage;
    @JsonProperty("DivisionWins")
    private Integer divisionWins;
    @JsonProperty("DivisionLosses")
    private Integer divisionLosses;
    @JsonProperty("GamesBehind")
    private Object gamesBehind;
    @JsonProperty("LastTenGamesWins")
    private Integer lastTenGamesWins;
    @JsonProperty("LastTenGamesLosses")
    private Integer lastTenGamesLosses;
    @JsonProperty("Streak")
    private String streak;
    @JsonProperty("WildCardRank")
    private Object wildCardRank;
    @JsonProperty("WildCardGamesBehind")
    private Object wildCardGamesBehind;
    @JsonProperty("HomeWins")
    private Integer homeWins;
    @JsonProperty("HomeLosses")
    private Integer homeLosses;
    @JsonProperty("AwayWins")
    private Integer awayWins;
    @JsonProperty("AwayLosses")
    private Integer awayLosses;
    @JsonProperty("DayWins")
    private Integer dayWins;
    @JsonProperty("DayLosses")
    private Integer dayLosses;
    @JsonProperty("NightWins")
    private Integer nightWins;
    @JsonProperty("NightLosses")
    private Integer nightLosses;
    @JsonProperty("RunsScored")
    private Integer runsScored;
    @JsonProperty("RunsAgainst")
    private Integer runsAgainst;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Season")
    public Integer getSeason() {
        return season;
    }

    @JsonProperty("Season")
    public void setSeason(Integer season) {
        this.season = season;
    }

    @JsonProperty("SeasonType")
    public Integer getSeasonType() {
        return seasonType;
    }

    @JsonProperty("SeasonType")
    public void setSeasonType(Integer seasonType) {
        this.seasonType = seasonType;
    }

    @JsonProperty("TeamID")
    public Integer getTeamID() {
        return teamID;
    }

    @JsonProperty("TeamID")
    public void setTeamID(Integer teamID) {
        this.teamID = teamID;
    }

    @JsonProperty("Key")
    public String getKey() {
        return key;
    }

    @JsonProperty("Key")
    public void setKey(String key) {
        this.key = key;
    }

    @JsonProperty("City")
    public String getCity() {
        return city;
    }

    @JsonProperty("City")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("League")
    public String getLeague() {
        return league;
    }

    @JsonProperty("League")
    public void setLeague(String league) {
        this.league = league;
    }

    @JsonProperty("Division")
    public String getDivision() {
        return division;
    }

    @JsonProperty("Division")
    public void setDivision(String division) {
        this.division = division;
    }

    @JsonProperty("Wins")
    public Integer getWins() {
        return wins;
    }

    @JsonProperty("Wins")
    public void setWins(Integer wins) {
        this.wins = wins;
    }

    @JsonProperty("Losses")
    public Integer getLosses() {
        return losses;
    }

    @JsonProperty("Losses")
    public void setLosses(Integer losses) {
        this.losses = losses;
    }

    @JsonProperty("Percentage")
    public Double getPercentage() {
        return percentage;
    }

    @JsonProperty("Percentage")
    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    @JsonProperty("DivisionWins")
    public Integer getDivisionWins() {
        return divisionWins;
    }

    @JsonProperty("DivisionWins")
    public void setDivisionWins(Integer divisionWins) {
        this.divisionWins = divisionWins;
    }

    @JsonProperty("DivisionLosses")
    public Integer getDivisionLosses() {
        return divisionLosses;
    }

    @JsonProperty("DivisionLosses")
    public void setDivisionLosses(Integer divisionLosses) {
        this.divisionLosses = divisionLosses;
    }

    @JsonProperty("GamesBehind")
    public Object getGamesBehind() {
        return gamesBehind;
    }

    @JsonProperty("GamesBehind")
    public void setGamesBehind(Object gamesBehind) {
        this.gamesBehind = gamesBehind;
    }

    @JsonProperty("LastTenGamesWins")
    public Integer getLastTenGamesWins() {
        return lastTenGamesWins;
    }

    @JsonProperty("LastTenGamesWins")
    public void setLastTenGamesWins(Integer lastTenGamesWins) {
        this.lastTenGamesWins = lastTenGamesWins;
    }

    @JsonProperty("LastTenGamesLosses")
    public Integer getLastTenGamesLosses() {
        return lastTenGamesLosses;
    }

    @JsonProperty("LastTenGamesLosses")
    public void setLastTenGamesLosses(Integer lastTenGamesLosses) {
        this.lastTenGamesLosses = lastTenGamesLosses;
    }

    @JsonProperty("Streak")
    public String getStreak() {
        return streak;
    }

    @JsonProperty("Streak")
    public void setStreak(String streak) {
        this.streak = streak;
    }

    @JsonProperty("WildCardRank")
    public Object getWildCardRank() {
        return wildCardRank;
    }

    @JsonProperty("WildCardRank")
    public void setWildCardRank(Object wildCardRank) {
        this.wildCardRank = wildCardRank;
    }

    @JsonProperty("WildCardGamesBehind")
    public Object getWildCardGamesBehind() {
        return wildCardGamesBehind;
    }

    @JsonProperty("WildCardGamesBehind")
    public void setWildCardGamesBehind(Object wildCardGamesBehind) {
        this.wildCardGamesBehind = wildCardGamesBehind;
    }

    @JsonProperty("HomeWins")
    public Integer getHomeWins() {
        return homeWins;
    }

    @JsonProperty("HomeWins")
    public void setHomeWins(Integer homeWins) {
        this.homeWins = homeWins;
    }

    @JsonProperty("HomeLosses")
    public Integer getHomeLosses() {
        return homeLosses;
    }

    @JsonProperty("HomeLosses")
    public void setHomeLosses(Integer homeLosses) {
        this.homeLosses = homeLosses;
    }

    @JsonProperty("AwayWins")
    public Integer getAwayWins() {
        return awayWins;
    }

    @JsonProperty("AwayWins")
    public void setAwayWins(Integer awayWins) {
        this.awayWins = awayWins;
    }

    @JsonProperty("AwayLosses")
    public Integer getAwayLosses() {
        return awayLosses;
    }

    @JsonProperty("AwayLosses")
    public void setAwayLosses(Integer awayLosses) {
        this.awayLosses = awayLosses;
    }

    @JsonProperty("DayWins")
    public Integer getDayWins() {
        return dayWins;
    }

    @JsonProperty("DayWins")
    public void setDayWins(Integer dayWins) {
        this.dayWins = dayWins;
    }

    @JsonProperty("DayLosses")
    public Integer getDayLosses() {
        return dayLosses;
    }

    @JsonProperty("DayLosses")
    public void setDayLosses(Integer dayLosses) {
        this.dayLosses = dayLosses;
    }

    @JsonProperty("NightWins")
    public Integer getNightWins() {
        return nightWins;
    }

    @JsonProperty("NightWins")
    public void setNightWins(Integer nightWins) {
        this.nightWins = nightWins;
    }

    @JsonProperty("NightLosses")
    public Integer getNightLosses() {
        return nightLosses;
    }

    @JsonProperty("NightLosses")
    public void setNightLosses(Integer nightLosses) {
        this.nightLosses = nightLosses;
    }

    @JsonProperty("RunsScored")
    public Integer getRunsScored() {
        return runsScored;
    }

    @JsonProperty("RunsScored")
    public void setRunsScored(Integer runsScored) {
        this.runsScored = runsScored;
    }

    @JsonProperty("RunsAgainst")
    public Integer getRunsAgainst() {
        return runsAgainst;
    }

    @JsonProperty("RunsAgainst")
    public void setRunsAgainst(Integer runsAgainst) {
        this.runsAgainst = runsAgainst;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
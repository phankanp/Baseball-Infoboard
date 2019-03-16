package com.spring.mlbstats.model.PlayerSearch;

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
        "position",
        "birth_country",
        "weight",
        "birth_state",
        "name_display_first_last",
        "college",
        "height_inches",
        "name_display_roster",
        "sport_code",
        "bats",
        "name_first",
        "team_code",
        "birth_city",
        "height_feet",
        "pro_debut_date",
        "team_full",
        "team_abbrev",
        "birth_date",
        "throws",
        "league",
        "name_display_last_first",
        "position_id",
        "high_school",
        "name_use",
        "player_id",
        "name_last",
        "team_id",
        "service_years",
        "active_sw"
})
public class Row  {

    @JsonProperty("position")
    private String position;
    @JsonProperty("birth_country")
    private String birthCountry;
    @JsonProperty("weight")
    private String weight;
    @JsonProperty("birth_state")
    private String birthState;
    @JsonProperty("name_display_first_last")
    private String nameDisplayFirstLast;
    @JsonProperty("college")
    private String college;
    @JsonProperty("height_inches")
    private String heightInches;
    @JsonProperty("name_display_roster")
    private String nameDisplayRoster;
    @JsonProperty("sport_code")
    private String sportCode;
    @JsonProperty("bats")
    private String bats;
    @JsonProperty("name_first")
    private String nameFirst;
    @JsonProperty("team_code")
    private String teamCode;
    @JsonProperty("birth_city")
    private String birthCity;
    @JsonProperty("height_feet")
    private String heightFeet;
    @JsonProperty("pro_debut_date")
    private String proDebutDate;
    @JsonProperty("team_full")
    private String teamFull;
    @JsonProperty("team_abbrev")
    private String teamAbbrev;
    @JsonProperty("birth_date")
    private String birthDate;
    @JsonProperty("throws")
    private String _throws;
    @JsonProperty("league")
    private String league;
    @JsonProperty("name_display_last_first")
    private String nameDisplayLastFirst;
    @JsonProperty("position_id")
    private String positionId;
    @JsonProperty("high_school")
    private String highSchool;
    @JsonProperty("name_use")
    private String nameUse;
    @JsonProperty("player_id")
    private String playerId;
    @JsonProperty("name_last")
    private String nameLast;
    @JsonProperty("team_id")
    private String teamId;
    @JsonProperty("service_years")
    private String serviceYears;
    @JsonProperty("active_sw")
    private String activeSw;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("position")
    public String getPosition() {
        return position;
    }

    @JsonProperty("position")
    public void setPosition(String position) {
        this.position = position;
    }

    @JsonProperty("birth_country")
    public String getBirthCountry() {
        return birthCountry;
    }

    @JsonProperty("birth_country")
    public void setBirthCountry(String birthCountry) {
        this.birthCountry = birthCountry;
    }

    @JsonProperty("weight")
    public String getWeight() {
        return weight;
    }

    @JsonProperty("weight")
    public void setWeight(String weight) {
        this.weight = weight;
    }

    @JsonProperty("birth_state")
    public String getBirthState() {
        return birthState;
    }

    @JsonProperty("birth_state")
    public void setBirthState(String birthState) {
        this.birthState = birthState;
    }

    @JsonProperty("name_display_first_last")
    public String getNameDisplayFirstLast() {
        return nameDisplayFirstLast;
    }

    @JsonProperty("name_display_first_last")
    public void setNameDisplayFirstLast(String nameDisplayFirstLast) {
        this.nameDisplayFirstLast = nameDisplayFirstLast;
    }

    @JsonProperty("college")
    public String getCollege() {
        return college;
    }

    @JsonProperty("college")
    public void setCollege(String college) {
        this.college = college;
    }

    @JsonProperty("height_inches")
    public String getHeightInches() {
        return heightInches;
    }

    @JsonProperty("height_inches")
    public void setHeightInches(String heightInches) {
        this.heightInches = heightInches;
    }

    @JsonProperty("name_display_roster")
    public String getNameDisplayRoster() {
        return nameDisplayRoster;
    }

    @JsonProperty("name_display_roster")
    public void setNameDisplayRoster(String nameDisplayRoster) {
        this.nameDisplayRoster = nameDisplayRoster;
    }

    @JsonProperty("sport_code")
    public String getSportCode() {
        return sportCode;
    }

    @JsonProperty("sport_code")
    public void setSportCode(String sportCode) {
        this.sportCode = sportCode;
    }

    @JsonProperty("bats")
    public String getBats() {
        return bats;
    }

    @JsonProperty("bats")
    public void setBats(String bats) {
        this.bats = bats;
    }

    @JsonProperty("name_first")
    public String getNameFirst() {
        return nameFirst;
    }

    @JsonProperty("name_first")
    public void setNameFirst(String nameFirst) {
        this.nameFirst = nameFirst;
    }

    @JsonProperty("team_code")
    public String getTeamCode() {
        return teamCode;
    }

    @JsonProperty("team_code")
    public void setTeamCode(String teamCode) {
        this.teamCode = teamCode;
    }

    @JsonProperty("birth_city")
    public String getBirthCity() {
        return birthCity;
    }

    @JsonProperty("birth_city")
    public void setBirthCity(String birthCity) {
        this.birthCity = birthCity;
    }

    @JsonProperty("height_feet")
    public String getHeightFeet() {
        return heightFeet;
    }

    @JsonProperty("height_feet")
    public void setHeightFeet(String heightFeet) {
        this.heightFeet = heightFeet;
    }

    @JsonProperty("pro_debut_date")
    public String getProDebutDate() {
        return proDebutDate;
    }

    @JsonProperty("pro_debut_date")
    public void setProDebutDate(String proDebutDate) {
        this.proDebutDate = proDebutDate;
    }

    @JsonProperty("team_full")
    public String getTeamFull() {
        return teamFull;
    }

    @JsonProperty("team_full")
    public void setTeamFull(String teamFull) {
        this.teamFull = teamFull;
    }

    @JsonProperty("team_abbrev")
    public String getTeamAbbrev() {
        return teamAbbrev;
    }

    @JsonProperty("team_abbrev")
    public void setTeamAbbrev(String teamAbbrev) {
        this.teamAbbrev = teamAbbrev;
    }

    @JsonProperty("birth_date")
    public String getBirthDate() {
        return birthDate;
    }

    @JsonProperty("birth_date")
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @JsonProperty("throws")
    public String getThrows() {
        return _throws;
    }

    @JsonProperty("throws")
    public void setThrows(String _throws) {
        this._throws = _throws;
    }

    @JsonProperty("league")
    public String getLeague() {
        return league;
    }

    @JsonProperty("league")
    public void setLeague(String league) {
        this.league = league;
    }

    @JsonProperty("name_display_last_first")
    public String getNameDisplayLastFirst() {
        return nameDisplayLastFirst;
    }

    @JsonProperty("name_display_last_first")
    public void setNameDisplayLastFirst(String nameDisplayLastFirst) {
        this.nameDisplayLastFirst = nameDisplayLastFirst;
    }

    @JsonProperty("position_id")
    public String getPositionId() {
        return positionId;
    }

    @JsonProperty("position_id")
    public void setPositionId(String positionId) {
        this.positionId = positionId;
    }

    @JsonProperty("high_school")
    public String getHighSchool() {
        return highSchool;
    }

    @JsonProperty("high_school")
    public void setHighSchool(String highSchool) {
        this.highSchool = highSchool;
    }

    @JsonProperty("name_use")
    public String getNameUse() {
        return nameUse;
    }

    @JsonProperty("name_use")
    public void setNameUse(String nameUse) {
        this.nameUse = nameUse;
    }

    @JsonProperty("player_id")
    public String getPlayerId() {
        return playerId;
    }

    @JsonProperty("player_id")
    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    @JsonProperty("name_last")
    public String getNameLast() {
        return nameLast;
    }

    @JsonProperty("name_last")
    public void setNameLast(String nameLast) {
        this.nameLast = nameLast;
    }

    @JsonProperty("team_id")
    public String getTeamId() {
        return teamId;
    }

    @JsonProperty("team_id")
    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    @JsonProperty("service_years")
    public String getServiceYears() {
        return serviceYears;
    }

    @JsonProperty("service_years")
    public void setServiceYears(String serviceYears) {
        this.serviceYears = serviceYears;
    }

    @JsonProperty("active_sw")
    public String getActiveSw() {
        return activeSw;
    }

    @JsonProperty("active_sw")
    public void setActiveSw(String activeSw) {
        this.activeSw = activeSw;
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

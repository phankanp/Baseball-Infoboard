package com.spring.mlbstats.model.TeamDetail;

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
        "position_txt",
        "weight",
        "name_display_first_last",
        "college",
        "height_inches",
        "starter_sw",
        "jersey_number",
        "end_date",
        "name_first",
        "bats",
        "team_code",
        "height_feet",
        "pro_debut_date",
        "status_code",
        "primary_position",
        "birth_date",
        "team_abbrev",
        "throws",
        "team_name",
        "name_display_last_first",
        "name_use",
        "player_id",
        "name_last",
        "team_id",
        "start_date",
        "name_full"
})
public class TeamRosterRow {
    @JsonProperty("position_txt")
    private String positionTxt;
    @JsonProperty("weight")
    private String weight;
    @JsonProperty("name_display_first_last")
    private String nameDisplayFirstLast;
    @JsonProperty("college")
    private String college;
    @JsonProperty("height_inches")
    private String heightInches;
    @JsonProperty("starter_sw")
    private String starterSw;
    @JsonProperty("jersey_number")
    private String jerseyNumber;
    @JsonProperty("end_date")
    private String endDate;
    @JsonProperty("name_first")
    private String nameFirst;
    @JsonProperty("bats")
    private String bats;
    @JsonProperty("team_code")
    private String teamCode;
    @JsonProperty("height_feet")
    private String heightFeet;
    @JsonProperty("pro_debut_date")
    private String proDebutDate;
    @JsonProperty("status_code")
    private String statusCode;
    @JsonProperty("primary_position")
    private String primaryPosition;
    @JsonProperty("birth_date")
    private String birthDate;
    @JsonProperty("team_abbrev")
    private String teamAbbrev;
    @JsonProperty("throws")
    private String _throws;
    @JsonProperty("team_name")
    private String teamName;
    @JsonProperty("name_display_last_first")
    private String nameDisplayLastFirst;
    @JsonProperty("name_use")
    private String nameUse;
    @JsonProperty("player_id")
    private String playerId;
    @JsonProperty("name_last")
    private String nameLast;
    @JsonProperty("team_id")
    private String teamId;
    @JsonProperty("start_date")
    private String startDate;
    @JsonProperty("name_full")
    private String nameFull;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("position_txt")
    public String getPositionTxt() {
        return positionTxt;
    }

    @JsonProperty("position_txt")
    public void setPositionTxt(String positionTxt) {
        this.positionTxt = positionTxt;
    }

    @JsonProperty("weight")
    public String getWeight() {
        return weight;
    }

    @JsonProperty("weight")
    public void setWeight(String weight) {
        this.weight = weight;
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

    @JsonProperty("starter_sw")
    public String getStarterSw() {
        return starterSw;
    }

    @JsonProperty("starter_sw")
    public void setStarterSw(String starterSw) {
        this.starterSw = starterSw;
    }

    @JsonProperty("jersey_number")
    public String getJerseyNumber() {
        return jerseyNumber;
    }

    @JsonProperty("jersey_number")
    public void setJerseyNumber(String jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    @JsonProperty("end_date")
    public String getEndDate() {
        return endDate;
    }

    @JsonProperty("end_date")
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @JsonProperty("name_first")
    public String getNameFirst() {
        return nameFirst;
    }

    @JsonProperty("name_first")
    public void setNameFirst(String nameFirst) {
        this.nameFirst = nameFirst;
    }

    @JsonProperty("bats")
    public String getBats() {
        return bats;
    }

    @JsonProperty("bats")
    public void setBats(String bats) {
        this.bats = bats;
    }

    @JsonProperty("team_code")
    public String getTeamCode() {
        return teamCode;
    }

    @JsonProperty("team_code")
    public void setTeamCode(String teamCode) {
        this.teamCode = teamCode;
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

    @JsonProperty("status_code")
    public String getStatusCode() {
        return statusCode;
    }

    @JsonProperty("status_code")
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    @JsonProperty("primary_position")
    public String getPrimaryPosition() {
        return primaryPosition;
    }

    @JsonProperty("primary_position")
    public void setPrimaryPosition(String primaryPosition) {
        this.primaryPosition = primaryPosition;
    }

    @JsonProperty("birth_date")
    public String getBirthDate() {
        return birthDate;
    }

    @JsonProperty("birth_date")
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @JsonProperty("team_abbrev")
    public String getTeamAbbrev() {
        return teamAbbrev;
    }

    @JsonProperty("team_abbrev")
    public void setTeamAbbrev(String teamAbbrev) {
        this.teamAbbrev = teamAbbrev;
    }

    @JsonProperty("throws")
    public String getThrows() {
        return _throws;
    }

    @JsonProperty("throws")
    public void setThrows(String _throws) {
        this._throws = _throws;
    }

    @JsonProperty("team_name")
    public String getTeamName() {
        return teamName;
    }

    @JsonProperty("team_name")
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    @JsonProperty("name_display_last_first")
    public String getNameDisplayLastFirst() {
        return nameDisplayLastFirst;
    }

    @JsonProperty("name_display_last_first")
    public void setNameDisplayLastFirst(String nameDisplayLastFirst) {
        this.nameDisplayLastFirst = nameDisplayLastFirst;
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

    @JsonProperty("start_date")
    public String getStartDate() {
        return startDate;
    }

    @JsonProperty("start_date")
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @JsonProperty("name_full")
    public String getNameFull() {
        return nameFull;
    }

    @JsonProperty("name_full")
    public void setNameFull(String nameFull) {
        this.nameFull = nameFull;
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

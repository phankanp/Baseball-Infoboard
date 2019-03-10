package com.spring.mlbstats.model.PlayerDetail;

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
        "birth_country",
        "name_prefix",
        "name_display_first_last",
        "college",
        "height_inches",
        "death_country",
        "age",
        "name_display_first_last_html",
        "gender",
        "height_feet",
        "pro_debut_date",
        "death_date",
        "primary_position",
        "birth_date",
        "team_abbrev",
        "status",
        "name_display_last_first_html",
        "throws",
        "death_city",
        "primary_position_txt",
        "high_school",
        "name_display_roster_html",
        "name_use",
        "player_id",
        "status_date",
        "primary_stat_type",
        "team_id",
        "active_sw",
        "primary_sport_code",
        "birth_state",
        "weight",
        "name_middle",
        "name_display_roster",
        "end_date",
        "jersey_number",
        "death_state",
        "name_first",
        "bats",
        "team_code",
        "birth_city",
        "name_nick",
        "status_code",
        "name_matrilineal",
        "team_name",
        "name_display_last_first",
        "twitter_id",
        "name_title",
        "file_code",
        "name_last",
        "start_date",
        "name_full"
})
public class PlayerRow {
    @JsonProperty("birth_country")
    private String birthCountry;
    @JsonProperty("name_prefix")
    private String namePrefix;
    @JsonProperty("name_display_first_last")
    private String nameDisplayFirstLast;
    @JsonProperty("college")
    private String college;
    @JsonProperty("height_inches")
    private String heightInches;
    @JsonProperty("death_country")
    private String deathCountry;
    @JsonProperty("age")
    private String age;
    @JsonProperty("name_display_first_last_html")
    private String nameDisplayFirstLastHtml;
    @JsonProperty("gender")
    private String gender;
    @JsonProperty("height_feet")
    private String heightFeet;
    @JsonProperty("pro_debut_date")
    private String proDebutDate;
    @JsonProperty("death_date")
    private String deathDate;
    @JsonProperty("primary_position")
    private String primaryPosition;
    @JsonProperty("birth_date")
    private String birthDate;
    @JsonProperty("team_abbrev")
    private String teamAbbrev;
    @JsonProperty("status")
    private String status;
    @JsonProperty("name_display_last_first_html")
    private String nameDisplayLastFirstHtml;
    @JsonProperty("throws")
    private String _throws;
    @JsonProperty("death_city")
    private String deathCity;
    @JsonProperty("primary_position_txt")
    private String primaryPositionTxt;
    @JsonProperty("high_school")
    private String highSchool;
    @JsonProperty("name_display_roster_html")
    private String nameDisplayRosterHtml;
    @JsonProperty("name_use")
    private String nameUse;
    @JsonProperty("player_id")
    private String playerId;
    @JsonProperty("status_date")
    private String statusDate;
    @JsonProperty("primary_stat_type")
    private String primaryStatType;
    @JsonProperty("team_id")
    private String teamId;
    @JsonProperty("active_sw")
    private String activeSw;
    @JsonProperty("primary_sport_code")
    private String primarySportCode;
    @JsonProperty("birth_state")
    private String birthState;
    @JsonProperty("weight")
    private String weight;
    @JsonProperty("name_middle")
    private String nameMiddle;
    @JsonProperty("name_display_roster")
    private String nameDisplayRoster;
    @JsonProperty("end_date")
    private String endDate;
    @JsonProperty("jersey_number")
    private String jerseyNumber;
    @JsonProperty("death_state")
    private String deathState;
    @JsonProperty("name_first")
    private String nameFirst;
    @JsonProperty("bats")
    private String bats;
    @JsonProperty("team_code")
    private String teamCode;
    @JsonProperty("birth_city")
    private String birthCity;
    @JsonProperty("name_nick")
    private String nameNick;
    @JsonProperty("status_code")
    private String statusCode;
    @JsonProperty("name_matrilineal")
    private String nameMatrilineal;
    @JsonProperty("team_name")
    private String teamName;
    @JsonProperty("name_display_last_first")
    private String nameDisplayLastFirst;
    @JsonProperty("twitter_id")
    private String twitterId;
    @JsonProperty("name_title")
    private String nameTitle;
    @JsonProperty("file_code")
    private String fileCode;
    @JsonProperty("name_last")
    private String nameLast;
    @JsonProperty("start_date")
    private String startDate;
    @JsonProperty("name_full")
    private String nameFull;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("birth_country")
    public String getBirthCountry() {
        return birthCountry;
    }

    @JsonProperty("birth_country")
    public void setBirthCountry(String birthCountry) {
        this.birthCountry = birthCountry;
    }

    @JsonProperty("name_prefix")
    public String getNamePrefix() {
        return namePrefix;
    }

    @JsonProperty("name_prefix")
    public void setNamePrefix(String namePrefix) {
        this.namePrefix = namePrefix;
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

    @JsonProperty("death_country")
    public String getDeathCountry() {
        return deathCountry;
    }

    @JsonProperty("death_country")
    public void setDeathCountry(String deathCountry) {
        this.deathCountry = deathCountry;
    }

    @JsonProperty("age")
    public String getAge() {
        return age;
    }

    @JsonProperty("age")
    public void setAge(String age) {
        this.age = age;
    }

    @JsonProperty("name_display_first_last_html")
    public String getNameDisplayFirstLastHtml() {
        return nameDisplayFirstLastHtml;
    }

    @JsonProperty("name_display_first_last_html")
    public void setNameDisplayFirstLastHtml(String nameDisplayFirstLastHtml) {
        this.nameDisplayFirstLastHtml = nameDisplayFirstLastHtml;
    }

    @JsonProperty("gender")
    public String getGender() {
        return gender;
    }

    @JsonProperty("gender")
    public void setGender(String gender) {
        this.gender = gender;
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

    @JsonProperty("death_date")
    public String getDeathDate() {
        return deathDate;
    }

    @JsonProperty("death_date")
    public void setDeathDate(String deathDate) {
        this.deathDate = deathDate;
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

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("name_display_last_first_html")
    public String getNameDisplayLastFirstHtml() {
        return nameDisplayLastFirstHtml;
    }

    @JsonProperty("name_display_last_first_html")
    public void setNameDisplayLastFirstHtml(String nameDisplayLastFirstHtml) {
        this.nameDisplayLastFirstHtml = nameDisplayLastFirstHtml;
    }

    @JsonProperty("throws")
    public String getThrows() {
        return _throws;
    }

    @JsonProperty("throws")
    public void setThrows(String _throws) {
        this._throws = _throws;
    }

    @JsonProperty("death_city")
    public String getDeathCity() {
        return deathCity;
    }

    @JsonProperty("death_city")
    public void setDeathCity(String deathCity) {
        this.deathCity = deathCity;
    }

    @JsonProperty("primary_position_txt")
    public String getPrimaryPositionTxt() {
        return primaryPositionTxt;
    }

    @JsonProperty("primary_position_txt")
    public void setPrimaryPositionTxt(String primaryPositionTxt) {
        this.primaryPositionTxt = primaryPositionTxt;
    }

    @JsonProperty("high_school")
    public String getHighSchool() {
        return highSchool;
    }

    @JsonProperty("high_school")
    public void setHighSchool(String highSchool) {
        this.highSchool = highSchool;
    }

    @JsonProperty("name_display_roster_html")
    public String getNameDisplayRosterHtml() {
        return nameDisplayRosterHtml;
    }

    @JsonProperty("name_display_roster_html")
    public void setNameDisplayRosterHtml(String nameDisplayRosterHtml) {
        this.nameDisplayRosterHtml = nameDisplayRosterHtml;
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

    @JsonProperty("status_date")
    public String getStatusDate() {
        return statusDate;
    }

    @JsonProperty("status_date")
    public void setStatusDate(String statusDate) {
        this.statusDate = statusDate;
    }

    @JsonProperty("primary_stat_type")
    public String getPrimaryStatType() {
        return primaryStatType;
    }

    @JsonProperty("primary_stat_type")
    public void setPrimaryStatType(String primaryStatType) {
        this.primaryStatType = primaryStatType;
    }

    @JsonProperty("team_id")
    public String getTeamId() {
        return teamId;
    }

    @JsonProperty("team_id")
    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    @JsonProperty("active_sw")
    public String getActiveSw() {
        return activeSw;
    }

    @JsonProperty("active_sw")
    public void setActiveSw(String activeSw) {
        this.activeSw = activeSw;
    }

    @JsonProperty("primary_sport_code")
    public String getPrimarySportCode() {
        return primarySportCode;
    }

    @JsonProperty("primary_sport_code")
    public void setPrimarySportCode(String primarySportCode) {
        this.primarySportCode = primarySportCode;
    }

    @JsonProperty("birth_state")
    public String getBirthState() {
        return birthState;
    }

    @JsonProperty("birth_state")
    public void setBirthState(String birthState) {
        this.birthState = birthState;
    }

    @JsonProperty("weight")
    public String getWeight() {
        return weight;
    }

    @JsonProperty("weight")
    public void setWeight(String weight) {
        this.weight = weight;
    }

    @JsonProperty("name_middle")
    public String getNameMiddle() {
        return nameMiddle;
    }

    @JsonProperty("name_middle")
    public void setNameMiddle(String nameMiddle) {
        this.nameMiddle = nameMiddle;
    }

    @JsonProperty("name_display_roster")
    public String getNameDisplayRoster() {
        return nameDisplayRoster;
    }

    @JsonProperty("name_display_roster")
    public void setNameDisplayRoster(String nameDisplayRoster) {
        this.nameDisplayRoster = nameDisplayRoster;
    }

    @JsonProperty("end_date")
    public String getEndDate() {
        return endDate;
    }

    @JsonProperty("end_date")
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @JsonProperty("jersey_number")
    public String getJerseyNumber() {
        return jerseyNumber;
    }

    @JsonProperty("jersey_number")
    public void setJerseyNumber(String jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    @JsonProperty("death_state")
    public String getDeathState() {
        return deathState;
    }

    @JsonProperty("death_state")
    public void setDeathState(String deathState) {
        this.deathState = deathState;
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

    @JsonProperty("birth_city")
    public String getBirthCity() {
        return birthCity;
    }

    @JsonProperty("birth_city")
    public void setBirthCity(String birthCity) {
        this.birthCity = birthCity;
    }

    @JsonProperty("name_nick")
    public String getNameNick() {
        return nameNick;
    }

    @JsonProperty("name_nick")
    public void setNameNick(String nameNick) {
        this.nameNick = nameNick;
    }

    @JsonProperty("status_code")
    public String getStatusCode() {
        return statusCode;
    }

    @JsonProperty("status_code")
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    @JsonProperty("name_matrilineal")
    public String getNameMatrilineal() {
        return nameMatrilineal;
    }

    @JsonProperty("name_matrilineal")
    public void setNameMatrilineal(String nameMatrilineal) {
        this.nameMatrilineal = nameMatrilineal;
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

    @JsonProperty("twitter_id")
    public String getTwitterId() {
        return twitterId;
    }

    @JsonProperty("twitter_id")
    public void setTwitterId(String twitterId) {
        this.twitterId = twitterId;
    }

    @JsonProperty("name_title")
    public String getNameTitle() {
        return nameTitle;
    }

    @JsonProperty("name_title")
    public void setNameTitle(String nameTitle) {
        this.nameTitle = nameTitle;
    }

    @JsonProperty("file_code")
    public String getFileCode() {
        return fileCode;
    }

    @JsonProperty("file_code")
    public void setFileCode(String fileCode) {
        this.fileCode = fileCode;
    }

    @JsonProperty("name_last")
    public String getNameLast() {
        return nameLast;
    }

    @JsonProperty("name_last")
    public void setNameLast(String nameLast) {
        this.nameLast = nameLast;
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

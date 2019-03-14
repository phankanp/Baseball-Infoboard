package com.spring.mlbstats.model.LeagueLeaders.PitchingLeaders;

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
        "w",
        "team_name",
        "name_display_first_last",
        "player_id",
        "so",
        "era",
        "sv"
})
public class LeaderPitchingRow {

    @JsonProperty("w")
    private String w;
    @JsonProperty("team_name")
    private String teamName;
    @JsonProperty("name_display_first_last")
    private String nameDisplayFirstLast;
    @JsonProperty("player_id")
    private String playerId;
    @JsonProperty("so")
    private String so;
    @JsonProperty("era")
    private String era;
    @JsonProperty("sv")
    private String sv;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("w")
    public String getW() {
        return w;
    }

    @JsonProperty("w")
    public void setW(String w) {
        this.w = w;
    }

    @JsonProperty("team_name")
    public String getTeamName() {
        return teamName;
    }

    @JsonProperty("team_name")
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    @JsonProperty("name_display_first_last")
    public String getNameDisplayFirstLast() {
        return nameDisplayFirstLast;
    }

    @JsonProperty("name_display_first_last")
    public void setNameDisplayFirstLast(String nameDisplayFirstLast) {
        this.nameDisplayFirstLast = nameDisplayFirstLast;
    }

    @JsonProperty("player_id")
    public String getPlayerId() {
        return playerId;
    }

    @JsonProperty("player_id")
    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so;
    }

    public String getEra() {
        return era;
    }

    public void setEra(String era) {
        this.era = era;
    }

    public String getSv() {
        return sv;
    }

    public void setSv(String sv) {
        this.sv = sv;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}

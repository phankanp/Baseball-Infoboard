package com.spring.mlbstats.model.LeagueLeaders.HittingLeaders;

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
        "hr",
        "team_name",
        "name_display_first_last",
        "player_id",
        "h",
        "rbi",
        "avg"
})
public class LeaderHittingRow {

    @JsonProperty("hr")
    private String hr;
    @JsonProperty("team_name")
    private String teamName;
    @JsonProperty("name_display_first_last")
    private String nameDisplayFirstLast;
    @JsonProperty("player_id")
    private String playerId;
    @JsonProperty("h")
    private String h;
    @JsonProperty("rbi")
    private String rbi;
    @JsonProperty("avg")
    private String avg;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("hr")
    public String getHr() {
        return hr;
    }

    @JsonProperty("hr")
    public void setHr(String hr) {
        this.hr = hr;
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

    @JsonProperty("h")
    public String getH() {
        return h;
    }

    @JsonProperty("h")
    public void setH(String h) {
        this.h = h;
    }

    public String getRbi() {
        return rbi;
    }

    public void setRbi(String rbi) {
        this.rbi = rbi;
    }

    public String getAvg() {
        return avg;
    }

    public void setAvg(String avg) {
        this.avg = avg;
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

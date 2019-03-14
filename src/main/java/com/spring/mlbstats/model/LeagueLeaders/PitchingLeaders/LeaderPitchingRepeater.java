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
        "copyRight",
        "leader_pitching_mux"
})
public class LeaderPitchingRepeater {

    @JsonProperty("copyRight")
    private String copyRight;
    @JsonProperty("leader_pitching_mux")
    private LeaderPitchingMux leaderPitchingMux;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("copyRight")
    public String getCopyRight() {
        return copyRight;
    }

    @JsonProperty("copyRight")
    public void setCopyRight(String copyRight) {
        this.copyRight = copyRight;
    }

    @JsonProperty("leader_pitching_mux")
    public LeaderPitchingMux getLeaderPitchingMux() {
        return leaderPitchingMux;
    }

    @JsonProperty("leader_pitching_mux")
    public void setLeaderPitchingMux(LeaderPitchingMux leaderPitchingMux) {
        this.leaderPitchingMux = leaderPitchingMux;
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

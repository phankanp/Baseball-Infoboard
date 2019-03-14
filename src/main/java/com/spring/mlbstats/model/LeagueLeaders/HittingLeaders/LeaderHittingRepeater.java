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
        "copyRight",
        "leader_hitting_mux"
})
public class LeaderHittingRepeater {

    @JsonProperty("copyRight")
    private String copyRight;
    @JsonProperty("leader_hitting_mux")
    private LeaderHittingMux leaderHittingMux;
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

    @JsonProperty("leader_hitting_mux")
    public LeaderHittingMux getLeaderHittingMux() {
        return leaderHittingMux;
    }

    @JsonProperty("leader_hitting_mux")
    public void setLeaderHittingMux(LeaderHittingMux leaderHittingMux) {
        this.leaderHittingMux = leaderHittingMux;
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

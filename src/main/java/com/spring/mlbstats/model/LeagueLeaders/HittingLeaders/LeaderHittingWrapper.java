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
        "leader_hitting_repeater"
})
public class LeaderHittingWrapper {

    @JsonProperty("leader_hitting_repeater")
    private LeaderHittingRepeater leaderHittingRepeater;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("leader_hitting_repeater")
    public LeaderHittingRepeater getLeaderHittingRepeater() {
        return leaderHittingRepeater;
    }

    @JsonProperty("leader_hitting_repeater")
    public void setLeaderHittingRepeater(LeaderHittingRepeater leaderHittingRepeater) {
        this.leaderHittingRepeater = leaderHittingRepeater;
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

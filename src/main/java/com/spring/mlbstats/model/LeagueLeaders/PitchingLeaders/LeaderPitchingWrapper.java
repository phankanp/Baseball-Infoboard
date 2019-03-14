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
        "leader_pitching_repeater"
})
public class LeaderPitchingWrapper {

    @JsonProperty("leader_pitching_repeater")
    private LeaderPitchingRepeater leaderPitchingRepeater;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("leader_pitching_repeater")
    public LeaderPitchingRepeater getLeaderPitchingRepeater() {
        return leaderPitchingRepeater;
    }

    @JsonProperty("leader_pitching_repeater")
    public void setLeaderPitchingRepeater(LeaderPitchingRepeater leaderPitchingRepeater) {
        this.leaderPitchingRepeater = leaderPitchingRepeater;
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

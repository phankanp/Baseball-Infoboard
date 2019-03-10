package com.spring.mlbstats.model.PlayerDetail.SeasonPitchingStats;

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
        "sport_pitching_tm"
})
public class SeasonPitchingStatsWrapper {

    @JsonProperty("sport_pitching_tm")
    private SeasonPitchingStats seasonPitchingStats;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sport_pitching_tm")
    public SeasonPitchingStats getSeasonPitchingStats() {
        return seasonPitchingStats;
    }

    @JsonProperty("sport_pitching_tm")
    public void setSeasonPitchingStats(SeasonPitchingStats sportPitchingTm) {
        this.seasonPitchingStats = sportPitchingTm;
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

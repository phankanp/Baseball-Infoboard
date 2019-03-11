package com.spring.mlbstats.model.PlayerDetail.SeasonHittingStats;

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
        "seasonHittingStats"
})
public class SeasonHittingStatsWrapper {

    @JsonProperty("sport_hitting_tm")
    private SeasonHittingStats seasonHittingStats;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sport_hitting_tm")
    public SeasonHittingStats getSeasonHittingStats() {
        return seasonHittingStats;
    }

    @JsonProperty("sport_hitting_tm")
    public void setSeasonHittingStats(SeasonHittingStats sportHittingTm) {
        this.seasonHittingStats = sportHittingTm;
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

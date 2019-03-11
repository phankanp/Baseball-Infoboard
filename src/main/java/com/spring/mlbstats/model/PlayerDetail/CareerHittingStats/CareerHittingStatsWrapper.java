package com.spring.mlbstats.model.PlayerDetail.CareerHittingStats;

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
        "sport_career_hitting"
})
public class CareerHittingStatsWrapper {

    @JsonProperty("sport_career_hitting")
    private CareerHittingStats careerHittingStats;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sport_career_hitting")
    public CareerHittingStats getCareerHittingStats() {
        return careerHittingStats;
    }

    @JsonProperty("sport_career_hitting")
    public void setCareerHittingStats(CareerHittingStats careerHittingStats) {
        this.careerHittingStats = careerHittingStats;
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

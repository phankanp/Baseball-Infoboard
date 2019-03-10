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
        "copyRight",
        "queryResults"
})
public class SeasonPitchingStats {

    @JsonProperty("copyRight")
    private String copyRight;
    @JsonProperty("queryResults")
    private SeasonPitchingStatsQueryResults queryResults;
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

    @JsonProperty("queryResults")
    public SeasonPitchingStatsQueryResults getQueryResults() {
        return queryResults;
    }

    @JsonProperty("queryResults")
    public void setQueryResults(SeasonPitchingStatsQueryResults queryResults) {
        this.queryResults = queryResults;
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

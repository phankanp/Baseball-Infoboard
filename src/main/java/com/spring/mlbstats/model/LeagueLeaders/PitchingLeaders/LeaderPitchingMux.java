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
        "sort_column",
        "queryResults"
})
public class LeaderPitchingMux {
    @JsonProperty("sort_column")
    private String sortColumn;
    @JsonProperty("queryResults")
    private LeaderPitchingQueryResults queryResults;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sort_column")
    public String getSortColumn() {
        return sortColumn;
    }

    @JsonProperty("sort_column")
    public void setSortColumn(String sortColumn) {
        this.sortColumn = sortColumn;
    }

    @JsonProperty("queryResults")
    public LeaderPitchingQueryResults getQueryResults() {
        return queryResults;
    }

    @JsonProperty("queryResults")
    public void setQueryResults(LeaderPitchingQueryResults queryResults) {
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

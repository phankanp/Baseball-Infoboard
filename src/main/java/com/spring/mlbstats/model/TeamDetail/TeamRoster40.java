package com.spring.mlbstats.model.TeamDetail;

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
public class TeamRoster40 {
    @JsonProperty("copyRight")
    private String copyRight;
    @JsonProperty("queryResults")
    private TeamRosterQueryResults queryResults;
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
    public TeamRosterQueryResults getQueryResults() {
        return queryResults;
    }

    @JsonProperty("queryResults")
    public void setQueryResults(TeamRosterQueryResults queryResults) {
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

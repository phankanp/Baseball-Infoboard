package com.spring.mlbstats.model.PlayerDetail.ProjectedPitchingStats;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.spring.mlbstats.model.PlayerDetail.PlayerQueryResults;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "copyRight",
        "queryResults"
})
public class ProjPecotaPitching {

    @JsonProperty("copyRight")
    private String copyRight;
    @JsonProperty("queryResults")
    private ProjectedPitchingStatQueryResults queryResults;
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
    public ProjectedPitchingStatQueryResults getQueryResults() {
        return queryResults;
    }

    @JsonProperty("queryResults")
    public void setQueryResults(ProjectedPitchingStatQueryResults queryResults) {
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
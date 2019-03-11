package com.spring.mlbstats.model.PlayerDetail.ProjectedHittingStats;

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
        "created",
        "totalSize",
        "row"
})
public class ProjectHittingStatsQueryResults {

    @JsonProperty("created")
    private String created;
    @JsonProperty("totalSize")
    private String totalSize;
    @JsonProperty("row")
    private ProjectedHittingStatsRow row;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("created")
    public String getCreated() {
        return created;
    }

    @JsonProperty("created")
    public void setCreated(String created) {
        this.created = created;
    }

    @JsonProperty("totalSize")
    public String getTotalSize() {
        return totalSize;
    }

    @JsonProperty("totalSize")
    public void setTotalSize(String totalSize) {
        this.totalSize = totalSize;
    }

    @JsonProperty("row")
    public ProjectedHittingStatsRow getRow() {
        return row;
    }

    @JsonProperty("row")
    public void setRow(ProjectedHittingStatsRow row) {
        this.row = row;
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

package com.spring.mlbstats.model.PlayerDetail.ProjectedPitchingStats;

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
        "proj_pecota_pitching"
})
public class ProjectedPitchingStatsWrapper {

    @JsonProperty("proj_pecota_pitching")
    private ProjPecotaPitching projPecotaPitching;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("proj_pecota_pitching")
    public ProjPecotaPitching getProjPecotaPitching() {
        return projPecotaPitching;
    }

    @JsonProperty("proj_pecota_pitching")
    public void setProjPecotaPitching(ProjPecotaPitching projPecotaPitching) {
        this.projPecotaPitching = projPecotaPitching;
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

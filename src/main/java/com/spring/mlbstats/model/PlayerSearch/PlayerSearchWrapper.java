package com.spring.mlbstats.model.PlayerSearch;

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
        "search_player_all"
})
public class PlayerSearchWrapper {

    @JsonProperty("search_player_all")
    private SearchPlayerAll searchPlayerAll;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("search_player_all")
    public SearchPlayerAll getSearchPlayerAll() {
        return searchPlayerAll;
    }

    @JsonProperty("search_player_all")
    public void setSearchPlayerAll(SearchPlayerAll searchPlayerAll) {
        this.searchPlayerAll = searchPlayerAll;
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

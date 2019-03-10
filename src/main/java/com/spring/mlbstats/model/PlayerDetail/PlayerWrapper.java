package com.spring.mlbstats.model.PlayerDetail;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.spring.mlbstats.model.PlayerDetail.ProjectedPitchingStats.ProjPecotaPitching;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "player_info"
})
public class PlayerWrapper {
    @JsonProperty("player_info")
    private PlayerInfo playerInfo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("player_info")
    public PlayerInfo getPlayerInfo() {
        return playerInfo;
    }

    @JsonProperty("player_info")
    public void setPlayerInfo(PlayerInfo playerInfo) {
        this.playerInfo = playerInfo;
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

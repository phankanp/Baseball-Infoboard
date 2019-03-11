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
        "hr",
        "gidp",
        "player",
        "sac",
        "rbi",
        "tb",
        "slg",
        "avg",
        "bb",
        "ops",
        "hbp",
        "g",
        "d",
        "e",
        "so",
        "sf",
        "tpa",
        "h",
        "cs",
        "obp",
        "t",
        "s",
        "r",
        "sb",
        "sbpct",
        "player_id",
        "ab",
        "ibb"
})
public class ProjectedHittingStatsRow {

    @JsonProperty("hr")
    private String hr;
    @JsonProperty("gidp")
    private String gidp;
    @JsonProperty("player")
    private String player;
    @JsonProperty("sac")
    private String sac;
    @JsonProperty("rbi")
    private String rbi;
    @JsonProperty("tb")
    private String tb;
    @JsonProperty("slg")
    private String slg;
    @JsonProperty("avg")
    private String avg;
    @JsonProperty("bb")
    private String bb;
    @JsonProperty("ops")
    private String ops;
    @JsonProperty("hbp")
    private String hbp;
    @JsonProperty("g")
    private String g;
    @JsonProperty("d")
    private String d;
    @JsonProperty("e")
    private String e;
    @JsonProperty("so")
    private String so;
    @JsonProperty("sf")
    private String sf;
    @JsonProperty("tpa")
    private String tpa;
    @JsonProperty("h")
    private String h;
    @JsonProperty("cs")
    private String cs;
    @JsonProperty("obp")
    private String obp;
    @JsonProperty("t")
    private String t;
    @JsonProperty("s")
    private String s;
    @JsonProperty("r")
    private String r;
    @JsonProperty("sb")
    private String sb;
    @JsonProperty("sbpct")
    private String sbpct;
    @JsonProperty("player_id")
    private String playerId;
    @JsonProperty("ab")
    private String ab;
    @JsonProperty("ibb")
    private String ibb;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("hr")
    public String getHr() {
        return hr;
    }

    @JsonProperty("hr")
    public void setHr(String hr) {
        this.hr = hr;
    }

    @JsonProperty("gidp")
    public String getGidp() {
        return gidp;
    }

    @JsonProperty("gidp")
    public void setGidp(String gidp) {
        this.gidp = gidp;
    }

    @JsonProperty("player")
    public String getPlayer() {
        return player;
    }

    @JsonProperty("player")
    public void setPlayer(String player) {
        this.player = player;
    }

    @JsonProperty("sac")
    public String getSac() {
        return sac;
    }

    @JsonProperty("sac")
    public void setSac(String sac) {
        this.sac = sac;
    }

    @JsonProperty("rbi")
    public String getRbi() {
        return rbi;
    }

    @JsonProperty("rbi")
    public void setRbi(String rbi) {
        this.rbi = rbi;
    }

    @JsonProperty("tb")
    public String getTb() {
        return tb;
    }

    @JsonProperty("tb")
    public void setTb(String tb) {
        this.tb = tb;
    }

    @JsonProperty("slg")
    public String getSlg() {
        return slg;
    }

    @JsonProperty("slg")
    public void setSlg(String slg) {
        this.slg = slg;
    }

    @JsonProperty("avg")
    public String getAvg() {
        return avg;
    }

    @JsonProperty("avg")
    public void setAvg(String avg) {
        this.avg = avg;
    }

    @JsonProperty("bb")
    public String getBb() {
        return bb;
    }

    @JsonProperty("bb")
    public void setBb(String bb) {
        this.bb = bb;
    }

    @JsonProperty("ops")
    public String getOps() {
        return ops;
    }

    @JsonProperty("ops")
    public void setOps(String ops) {
        this.ops = ops;
    }

    @JsonProperty("hbp")
    public String getHbp() {
        return hbp;
    }

    @JsonProperty("hbp")
    public void setHbp(String hbp) {
        this.hbp = hbp;
    }

    @JsonProperty("g")
    public String getG() {
        return g;
    }

    @JsonProperty("g")
    public void setG(String g) {
        this.g = g;
    }

    @JsonProperty("d")
    public String getD() {
        return d;
    }

    @JsonProperty("d")
    public void setD(String d) {
        this.d = d;
    }

    @JsonProperty("e")
    public String getE() {
        return e;
    }

    @JsonProperty("e")
    public void setE(String e) {
        this.e = e;
    }

    @JsonProperty("so")
    public String getSo() {
        return so;
    }

    @JsonProperty("so")
    public void setSo(String so) {
        this.so = so;
    }

    @JsonProperty("sf")
    public String getSf() {
        return sf;
    }

    @JsonProperty("sf")
    public void setSf(String sf) {
        this.sf = sf;
    }

    @JsonProperty("tpa")
    public String getTpa() {
        return tpa;
    }

    @JsonProperty("tpa")
    public void setTpa(String tpa) {
        this.tpa = tpa;
    }

    @JsonProperty("h")
    public String getH() {
        return h;
    }

    @JsonProperty("h")
    public void setH(String h) {
        this.h = h;
    }

    @JsonProperty("cs")
    public String getCs() {
        return cs;
    }

    @JsonProperty("cs")
    public void setCs(String cs) {
        this.cs = cs;
    }

    @JsonProperty("obp")
    public String getObp() {
        return obp;
    }

    @JsonProperty("obp")
    public void setObp(String obp) {
        this.obp = obp;
    }

    @JsonProperty("t")
    public String getT() {
        return t;
    }

    @JsonProperty("t")
    public void setT(String t) {
        this.t = t;
    }

    @JsonProperty("s")
    public String getS() {
        return s;
    }

    @JsonProperty("s")
    public void setS(String s) {
        this.s = s;
    }

    @JsonProperty("r")
    public String getR() {
        return r;
    }

    @JsonProperty("r")
    public void setR(String r) {
        this.r = r;
    }

    @JsonProperty("sb")
    public String getSb() {
        return sb;
    }

    @JsonProperty("sb")
    public void setSb(String sb) {
        this.sb = sb;
    }

    @JsonProperty("sbpct")
    public String getSbpct() {
        return sbpct;
    }

    @JsonProperty("sbpct")
    public void setSbpct(String sbpct) {
        this.sbpct = sbpct;
    }

    @JsonProperty("player_id")
    public String getPlayerId() {
        return playerId;
    }

    @JsonProperty("player_id")
    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    @JsonProperty("ab")
    public String getAb() {
        return ab;
    }

    @JsonProperty("ab")
    public void setAb(String ab) {
        this.ab = ab;
    }

    @JsonProperty("ibb")
    public String getIbb() {
        return ibb;
    }

    @JsonProperty("ibb")
    public void setIbb(String ibb) {
        this.ibb = ibb;
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

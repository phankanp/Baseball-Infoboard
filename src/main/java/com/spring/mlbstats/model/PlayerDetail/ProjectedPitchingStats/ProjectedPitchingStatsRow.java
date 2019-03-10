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
        "hr",
        "player",
        "wpct",
        "era",
        "bsv",
        "outs",
        "sho",
        "sv",
        "whip",
        "qs",
        "bb",
        "g",
        "hld",
        "so",
        "l",
        "hb",
        "svo",
        "h",
        "ip",
        "w",
        "r",
        "pa",
        "player_id",
        "cg",
        "gs",
        "ibb",
        "er"
})
public class ProjectedPitchingStatsRow {

    @JsonProperty("hr")
    private String hr;
    @JsonProperty("player")
    private String player;
    @JsonProperty("wpct")
    private String wpct;
    @JsonProperty("era")
    private String era;
    @JsonProperty("bsv")
    private String bsv;
    @JsonProperty("outs")
    private String outs;
    @JsonProperty("sho")
    private String sho;
    @JsonProperty("sv")
    private String sv;
    @JsonProperty("whip")
    private String whip;
    @JsonProperty("qs")
    private String qs;
    @JsonProperty("bb")
    private String bb;
    @JsonProperty("g")
    private String g;
    @JsonProperty("hld")
    private String hld;
    @JsonProperty("so")
    private String so;
    @JsonProperty("l")
    private String l;
    @JsonProperty("hb")
    private String hb;
    @JsonProperty("svo")
    private String svo;
    @JsonProperty("h")
    private String h;
    @JsonProperty("ip")
    private String ip;
    @JsonProperty("w")
    private String w;
    @JsonProperty("r")
    private String r;
    @JsonProperty("pa")
    private String pa;
    @JsonProperty("player_id")
    private String playerId;
    @JsonProperty("cg")
    private String cg;
    @JsonProperty("gs")
    private String gs;
    @JsonProperty("ibb")
    private String ibb;
    @JsonProperty("er")
    private String er;
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

    @JsonProperty("player")
    public String getPlayer() {
        return player;
    }

    @JsonProperty("player")
    public void setPlayer(String player) {
        this.player = player;
    }

    @JsonProperty("wpct")
    public String getWpct() {
        return wpct;
    }

    @JsonProperty("wpct")
    public void setWpct(String wpct) {
        this.wpct = wpct;
    }

    @JsonProperty("era")
    public String getEra() {
        return era;
    }

    @JsonProperty("era")
    public void setEra(String era) {
        this.era = era;
    }

    @JsonProperty("bsv")
    public String getBsv() {
        return bsv;
    }

    @JsonProperty("bsv")
    public void setBsv(String bsv) {
        this.bsv = bsv;
    }

    @JsonProperty("outs")
    public String getOuts() {
        return outs;
    }

    @JsonProperty("outs")
    public void setOuts(String outs) {
        this.outs = outs;
    }

    @JsonProperty("sho")
    public String getSho() {
        return sho;
    }

    @JsonProperty("sho")
    public void setSho(String sho) {
        this.sho = sho;
    }

    @JsonProperty("sv")
    public String getSv() {
        return sv;
    }

    @JsonProperty("sv")
    public void setSv(String sv) {
        this.sv = sv;
    }

    @JsonProperty("whip")
    public String getWhip() {
        return whip;
    }

    @JsonProperty("whip")
    public void setWhip(String whip) {
        this.whip = whip;
    }

    @JsonProperty("qs")
    public String getQs() {
        return qs;
    }

    @JsonProperty("qs")
    public void setQs(String qs) {
        this.qs = qs;
    }

    @JsonProperty("bb")
    public String getBb() {
        return bb;
    }

    @JsonProperty("bb")
    public void setBb(String bb) {
        this.bb = bb;
    }

    @JsonProperty("g")
    public String getG() {
        return g;
    }

    @JsonProperty("g")
    public void setG(String g) {
        this.g = g;
    }

    @JsonProperty("hld")
    public String getHld() {
        return hld;
    }

    @JsonProperty("hld")
    public void setHld(String hld) {
        this.hld = hld;
    }

    @JsonProperty("so")
    public String getSo() {
        return so;
    }

    @JsonProperty("so")
    public void setSo(String so) {
        this.so = so;
    }

    @JsonProperty("l")
    public String getL() {
        return l;
    }

    @JsonProperty("l")
    public void setL(String l) {
        this.l = l;
    }

    @JsonProperty("hb")
    public String getHb() {
        return hb;
    }

    @JsonProperty("hb")
    public void setHb(String hb) {
        this.hb = hb;
    }

    @JsonProperty("svo")
    public String getSvo() {
        return svo;
    }

    @JsonProperty("svo")
    public void setSvo(String svo) {
        this.svo = svo;
    }

    @JsonProperty("h")
    public String getH() {
        return h;
    }

    @JsonProperty("h")
    public void setH(String h) {
        this.h = h;
    }

    @JsonProperty("ip")
    public String getIp() {
        return ip;
    }

    @JsonProperty("ip")
    public void setIp(String ip) {
        this.ip = ip;
    }

    @JsonProperty("w")
    public String getW() {
        return w;
    }

    @JsonProperty("w")
    public void setW(String w) {
        this.w = w;
    }

    @JsonProperty("r")
    public String getR() {
        return r;
    }

    @JsonProperty("r")
    public void setR(String r) {
        this.r = r;
    }

    @JsonProperty("pa")
    public String getPa() {
        return pa;
    }

    @JsonProperty("pa")
    public void setPa(String pa) {
        this.pa = pa;
    }

    @JsonProperty("player_id")
    public String getPlayerId() {
        return playerId;
    }

    @JsonProperty("player_id")
    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    @JsonProperty("cg")
    public String getCg() {
        return cg;
    }

    @JsonProperty("cg")
    public void setCg(String cg) {
        this.cg = cg;
    }

    @JsonProperty("gs")
    public String getGs() {
        return gs;
    }

    @JsonProperty("gs")
    public void setGs(String gs) {
        this.gs = gs;
    }

    @JsonProperty("ibb")
    public String getIbb() {
        return ibb;
    }

    @JsonProperty("ibb")
    public void setIbb(String ibb) {
        this.ibb = ibb;
    }

    @JsonProperty("er")
    public String getEr() {
        return er;
    }

    @JsonProperty("er")
    public void setEr(String er) {
        this.er = er;
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
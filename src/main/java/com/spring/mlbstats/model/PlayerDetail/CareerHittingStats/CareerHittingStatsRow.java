package com.spring.mlbstats.model.PlayerDetail.CareerHittingStats;

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
        "np",
        "sac",
        "team_count",
        "sport_code",
        "hgnd",
        "rbi",
        "lob",
        "babip",
        "gidp_opp",
        "tb",
        "xbh",
        "sport_id",
        "bb",
        "avg",
        "slg",
        "ops",
        "hbp",
        "g",
        "d",
        "hfly",
        "so",
        "wo",
        "sport",
        "sf",
        "hpop",
        "tpa",
        "h",
        "cs",
        "obp",
        "hldr",
        "t",
        "ao",
        "r",
        "go_ao",
        "sb",
        "ppa",
        "player_id",
        "ab",
        "ibb",
        "roe",
        "go"
})
public class CareerHittingStatsRow {

    @JsonProperty("hr")
    private String hr;
    @JsonProperty("gidp")
    private String gidp;
    @JsonProperty("np")
    private String np;
    @JsonProperty("sac")
    private String sac;
    @JsonProperty("team_count")
    private String teamCount;
    @JsonProperty("sport_code")
    private String sportCode;
    @JsonProperty("hgnd")
    private String hgnd;
    @JsonProperty("rbi")
    private String rbi;
    @JsonProperty("lob")
    private String lob;
    @JsonProperty("babip")
    private String babip;
    @JsonProperty("gidp_opp")
    private String gidpOpp;
    @JsonProperty("tb")
    private String tb;
    @JsonProperty("xbh")
    private String xbh;
    @JsonProperty("sport_id")
    private String sportId;
    @JsonProperty("bb")
    private String bb;
    @JsonProperty("avg")
    private String avg;
    @JsonProperty("slg")
    private String slg;
    @JsonProperty("ops")
    private String ops;
    @JsonProperty("hbp")
    private String hbp;
    @JsonProperty("g")
    private String g;
    @JsonProperty("d")
    private String d;
    @JsonProperty("hfly")
    private String hfly;
    @JsonProperty("so")
    private String so;
    @JsonProperty("wo")
    private String wo;
    @JsonProperty("sport")
    private String sport;
    @JsonProperty("sf")
    private String sf;
    @JsonProperty("hpop")
    private String hpop;
    @JsonProperty("tpa")
    private String tpa;
    @JsonProperty("h")
    private String h;
    @JsonProperty("cs")
    private String cs;
    @JsonProperty("obp")
    private String obp;
    @JsonProperty("hldr")
    private String hldr;
    @JsonProperty("t")
    private String t;
    @JsonProperty("ao")
    private String ao;
    @JsonProperty("r")
    private String r;
    @JsonProperty("go_ao")
    private String goAo;
    @JsonProperty("sb")
    private String sb;
    @JsonProperty("ppa")
    private String ppa;
    @JsonProperty("player_id")
    private String playerId;
    @JsonProperty("ab")
    private String ab;
    @JsonProperty("ibb")
    private String ibb;
    @JsonProperty("roe")
    private String roe;
    @JsonProperty("go")
    private String go;
    private int singles;
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

    @JsonProperty("np")
    public String getNp() {
        return np;
    }

    @JsonProperty("np")
    public void setNp(String np) {
        this.np = np;
    }

    @JsonProperty("sac")
    public String getSac() {
        return sac;
    }

    @JsonProperty("sac")
    public void setSac(String sac) {
        this.sac = sac;
    }

    @JsonProperty("team_count")
    public String getTeamCount() {
        return teamCount;
    }

    @JsonProperty("team_count")
    public void setTeamCount(String teamCount) {
        this.teamCount = teamCount;
    }

    @JsonProperty("sport_code")
    public String getSportCode() {
        return sportCode;
    }

    @JsonProperty("sport_code")
    public void setSportCode(String sportCode) {
        this.sportCode = sportCode;
    }

    @JsonProperty("hgnd")
    public String getHgnd() {
        return hgnd;
    }

    @JsonProperty("hgnd")
    public void setHgnd(String hgnd) {
        this.hgnd = hgnd;
    }

    @JsonProperty("rbi")
    public String getRbi() {
        return rbi;
    }

    @JsonProperty("rbi")
    public void setRbi(String rbi) {
        this.rbi = rbi;
    }

    @JsonProperty("lob")
    public String getLob() {
        return lob;
    }

    @JsonProperty("lob")
    public void setLob(String lob) {
        this.lob = lob;
    }

    @JsonProperty("babip")
    public String getBabip() {
        return babip;
    }

    @JsonProperty("babip")
    public void setBabip(String babip) {
        this.babip = babip;
    }

    @JsonProperty("gidp_opp")
    public String getGidpOpp() {
        return gidpOpp;
    }

    @JsonProperty("gidp_opp")
    public void setGidpOpp(String gidpOpp) {
        this.gidpOpp = gidpOpp;
    }

    @JsonProperty("tb")
    public String getTb() {
        return tb;
    }

    @JsonProperty("tb")
    public void setTb(String tb) {
        this.tb = tb;
    }

    @JsonProperty("xbh")
    public String getXbh() {
        return xbh;
    }

    @JsonProperty("xbh")
    public void setXbh(String xbh) {
        this.xbh = xbh;
    }

    @JsonProperty("sport_id")
    public String getSportId() {
        return sportId;
    }

    @JsonProperty("sport_id")
    public void setSportId(String sportId) {
        this.sportId = sportId;
    }

    @JsonProperty("bb")
    public String getBb() {
        return bb;
    }

    @JsonProperty("bb")
    public void setBb(String bb) {
        this.bb = bb;
    }

    @JsonProperty("avg")
    public String getAvg() {
        return avg;
    }

    @JsonProperty("avg")
    public void setAvg(String avg) {
        this.avg = avg;
    }

    @JsonProperty("slg")
    public String getSlg() {
        return slg;
    }

    @JsonProperty("slg")
    public void setSlg(String slg) {
        this.slg = slg;
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

    @JsonProperty("hfly")
    public String getHfly() {
        return hfly;
    }

    @JsonProperty("hfly")
    public void setHfly(String hfly) {
        this.hfly = hfly;
    }

    @JsonProperty("so")
    public String getSo() {
        return so;
    }

    @JsonProperty("so")
    public void setSo(String so) {
        this.so = so;
    }

    @JsonProperty("wo")
    public String getWo() {
        return wo;
    }

    @JsonProperty("wo")
    public void setWo(String wo) {
        this.wo = wo;
    }

    @JsonProperty("sport")
    public String getSport() {
        return sport;
    }

    @JsonProperty("sport")
    public void setSport(String sport) {
        this.sport = sport;
    }

    @JsonProperty("sf")
    public String getSf() {
        return sf;
    }

    @JsonProperty("sf")
    public void setSf(String sf) {
        this.sf = sf;
    }

    @JsonProperty("hpop")
    public String getHpop() {
        return hpop;
    }

    @JsonProperty("hpop")
    public void setHpop(String hpop) {
        this.hpop = hpop;
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

    @JsonProperty("hldr")
    public String getHldr() {
        return hldr;
    }

    @JsonProperty("hldr")
    public void setHldr(String hldr) {
        this.hldr = hldr;
    }

    @JsonProperty("t")
    public String getT() {
        return t;
    }

    @JsonProperty("t")
    public void setT(String t) {
        this.t = t;
    }

    @JsonProperty("ao")
    public String getAo() {
        return ao;
    }

    @JsonProperty("ao")
    public void setAo(String ao) {
        this.ao = ao;
    }

    @JsonProperty("r")
    public String getR() {
        return r;
    }

    @JsonProperty("r")
    public void setR(String r) {
        this.r = r;
    }

    @JsonProperty("go_ao")
    public String getGoAo() {
        return goAo;
    }

    @JsonProperty("go_ao")
    public void setGoAo(String goAo) {
        this.goAo = goAo;
    }

    @JsonProperty("sb")
    public String getSb() {
        return sb;
    }

    @JsonProperty("sb")
    public void setSb(String sb) {
        this.sb = sb;
    }

    @JsonProperty("ppa")
    public String getPpa() {
        return ppa;
    }

    @JsonProperty("ppa")
    public void setPpa(String ppa) {
        this.ppa = ppa;
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

    @JsonProperty("roe")
    public String getRoe() {
        return roe;
    }

    @JsonProperty("roe")
    public void setRoe(String roe) {
        this.roe = roe;
    }

    @JsonProperty("go")
    public String getGo() {
        return go;
    }

    @JsonProperty("go")
    public void setGo(String go) {
        this.go = go;
    }

    public int getSingles() {
        return Integer.parseInt(h) - Integer.parseInt(xbh);
    }

    public void setSingles(int singles) {
        this.singles = singles;
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

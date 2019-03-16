package com.spring.mlbstats.model.PlayerDetail.SeasonHittingStats;

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
        "gidp",
        "sac",
        "np",
        "sport_code",
        "hgnd",
        "tb",
        "gidp_opp",
        "sport_id",
        "bb",
        "avg",
        "slg",
        "team_full",
        "ops",
        "hbp",
        "league_full",
        "team_abbrev",
        "so",
        "hfly",
        "wo",
        "league_id",
        "sf",
        "team_seq",
        "league",
        "hpop",
        "cs",
        "season",
        "sb",
        "go_ao",
        "ppa",
        "player_id",
        "ibb",
        "team_id",
        "roe",
        "go",
        "hr",
        "rbi",
        "babip",
        "lob",
        "end_date",
        "xbh",
        "league_short",
        "g",
        "d",
        "sport",
        "team_short",
        "tpa",
        "h",
        "obp",
        "hldr",
        "t",
        "ao",
        "r",
        "ab"
})
public class SeasonHittingStatsRow {

    @JsonProperty("gidp")
    private String gidp;
    @JsonProperty("sac")
    private String sac;
    @JsonProperty("np")
    private String np;
    @JsonProperty("sport_code")
    private String sportCode;
    @JsonProperty("hgnd")
    private String hgnd;
    @JsonProperty("tb")
    private String tb;
    @JsonProperty("gidp_opp")
    private String gidpOpp;
    @JsonProperty("sport_id")
    private String sportId;
    @JsonProperty("bb")
    private String bb;
    @JsonProperty("avg")
    private String avg;
    @JsonProperty("slg")
    private String slg;
    @JsonProperty("team_full")
    private String teamFull;
    @JsonProperty("ops")
    private String ops;
    @JsonProperty("hbp")
    private String hbp;
    @JsonProperty("league_full")
    private String leagueFull;
    @JsonProperty("team_abbrev")
    private String teamAbbrev;
    @JsonProperty("so")
    private String so;
    @JsonProperty("hfly")
    private String hfly;
    @JsonProperty("wo")
    private String wo;
    @JsonProperty("league_id")
    private String leagueId;
    @JsonProperty("sf")
    private String sf;
    @JsonProperty("team_seq")
    private String teamSeq;
    @JsonProperty("league")
    private String league;
    @JsonProperty("hpop")
    private String hpop;
    @JsonProperty("cs")
    private String cs;
    @JsonProperty("season")
    private String season;
    @JsonProperty("sb")
    private String sb;
    @JsonProperty("go_ao")
    private String goAo;
    @JsonProperty("ppa")
    private String ppa;
    @JsonProperty("player_id")
    private String playerId;
    @JsonProperty("ibb")
    private String ibb;
    @JsonProperty("team_id")
    private String teamId;
    @JsonProperty("roe")
    private String roe;
    @JsonProperty("go")
    private String go;
    @JsonProperty("hr")
    private String hr;
    @JsonProperty("rbi")
    private String rbi;
    @JsonProperty("babip")
    private String babip;
    @JsonProperty("lob")
    private String lob;
    @JsonProperty("end_date")
    private String endDate;
    @JsonProperty("xbh")
    private String xbh;
    @JsonProperty("league_short")
    private String leagueShort;
    @JsonProperty("g")
    private String g;
    @JsonProperty("d")
    private String d;
    @JsonProperty("sport")
    private String sport;
    @JsonProperty("team_short")
    private String teamShort;
    @JsonProperty("tpa")
    private String tpa;
    @JsonProperty("h")
    private String h;
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
    @JsonProperty("ab")
    private String ab;
    private int singles;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("gidp")
    public String getGidp() {
        return gidp;
    }

    @JsonProperty("gidp")
    public void setGidp(String gidp) {
        this.gidp = gidp;
    }

    @JsonProperty("sac")
    public String getSac() {
        return sac;
    }

    @JsonProperty("sac")
    public void setSac(String sac) {
        this.sac = sac;
    }

    @JsonProperty("np")
    public String getNp() {
        return np;
    }

    @JsonProperty("np")
    public void setNp(String np) {
        this.np = np;
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

    @JsonProperty("tb")
    public String getTb() {
        return tb;
    }

    @JsonProperty("tb")
    public void setTb(String tb) {
        this.tb = tb;
    }

    @JsonProperty("gidp_opp")
    public String getGidpOpp() {
        return gidpOpp;
    }

    @JsonProperty("gidp_opp")
    public void setGidpOpp(String gidpOpp) {
        this.gidpOpp = gidpOpp;
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

    @JsonProperty("team_full")
    public String getTeamFull() {
        return teamFull;
    }

    @JsonProperty("team_full")
    public void setTeamFull(String teamFull) {
        this.teamFull = teamFull;
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

    @JsonProperty("league_full")
    public String getLeagueFull() {
        return leagueFull;
    }

    @JsonProperty("league_full")
    public void setLeagueFull(String leagueFull) {
        this.leagueFull = leagueFull;
    }

    @JsonProperty("team_abbrev")
    public String getTeamAbbrev() {
        return teamAbbrev;
    }

    @JsonProperty("team_abbrev")
    public void setTeamAbbrev(String teamAbbrev) {
        this.teamAbbrev = teamAbbrev;
    }

    @JsonProperty("so")
    public String getSo() {
        return so;
    }

    @JsonProperty("so")
    public void setSo(String so) {
        this.so = so;
    }

    @JsonProperty("hfly")
    public String getHfly() {
        return hfly;
    }

    @JsonProperty("hfly")
    public void setHfly(String hfly) {
        this.hfly = hfly;
    }

    @JsonProperty("wo")
    public String getWo() {
        return wo;
    }

    @JsonProperty("wo")
    public void setWo(String wo) {
        this.wo = wo;
    }

    @JsonProperty("league_id")
    public String getLeagueId() {
        return leagueId;
    }

    @JsonProperty("league_id")
    public void setLeagueId(String leagueId) {
        this.leagueId = leagueId;
    }

    @JsonProperty("sf")
    public String getSf() {
        return sf;
    }

    @JsonProperty("sf")
    public void setSf(String sf) {
        this.sf = sf;
    }

    @JsonProperty("team_seq")
    public String getTeamSeq() {
        return teamSeq;
    }

    @JsonProperty("team_seq")
    public void setTeamSeq(String teamSeq) {
        this.teamSeq = teamSeq;
    }

    @JsonProperty("league")
    public String getLeague() {
        return league;
    }

    @JsonProperty("league")
    public void setLeague(String league) {
        this.league = league;
    }

    @JsonProperty("hpop")
    public String getHpop() {
        return hpop;
    }

    @JsonProperty("hpop")
    public void setHpop(String hpop) {
        this.hpop = hpop;
    }

    @JsonProperty("cs")
    public String getCs() {
        return cs;
    }

    @JsonProperty("cs")
    public void setCs(String cs) {
        this.cs = cs;
    }

    @JsonProperty("season")
    public String getSeason() {
        return season;
    }

    @JsonProperty("season")
    public void setSeason(String season) {
        this.season = season;
    }

    @JsonProperty("sb")
    public String getSb() {
        return sb;
    }

    @JsonProperty("sb")
    public void setSb(String sb) {
        this.sb = sb;
    }

    @JsonProperty("go_ao")
    public String getGoAo() {
        return goAo;
    }

    @JsonProperty("go_ao")
    public void setGoAo(String goAo) {
        this.goAo = goAo;
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

    @JsonProperty("ibb")
    public String getIbb() {
        return ibb;
    }

    @JsonProperty("ibb")
    public void setIbb(String ibb) {
        this.ibb = ibb;
    }

    @JsonProperty("team_id")
    public String getTeamId() {
        return teamId;
    }

    @JsonProperty("team_id")
    public void setTeamId(String teamId) {
        this.teamId = teamId;
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

    @JsonProperty("hr")
    public String getHr() {
        return hr;
    }

    @JsonProperty("hr")
    public void setHr(String hr) {
        this.hr = hr;
    }

    @JsonProperty("rbi")
    public String getRbi() {
        return rbi;
    }

    @JsonProperty("rbi")
    public void setRbi(String rbi) {
        this.rbi = rbi;
    }

    @JsonProperty("babip")
    public String getBabip() {
        return babip;
    }

    @JsonProperty("babip")
    public void setBabip(String babip) {
        this.babip = babip;
    }

    @JsonProperty("lob")
    public String getLob() {
        return lob;
    }

    @JsonProperty("lob")
    public void setLob(String lob) {
        this.lob = lob;
    }

    @JsonProperty("end_date")
    public String getEndDate() {
        return endDate;
    }

    @JsonProperty("end_date")
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @JsonProperty("xbh")
    public String getXbh() {
        return xbh;
    }

    @JsonProperty("xbh")
    public void setXbh(String xbh) {
        this.xbh = xbh;
    }

    @JsonProperty("league_short")
    public String getLeagueShort() {
        return leagueShort;
    }

    @JsonProperty("league_short")
    public void setLeagueShort(String leagueShort) {
        this.leagueShort = leagueShort;
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

    @JsonProperty("sport")
    public String getSport() {
        return sport;
    }

    @JsonProperty("sport")
    public void setSport(String sport) {
        this.sport = sport;
    }

    @JsonProperty("team_short")
    public String getTeamShort() {
        return teamShort;
    }

    @JsonProperty("team_short")
    public void setTeamShort(String teamShort) {
        this.teamShort = teamShort;
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

    @JsonProperty("ab")
    public String getAb() {
        return ab;
    }

    @JsonProperty("ab")
    public void setAb(String ab) {
        this.ab = ab;
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

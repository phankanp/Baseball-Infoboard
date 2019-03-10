package com.spring.mlbstats.model.PlayerDetail.SeasonPitchingStats;

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
        "h9",
        "np",
        "tr",
        "gf",
        "sport_code",
        "bqs",
        "hgnd",
        "sho",
        "bq",
        "gidp_opp",
        "bk",
        "kbb",
        "sport_id",
        "hr9",
        "sv",
        "slg",
        "bb",
        "whip",
        "avg",
        "ops",
        "team_full",
        "db",
        "league_full",
        "team_abbrev",
        "hfly",
        "so",
        "tbf",
        "bb9",
        "league_id",
        "wp",
        "team_seq",
        "hpop",
        "league",
        "hb",
        "cs",
        "pgs",
        "season",
        "sb",
        "go_ao",
        "ppa",
        "cg",
        "player_id",
        "gs",
        "ibb",
        "team_id",
        "pk",
        "go",
        "hr",
        "irs",
        "wpct",
        "era",
        "babip",
        "end_date",
        "rs9",
        "qs",
        "league_short",
        "g",
        "ir",
        "hld",
        "k9",
        "sport",
        "team_short",
        "l",
        "svo",
        "h",
        "ip",
        "obp",
        "w",
        "hldr",
        "ao",
        "s",
        "r",
        "spct",
        "pip",
        "ab",
        "er"
})
public class SeasonPitchingStatsRow {

    @JsonProperty("gidp")
    private String gidp;
    @JsonProperty("h9")
    private String h9;
    @JsonProperty("np")
    private String np;
    @JsonProperty("tr")
    private String tr;
    @JsonProperty("gf")
    private String gf;
    @JsonProperty("sport_code")
    private String sportCode;
    @JsonProperty("bqs")
    private String bqs;
    @JsonProperty("hgnd")
    private String hgnd;
    @JsonProperty("sho")
    private String sho;
    @JsonProperty("bq")
    private String bq;
    @JsonProperty("gidp_opp")
    private String gidpOpp;
    @JsonProperty("bk")
    private String bk;
    @JsonProperty("kbb")
    private String kbb;
    @JsonProperty("sport_id")
    private String sportId;
    @JsonProperty("hr9")
    private String hr9;
    @JsonProperty("sv")
    private String sv;
    @JsonProperty("slg")
    private String slg;
    @JsonProperty("bb")
    private String bb;
    @JsonProperty("whip")
    private String whip;
    @JsonProperty("avg")
    private String avg;
    @JsonProperty("ops")
    private String ops;
    @JsonProperty("team_full")
    private String teamFull;
    @JsonProperty("db")
    private String db;
    @JsonProperty("league_full")
    private String leagueFull;
    @JsonProperty("team_abbrev")
    private String teamAbbrev;
    @JsonProperty("hfly")
    private String hfly;
    @JsonProperty("so")
    private String so;
    @JsonProperty("tbf")
    private String tbf;
    @JsonProperty("bb9")
    private String bb9;
    @JsonProperty("league_id")
    private String leagueId;
    @JsonProperty("wp")
    private String wp;
    @JsonProperty("team_seq")
    private String teamSeq;
    @JsonProperty("hpop")
    private String hpop;
    @JsonProperty("league")
    private String league;
    @JsonProperty("hb")
    private String hb;
    @JsonProperty("cs")
    private String cs;
    @JsonProperty("pgs")
    private String pgs;
    @JsonProperty("season")
    private String season;
    @JsonProperty("sb")
    private String sb;
    @JsonProperty("go_ao")
    private String goAo;
    @JsonProperty("ppa")
    private String ppa;
    @JsonProperty("cg")
    private String cg;
    @JsonProperty("player_id")
    private String playerId;
    @JsonProperty("gs")
    private String gs;
    @JsonProperty("ibb")
    private String ibb;
    @JsonProperty("team_id")
    private String teamId;
    @JsonProperty("pk")
    private String pk;
    @JsonProperty("go")
    private String go;
    @JsonProperty("hr")
    private String hr;
    @JsonProperty("irs")
    private String irs;
    @JsonProperty("wpct")
    private String wpct;
    @JsonProperty("era")
    private String era;
    @JsonProperty("babip")
    private String babip;
    @JsonProperty("end_date")
    private String endDate;
    @JsonProperty("rs9")
    private String rs9;
    @JsonProperty("qs")
    private String qs;
    @JsonProperty("league_short")
    private String leagueShort;
    @JsonProperty("g")
    private String g;
    @JsonProperty("ir")
    private String ir;
    @JsonProperty("hld")
    private String hld;
    @JsonProperty("k9")
    private String k9;
    @JsonProperty("sport")
    private String sport;
    @JsonProperty("team_short")
    private String teamShort;
    @JsonProperty("l")
    private String l;
    @JsonProperty("svo")
    private String svo;
    @JsonProperty("h")
    private String h;
    @JsonProperty("ip")
    private String ip;
    @JsonProperty("obp")
    private String obp;
    @JsonProperty("w")
    private String w;
    @JsonProperty("hldr")
    private String hldr;
    @JsonProperty("ao")
    private String ao;
    @JsonProperty("s")
    private String s;
    @JsonProperty("r")
    private String r;
    @JsonProperty("spct")
    private String spct;
    @JsonProperty("pip")
    private String pip;
    @JsonProperty("ab")
    private String ab;
    @JsonProperty("er")
    private String er;
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

    @JsonProperty("h9")
    public String getH9() {
        return h9;
    }

    @JsonProperty("h9")
    public void setH9(String h9) {
        this.h9 = h9;
    }

    @JsonProperty("np")
    public String getNp() {
        return np;
    }

    @JsonProperty("np")
    public void setNp(String np) {
        this.np = np;
    }

    @JsonProperty("tr")
    public String getTr() {
        return tr;
    }

    @JsonProperty("tr")
    public void setTr(String tr) {
        this.tr = tr;
    }

    @JsonProperty("gf")
    public String getGf() {
        return gf;
    }

    @JsonProperty("gf")
    public void setGf(String gf) {
        this.gf = gf;
    }

    @JsonProperty("sport_code")
    public String getSportCode() {
        return sportCode;
    }

    @JsonProperty("sport_code")
    public void setSportCode(String sportCode) {
        this.sportCode = sportCode;
    }

    @JsonProperty("bqs")
    public String getBqs() {
        return bqs;
    }

    @JsonProperty("bqs")
    public void setBqs(String bqs) {
        this.bqs = bqs;
    }

    @JsonProperty("hgnd")
    public String getHgnd() {
        return hgnd;
    }

    @JsonProperty("hgnd")
    public void setHgnd(String hgnd) {
        this.hgnd = hgnd;
    }

    @JsonProperty("sho")
    public String getSho() {
        return sho;
    }

    @JsonProperty("sho")
    public void setSho(String sho) {
        this.sho = sho;
    }

    @JsonProperty("bq")
    public String getBq() {
        return bq;
    }

    @JsonProperty("bq")
    public void setBq(String bq) {
        this.bq = bq;
    }

    @JsonProperty("gidp_opp")
    public String getGidpOpp() {
        return gidpOpp;
    }

    @JsonProperty("gidp_opp")
    public void setGidpOpp(String gidpOpp) {
        this.gidpOpp = gidpOpp;
    }

    @JsonProperty("bk")
    public String getBk() {
        return bk;
    }

    @JsonProperty("bk")
    public void setBk(String bk) {
        this.bk = bk;
    }

    @JsonProperty("kbb")
    public String getKbb() {
        return kbb;
    }

    @JsonProperty("kbb")
    public void setKbb(String kbb) {
        this.kbb = kbb;
    }

    @JsonProperty("sport_id")
    public String getSportId() {
        return sportId;
    }

    @JsonProperty("sport_id")
    public void setSportId(String sportId) {
        this.sportId = sportId;
    }

    @JsonProperty("hr9")
    public String getHr9() {
        return hr9;
    }

    @JsonProperty("hr9")
    public void setHr9(String hr9) {
        this.hr9 = hr9;
    }

    @JsonProperty("sv")
    public String getSv() {
        return sv;
    }

    @JsonProperty("sv")
    public void setSv(String sv) {
        this.sv = sv;
    }

    @JsonProperty("slg")
    public String getSlg() {
        return slg;
    }

    @JsonProperty("slg")
    public void setSlg(String slg) {
        this.slg = slg;
    }

    @JsonProperty("bb")
    public String getBb() {
        return bb;
    }

    @JsonProperty("bb")
    public void setBb(String bb) {
        this.bb = bb;
    }

    @JsonProperty("whip")
    public String getWhip() {
        return whip;
    }

    @JsonProperty("whip")
    public void setWhip(String whip) {
        this.whip = whip;
    }

    @JsonProperty("avg")
    public String getAvg() {
        return avg;
    }

    @JsonProperty("avg")
    public void setAvg(String avg) {
        this.avg = avg;
    }

    @JsonProperty("ops")
    public String getOps() {
        return ops;
    }

    @JsonProperty("ops")
    public void setOps(String ops) {
        this.ops = ops;
    }

    @JsonProperty("team_full")
    public String getTeamFull() {
        return teamFull;
    }

    @JsonProperty("team_full")
    public void setTeamFull(String teamFull) {
        this.teamFull = teamFull;
    }

    @JsonProperty("db")
    public String getDb() {
        return db;
    }

    @JsonProperty("db")
    public void setDb(String db) {
        this.db = db;
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

    @JsonProperty("tbf")
    public String getTbf() {
        return tbf;
    }

    @JsonProperty("tbf")
    public void setTbf(String tbf) {
        this.tbf = tbf;
    }

    @JsonProperty("bb9")
    public String getBb9() {
        return bb9;
    }

    @JsonProperty("bb9")
    public void setBb9(String bb9) {
        this.bb9 = bb9;
    }

    @JsonProperty("league_id")
    public String getLeagueId() {
        return leagueId;
    }

    @JsonProperty("league_id")
    public void setLeagueId(String leagueId) {
        this.leagueId = leagueId;
    }

    @JsonProperty("wp")
    public String getWp() {
        return wp;
    }

    @JsonProperty("wp")
    public void setWp(String wp) {
        this.wp = wp;
    }

    @JsonProperty("team_seq")
    public String getTeamSeq() {
        return teamSeq;
    }

    @JsonProperty("team_seq")
    public void setTeamSeq(String teamSeq) {
        this.teamSeq = teamSeq;
    }

    @JsonProperty("hpop")
    public String getHpop() {
        return hpop;
    }

    @JsonProperty("hpop")
    public void setHpop(String hpop) {
        this.hpop = hpop;
    }

    @JsonProperty("league")
    public String getLeague() {
        return league;
    }

    @JsonProperty("league")
    public void setLeague(String league) {
        this.league = league;
    }

    @JsonProperty("hb")
    public String getHb() {
        return hb;
    }

    @JsonProperty("hb")
    public void setHb(String hb) {
        this.hb = hb;
    }

    @JsonProperty("cs")
    public String getCs() {
        return cs;
    }

    @JsonProperty("cs")
    public void setCs(String cs) {
        this.cs = cs;
    }

    @JsonProperty("pgs")
    public String getPgs() {
        return pgs;
    }

    @JsonProperty("pgs")
    public void setPgs(String pgs) {
        this.pgs = pgs;
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

    @JsonProperty("cg")
    public String getCg() {
        return cg;
    }

    @JsonProperty("cg")
    public void setCg(String cg) {
        this.cg = cg;
    }

    @JsonProperty("player_id")
    public String getPlayerId() {
        return playerId;
    }

    @JsonProperty("player_id")
    public void setPlayerId(String playerId) {
        this.playerId = playerId;
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

    @JsonProperty("team_id")
    public String getTeamId() {
        return teamId;
    }

    @JsonProperty("team_id")
    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    @JsonProperty("pk")
    public String getPk() {
        return pk;
    }

    @JsonProperty("pk")
    public void setPk(String pk) {
        this.pk = pk;
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

    @JsonProperty("irs")
    public String getIrs() {
        return irs;
    }

    @JsonProperty("irs")
    public void setIrs(String irs) {
        this.irs = irs;
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

    @JsonProperty("babip")
    public String getBabip() {
        return babip;
    }

    @JsonProperty("babip")
    public void setBabip(String babip) {
        this.babip = babip;
    }

    @JsonProperty("end_date")
    public String getEndDate() {
        return endDate;
    }

    @JsonProperty("end_date")
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @JsonProperty("rs9")
    public String getRs9() {
        return rs9;
    }

    @JsonProperty("rs9")
    public void setRs9(String rs9) {
        this.rs9 = rs9;
    }

    @JsonProperty("qs")
    public String getQs() {
        return qs;
    }

    @JsonProperty("qs")
    public void setQs(String qs) {
        this.qs = qs;
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

    @JsonProperty("ir")
    public String getIr() {
        return ir;
    }

    @JsonProperty("ir")
    public void setIr(String ir) {
        this.ir = ir;
    }

    @JsonProperty("hld")
    public String getHld() {
        return hld;
    }

    @JsonProperty("hld")
    public void setHld(String hld) {
        this.hld = hld;
    }

    @JsonProperty("k9")
    public String getK9() {
        return k9;
    }

    @JsonProperty("k9")
    public void setK9(String k9) {
        this.k9 = k9;
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

    @JsonProperty("l")
    public String getL() {
        return l;
    }

    @JsonProperty("l")
    public void setL(String l) {
        this.l = l;
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

    @JsonProperty("obp")
    public String getObp() {
        return obp;
    }

    @JsonProperty("obp")
    public void setObp(String obp) {
        this.obp = obp;
    }

    @JsonProperty("w")
    public String getW() {
        return w;
    }

    @JsonProperty("w")
    public void setW(String w) {
        this.w = w;
    }

    @JsonProperty("hldr")
    public String getHldr() {
        return hldr;
    }

    @JsonProperty("hldr")
    public void setHldr(String hldr) {
        this.hldr = hldr;
    }

    @JsonProperty("ao")
    public String getAo() {
        return ao;
    }

    @JsonProperty("ao")
    public void setAo(String ao) {
        this.ao = ao;
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

    @JsonProperty("spct")
    public String getSpct() {
        return spct;
    }

    @JsonProperty("spct")
    public void setSpct(String spct) {
        this.spct = spct;
    }

    @JsonProperty("pip")
    public String getPip() {
        return pip;
    }

    @JsonProperty("pip")
    public void setPip(String pip) {
        this.pip = pip;
    }

    @JsonProperty("ab")
    public String getAb() {
        return ab;
    }

    @JsonProperty("ab")
    public void setAb(String ab) {
        this.ab = ab;
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

package com.spring.mlbstats.model.TeamDetail;

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
        "StatID",
        "TeamID",
        "SeasonType",
        "Season",
        "Name",
        "Team",
        "GlobalTeamID",
        "Updated",
        "Games",
        "FantasyPoints",
        "AtBats",
        "Runs",
        "Hits",
        "Singles",
        "Doubles",
        "Triples",
        "HomeRuns",
        "RunsBattedIn",
        "BattingAverage",
        "Outs",
        "Strikeouts",
        "Walks",
        "HitByPitch",
        "Sacrifices",
        "SacrificeFlies",
        "GroundIntoDoublePlay",
        "StolenBases",
        "CaughtStealing",
        "PitchesSeen",
        "OnBasePercentage",
        "SluggingPercentage",
        "OnBasePlusSlugging",
        "Errors",
        "Wins",
        "Losses",
        "Saves",
        "InningsPitchedDecimal",
        "TotalOutsPitched",
        "InningsPitchedFull",
        "InningsPitchedOuts",
        "EarnedRunAverage",
        "PitchingHits",
        "PitchingRuns",
        "PitchingEarnedRuns",
        "PitchingWalks",
        "PitchingStrikeouts",
        "PitchingHomeRuns",
        "PitchesThrown",
        "PitchesThrownStrikes",
        "WalksHitsPerInningsPitched",
        "PitchingBattingAverageAgainst",
        "GrandSlams",
        "FantasyPointsFanDuel",
        "FantasyPointsDraftKings",
        "FantasyPointsYahoo",
        "PlateAppearances",
        "TotalBases",
        "FlyOuts",
        "GroundOuts",
        "LineOuts",
        "PopOuts",
        "IntentionalWalks",
        "ReachedOnError",
        "BallsInPlay",
        "BattingAverageOnBallsInPlay",
        "WeightedOnBasePercentage",
        "PitchingSingles",
        "PitchingDoubles",
        "PitchingTriples",
        "PitchingGrandSlams",
        "PitchingHitByPitch",
        "PitchingSacrifices",
        "PitchingSacrificeFlies",
        "PitchingGroundIntoDoublePlay",
        "PitchingCompleteGames",
        "PitchingShutOuts",
        "PitchingNoHitters",
        "PitchingPerfectGames",
        "PitchingPlateAppearances",
        "PitchingTotalBases",
        "PitchingFlyOuts",
        "PitchingGroundOuts",
        "PitchingLineOuts",
        "PitchingPopOuts",
        "PitchingIntentionalWalks",
        "PitchingReachedOnError",
        "PitchingCatchersInterference",
        "PitchingBallsInPlay",
        "PitchingOnBasePercentage",
        "PitchingSluggingPercentage",
        "PitchingOnBasePlusSlugging",
        "PitchingStrikeoutsPerNineInnings",
        "PitchingWalksPerNineInnings",
        "PitchingBattingAverageOnBallsInPlay",
        "PitchingWeightedOnBasePercentage",
        "DoublePlays",
        "PitchingDoublePlays",
        "BattingOrderConfirmed",
        "IsolatedPower",
        "FieldingIndependentPitching",
        "PitchingQualityStarts",
        "PitchingInningStarted",
        "LeftOnBase",
        "PitchingHolds",
        "PitchingBlownSaves",
        "SubstituteBattingOrder",
        "SubstituteBattingOrderSequence",
        "FantasyPointsFantasyDraft"
})
public class TeamStat {

    @JsonProperty("StatID")
    private Integer statID;
    @JsonProperty("TeamID")
    private Integer teamID;
    @JsonProperty("SeasonType")
    private Integer seasonType;
    @JsonProperty("Season")
    private Integer season;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Team")
    private String team;
    @JsonProperty("GlobalTeamID")
    private Integer globalTeamID;
    @JsonProperty("Updated")
    private String updated;
    @JsonProperty("Games")
    private Integer games;
    @JsonProperty("FantasyPoints")
    private Double fantasyPoints;
    @JsonProperty("AtBats")
    private Double atBats;
    @JsonProperty("Runs")
    private Double runs;
    @JsonProperty("Hits")
    private Double hits;
    @JsonProperty("Singles")
    private Double singles;
    @JsonProperty("Doubles")
    private Double doubles;
    @JsonProperty("Triples")
    private Double triples;
    @JsonProperty("HomeRuns")
    private Double homeRuns;
    @JsonProperty("RunsBattedIn")
    private Double runsBattedIn;
    @JsonProperty("BattingAverage")
    private Double battingAverage;
    @JsonProperty("Outs")
    private Double outs;
    @JsonProperty("Strikeouts")
    private Double strikeouts;
    @JsonProperty("Walks")
    private Double walks;
    @JsonProperty("HitByPitch")
    private Double hitByPitch;
    @JsonProperty("Sacrifices")
    private Double sacrifices;
    @JsonProperty("SacrificeFlies")
    private Double sacrificeFlies;
    @JsonProperty("GroundIntoDoublePlay")
    private Double groundIntoDoublePlay;
    @JsonProperty("StolenBases")
    private Double stolenBases;
    @JsonProperty("CaughtStealing")
    private Double caughtStealing;
    @JsonProperty("PitchesSeen")
    private Double pitchesSeen;
    @JsonProperty("OnBasePercentage")
    private Double onBasePercentage;
    @JsonProperty("SluggingPercentage")
    private Double sluggingPercentage;
    @JsonProperty("OnBasePlusSlugging")
    private Double onBasePlusSlugging;
    @JsonProperty("Errors")
    private Double errors;
    @JsonProperty("Wins")
    private Double wins;
    @JsonProperty("Losses")
    private Double losses;
    @JsonProperty("Saves")
    private Double saves;
    @JsonProperty("InningsPitchedDecimal")
    private Double inningsPitchedDecimal;
    @JsonProperty("TotalOutsPitched")
    private Double totalOutsPitched;
    @JsonProperty("InningsPitchedFull")
    private Double inningsPitchedFull;
    @JsonProperty("InningsPitchedOuts")
    private Double inningsPitchedOuts;
    @JsonProperty("EarnedRunAverage")
    private Double earnedRunAverage;
    @JsonProperty("PitchingHits")
    private Double pitchingHits;
    @JsonProperty("PitchingRuns")
    private Double pitchingRuns;
    @JsonProperty("PitchingEarnedRuns")
    private Double pitchingEarnedRuns;
    @JsonProperty("PitchingWalks")
    private Double pitchingWalks;
    @JsonProperty("PitchingStrikeouts")
    private Double pitchingStrikeouts;
    @JsonProperty("PitchingHomeRuns")
    private Double pitchingHomeRuns;
    @JsonProperty("PitchesThrown")
    private Double pitchesThrown;
    @JsonProperty("PitchesThrownStrikes")
    private Double pitchesThrownStrikes;
    @JsonProperty("WalksHitsPerInningsPitched")
    private Double walksHitsPerInningsPitched;
    @JsonProperty("PitchingBattingAverageAgainst")
    private Double pitchingBattingAverageAgainst;
    @JsonProperty("GrandSlams")
    private Double grandSlams;
    @JsonProperty("FantasyPointsFanDuel")
    private Double fantasyPointsFanDuel;
    @JsonProperty("FantasyPointsDraftKings")
    private Double fantasyPointsDraftKings;
    @JsonProperty("FantasyPointsYahoo")
    private Double fantasyPointsYahoo;
    @JsonProperty("PlateAppearances")
    private Double plateAppearances;
    @JsonProperty("TotalBases")
    private Double totalBases;
    @JsonProperty("FlyOuts")
    private Double flyOuts;
    @JsonProperty("GroundOuts")
    private Double groundOuts;
    @JsonProperty("LineOuts")
    private Double lineOuts;
    @JsonProperty("PopOuts")
    private Double popOuts;
    @JsonProperty("IntentionalWalks")
    private Double intentionalWalks;
    @JsonProperty("ReachedOnError")
    private Double reachedOnError;
    @JsonProperty("BallsInPlay")
    private Double ballsInPlay;
    @JsonProperty("BattingAverageOnBallsInPlay")
    private Double battingAverageOnBallsInPlay;
    @JsonProperty("WeightedOnBasePercentage")
    private Double weightedOnBasePercentage;
    @JsonProperty("PitchingSingles")
    private Double pitchingSingles;
    @JsonProperty("PitchingDoubles")
    private Double pitchingDoubles;
    @JsonProperty("PitchingTriples")
    private Double pitchingTriples;
    @JsonProperty("PitchingGrandSlams")
    private Double pitchingGrandSlams;
    @JsonProperty("PitchingHitByPitch")
    private Double pitchingHitByPitch;
    @JsonProperty("PitchingSacrifices")
    private Double pitchingSacrifices;
    @JsonProperty("PitchingSacrificeFlies")
    private Double pitchingSacrificeFlies;
    @JsonProperty("PitchingGroundIntoDoublePlay")
    private Double pitchingGroundIntoDoublePlay;
    @JsonProperty("PitchingCompleteGames")
    private Double pitchingCompleteGames;
    @JsonProperty("PitchingShutOuts")
    private Double pitchingShutOuts;
    @JsonProperty("PitchingNoHitters")
    private Double pitchingNoHitters;
    @JsonProperty("PitchingPerfectGames")
    private Double pitchingPerfectGames;
    @JsonProperty("PitchingPlateAppearances")
    private Double pitchingPlateAppearances;
    @JsonProperty("PitchingTotalBases")
    private Double pitchingTotalBases;
    @JsonProperty("PitchingFlyOuts")
    private Double pitchingFlyOuts;
    @JsonProperty("PitchingGroundOuts")
    private Double pitchingGroundOuts;
    @JsonProperty("PitchingLineOuts")
    private Double pitchingLineOuts;
    @JsonProperty("PitchingPopOuts")
    private Double pitchingPopOuts;
    @JsonProperty("PitchingIntentionalWalks")
    private Double pitchingIntentionalWalks;
    @JsonProperty("PitchingReachedOnError")
    private Double pitchingReachedOnError;
    @JsonProperty("PitchingCatchersInterference")
    private Double pitchingCatchersInterference;
    @JsonProperty("PitchingBallsInPlay")
    private Double pitchingBallsInPlay;
    @JsonProperty("PitchingOnBasePercentage")
    private Double pitchingOnBasePercentage;
    @JsonProperty("PitchingSluggingPercentage")
    private Double pitchingSluggingPercentage;
    @JsonProperty("PitchingOnBasePlusSlugging")
    private Double pitchingOnBasePlusSlugging;
    @JsonProperty("PitchingStrikeoutsPerNineInnings")
    private Double pitchingStrikeoutsPerNineInnings;
    @JsonProperty("PitchingWalksPerNineInnings")
    private Double pitchingWalksPerNineInnings;
    @JsonProperty("PitchingBattingAverageOnBallsInPlay")
    private Double pitchingBattingAverageOnBallsInPlay;
    @JsonProperty("PitchingWeightedOnBasePercentage")
    private Double pitchingWeightedOnBasePercentage;
    @JsonProperty("DoublePlays")
    private Double doublePlays;
    @JsonProperty("PitchingDoublePlays")
    private Double pitchingDoublePlays;
    @JsonProperty("BattingOrderConfirmed")
    private Boolean battingOrderConfirmed;
    @JsonProperty("IsolatedPower")
    private Double isolatedPower;
    @JsonProperty("FieldingIndependentPitching")
    private Double fieldingIndependentPitching;
    @JsonProperty("PitchingQualityStarts")
    private Double pitchingQualityStarts;
    @JsonProperty("PitchingInningStarted")
    private Object pitchingInningStarted;
    @JsonProperty("LeftOnBase")
    private Double leftOnBase;
    @JsonProperty("PitchingHolds")
    private Double pitchingHolds;
    @JsonProperty("PitchingBlownSaves")
    private Double pitchingBlownSaves;
    @JsonProperty("SubstituteBattingOrder")
    private Object substituteBattingOrder;
    @JsonProperty("SubstituteBattingOrderSequence")
    private Object substituteBattingOrderSequence;
    @JsonProperty("FantasyPointsFantasyDraft")
    private Double fantasyPointsFantasyDraft;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("StatID")
    public Integer getStatID() {
        return statID;
    }

    @JsonProperty("StatID")
    public void setStatID(Integer statID) {
        this.statID = statID;
    }

    @JsonProperty("TeamID")
    public Integer getTeamID() {
        return teamID;
    }

    @JsonProperty("TeamID")
    public void setTeamID(Integer teamID) {
        this.teamID = teamID;
    }

    @JsonProperty("SeasonType")
    public Integer getSeasonType() {
        return seasonType;
    }

    @JsonProperty("SeasonType")
    public void setSeasonType(Integer seasonType) {
        this.seasonType = seasonType;
    }

    @JsonProperty("Season")
    public Integer getSeason() {
        return season;
    }

    @JsonProperty("Season")
    public void setSeason(Integer season) {
        this.season = season;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("Team")
    public String getTeam() {
        return team;
    }

    @JsonProperty("Team")
    public void setTeam(String team) {
        this.team = team;
    }

    @JsonProperty("GlobalTeamID")
    public Integer getGlobalTeamID() {
        return globalTeamID;
    }

    @JsonProperty("GlobalTeamID")
    public void setGlobalTeamID(Integer globalTeamID) {
        this.globalTeamID = globalTeamID;
    }

    @JsonProperty("Updated")
    public String getUpdated() {
        return updated;
    }

    @JsonProperty("Updated")
    public void setUpdated(String updated) {
        this.updated = updated;
    }

    @JsonProperty("Games")
    public Integer getGames() {
        return games;
    }

    @JsonProperty("Games")
    public void setGames(Integer games) {
        this.games = games;
    }

    @JsonProperty("FantasyPoints")
    public Double getFantasyPoints() {
        return fantasyPoints;
    }

    @JsonProperty("FantasyPoints")
    public void setFantasyPoints(Double fantasyPoints) {
        this.fantasyPoints = fantasyPoints;
    }

    @JsonProperty("AtBats")
    public Double getAtBats() {
        return atBats;
    }

    @JsonProperty("AtBats")
    public void setAtBats(Double atBats) {
        this.atBats = atBats;
    }

    @JsonProperty("Runs")
    public Double getRuns() {
        return runs;
    }

    @JsonProperty("Runs")
    public void setRuns(Double runs) {
        this.runs = runs;
    }

    @JsonProperty("Hits")
    public Double getHits() {
        return hits;
    }

    @JsonProperty("Hits")
    public void setHits(Double hits) {
        this.hits = hits;
    }

    @JsonProperty("Singles")
    public Double getSingles() {
        return singles;
    }

    @JsonProperty("Singles")
    public void setSingles(Double singles) {
        this.singles = singles;
    }

    @JsonProperty("Doubles")
    public Double getDoubles() {
        return doubles;
    }

    @JsonProperty("Doubles")
    public void setDoubles(Double doubles) {
        this.doubles = doubles;
    }

    @JsonProperty("Triples")
    public Double getTriples() {
        return triples;
    }

    @JsonProperty("Triples")
    public void setTriples(Double triples) {
        this.triples = triples;
    }

    @JsonProperty("HomeRuns")
    public Double getHomeRuns() {
        return homeRuns;
    }

    @JsonProperty("HomeRuns")
    public void setHomeRuns(Double homeRuns) {
        this.homeRuns = homeRuns;
    }

    @JsonProperty("RunsBattedIn")
    public Double getRunsBattedIn() {
        return runsBattedIn;
    }

    @JsonProperty("RunsBattedIn")
    public void setRunsBattedIn(Double runsBattedIn) {
        this.runsBattedIn = runsBattedIn;
    }

    @JsonProperty("BattingAverage")
    public Double getBattingAverage() {
        return battingAverage;
    }

    @JsonProperty("BattingAverage")
    public void setBattingAverage(Double battingAverage) {
        this.battingAverage = battingAverage;
    }

    @JsonProperty("Outs")
    public Double getOuts() {
        return outs;
    }

    @JsonProperty("Outs")
    public void setOuts(Double outs) {
        this.outs = outs;
    }

    @JsonProperty("Strikeouts")
    public Double getStrikeouts() {
        return strikeouts;
    }

    @JsonProperty("Strikeouts")
    public void setStrikeouts(Double strikeouts) {
        this.strikeouts = strikeouts;
    }

    @JsonProperty("Walks")
    public Double getWalks() {
        return walks;
    }

    @JsonProperty("Walks")
    public void setWalks(Double walks) {
        this.walks = walks;
    }

    @JsonProperty("HitByPitch")
    public Double getHitByPitch() {
        return hitByPitch;
    }

    @JsonProperty("HitByPitch")
    public void setHitByPitch(Double hitByPitch) {
        this.hitByPitch = hitByPitch;
    }

    @JsonProperty("Sacrifices")
    public Double getSacrifices() {
        return sacrifices;
    }

    @JsonProperty("Sacrifices")
    public void setSacrifices(Double sacrifices) {
        this.sacrifices = sacrifices;
    }

    @JsonProperty("SacrificeFlies")
    public Double getSacrificeFlies() {
        return sacrificeFlies;
    }

    @JsonProperty("SacrificeFlies")
    public void setSacrificeFlies(Double sacrificeFlies) {
        this.sacrificeFlies = sacrificeFlies;
    }

    @JsonProperty("GroundIntoDoublePlay")
    public Double getGroundIntoDoublePlay() {
        return groundIntoDoublePlay;
    }

    @JsonProperty("GroundIntoDoublePlay")
    public void setGroundIntoDoublePlay(Double groundIntoDoublePlay) {
        this.groundIntoDoublePlay = groundIntoDoublePlay;
    }

    @JsonProperty("StolenBases")
    public Double getStolenBases() {
        return stolenBases;
    }

    @JsonProperty("StolenBases")
    public void setStolenBases(Double stolenBases) {
        this.stolenBases = stolenBases;
    }

    @JsonProperty("CaughtStealing")
    public Double getCaughtStealing() {
        return caughtStealing;
    }

    @JsonProperty("CaughtStealing")
    public void setCaughtStealing(Double caughtStealing) {
        this.caughtStealing = caughtStealing;
    }

    @JsonProperty("PitchesSeen")
    public Double getPitchesSeen() {
        return pitchesSeen;
    }

    @JsonProperty("PitchesSeen")
    public void setPitchesSeen(Double pitchesSeen) {
        this.pitchesSeen = pitchesSeen;
    }

    @JsonProperty("OnBasePercentage")
    public Double getOnBasePercentage() {
        return onBasePercentage;
    }

    @JsonProperty("OnBasePercentage")
    public void setOnBasePercentage(Double onBasePercentage) {
        this.onBasePercentage = onBasePercentage;
    }

    @JsonProperty("SluggingPercentage")
    public Double getSluggingPercentage() {
        return sluggingPercentage;
    }

    @JsonProperty("SluggingPercentage")
    public void setSluggingPercentage(Double sluggingPercentage) {
        this.sluggingPercentage = sluggingPercentage;
    }

    @JsonProperty("OnBasePlusSlugging")
    public Double getOnBasePlusSlugging() {
        return onBasePlusSlugging;
    }

    @JsonProperty("OnBasePlusSlugging")
    public void setOnBasePlusSlugging(Double onBasePlusSlugging) {
        this.onBasePlusSlugging = onBasePlusSlugging;
    }

    @JsonProperty("Errors")
    public Double getErrors() {
        return errors;
    }

    @JsonProperty("Errors")
    public void setErrors(Double errors) {
        this.errors = errors;
    }

    @JsonProperty("Wins")
    public Double getWins() {
        return wins;
    }

    @JsonProperty("Wins")
    public void setWins(Double wins) {
        this.wins = wins;
    }

    @JsonProperty("Losses")
    public Double getLosses() {
        return losses;
    }

    @JsonProperty("Losses")
    public void setLosses(Double losses) {
        this.losses = losses;
    }

    @JsonProperty("Saves")
    public Double getSaves() {
        return saves;
    }

    @JsonProperty("Saves")
    public void setSaves(Double saves) {
        this.saves = saves;
    }

    @JsonProperty("InningsPitchedDecimal")
    public Double getInningsPitchedDecimal() {
        return inningsPitchedDecimal;
    }

    @JsonProperty("InningsPitchedDecimal")
    public void setInningsPitchedDecimal(Double inningsPitchedDecimal) {
        this.inningsPitchedDecimal = inningsPitchedDecimal;
    }

    @JsonProperty("TotalOutsPitched")
    public Double getTotalOutsPitched() {
        return totalOutsPitched;
    }

    @JsonProperty("TotalOutsPitched")
    public void setTotalOutsPitched(Double totalOutsPitched) {
        this.totalOutsPitched = totalOutsPitched;
    }

    @JsonProperty("InningsPitchedFull")
    public Double getInningsPitchedFull() {
        return inningsPitchedFull;
    }

    @JsonProperty("InningsPitchedFull")
    public void setInningsPitchedFull(Double inningsPitchedFull) {
        this.inningsPitchedFull = inningsPitchedFull;
    }

    @JsonProperty("InningsPitchedOuts")
    public Double getInningsPitchedOuts() {
        return inningsPitchedOuts;
    }

    @JsonProperty("InningsPitchedOuts")
    public void setInningsPitchedOuts(Double inningsPitchedOuts) {
        this.inningsPitchedOuts = inningsPitchedOuts;
    }

    @JsonProperty("EarnedRunAverage")
    public Double getEarnedRunAverage() {
        return earnedRunAverage;
    }

    @JsonProperty("EarnedRunAverage")
    public void setEarnedRunAverage(Double earnedRunAverage) {
        this.earnedRunAverage = earnedRunAverage;
    }

    @JsonProperty("PitchingHits")
    public Double getPitchingHits() {
        return pitchingHits;
    }

    @JsonProperty("PitchingHits")
    public void setPitchingHits(Double pitchingHits) {
        this.pitchingHits = pitchingHits;
    }

    @JsonProperty("PitchingRuns")
    public Double getPitchingRuns() {
        return pitchingRuns;
    }

    @JsonProperty("PitchingRuns")
    public void setPitchingRuns(Double pitchingRuns) {
        this.pitchingRuns = pitchingRuns;
    }

    @JsonProperty("PitchingEarnedRuns")
    public Double getPitchingEarnedRuns() {
        return pitchingEarnedRuns;
    }

    @JsonProperty("PitchingEarnedRuns")
    public void setPitchingEarnedRuns(Double pitchingEarnedRuns) {
        this.pitchingEarnedRuns = pitchingEarnedRuns;
    }

    @JsonProperty("PitchingWalks")
    public Double getPitchingWalks() {
        return pitchingWalks;
    }

    @JsonProperty("PitchingWalks")
    public void setPitchingWalks(Double pitchingWalks) {
        this.pitchingWalks = pitchingWalks;
    }

    @JsonProperty("PitchingStrikeouts")
    public Double getPitchingStrikeouts() {
        return pitchingStrikeouts;
    }

    @JsonProperty("PitchingStrikeouts")
    public void setPitchingStrikeouts(Double pitchingStrikeouts) {
        this.pitchingStrikeouts = pitchingStrikeouts;
    }

    @JsonProperty("PitchingHomeRuns")
    public Double getPitchingHomeRuns() {
        return pitchingHomeRuns;
    }

    @JsonProperty("PitchingHomeRuns")
    public void setPitchingHomeRuns(Double pitchingHomeRuns) {
        this.pitchingHomeRuns = pitchingHomeRuns;
    }

    @JsonProperty("PitchesThrown")
    public Double getPitchesThrown() {
        return pitchesThrown;
    }

    @JsonProperty("PitchesThrown")
    public void setPitchesThrown(Double pitchesThrown) {
        this.pitchesThrown = pitchesThrown;
    }

    @JsonProperty("PitchesThrownStrikes")
    public Double getPitchesThrownStrikes() {
        return pitchesThrownStrikes;
    }

    @JsonProperty("PitchesThrownStrikes")
    public void setPitchesThrownStrikes(Double pitchesThrownStrikes) {
        this.pitchesThrownStrikes = pitchesThrownStrikes;
    }

    @JsonProperty("WalksHitsPerInningsPitched")
    public Double getWalksHitsPerInningsPitched() {
        return walksHitsPerInningsPitched;
    }

    @JsonProperty("WalksHitsPerInningsPitched")
    public void setWalksHitsPerInningsPitched(Double walksHitsPerInningsPitched) {
        this.walksHitsPerInningsPitched = walksHitsPerInningsPitched;
    }

    @JsonProperty("PitchingBattingAverageAgainst")
    public Double getPitchingBattingAverageAgainst() {
        return pitchingBattingAverageAgainst;
    }

    @JsonProperty("PitchingBattingAverageAgainst")
    public void setPitchingBattingAverageAgainst(Double pitchingBattingAverageAgainst) {
        this.pitchingBattingAverageAgainst = pitchingBattingAverageAgainst;
    }

    @JsonProperty("GrandSlams")
    public Double getGrandSlams() {
        return grandSlams;
    }

    @JsonProperty("GrandSlams")
    public void setGrandSlams(Double grandSlams) {
        this.grandSlams = grandSlams;
    }

    @JsonProperty("FantasyPointsFanDuel")
    public Double getFantasyPointsFanDuel() {
        return fantasyPointsFanDuel;
    }

    @JsonProperty("FantasyPointsFanDuel")
    public void setFantasyPointsFanDuel(Double fantasyPointsFanDuel) {
        this.fantasyPointsFanDuel = fantasyPointsFanDuel;
    }

    @JsonProperty("FantasyPointsDraftKings")
    public Double getFantasyPointsDraftKings() {
        return fantasyPointsDraftKings;
    }

    @JsonProperty("FantasyPointsDraftKings")
    public void setFantasyPointsDraftKings(Double fantasyPointsDraftKings) {
        this.fantasyPointsDraftKings = fantasyPointsDraftKings;
    }

    @JsonProperty("FantasyPointsYahoo")
    public Double getFantasyPointsYahoo() {
        return fantasyPointsYahoo;
    }

    @JsonProperty("FantasyPointsYahoo")
    public void setFantasyPointsYahoo(Double fantasyPointsYahoo) {
        this.fantasyPointsYahoo = fantasyPointsYahoo;
    }

    @JsonProperty("PlateAppearances")
    public Double getPlateAppearances() {
        return plateAppearances;
    }

    @JsonProperty("PlateAppearances")
    public void setPlateAppearances(Double plateAppearances) {
        this.plateAppearances = plateAppearances;
    }

    @JsonProperty("TotalBases")
    public Double getTotalBases() {
        return totalBases;
    }

    @JsonProperty("TotalBases")
    public void setTotalBases(Double totalBases) {
        this.totalBases = totalBases;
    }

    @JsonProperty("FlyOuts")
    public Double getFlyOuts() {
        return flyOuts;
    }

    @JsonProperty("FlyOuts")
    public void setFlyOuts(Double flyOuts) {
        this.flyOuts = flyOuts;
    }

    @JsonProperty("GroundOuts")
    public Double getGroundOuts() {
        return groundOuts;
    }

    @JsonProperty("GroundOuts")
    public void setGroundOuts(Double groundOuts) {
        this.groundOuts = groundOuts;
    }

    @JsonProperty("LineOuts")
    public Double getLineOuts() {
        return lineOuts;
    }

    @JsonProperty("LineOuts")
    public void setLineOuts(Double lineOuts) {
        this.lineOuts = lineOuts;
    }

    @JsonProperty("PopOuts")
    public Double getPopOuts() {
        return popOuts;
    }

    @JsonProperty("PopOuts")
    public void setPopOuts(Double popOuts) {
        this.popOuts = popOuts;
    }

    @JsonProperty("IntentionalWalks")
    public Double getIntentionalWalks() {
        return intentionalWalks;
    }

    @JsonProperty("IntentionalWalks")
    public void setIntentionalWalks(Double intentionalWalks) {
        this.intentionalWalks = intentionalWalks;
    }

    @JsonProperty("ReachedOnError")
    public Double getReachedOnError() {
        return reachedOnError;
    }

    @JsonProperty("ReachedOnError")
    public void setReachedOnError(Double reachedOnError) {
        this.reachedOnError = reachedOnError;
    }

    @JsonProperty("BallsInPlay")
    public Double getBallsInPlay() {
        return ballsInPlay;
    }

    @JsonProperty("BallsInPlay")
    public void setBallsInPlay(Double ballsInPlay) {
        this.ballsInPlay = ballsInPlay;
    }

    @JsonProperty("BattingAverageOnBallsInPlay")
    public Double getBattingAverageOnBallsInPlay() {
        return battingAverageOnBallsInPlay;
    }

    @JsonProperty("BattingAverageOnBallsInPlay")
    public void setBattingAverageOnBallsInPlay(Double battingAverageOnBallsInPlay) {
        this.battingAverageOnBallsInPlay = battingAverageOnBallsInPlay;
    }

    @JsonProperty("WeightedOnBasePercentage")
    public Double getWeightedOnBasePercentage() {
        return weightedOnBasePercentage;
    }

    @JsonProperty("WeightedOnBasePercentage")
    public void setWeightedOnBasePercentage(Double weightedOnBasePercentage) {
        this.weightedOnBasePercentage = weightedOnBasePercentage;
    }

    @JsonProperty("PitchingSingles")
    public Double getPitchingSingles() {
        return pitchingSingles;
    }

    @JsonProperty("PitchingSingles")
    public void setPitchingSingles(Double pitchingSingles) {
        this.pitchingSingles = pitchingSingles;
    }

    @JsonProperty("PitchingDoubles")
    public Double getPitchingDoubles() {
        return pitchingDoubles;
    }

    @JsonProperty("PitchingDoubles")
    public void setPitchingDoubles(Double pitchingDoubles) {
        this.pitchingDoubles = pitchingDoubles;
    }

    @JsonProperty("PitchingTriples")
    public Double getPitchingTriples() {
        return pitchingTriples;
    }

    @JsonProperty("PitchingTriples")
    public void setPitchingTriples(Double pitchingTriples) {
        this.pitchingTriples = pitchingTriples;
    }

    @JsonProperty("PitchingGrandSlams")
    public Double getPitchingGrandSlams() {
        return pitchingGrandSlams;
    }

    @JsonProperty("PitchingGrandSlams")
    public void setPitchingGrandSlams(Double pitchingGrandSlams) {
        this.pitchingGrandSlams = pitchingGrandSlams;
    }

    @JsonProperty("PitchingHitByPitch")
    public Double getPitchingHitByPitch() {
        return pitchingHitByPitch;
    }

    @JsonProperty("PitchingHitByPitch")
    public void setPitchingHitByPitch(Double pitchingHitByPitch) {
        this.pitchingHitByPitch = pitchingHitByPitch;
    }

    @JsonProperty("PitchingSacrifices")
    public Double getPitchingSacrifices() {
        return pitchingSacrifices;
    }

    @JsonProperty("PitchingSacrifices")
    public void setPitchingSacrifices(Double pitchingSacrifices) {
        this.pitchingSacrifices = pitchingSacrifices;
    }

    @JsonProperty("PitchingSacrificeFlies")
    public Double getPitchingSacrificeFlies() {
        return pitchingSacrificeFlies;
    }

    @JsonProperty("PitchingSacrificeFlies")
    public void setPitchingSacrificeFlies(Double pitchingSacrificeFlies) {
        this.pitchingSacrificeFlies = pitchingSacrificeFlies;
    }

    @JsonProperty("PitchingGroundIntoDoublePlay")
    public Double getPitchingGroundIntoDoublePlay() {
        return pitchingGroundIntoDoublePlay;
    }

    @JsonProperty("PitchingGroundIntoDoublePlay")
    public void setPitchingGroundIntoDoublePlay(Double pitchingGroundIntoDoublePlay) {
        this.pitchingGroundIntoDoublePlay = pitchingGroundIntoDoublePlay;
    }

    @JsonProperty("PitchingCompleteGames")
    public Double getPitchingCompleteGames() {
        return pitchingCompleteGames;
    }

    @JsonProperty("PitchingCompleteGames")
    public void setPitchingCompleteGames(Double pitchingCompleteGames) {
        this.pitchingCompleteGames = pitchingCompleteGames;
    }

    @JsonProperty("PitchingShutOuts")
    public Double getPitchingShutOuts() {
        return pitchingShutOuts;
    }

    @JsonProperty("PitchingShutOuts")
    public void setPitchingShutOuts(Double pitchingShutOuts) {
        this.pitchingShutOuts = pitchingShutOuts;
    }

    @JsonProperty("PitchingNoHitters")
    public Double getPitchingNoHitters() {
        return pitchingNoHitters;
    }

    @JsonProperty("PitchingNoHitters")
    public void setPitchingNoHitters(Double pitchingNoHitters) {
        this.pitchingNoHitters = pitchingNoHitters;
    }

    @JsonProperty("PitchingPerfectGames")
    public Double getPitchingPerfectGames() {
        return pitchingPerfectGames;
    }

    @JsonProperty("PitchingPerfectGames")
    public void setPitchingPerfectGames(Double pitchingPerfectGames) {
        this.pitchingPerfectGames = pitchingPerfectGames;
    }

    @JsonProperty("PitchingPlateAppearances")
    public Double getPitchingPlateAppearances() {
        return pitchingPlateAppearances;
    }

    @JsonProperty("PitchingPlateAppearances")
    public void setPitchingPlateAppearances(Double pitchingPlateAppearances) {
        this.pitchingPlateAppearances = pitchingPlateAppearances;
    }

    @JsonProperty("PitchingTotalBases")
    public Double getPitchingTotalBases() {
        return pitchingTotalBases;
    }

    @JsonProperty("PitchingTotalBases")
    public void setPitchingTotalBases(Double pitchingTotalBases) {
        this.pitchingTotalBases = pitchingTotalBases;
    }

    @JsonProperty("PitchingFlyOuts")
    public Double getPitchingFlyOuts() {
        return pitchingFlyOuts;
    }

    @JsonProperty("PitchingFlyOuts")
    public void setPitchingFlyOuts(Double pitchingFlyOuts) {
        this.pitchingFlyOuts = pitchingFlyOuts;
    }

    @JsonProperty("PitchingGroundOuts")
    public Double getPitchingGroundOuts() {
        return pitchingGroundOuts;
    }

    @JsonProperty("PitchingGroundOuts")
    public void setPitchingGroundOuts(Double pitchingGroundOuts) {
        this.pitchingGroundOuts = pitchingGroundOuts;
    }

    @JsonProperty("PitchingLineOuts")
    public Double getPitchingLineOuts() {
        return pitchingLineOuts;
    }

    @JsonProperty("PitchingLineOuts")
    public void setPitchingLineOuts(Double pitchingLineOuts) {
        this.pitchingLineOuts = pitchingLineOuts;
    }

    @JsonProperty("PitchingPopOuts")
    public Double getPitchingPopOuts() {
        return pitchingPopOuts;
    }

    @JsonProperty("PitchingPopOuts")
    public void setPitchingPopOuts(Double pitchingPopOuts) {
        this.pitchingPopOuts = pitchingPopOuts;
    }

    @JsonProperty("PitchingIntentionalWalks")
    public Double getPitchingIntentionalWalks() {
        return pitchingIntentionalWalks;
    }

    @JsonProperty("PitchingIntentionalWalks")
    public void setPitchingIntentionalWalks(Double pitchingIntentionalWalks) {
        this.pitchingIntentionalWalks = pitchingIntentionalWalks;
    }

    @JsonProperty("PitchingReachedOnError")
    public Double getPitchingReachedOnError() {
        return pitchingReachedOnError;
    }

    @JsonProperty("PitchingReachedOnError")
    public void setPitchingReachedOnError(Double pitchingReachedOnError) {
        this.pitchingReachedOnError = pitchingReachedOnError;
    }

    @JsonProperty("PitchingCatchersInterference")
    public Double getPitchingCatchersInterference() {
        return pitchingCatchersInterference;
    }

    @JsonProperty("PitchingCatchersInterference")
    public void setPitchingCatchersInterference(Double pitchingCatchersInterference) {
        this.pitchingCatchersInterference = pitchingCatchersInterference;
    }

    @JsonProperty("PitchingBallsInPlay")
    public Double getPitchingBallsInPlay() {
        return pitchingBallsInPlay;
    }

    @JsonProperty("PitchingBallsInPlay")
    public void setPitchingBallsInPlay(Double pitchingBallsInPlay) {
        this.pitchingBallsInPlay = pitchingBallsInPlay;
    }

    @JsonProperty("PitchingOnBasePercentage")
    public Double getPitchingOnBasePercentage() {
        return pitchingOnBasePercentage;
    }

    @JsonProperty("PitchingOnBasePercentage")
    public void setPitchingOnBasePercentage(Double pitchingOnBasePercentage) {
        this.pitchingOnBasePercentage = pitchingOnBasePercentage;
    }

    @JsonProperty("PitchingSluggingPercentage")
    public Double getPitchingSluggingPercentage() {
        return pitchingSluggingPercentage;
    }

    @JsonProperty("PitchingSluggingPercentage")
    public void setPitchingSluggingPercentage(Double pitchingSluggingPercentage) {
        this.pitchingSluggingPercentage = pitchingSluggingPercentage;
    }

    @JsonProperty("PitchingOnBasePlusSlugging")
    public Double getPitchingOnBasePlusSlugging() {
        return pitchingOnBasePlusSlugging;
    }

    @JsonProperty("PitchingOnBasePlusSlugging")
    public void setPitchingOnBasePlusSlugging(Double pitchingOnBasePlusSlugging) {
        this.pitchingOnBasePlusSlugging = pitchingOnBasePlusSlugging;
    }

    @JsonProperty("PitchingStrikeoutsPerNineInnings")
    public Double getPitchingStrikeoutsPerNineInnings() {
        return pitchingStrikeoutsPerNineInnings;
    }

    @JsonProperty("PitchingStrikeoutsPerNineInnings")
    public void setPitchingStrikeoutsPerNineInnings(Double pitchingStrikeoutsPerNineInnings) {
        this.pitchingStrikeoutsPerNineInnings = pitchingStrikeoutsPerNineInnings;
    }

    @JsonProperty("PitchingWalksPerNineInnings")
    public Double getPitchingWalksPerNineInnings() {
        return pitchingWalksPerNineInnings;
    }

    @JsonProperty("PitchingWalksPerNineInnings")
    public void setPitchingWalksPerNineInnings(Double pitchingWalksPerNineInnings) {
        this.pitchingWalksPerNineInnings = pitchingWalksPerNineInnings;
    }

    @JsonProperty("PitchingBattingAverageOnBallsInPlay")
    public Double getPitchingBattingAverageOnBallsInPlay() {
        return pitchingBattingAverageOnBallsInPlay;
    }

    @JsonProperty("PitchingBattingAverageOnBallsInPlay")
    public void setPitchingBattingAverageOnBallsInPlay(Double pitchingBattingAverageOnBallsInPlay) {
        this.pitchingBattingAverageOnBallsInPlay = pitchingBattingAverageOnBallsInPlay;
    }

    @JsonProperty("PitchingWeightedOnBasePercentage")
    public Double getPitchingWeightedOnBasePercentage() {
        return pitchingWeightedOnBasePercentage;
    }

    @JsonProperty("PitchingWeightedOnBasePercentage")
    public void setPitchingWeightedOnBasePercentage(Double pitchingWeightedOnBasePercentage) {
        this.pitchingWeightedOnBasePercentage = pitchingWeightedOnBasePercentage;
    }

    @JsonProperty("DoublePlays")
    public Double getDoublePlays() {
        return doublePlays;
    }

    @JsonProperty("DoublePlays")
    public void setDoublePlays(Double doublePlays) {
        this.doublePlays = doublePlays;
    }

    @JsonProperty("PitchingDoublePlays")
    public Double getPitchingDoublePlays() {
        return pitchingDoublePlays;
    }

    @JsonProperty("PitchingDoublePlays")
    public void setPitchingDoublePlays(Double pitchingDoublePlays) {
        this.pitchingDoublePlays = pitchingDoublePlays;
    }

    @JsonProperty("BattingOrderConfirmed")
    public Boolean getBattingOrderConfirmed() {
        return battingOrderConfirmed;
    }

    @JsonProperty("BattingOrderConfirmed")
    public void setBattingOrderConfirmed(Boolean battingOrderConfirmed) {
        this.battingOrderConfirmed = battingOrderConfirmed;
    }

    @JsonProperty("IsolatedPower")
    public Double getIsolatedPower() {
        return isolatedPower;
    }

    @JsonProperty("IsolatedPower")
    public void setIsolatedPower(Double isolatedPower) {
        this.isolatedPower = isolatedPower;
    }

    @JsonProperty("FieldingIndependentPitching")
    public Double getFieldingIndependentPitching() {
        return fieldingIndependentPitching;
    }

    @JsonProperty("FieldingIndependentPitching")
    public void setFieldingIndependentPitching(Double fieldingIndependentPitching) {
        this.fieldingIndependentPitching = fieldingIndependentPitching;
    }

    @JsonProperty("PitchingQualityStarts")
    public Double getPitchingQualityStarts() {
        return pitchingQualityStarts;
    }

    @JsonProperty("PitchingQualityStarts")
    public void setPitchingQualityStarts(Double pitchingQualityStarts) {
        this.pitchingQualityStarts = pitchingQualityStarts;
    }

    @JsonProperty("PitchingInningStarted")
    public Object getPitchingInningStarted() {
        return pitchingInningStarted;
    }

    @JsonProperty("PitchingInningStarted")
    public void setPitchingInningStarted(Object pitchingInningStarted) {
        this.pitchingInningStarted = pitchingInningStarted;
    }

    @JsonProperty("LeftOnBase")
    public Double getLeftOnBase() {
        return leftOnBase;
    }

    @JsonProperty("LeftOnBase")
    public void setLeftOnBase(Double leftOnBase) {
        this.leftOnBase = leftOnBase;
    }

    @JsonProperty("PitchingHolds")
    public Double getPitchingHolds() {
        return pitchingHolds;
    }

    @JsonProperty("PitchingHolds")
    public void setPitchingHolds(Double pitchingHolds) {
        this.pitchingHolds = pitchingHolds;
    }

    @JsonProperty("PitchingBlownSaves")
    public Double getPitchingBlownSaves() {
        return pitchingBlownSaves;
    }

    @JsonProperty("PitchingBlownSaves")
    public void setPitchingBlownSaves(Double pitchingBlownSaves) {
        this.pitchingBlownSaves = pitchingBlownSaves;
    }

    @JsonProperty("SubstituteBattingOrder")
    public Object getSubstituteBattingOrder() {
        return substituteBattingOrder;
    }

    @JsonProperty("SubstituteBattingOrder")
    public void setSubstituteBattingOrder(Object substituteBattingOrder) {
        this.substituteBattingOrder = substituteBattingOrder;
    }

    @JsonProperty("SubstituteBattingOrderSequence")
    public Object getSubstituteBattingOrderSequence() {
        return substituteBattingOrderSequence;
    }

    @JsonProperty("SubstituteBattingOrderSequence")
    public void setSubstituteBattingOrderSequence(Object substituteBattingOrderSequence) {
        this.substituteBattingOrderSequence = substituteBattingOrderSequence;
    }

    @JsonProperty("FantasyPointsFantasyDraft")
    public Double getFantasyPointsFantasyDraft() {
        return fantasyPointsFantasyDraft;
    }

    @JsonProperty("FantasyPointsFantasyDraft")
    public void setFantasyPointsFantasyDraft(Double fantasyPointsFantasyDraft) {
        this.fantasyPointsFantasyDraft = fantasyPointsFantasyDraft;
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
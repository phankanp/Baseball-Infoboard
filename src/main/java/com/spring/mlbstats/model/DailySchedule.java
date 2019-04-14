package com.spring.mlbstats.model;

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
        "GameID",
        "Season",
        "SeasonType",
        "Status",
        "Day",
        "DateTime",
        "AwayTeam",
        "HomeTeam",
        "AwayTeamID",
        "HomeTeamID",
        "RescheduledGameID",
        "StadiumID",
        "Channel",
        "Inning",
        "InningHalf",
        "AwayTeamRuns",
        "HomeTeamRuns",
        "AwayTeamHits",
        "HomeTeamHits",
        "AwayTeamErrors",
        "HomeTeamErrors",
        "WinningPitcherID",
        "LosingPitcherID",
        "SavingPitcherID",
        "Attendance",
        "AwayTeamProbablePitcherID",
        "HomeTeamProbablePitcherID",
        "Outs",
        "Balls",
        "Strikes",
        "CurrentPitcherID",
        "CurrentHitterID",
        "AwayTeamStartingPitcherID",
        "HomeTeamStartingPitcherID",
        "CurrentPitchingTeamID",
        "CurrentHittingTeamID",
        "PointSpread",
        "OverUnder",
        "AwayTeamMoneyLine",
        "HomeTeamMoneyLine",
        "ForecastTempLow",
        "ForecastTempHigh",
        "ForecastDescription",
        "ForecastWindChill",
        "ForecastWindSpeed",
        "ForecastWindDirection",
        "RescheduledFromGameID",
        "RunnerOnFirst",
        "RunnerOnSecond",
        "RunnerOnThird",
        "AwayTeamStartingPitcher",
        "HomeTeamStartingPitcher",
        "CurrentPitcher",
        "CurrentHitter",
        "WinningPitcher",
        "LosingPitcher",
        "SavingPitcher",
        "DueUpHitterID1",
        "DueUpHitterID2",
        "DueUpHitterID3",
        "GlobalGameID",
        "GlobalAwayTeamID",
        "GlobalHomeTeamID",
        "PointSpreadAwayTeamMoneyLine",
        "PointSpreadHomeTeamMoneyLine",
        "LastPlay",
        "IsClosed",
        "Updated",
        "GameEndDateTime"
})
public class DailySchedule {

    @JsonProperty("GameID")
    private Integer gameID;
    @JsonProperty("Season")
    private Integer season;
    @JsonProperty("SeasonType")
    private Integer seasonType;
    @JsonProperty("Status")
    private String status;
    @JsonProperty("Day")
    private String day;
    @JsonProperty("DateTime")
    private String dateTime;
    @JsonProperty("AwayTeam")
    private String awayTeam;
    @JsonProperty("HomeTeam")
    private String homeTeam;
    @JsonProperty("AwayTeamID")
    private Integer awayTeamID;
    @JsonProperty("HomeTeamID")
    private Integer homeTeamID;
    @JsonProperty("RescheduledGameID")
    private Object rescheduledGameID;
    @JsonProperty("StadiumID")
    private Integer stadiumID;
    @JsonProperty("Channel")
    private Object channel;
    @JsonProperty("Inning")
    private Integer inning;
    @JsonProperty("InningHalf")
    private String inningHalf;
    @JsonProperty("AwayTeamRuns")
    private Integer awayTeamRuns;
    @JsonProperty("HomeTeamRuns")
    private Integer homeTeamRuns;
    @JsonProperty("AwayTeamHits")
    private Integer awayTeamHits;
    @JsonProperty("HomeTeamHits")
    private Integer homeTeamHits;
    @JsonProperty("AwayTeamErrors")
    private Integer awayTeamErrors;
    @JsonProperty("HomeTeamErrors")
    private Integer homeTeamErrors;
    @JsonProperty("WinningPitcherID")
    private Integer winningPitcherID;
    @JsonProperty("LosingPitcherID")
    private Integer losingPitcherID;
    @JsonProperty("SavingPitcherID")
    private Object savingPitcherID;
    @JsonProperty("Attendance")
    private Object attendance;
    @JsonProperty("AwayTeamProbablePitcherID")
    private Object awayTeamProbablePitcherID;
    @JsonProperty("HomeTeamProbablePitcherID")
    private Object homeTeamProbablePitcherID;
    @JsonProperty("Outs")
    private Object outs;
    @JsonProperty("Balls")
    private Object balls;
    @JsonProperty("Strikes")
    private Object strikes;
    @JsonProperty("CurrentPitcherID")
    private Object currentPitcherID;
    @JsonProperty("CurrentHitterID")
    private Object currentHitterID;
    @JsonProperty("AwayTeamStartingPitcherID")
    private Integer awayTeamStartingPitcherID;
    @JsonProperty("HomeTeamStartingPitcherID")
    private Integer homeTeamStartingPitcherID;
    @JsonProperty("CurrentPitchingTeamID")
    private Object currentPitchingTeamID;
    @JsonProperty("CurrentHittingTeamID")
    private Object currentHittingTeamID;
    @JsonProperty("PointSpread")
    private Double pointSpread;
    @JsonProperty("OverUnder")
    private Double overUnder;
    @JsonProperty("AwayTeamMoneyLine")
    private Integer awayTeamMoneyLine;
    @JsonProperty("HomeTeamMoneyLine")
    private Integer homeTeamMoneyLine;
    @JsonProperty("ForecastTempLow")
    private Integer forecastTempLow;
    @JsonProperty("ForecastTempHigh")
    private Integer forecastTempHigh;
    @JsonProperty("ForecastDescription")
    private String forecastDescription;
    @JsonProperty("ForecastWindChill")
    private Integer forecastWindChill;
    @JsonProperty("ForecastWindSpeed")
    private Integer forecastWindSpeed;
    @JsonProperty("ForecastWindDirection")
    private Integer forecastWindDirection;
    @JsonProperty("RescheduledFromGameID")
    private Object rescheduledFromGameID;
    @JsonProperty("RunnerOnFirst")
    private Object runnerOnFirst;
    @JsonProperty("RunnerOnSecond")
    private Object runnerOnSecond;
    @JsonProperty("RunnerOnThird")
    private Object runnerOnThird;
    @JsonProperty("AwayTeamStartingPitcher")
    private String awayTeamStartingPitcher;
    @JsonProperty("HomeTeamStartingPitcher")
    private String homeTeamStartingPitcher;
    @JsonProperty("CurrentPitcher")
    private String currentPitcher;
    @JsonProperty("CurrentHitter")
    private String currentHitter;
    @JsonProperty("WinningPitcher")
    private String winningPitcher;
    @JsonProperty("LosingPitcher")
    private String losingPitcher;
    @JsonProperty("SavingPitcher")
    private String savingPitcher;
    @JsonProperty("DueUpHitterID1")
    private Object dueUpHitterID1;
    @JsonProperty("DueUpHitterID2")
    private Object dueUpHitterID2;
    @JsonProperty("DueUpHitterID3")
    private Object dueUpHitterID3;
    @JsonProperty("GlobalGameID")
    private Integer globalGameID;
    @JsonProperty("GlobalAwayTeamID")
    private Integer globalAwayTeamID;
    @JsonProperty("GlobalHomeTeamID")
    private Integer globalHomeTeamID;
    @JsonProperty("PointSpreadAwayTeamMoneyLine")
    private Object pointSpreadAwayTeamMoneyLine;
    @JsonProperty("PointSpreadHomeTeamMoneyLine")
    private Object pointSpreadHomeTeamMoneyLine;
    @JsonProperty("LastPlay")
    private String lastPlay;
    @JsonProperty("IsClosed")
    private Boolean isClosed;
    @JsonProperty("Updated")
    private String updated;
    @JsonProperty("GameEndDateTime")
    private String gameEndDateTime;
    private String stadiumName;
    private String startTime;
    private String stadiumCity;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("GameID")
    public Integer getGameID() {
        return gameID;
    }

    @JsonProperty("GameID")
    public void setGameID(Integer gameID) {
        this.gameID = gameID;
    }

    @JsonProperty("Season")
    public Integer getSeason() {
        return season;
    }

    @JsonProperty("Season")
    public void setSeason(Integer season) {
        this.season = season;
    }

    @JsonProperty("SeasonType")
    public Integer getSeasonType() {
        return seasonType;
    }

    @JsonProperty("SeasonType")
    public void setSeasonType(Integer seasonType) {
        this.seasonType = seasonType;
    }

    @JsonProperty("Status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("Status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("Day")
    public String getDay() {
        return day;
    }

    @JsonProperty("Day")
    public void setDay(String day) {
        this.day = day;
    }

    @JsonProperty("DateTime")
    public String getDateTime() {
        return dateTime;
    }

    @JsonProperty("DateTime")
    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    @JsonProperty("AwayTeam")
    public String getAwayTeam() {
        return awayTeam;
    }

    @JsonProperty("AwayTeam")
    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }

    @JsonProperty("HomeTeam")
    public String getHomeTeam() {
        return homeTeam;
    }

    @JsonProperty("HomeTeam")
    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    @JsonProperty("AwayTeamID")
    public Integer getAwayTeamID() {
        return awayTeamID;
    }

    @JsonProperty("AwayTeamID")
    public void setAwayTeamID(Integer awayTeamID) {
        this.awayTeamID = awayTeamID;
    }

    @JsonProperty("HomeTeamID")
    public Integer getHomeTeamID() {
        return homeTeamID;
    }

    @JsonProperty("HomeTeamID")
    public void setHomeTeamID(Integer homeTeamID) {
        this.homeTeamID = homeTeamID;
    }

    @JsonProperty("RescheduledGameID")
    public Object getRescheduledGameID() {
        return rescheduledGameID;
    }

    @JsonProperty("RescheduledGameID")
    public void setRescheduledGameID(Object rescheduledGameID) {
        this.rescheduledGameID = rescheduledGameID;
    }

    @JsonProperty("StadiumID")
    public Integer getStadiumID() {
        return stadiumID;
    }

    @JsonProperty("StadiumID")
    public void setStadiumID(Integer stadiumID) {
        this.stadiumID = stadiumID;
    }

    @JsonProperty("Channel")
    public Object getChannel() {
        return channel;
    }

    @JsonProperty("Channel")
    public void setChannel(Object channel) {
        this.channel = channel;
    }

    @JsonProperty("Inning")
    public Integer getInning() {
        return inning;
    }

    @JsonProperty("Inning")
    public void setInning(Integer inning) {
        this.inning = inning;
    }

    @JsonProperty("InningHalf")
    public String getInningHalf() {
        return inningHalf;
    }

    @JsonProperty("InningHalf")
    public void setInningHalf(String inningHalf) {
        this.inningHalf = inningHalf;
    }

    @JsonProperty("AwayTeamRuns")
    public Integer getAwayTeamRuns() {
        return awayTeamRuns;
    }

    @JsonProperty("AwayTeamRuns")
    public void setAwayTeamRuns(Integer awayTeamRuns) {
        this.awayTeamRuns = awayTeamRuns;
    }

    @JsonProperty("HomeTeamRuns")
    public Integer getHomeTeamRuns() {
        return homeTeamRuns;
    }

    @JsonProperty("HomeTeamRuns")
    public void setHomeTeamRuns(Integer homeTeamRuns) {
        this.homeTeamRuns = homeTeamRuns;
    }

    @JsonProperty("AwayTeamHits")
    public Integer getAwayTeamHits() {
        return awayTeamHits;
    }

    @JsonProperty("AwayTeamHits")
    public void setAwayTeamHits(Integer awayTeamHits) {
        this.awayTeamHits = awayTeamHits;
    }

    @JsonProperty("HomeTeamHits")
    public Integer getHomeTeamHits() {
        return homeTeamHits;
    }

    @JsonProperty("HomeTeamHits")
    public void setHomeTeamHits(Integer homeTeamHits) {
        this.homeTeamHits = homeTeamHits;
    }

    @JsonProperty("AwayTeamErrors")
    public Integer getAwayTeamErrors() {
        return awayTeamErrors;
    }

    @JsonProperty("AwayTeamErrors")
    public void setAwayTeamErrors(Integer awayTeamErrors) {
        this.awayTeamErrors = awayTeamErrors;
    }

    @JsonProperty("HomeTeamErrors")
    public Integer getHomeTeamErrors() {
        return homeTeamErrors;
    }

    @JsonProperty("HomeTeamErrors")
    public void setHomeTeamErrors(Integer homeTeamErrors) {
        this.homeTeamErrors = homeTeamErrors;
    }

    @JsonProperty("WinningPitcherID")
    public Integer getWinningPitcherID() {
        return winningPitcherID;
    }

    @JsonProperty("WinningPitcherID")
    public void setWinningPitcherID(Integer winningPitcherID) {
        this.winningPitcherID = winningPitcherID;
    }

    @JsonProperty("LosingPitcherID")
    public Integer getLosingPitcherID() {
        return losingPitcherID;
    }

    @JsonProperty("LosingPitcherID")
    public void setLosingPitcherID(Integer losingPitcherID) {
        this.losingPitcherID = losingPitcherID;
    }

    @JsonProperty("SavingPitcherID")
    public Object getSavingPitcherID() {
        return savingPitcherID;
    }

    @JsonProperty("SavingPitcherID")
    public void setSavingPitcherID(Object savingPitcherID) {
        this.savingPitcherID = savingPitcherID;
    }

    @JsonProperty("Attendance")
    public Object getAttendance() {
        return attendance;
    }

    @JsonProperty("Attendance")
    public void setAttendance(Object attendance) {
        this.attendance = attendance;
    }

    @JsonProperty("AwayTeamProbablePitcherID")
    public Object getAwayTeamProbablePitcherID() {
        return awayTeamProbablePitcherID;
    }

    @JsonProperty("AwayTeamProbablePitcherID")
    public void setAwayTeamProbablePitcherID(Object awayTeamProbablePitcherID) {
        this.awayTeamProbablePitcherID = awayTeamProbablePitcherID;
    }

    @JsonProperty("HomeTeamProbablePitcherID")
    public Object getHomeTeamProbablePitcherID() {
        return homeTeamProbablePitcherID;
    }

    @JsonProperty("HomeTeamProbablePitcherID")
    public void setHomeTeamProbablePitcherID(Object homeTeamProbablePitcherID) {
        this.homeTeamProbablePitcherID = homeTeamProbablePitcherID;
    }

    @JsonProperty("Outs")
    public Object getOuts() {
        return outs;
    }

    @JsonProperty("Outs")
    public void setOuts(Object outs) {
        this.outs = outs;
    }

    @JsonProperty("Balls")
    public Object getBalls() {
        return balls;
    }

    @JsonProperty("Balls")
    public void setBalls(Object balls) {
        this.balls = balls;
    }

    @JsonProperty("Strikes")
    public Object getStrikes() {
        return strikes;
    }

    @JsonProperty("Strikes")
    public void setStrikes(Object strikes) {
        this.strikes = strikes;
    }

    @JsonProperty("CurrentPitcherID")
    public Object getCurrentPitcherID() {
        return currentPitcherID;
    }

    @JsonProperty("CurrentPitcherID")
    public void setCurrentPitcherID(Object currentPitcherID) {
        this.currentPitcherID = currentPitcherID;
    }

    @JsonProperty("CurrentHitterID")
    public Object getCurrentHitterID() {
        return currentHitterID;
    }

    @JsonProperty("CurrentHitterID")
    public void setCurrentHitterID(Object currentHitterID) {
        this.currentHitterID = currentHitterID;
    }

    @JsonProperty("AwayTeamStartingPitcherID")
    public Integer getAwayTeamStartingPitcherID() {
        return awayTeamStartingPitcherID;
    }

    @JsonProperty("AwayTeamStartingPitcherID")
    public void setAwayTeamStartingPitcherID(Integer awayTeamStartingPitcherID) {
        this.awayTeamStartingPitcherID = awayTeamStartingPitcherID;
    }

    @JsonProperty("HomeTeamStartingPitcherID")
    public Integer getHomeTeamStartingPitcherID() {
        return homeTeamStartingPitcherID;
    }

    @JsonProperty("HomeTeamStartingPitcherID")
    public void setHomeTeamStartingPitcherID(Integer homeTeamStartingPitcherID) {
        this.homeTeamStartingPitcherID = homeTeamStartingPitcherID;
    }

    @JsonProperty("CurrentPitchingTeamID")
    public Object getCurrentPitchingTeamID() {
        return currentPitchingTeamID;
    }

    @JsonProperty("CurrentPitchingTeamID")
    public void setCurrentPitchingTeamID(Object currentPitchingTeamID) {
        this.currentPitchingTeamID = currentPitchingTeamID;
    }

    @JsonProperty("CurrentHittingTeamID")
    public Object getCurrentHittingTeamID() {
        return currentHittingTeamID;
    }

    @JsonProperty("CurrentHittingTeamID")
    public void setCurrentHittingTeamID(Object currentHittingTeamID) {
        this.currentHittingTeamID = currentHittingTeamID;
    }

    @JsonProperty("PointSpread")
    public Double getPointSpread() {
        return pointSpread;
    }

    @JsonProperty("PointSpread")
    public void setPointSpread(Double pointSpread) {
        this.pointSpread = pointSpread;
    }

    @JsonProperty("OverUnder")
    public Double getOverUnder() {
        return overUnder;
    }

    @JsonProperty("OverUnder")
    public void setOverUnder(Double overUnder) {
        this.overUnder = overUnder;
    }

    @JsonProperty("AwayTeamMoneyLine")
    public Integer getAwayTeamMoneyLine() {
        return awayTeamMoneyLine;
    }

    @JsonProperty("AwayTeamMoneyLine")
    public void setAwayTeamMoneyLine(Integer awayTeamMoneyLine) {
        this.awayTeamMoneyLine = awayTeamMoneyLine;
    }

    @JsonProperty("HomeTeamMoneyLine")
    public Integer getHomeTeamMoneyLine() {
        return homeTeamMoneyLine;
    }

    @JsonProperty("HomeTeamMoneyLine")
    public void setHomeTeamMoneyLine(Integer homeTeamMoneyLine) {
        this.homeTeamMoneyLine = homeTeamMoneyLine;
    }

    @JsonProperty("ForecastTempLow")
    public Integer getForecastTempLow() {
        return forecastTempLow;
    }

    @JsonProperty("ForecastTempLow")
    public void setForecastTempLow(Integer forecastTempLow) {
        this.forecastTempLow = forecastTempLow;
    }

    @JsonProperty("ForecastTempHigh")
    public Integer getForecastTempHigh() {
        return forecastTempHigh;
    }

    @JsonProperty("ForecastTempHigh")
    public void setForecastTempHigh(Integer forecastTempHigh) {
        this.forecastTempHigh = forecastTempHigh;
    }

    @JsonProperty("ForecastDescription")
    public String getForecastDescription() {
        return forecastDescription;
    }

    @JsonProperty("ForecastDescription")
    public void setForecastDescription(String forecastDescription) {
        this.forecastDescription = forecastDescription;
    }

    @JsonProperty("ForecastWindChill")
    public Integer getForecastWindChill() {
        return forecastWindChill;
    }

    @JsonProperty("ForecastWindChill")
    public void setForecastWindChill(Integer forecastWindChill) {
        this.forecastWindChill = forecastWindChill;
    }

    @JsonProperty("ForecastWindSpeed")
    public Integer getForecastWindSpeed() {
        return forecastWindSpeed;
    }

    @JsonProperty("ForecastWindSpeed")
    public void setForecastWindSpeed(Integer forecastWindSpeed) {
        this.forecastWindSpeed = forecastWindSpeed;
    }

    @JsonProperty("ForecastWindDirection")
    public Integer getForecastWindDirection() {
        return forecastWindDirection;
    }

    @JsonProperty("ForecastWindDirection")
    public void setForecastWindDirection(Integer forecastWindDirection) {
        this.forecastWindDirection = forecastWindDirection;
    }

    @JsonProperty("RescheduledFromGameID")
    public Object getRescheduledFromGameID() {
        return rescheduledFromGameID;
    }

    @JsonProperty("RescheduledFromGameID")
    public void setRescheduledFromGameID(Object rescheduledFromGameID) {
        this.rescheduledFromGameID = rescheduledFromGameID;
    }

    @JsonProperty("RunnerOnFirst")
    public Object getRunnerOnFirst() {
        return runnerOnFirst;
    }

    @JsonProperty("RunnerOnFirst")
    public void setRunnerOnFirst(Object runnerOnFirst) {
        this.runnerOnFirst = runnerOnFirst;
    }

    @JsonProperty("RunnerOnSecond")
    public Object getRunnerOnSecond() {
        return runnerOnSecond;
    }

    @JsonProperty("RunnerOnSecond")
    public void setRunnerOnSecond(Object runnerOnSecond) {
        this.runnerOnSecond = runnerOnSecond;
    }

    @JsonProperty("RunnerOnThird")
    public Object getRunnerOnThird() {
        return runnerOnThird;
    }

    @JsonProperty("RunnerOnThird")
    public void setRunnerOnThird(Object runnerOnThird) {
        this.runnerOnThird = runnerOnThird;
    }

    @JsonProperty("AwayTeamStartingPitcher")
    public String getAwayTeamStartingPitcher() {
        return awayTeamStartingPitcher;
    }

    @JsonProperty("AwayTeamStartingPitcher")
    public void setAwayTeamStartingPitcher(String awayTeamStartingPitcher) {
        this.awayTeamStartingPitcher = awayTeamStartingPitcher;
    }

    @JsonProperty("HomeTeamStartingPitcher")
    public String getHomeTeamStartingPitcher() {
        return homeTeamStartingPitcher;
    }

    @JsonProperty("HomeTeamStartingPitcher")
    public void setHomeTeamStartingPitcher(String homeTeamStartingPitcher) {
        this.homeTeamStartingPitcher = homeTeamStartingPitcher;
    }

    @JsonProperty("CurrentPitcher")
    public String getCurrentPitcher() {
        return currentPitcher;
    }

    @JsonProperty("CurrentPitcher")
    public void setCurrentPitcher(String currentPitcher) {
        this.currentPitcher = currentPitcher;
    }

    @JsonProperty("CurrentHitter")
    public String getCurrentHitter() {
        return currentHitter;
    }

    @JsonProperty("CurrentHitter")
    public void setCurrentHitter(String currentHitter) {
        this.currentHitter = currentHitter;
    }

    @JsonProperty("WinningPitcher")
    public String getWinningPitcher() {
        return winningPitcher;
    }

    @JsonProperty("WinningPitcher")
    public void setWinningPitcher(String winningPitcher) {
        this.winningPitcher = winningPitcher;
    }

    @JsonProperty("LosingPitcher")
    public String getLosingPitcher() {
        return losingPitcher;
    }

    @JsonProperty("LosingPitcher")
    public void setLosingPitcher(String losingPitcher) {
        this.losingPitcher = losingPitcher;
    }

    @JsonProperty("SavingPitcher")
    public String getSavingPitcher() {
        return savingPitcher;
    }

    @JsonProperty("SavingPitcher")
    public void setSavingPitcher(String savingPitcher) {
        this.savingPitcher = savingPitcher;
    }

    @JsonProperty("DueUpHitterID1")
    public Object getDueUpHitterID1() {
        return dueUpHitterID1;
    }

    @JsonProperty("DueUpHitterID1")
    public void setDueUpHitterID1(Object dueUpHitterID1) {
        this.dueUpHitterID1 = dueUpHitterID1;
    }

    @JsonProperty("DueUpHitterID2")
    public Object getDueUpHitterID2() {
        return dueUpHitterID2;
    }

    @JsonProperty("DueUpHitterID2")
    public void setDueUpHitterID2(Object dueUpHitterID2) {
        this.dueUpHitterID2 = dueUpHitterID2;
    }

    @JsonProperty("DueUpHitterID3")
    public Object getDueUpHitterID3() {
        return dueUpHitterID3;
    }

    @JsonProperty("DueUpHitterID3")
    public void setDueUpHitterID3(Object dueUpHitterID3) {
        this.dueUpHitterID3 = dueUpHitterID3;
    }

    @JsonProperty("GlobalGameID")
    public Integer getGlobalGameID() {
        return globalGameID;
    }

    @JsonProperty("GlobalGameID")
    public void setGlobalGameID(Integer globalGameID) {
        this.globalGameID = globalGameID;
    }

    @JsonProperty("GlobalAwayTeamID")
    public Integer getGlobalAwayTeamID() {
        return globalAwayTeamID;
    }

    @JsonProperty("GlobalAwayTeamID")
    public void setGlobalAwayTeamID(Integer globalAwayTeamID) {
        this.globalAwayTeamID = globalAwayTeamID;
    }

    @JsonProperty("GlobalHomeTeamID")
    public Integer getGlobalHomeTeamID() {
        return globalHomeTeamID;
    }

    @JsonProperty("GlobalHomeTeamID")
    public void setGlobalHomeTeamID(Integer globalHomeTeamID) {
        this.globalHomeTeamID = globalHomeTeamID;
    }

    @JsonProperty("PointSpreadAwayTeamMoneyLine")
    public Object getPointSpreadAwayTeamMoneyLine() {
        return pointSpreadAwayTeamMoneyLine;
    }

    @JsonProperty("PointSpreadAwayTeamMoneyLine")
    public void setPointSpreadAwayTeamMoneyLine(Object pointSpreadAwayTeamMoneyLine) {
        this.pointSpreadAwayTeamMoneyLine = pointSpreadAwayTeamMoneyLine;
    }

    @JsonProperty("PointSpreadHomeTeamMoneyLine")
    public Object getPointSpreadHomeTeamMoneyLine() {
        return pointSpreadHomeTeamMoneyLine;
    }

    @JsonProperty("PointSpreadHomeTeamMoneyLine")
    public void setPointSpreadHomeTeamMoneyLine(Object pointSpreadHomeTeamMoneyLine) {
        this.pointSpreadHomeTeamMoneyLine = pointSpreadHomeTeamMoneyLine;
    }

    @JsonProperty("LastPlay")
    public String getLastPlay() {
        return lastPlay;
    }

    @JsonProperty("LastPlay")
    public void setLastPlay(String lastPlay) {
        this.lastPlay = lastPlay;
    }

    @JsonProperty("IsClosed")
    public Boolean getIsClosed() {
        return isClosed;
    }

    @JsonProperty("IsClosed")
    public void setIsClosed(Boolean isClosed) {
        this.isClosed = isClosed;
    }

    @JsonProperty("Updated")
    public String getUpdated() {
        return updated;
    }

    @JsonProperty("Updated")
    public void setUpdated(String updated) {
        this.updated = updated;
    }

    @JsonProperty("GameEndDateTime")
    public String getGameEndDateTime() {
        return gameEndDateTime;
    }

    @JsonProperty("GameEndDateTime")
    public void setGameEndDateTime(String gameEndDateTime) {
        this.gameEndDateTime = gameEndDateTime;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @JsonProperty("StadiumName")
    public String getStadiumName() {
        return stadiumName;
    }

    @JsonProperty("StadiumName")
    public void setStadiumName(String stadiumName) {
        this.stadiumName = stadiumName;
    }

    @JsonProperty("StartTime")
    public String getStartTime() {
        return startTime;
    }

    @JsonProperty("StartTime")
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    @JsonProperty("StadiumCity")
    public String getStadiumCity() {
        return stadiumCity;
    }

    @JsonProperty("StadiumCity")
    public void setStadiumCity(String stadiumCity) {
        this.stadiumCity = stadiumCity;
    }

    @Override
    public String toString() {
        return "DailySchedule{" +
                "gameID=" + gameID +
                ", season=" + season +
                ", seasonType=" + seasonType +
                ", status='" + status + '\'' +
                ", day='" + day + '\'' +
                ", dateTime='" + dateTime + '\'' +
                ", awayTeam='" + awayTeam + '\'' +
                ", homeTeam='" + homeTeam + '\'' +
                ", awayTeamID=" + awayTeamID +
                ", homeTeamID=" + homeTeamID +
                ", rescheduledGameID=" + rescheduledGameID +
                ", stadiumID=" + stadiumID +
                ", channel=" + channel +
                ", inning=" + inning +
                ", inningHalf='" + inningHalf + '\'' +
                ", awayTeamRuns=" + awayTeamRuns +
                ", homeTeamRuns=" + homeTeamRuns +
                ", awayTeamHits=" + awayTeamHits +
                ", homeTeamHits=" + homeTeamHits +
                ", awayTeamErrors=" + awayTeamErrors +
                ", homeTeamErrors=" + homeTeamErrors +
                ", winningPitcherID=" + winningPitcherID +
                ", losingPitcherID=" + losingPitcherID +
                ", savingPitcherID=" + savingPitcherID +
                ", attendance=" + attendance +
                ", awayTeamProbablePitcherID=" + awayTeamProbablePitcherID +
                ", homeTeamProbablePitcherID=" + homeTeamProbablePitcherID +
                ", outs=" + outs +
                ", balls=" + balls +
                ", strikes=" + strikes +
                ", currentPitcherID=" + currentPitcherID +
                ", currentHitterID=" + currentHitterID +
                ", awayTeamStartingPitcherID=" + awayTeamStartingPitcherID +
                ", homeTeamStartingPitcherID=" + homeTeamStartingPitcherID +
                ", currentPitchingTeamID=" + currentPitchingTeamID +
                ", currentHittingTeamID=" + currentHittingTeamID +
                ", pointSpread=" + pointSpread +
                ", overUnder=" + overUnder +
                ", awayTeamMoneyLine=" + awayTeamMoneyLine +
                ", homeTeamMoneyLine=" + homeTeamMoneyLine +
                ", forecastTempLow=" + forecastTempLow +
                ", forecastTempHigh=" + forecastTempHigh +
                ", forecastDescription='" + forecastDescription + '\'' +
                ", forecastWindChill=" + forecastWindChill +
                ", forecastWindSpeed=" + forecastWindSpeed +
                ", forecastWindDirection=" + forecastWindDirection +
                ", rescheduledFromGameID=" + rescheduledFromGameID +
                ", runnerOnFirst=" + runnerOnFirst +
                ", runnerOnSecond=" + runnerOnSecond +
                ", runnerOnThird=" + runnerOnThird +
                ", awayTeamStartingPitcher='" + awayTeamStartingPitcher + '\'' +
                ", homeTeamStartingPitcher='" + homeTeamStartingPitcher + '\'' +
                ", currentPitcher='" + currentPitcher + '\'' +
                ", currentHitter='" + currentHitter + '\'' +
                ", winningPitcher='" + winningPitcher + '\'' +
                ", losingPitcher='" + losingPitcher + '\'' +
                ", savingPitcher='" + savingPitcher + '\'' +
                ", dueUpHitterID1=" + dueUpHitterID1 +
                ", dueUpHitterID2=" + dueUpHitterID2 +
                ", dueUpHitterID3=" + dueUpHitterID3 +
                ", globalGameID=" + globalGameID +
                ", globalAwayTeamID=" + globalAwayTeamID +
                ", globalHomeTeamID=" + globalHomeTeamID +
                ", pointSpreadAwayTeamMoneyLine=" + pointSpreadAwayTeamMoneyLine +
                ", pointSpreadHomeTeamMoneyLine=" + pointSpreadHomeTeamMoneyLine +
                ", lastPlay='" + lastPlay + '\'' +
                ", isClosed=" + isClosed +
                ", updated='" + updated + '\'' +
                ", gameEndDateTime='" + gameEndDateTime + '\'' +
                ", stadiumName='" + stadiumName + '\'' +
                ", startTime='" + startTime + '\'' +
                ", stadiumCity='" + stadiumCity + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
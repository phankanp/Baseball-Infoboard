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
        "phone_number",
        "venue_name",
        "franchise_code",
        "all_star_sw",
        "sport_code",
        "address_city",
        "city",
        "name_display_full",
        "spring_league_abbrev",
        "time_zone_alt",
        "sport_id",
        "venue_id",
        "mlb_org_id",
        "time_zone_generic",
        "mlb_org",
        "last_year_of_play",
        "league_full",
        "home_opener_time",
        "address_province",
        "league_id",
        "name_abbrev",
        "bis_team_code",
        "league",
        "spring_league",
        "base_url",
        "address_zip",
        "sport_code_display",
        "mlb_org_short",
        "time_zone",
        "address_line1",
        "mlb_org_brief",
        "address_line2",
        "season",
        "address_line3",
        "division_abbrev",
        "name_display_short",
        "team_id",
        "active_sw",
        "address_intl",
        "state",
        "address_country",
        "mlb_org_abbrev",
        "division",
        "team_code",
        "name",
        "website_url",
        "sport_code_name",
        "first_year_of_play",
        "league_abbrev",
        "name_display_long",
        "store_url",
        "time_zone_text",
        "name_short",
        "home_opener",
        "address_state",
        "division_full",
        "time_zone_num",
        "spring_league_full",
        "address",
        "name_display_brief",
        "file_code",
        "division_id",
        "spring_league_id",
        "venue_short"
})
public class TeamRow {
    @JsonProperty("phone_number")
    private String phoneNumber;
    @JsonProperty("venue_name")
    private String venueName;
    @JsonProperty("franchise_code")
    private String franchiseCode;
    @JsonProperty("all_star_sw")
    private String allStarSw;
    @JsonProperty("sport_code")
    private String sportCode;
    @JsonProperty("address_city")
    private String addressCity;
    @JsonProperty("city")
    private String city;
    @JsonProperty("name_display_full")
    private String nameDisplayFull;
    @JsonProperty("spring_league_abbrev")
    private String springLeagueAbbrev;
    @JsonProperty("time_zone_alt")
    private String timeZoneAlt;
    @JsonProperty("sport_id")
    private String sportId;
    @JsonProperty("venue_id")
    private String venueId;
    @JsonProperty("mlb_org_id")
    private String mlbOrgId;
    @JsonProperty("time_zone_generic")
    private String timeZoneGeneric;
    @JsonProperty("mlb_org")
    private String mlbOrg;
    @JsonProperty("last_year_of_play")
    private String lastYearOfPlay;
    @JsonProperty("league_full")
    private String leagueFull;
    @JsonProperty("home_opener_time")
    private String homeOpenerTime;
    @JsonProperty("address_province")
    private String addressProvince;
    @JsonProperty("league_id")
    private String leagueId;
    @JsonProperty("name_abbrev")
    private String nameAbbrev;
    @JsonProperty("bis_team_code")
    private String bisTeamCode;
    @JsonProperty("league")
    private String league;
    @JsonProperty("spring_league")
    private String springLeague;
    @JsonProperty("base_url")
    private String baseUrl;
    @JsonProperty("address_zip")
    private String addressZip;
    @JsonProperty("sport_code_display")
    private String sportCodeDisplay;
    @JsonProperty("mlb_org_short")
    private String mlbOrgShort;
    @JsonProperty("time_zone")
    private String timeZone;
    @JsonProperty("address_line1")
    private String addressLine1;
    @JsonProperty("mlb_org_brief")
    private String mlbOrgBrief;
    @JsonProperty("address_line2")
    private String addressLine2;
    @JsonProperty("season")
    private String season;
    @JsonProperty("address_line3")
    private String addressLine3;
    @JsonProperty("division_abbrev")
    private String divisionAbbrev;
    @JsonProperty("name_display_short")
    private String nameDisplayShort;
    @JsonProperty("team_id")
    private String teamId;
    @JsonProperty("active_sw")
    private String activeSw;
    @JsonProperty("address_intl")
    private String addressIntl;
    @JsonProperty("state")
    private String state;
    @JsonProperty("address_country")
    private String addressCountry;
    @JsonProperty("mlb_org_abbrev")
    private String mlbOrgAbbrev;
    @JsonProperty("division")
    private String division;
    @JsonProperty("team_code")
    private String teamCode;
    @JsonProperty("name")
    private String name;
    @JsonProperty("website_url")
    private String websiteUrl;
    @JsonProperty("sport_code_name")
    private String sportCodeName;
    @JsonProperty("first_year_of_play")
    private String firstYearOfPlay;
    @JsonProperty("league_abbrev")
    private String leagueAbbrev;
    @JsonProperty("name_display_long")
    private String nameDisplayLong;
    @JsonProperty("store_url")
    private String storeUrl;
    @JsonProperty("time_zone_text")
    private String timeZoneText;
    @JsonProperty("name_short")
    private String nameShort;
    @JsonProperty("home_opener")
    private String homeOpener;
    @JsonProperty("address_state")
    private String addressState;
    @JsonProperty("division_full")
    private String divisionFull;
    @JsonProperty("time_zone_num")
    private String timeZoneNum;
    @JsonProperty("spring_league_full")
    private String springLeagueFull;
    @JsonProperty("address")
    private String address;
    @JsonProperty("name_display_brief")
    private String nameDisplayBrief;
    @JsonProperty("file_code")
    private String fileCode;
    @JsonProperty("division_id")
    private String divisionId;
    @JsonProperty("spring_league_id")
    private String springLeagueId;
    @JsonProperty("venue_short")
    private String venueShort;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("phone_number")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @JsonProperty("phone_number")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @JsonProperty("venue_name")
    public String getVenueName() {
        return venueName;
    }

    @JsonProperty("venue_name")
    public void setVenueName(String venueName) {
        this.venueName = venueName;
    }

    @JsonProperty("franchise_code")
    public String getFranchiseCode() {
        return franchiseCode;
    }

    @JsonProperty("franchise_code")
    public void setFranchiseCode(String franchiseCode) {
        this.franchiseCode = franchiseCode;
    }

    @JsonProperty("all_star_sw")
    public String getAllStarSw() {
        return allStarSw;
    }

    @JsonProperty("all_star_sw")
    public void setAllStarSw(String allStarSw) {
        this.allStarSw = allStarSw;
    }

    @JsonProperty("sport_code")
    public String getSportCode() {
        return sportCode;
    }

    @JsonProperty("sport_code")
    public void setSportCode(String sportCode) {
        this.sportCode = sportCode;
    }

    @JsonProperty("address_city")
    public String getAddressCity() {
        return addressCity;
    }

    @JsonProperty("address_city")
    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("name_display_full")
    public String getNameDisplayFull() {
        return nameDisplayFull;
    }

    @JsonProperty("name_display_full")
    public void setNameDisplayFull(String nameDisplayFull) {
        this.nameDisplayFull = nameDisplayFull;
    }

    @JsonProperty("spring_league_abbrev")
    public String getSpringLeagueAbbrev() {
        return springLeagueAbbrev;
    }

    @JsonProperty("spring_league_abbrev")
    public void setSpringLeagueAbbrev(String springLeagueAbbrev) {
        this.springLeagueAbbrev = springLeagueAbbrev;
    }

    @JsonProperty("time_zone_alt")
    public String getTimeZoneAlt() {
        return timeZoneAlt;
    }

    @JsonProperty("time_zone_alt")
    public void setTimeZoneAlt(String timeZoneAlt) {
        this.timeZoneAlt = timeZoneAlt;
    }

    @JsonProperty("sport_id")
    public String getSportId() {
        return sportId;
    }

    @JsonProperty("sport_id")
    public void setSportId(String sportId) {
        this.sportId = sportId;
    }

    @JsonProperty("venue_id")
    public String getVenueId() {
        return venueId;
    }

    @JsonProperty("venue_id")
    public void setVenueId(String venueId) {
        this.venueId = venueId;
    }

    @JsonProperty("mlb_org_id")
    public String getMlbOrgId() {
        return mlbOrgId;
    }

    @JsonProperty("mlb_org_id")
    public void setMlbOrgId(String mlbOrgId) {
        this.mlbOrgId = mlbOrgId;
    }

    @JsonProperty("time_zone_generic")
    public String getTimeZoneGeneric() {
        return timeZoneGeneric;
    }

    @JsonProperty("time_zone_generic")
    public void setTimeZoneGeneric(String timeZoneGeneric) {
        this.timeZoneGeneric = timeZoneGeneric;
    }

    @JsonProperty("mlb_org")
    public String getMlbOrg() {
        return mlbOrg;
    }

    @JsonProperty("mlb_org")
    public void setMlbOrg(String mlbOrg) {
        this.mlbOrg = mlbOrg;
    }

    @JsonProperty("last_year_of_play")
    public String getLastYearOfPlay() {
        return lastYearOfPlay;
    }

    @JsonProperty("last_year_of_play")
    public void setLastYearOfPlay(String lastYearOfPlay) {
        this.lastYearOfPlay = lastYearOfPlay;
    }

    @JsonProperty("league_full")
    public String getLeagueFull() {
        return leagueFull;
    }

    @JsonProperty("league_full")
    public void setLeagueFull(String leagueFull) {
        this.leagueFull = leagueFull;
    }

    @JsonProperty("home_opener_time")
    public String getHomeOpenerTime() {
        return homeOpenerTime;
    }

    @JsonProperty("home_opener_time")
    public void setHomeOpenerTime(String homeOpenerTime) {
        this.homeOpenerTime = homeOpenerTime;
    }

    @JsonProperty("address_province")
    public String getAddressProvince() {
        return addressProvince;
    }

    @JsonProperty("address_province")
    public void setAddressProvince(String addressProvince) {
        this.addressProvince = addressProvince;
    }

    @JsonProperty("league_id")
    public String getLeagueId() {
        return leagueId;
    }

    @JsonProperty("league_id")
    public void setLeagueId(String leagueId) {
        this.leagueId = leagueId;
    }

    @JsonProperty("name_abbrev")
    public String getNameAbbrev() {
        return nameAbbrev;
    }

    @JsonProperty("name_abbrev")
    public void setNameAbbrev(String nameAbbrev) {
        this.nameAbbrev = nameAbbrev;
    }

    @JsonProperty("bis_team_code")
    public String getBisTeamCode() {
        return bisTeamCode;
    }

    @JsonProperty("bis_team_code")
    public void setBisTeamCode(String bisTeamCode) {
        this.bisTeamCode = bisTeamCode;
    }

    @JsonProperty("league")
    public String getLeague() {
        return league;
    }

    @JsonProperty("league")
    public void setLeague(String league) {
        this.league = league;
    }

    @JsonProperty("spring_league")
    public String getSpringLeague() {
        return springLeague;
    }

    @JsonProperty("spring_league")
    public void setSpringLeague(String springLeague) {
        this.springLeague = springLeague;
    }

    @JsonProperty("base_url")
    public String getBaseUrl() {
        return baseUrl;
    }

    @JsonProperty("base_url")
    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    @JsonProperty("address_zip")
    public String getAddressZip() {
        return addressZip;
    }

    @JsonProperty("address_zip")
    public void setAddressZip(String addressZip) {
        this.addressZip = addressZip;
    }

    @JsonProperty("sport_code_display")
    public String getSportCodeDisplay() {
        return sportCodeDisplay;
    }

    @JsonProperty("sport_code_display")
    public void setSportCodeDisplay(String sportCodeDisplay) {
        this.sportCodeDisplay = sportCodeDisplay;
    }

    @JsonProperty("mlb_org_short")
    public String getMlbOrgShort() {
        return mlbOrgShort;
    }

    @JsonProperty("mlb_org_short")
    public void setMlbOrgShort(String mlbOrgShort) {
        this.mlbOrgShort = mlbOrgShort;
    }

    @JsonProperty("time_zone")
    public String getTimeZone() {
        return timeZone;
    }

    @JsonProperty("time_zone")
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    @JsonProperty("address_line1")
    public String getAddressLine1() {
        return addressLine1;
    }

    @JsonProperty("address_line1")
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    @JsonProperty("mlb_org_brief")
    public String getMlbOrgBrief() {
        return mlbOrgBrief;
    }

    @JsonProperty("mlb_org_brief")
    public void setMlbOrgBrief(String mlbOrgBrief) {
        this.mlbOrgBrief = mlbOrgBrief;
    }

    @JsonProperty("address_line2")
    public String getAddressLine2() {
        return addressLine2;
    }

    @JsonProperty("address_line2")
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    @JsonProperty("season")
    public String getSeason() {
        return season;
    }

    @JsonProperty("season")
    public void setSeason(String season) {
        this.season = season;
    }

    @JsonProperty("address_line3")
    public String getAddressLine3() {
        return addressLine3;
    }

    @JsonProperty("address_line3")
    public void setAddressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
    }

    @JsonProperty("division_abbrev")
    public String getDivisionAbbrev() {
        return divisionAbbrev;
    }

    @JsonProperty("division_abbrev")
    public void setDivisionAbbrev(String divisionAbbrev) {
        this.divisionAbbrev = divisionAbbrev;
    }

    @JsonProperty("name_display_short")
    public String getNameDisplayShort() {
        return nameDisplayShort;
    }

    @JsonProperty("name_display_short")
    public void setNameDisplayShort(String nameDisplayShort) {
        this.nameDisplayShort = nameDisplayShort;
    }

    @JsonProperty("team_id")
    public String getTeamId() {
        return teamId;
    }

    @JsonProperty("team_id")
    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    @JsonProperty("active_sw")
    public String getActiveSw() {
        return activeSw;
    }

    @JsonProperty("active_sw")
    public void setActiveSw(String activeSw) {
        this.activeSw = activeSw;
    }

    @JsonProperty("address_intl")
    public String getAddressIntl() {
        return addressIntl;
    }

    @JsonProperty("address_intl")
    public void setAddressIntl(String addressIntl) {
        this.addressIntl = addressIntl;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("address_country")
    public String getAddressCountry() {
        return addressCountry;
    }

    @JsonProperty("address_country")
    public void setAddressCountry(String addressCountry) {
        this.addressCountry = addressCountry;
    }

    @JsonProperty("mlb_org_abbrev")
    public String getMlbOrgAbbrev() {
        return mlbOrgAbbrev;
    }

    @JsonProperty("mlb_org_abbrev")
    public void setMlbOrgAbbrev(String mlbOrgAbbrev) {
        this.mlbOrgAbbrev = mlbOrgAbbrev;
    }

    @JsonProperty("division")
    public String getDivision() {
        return division;
    }

    @JsonProperty("division")
    public void setDivision(String division) {
        this.division = division;
    }

    @JsonProperty("team_code")
    public String getTeamCode() {
        return teamCode;
    }

    @JsonProperty("team_code")
    public void setTeamCode(String teamCode) {
        this.teamCode = teamCode;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("website_url")
    public String getWebsiteUrl() {
        return websiteUrl;
    }

    @JsonProperty("website_url")
    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    @JsonProperty("sport_code_name")
    public String getSportCodeName() {
        return sportCodeName;
    }

    @JsonProperty("sport_code_name")
    public void setSportCodeName(String sportCodeName) {
        this.sportCodeName = sportCodeName;
    }

    @JsonProperty("first_year_of_play")
    public String getFirstYearOfPlay() {
        return firstYearOfPlay;
    }

    @JsonProperty("first_year_of_play")
    public void setFirstYearOfPlay(String firstYearOfPlay) {
        this.firstYearOfPlay = firstYearOfPlay;
    }

    @JsonProperty("league_abbrev")
    public String getLeagueAbbrev() {
        return leagueAbbrev;
    }

    @JsonProperty("league_abbrev")
    public void setLeagueAbbrev(String leagueAbbrev) {
        this.leagueAbbrev = leagueAbbrev;
    }

    @JsonProperty("name_display_long")
    public String getNameDisplayLong() {
        return nameDisplayLong;
    }

    @JsonProperty("name_display_long")
    public void setNameDisplayLong(String nameDisplayLong) {
        this.nameDisplayLong = nameDisplayLong;
    }

    @JsonProperty("store_url")
    public String getStoreUrl() {
        return storeUrl;
    }

    @JsonProperty("store_url")
    public void setStoreUrl(String storeUrl) {
        this.storeUrl = storeUrl;
    }

    @JsonProperty("time_zone_text")
    public String getTimeZoneText() {
        return timeZoneText;
    }

    @JsonProperty("time_zone_text")
    public void setTimeZoneText(String timeZoneText) {
        this.timeZoneText = timeZoneText;
    }

    @JsonProperty("name_short")
    public String getNameShort() {
        return nameShort;
    }

    @JsonProperty("name_short")
    public void setNameShort(String nameShort) {
        this.nameShort = nameShort;
    }

    @JsonProperty("home_opener")
    public String getHomeOpener() {
        return homeOpener;
    }

    @JsonProperty("home_opener")
    public void setHomeOpener(String homeOpener) {
        this.homeOpener = homeOpener;
    }

    @JsonProperty("address_state")
    public String getAddressState() {
        return addressState;
    }

    @JsonProperty("address_state")
    public void setAddressState(String addressState) {
        this.addressState = addressState;
    }

    @JsonProperty("division_full")
    public String getDivisionFull() {
        return divisionFull;
    }

    @JsonProperty("division_full")
    public void setDivisionFull(String divisionFull) {
        this.divisionFull = divisionFull;
    }

    @JsonProperty("time_zone_num")
    public String getTimeZoneNum() {
        return timeZoneNum;
    }

    @JsonProperty("time_zone_num")
    public void setTimeZoneNum(String timeZoneNum) {
        this.timeZoneNum = timeZoneNum;
    }

    @JsonProperty("spring_league_full")
    public String getSpringLeagueFull() {
        return springLeagueFull;
    }

    @JsonProperty("spring_league_full")
    public void setSpringLeagueFull(String springLeagueFull) {
        this.springLeagueFull = springLeagueFull;
    }

    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    @JsonProperty("name_display_brief")
    public String getNameDisplayBrief() {
        return nameDisplayBrief;
    }

    @JsonProperty("name_display_brief")
    public void setNameDisplayBrief(String nameDisplayBrief) {
        this.nameDisplayBrief = nameDisplayBrief;
    }

    @JsonProperty("file_code")
    public String getFileCode() {
        return fileCode;
    }

    @JsonProperty("file_code")
    public void setFileCode(String fileCode) {
        this.fileCode = fileCode;
    }

    @JsonProperty("division_id")
    public String getDivisionId() {
        return divisionId;
    }

    @JsonProperty("division_id")
    public void setDivisionId(String divisionId) {
        this.divisionId = divisionId;
    }

    @JsonProperty("spring_league_id")
    public String getSpringLeagueId() {
        return springLeagueId;
    }

    @JsonProperty("spring_league_id")
    public void setSpringLeagueId(String springLeagueId) {
        this.springLeagueId = springLeagueId;
    }

    @JsonProperty("venue_short")
    public String getVenueShort() {
        return venueShort;
    }

    @JsonProperty("venue_short")
    public void setVenueShort(String venueShort) {
        this.venueShort = venueShort;
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

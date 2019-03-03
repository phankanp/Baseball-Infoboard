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
        "mlb_org_id"
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
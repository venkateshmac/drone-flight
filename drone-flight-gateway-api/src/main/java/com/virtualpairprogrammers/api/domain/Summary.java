
package com.virtualpairprogrammers.api.domain;

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
    "home_location_lat",
    "home_location_lon",
    "aircraft_smart_gohome"
})
public class Summary {

    @JsonProperty("home_location_lat")
    private String homeLocationLat;
    @JsonProperty("home_location_lon")
    private String homeLocationLon;
    @JsonProperty("aircraft_smart_gohome")
    private AircraftSmartGohome aircraftSmartGohome;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("home_location_lat")
    public String getHomeLocationLat() {
        return homeLocationLat;
    }

    @JsonProperty("home_location_lat")
    public void setHomeLocationLat(String homeLocationLat) {
        this.homeLocationLat = homeLocationLat;
    }

    @JsonProperty("home_location_lon")
    public String getHomeLocationLon() {
        return homeLocationLon;
    }

    @JsonProperty("home_location_lon")
    public void setHomeLocationLon(String homeLocationLon) {
        this.homeLocationLon = homeLocationLon;
    }

    @JsonProperty("aircraft_smart_gohome")
    public AircraftSmartGohome getAircraftSmartGohome() {
        return aircraftSmartGohome;
    }

    @JsonProperty("aircraft_smart_gohome")
    public void setAircraftSmartGohome(AircraftSmartGohome aircraftSmartGohome) {
        this.aircraftSmartGohome = aircraftSmartGohome;
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

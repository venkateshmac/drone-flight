
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
    "flight_return_time",
    "landing_power",
    "return_power",
    "landing_radius",
    "landing_time"
})
public class AircraftSmartGohome {

    @JsonProperty("flight_return_time")
    private Object flightReturnTime;
    @JsonProperty("landing_power")
    private Object landingPower;
    @JsonProperty("return_power")
    private String returnPower;
    @JsonProperty("landing_radius")
    private String landingRadius;
    @JsonProperty("landing_time")
    private Object landingTime;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("flight_return_time")
    public Object getFlightReturnTime() {
        return flightReturnTime;
    }

    @JsonProperty("flight_return_time")
    public void setFlightReturnTime(Object flightReturnTime) {
        this.flightReturnTime = flightReturnTime;
    }

    @JsonProperty("landing_power")
    public Object getLandingPower() {
        return landingPower;
    }

    @JsonProperty("landing_power")
    public void setLandingPower(Object landingPower) {
        this.landingPower = landingPower;
    }

    @JsonProperty("return_power")
    public String getReturnPower() {
        return returnPower;
    }

    @JsonProperty("return_power")
    public void setReturnPower(String returnPower) {
        this.returnPower = returnPower;
    }

    @JsonProperty("landing_radius")
    public String getLandingRadius() {
        return landingRadius;
    }

    @JsonProperty("landing_radius")
    public void setLandingRadius(String landingRadius) {
        this.landingRadius = landingRadius;
    }

    @JsonProperty("landing_time")
    public Object getLandingTime() {
        return landingTime;
    }

    @JsonProperty("landing_time")
    public void setLandingTime(Object landingTime) {
        this.landingTime = landingTime;
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

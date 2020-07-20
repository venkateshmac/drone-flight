
package com.virtualpairprogrammers.tracker.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "event",
    "altitude_system",
    "logging_start_dtg",
    "flight_logging_items",
    "flight_logging_keys"
})
public class FlightLogging {

    @JsonProperty("event")
    private List<Event> event = null;
    @JsonProperty("altitude_system")
    private String altitudeSystem;
    @JsonProperty("logging_start_dtg")
    private String loggingStartDtg;
    @JsonProperty("flight_logging_items")
    private List<List<String>> flightLoggingItems = null;
    @JsonProperty("flight_logging_keys")
    private List<String> flightLoggingKeys = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("event")
    public List<Event> getEvent() {
        return event;
    }

    @JsonProperty("event")
    public void setEvent(List<Event> event) {
        this.event = event;
    }

    @JsonProperty("altitude_system")
    public String getAltitudeSystem() {
        return altitudeSystem;
    }

    @JsonProperty("altitude_system")
    public void setAltitudeSystem(String altitudeSystem) {
        this.altitudeSystem = altitudeSystem;
    }

    @JsonProperty("logging_start_dtg")
    public String getLoggingStartDtg() {
        return loggingStartDtg;
    }

    @JsonProperty("logging_start_dtg")
    public void setLoggingStartDtg(String loggingStartDtg) {
        this.loggingStartDtg = loggingStartDtg;
    }

    @JsonProperty("flight_logging_items")
    public List<List<String>> getFlightLoggingItems() {
        return flightLoggingItems;
    }

    @JsonProperty("flight_logging_items")
    public void setFlightLoggingItems(List<List<String>> flightLoggingItems) {
        this.flightLoggingItems = flightLoggingItems;
    }

    @JsonProperty("flight_logging_keys")
    public List<String> getFlightLoggingKeys() {
        return flightLoggingKeys;
    }

    @JsonProperty("flight_logging_keys")
    public void setFlightLoggingKeys(List<String> flightLoggingKeys) {
        this.flightLoggingKeys = flightLoggingKeys;
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

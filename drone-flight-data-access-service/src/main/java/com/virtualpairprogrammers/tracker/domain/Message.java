package com.virtualpairprogrammers.tracker.domain;

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
    "file",
    "message_type",
    "flight_logging",
    "flight_data"
})
public class Message {

    @JsonProperty("file")
    private File file;
    @JsonProperty("message_type")
    private String messageType;
    @JsonProperty("flight_logging")
    private FlightLogging flightLogging;
    @JsonProperty("flight_data")
    private FlightData flightData;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("file")
    public File getFile() {
        return file;
    }

    @JsonProperty("file")
    public void setFile(File file) {
        this.file = file;
    }

    @JsonProperty("message_type")
    public String getMessageType() {
        return messageType;
    }

    @JsonProperty("message_type")
    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    @JsonProperty("flight_logging")
    public FlightLogging getFlightLogging() {
        return flightLogging;
    }

    @JsonProperty("flight_logging")
    public void setFlightLogging(FlightLogging flightLogging) {
        this.flightLogging = flightLogging;
    }

    @JsonProperty("flight_data")
    public FlightData getFlightData() {
        return flightData;
    }

    @JsonProperty("flight_data")
    public void setFlightData(FlightData flightData) {
        this.flightData = flightData;
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

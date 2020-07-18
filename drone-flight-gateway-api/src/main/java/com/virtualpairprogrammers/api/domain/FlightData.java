
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
    "payload",
    "remote_controller",
    "aircraft",
    "summary",
    "gcs",
    "flight_session_end",
    "flight_controller",
    "battery",
    "flight_session_start",
    "logfile_device_origin"
})
public class FlightData {

    @JsonProperty("payload")
    private Payload payload;
    @JsonProperty("remote_controller")
    private RemoteController remoteController;
    @JsonProperty("aircraft")
    private Aircraft aircraft;
    @JsonProperty("summary")
    private Summary summary;
    @JsonProperty("gcs")
    private Gcs gcs;
    @JsonProperty("flight_session_end")
    private String flightSessionEnd;
    @JsonProperty("flight_controller")
    private FlightController flightController;
    @JsonProperty("battery")
    private Battery battery;
    @JsonProperty("flight_session_start")
    private String flightSessionStart;
    @JsonProperty("logfile_device_origin")
    private LogfileDeviceOrigin logfileDeviceOrigin;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("payload")
    public Payload getPayload() {
        return payload;
    }

    @JsonProperty("payload")
    public void setPayload(Payload payload) {
        this.payload = payload;
    }

    @JsonProperty("remote_controller")
    public RemoteController getRemoteController() {
        return remoteController;
    }

    @JsonProperty("remote_controller")
    public void setRemoteController(RemoteController remoteController) {
        this.remoteController = remoteController;
    }

    @JsonProperty("aircraft")
    public Aircraft getAircraft() {
        return aircraft;
    }

    @JsonProperty("aircraft")
    public void setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
    }

    @JsonProperty("summary")
    public Summary getSummary() {
        return summary;
    }

    @JsonProperty("summary")
    public void setSummary(Summary summary) {
        this.summary = summary;
    }

    @JsonProperty("gcs")
    public Gcs getGcs() {
        return gcs;
    }

    @JsonProperty("gcs")
    public void setGcs(Gcs gcs) {
        this.gcs = gcs;
    }

    @JsonProperty("flight_session_end")
    public String getFlightSessionEnd() {
        return flightSessionEnd;
    }

    @JsonProperty("flight_session_end")
    public void setFlightSessionEnd(String flightSessionEnd) {
        this.flightSessionEnd = flightSessionEnd;
    }

    @JsonProperty("flight_controller")
    public FlightController getFlightController() {
        return flightController;
    }

    @JsonProperty("flight_controller")
    public void setFlightController(FlightController flightController) {
        this.flightController = flightController;
    }

    @JsonProperty("battery")
    public Battery getBattery() {
        return battery;
    }

    @JsonProperty("battery")
    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    @JsonProperty("flight_session_start")
    public String getFlightSessionStart() {
        return flightSessionStart;
    }

    @JsonProperty("flight_session_start")
    public void setFlightSessionStart(String flightSessionStart) {
        this.flightSessionStart = flightSessionStart;
    }

    @JsonProperty("logfile_device_origin")
    public LogfileDeviceOrigin getLogfileDeviceOrigin() {
        return logfileDeviceOrigin;
    }

    @JsonProperty("logfile_device_origin")
    public void setLogfileDeviceOrigin(LogfileDeviceOrigin logfileDeviceOrigin) {
        this.logfileDeviceOrigin = logfileDeviceOrigin;
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

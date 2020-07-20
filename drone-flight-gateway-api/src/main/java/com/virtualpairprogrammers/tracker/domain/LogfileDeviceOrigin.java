
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
    "user_interface_idiom",
    "operating_system",
    "model",
    "device_ssid"
})
public class LogfileDeviceOrigin {

    @JsonProperty("user_interface_idiom")
    private String userInterfaceIdiom;
    @JsonProperty("operating_system")
    private String operatingSystem;
    @JsonProperty("model")
    private String model;
    @JsonProperty("device_ssid")
    private String deviceSsid;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("user_interface_idiom")
    public String getUserInterfaceIdiom() {
        return userInterfaceIdiom;
    }

    @JsonProperty("user_interface_idiom")
    public void setUserInterfaceIdiom(String userInterfaceIdiom) {
        this.userInterfaceIdiom = userInterfaceIdiom;
    }

    @JsonProperty("operating_system")
    public String getOperatingSystem() {
        return operatingSystem;
    }

    @JsonProperty("operating_system")
    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    @JsonProperty("model")
    public String getModel() {
        return model;
    }

    @JsonProperty("model")
    public void setModel(String model) {
        this.model = model;
    }

    @JsonProperty("device_ssid")
    public String getDeviceSsid() {
        return deviceSsid;
    }

    @JsonProperty("device_ssid")
    public void setDeviceSsid(String deviceSsid) {
        this.deviceSsid = deviceSsid;
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


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
    "camera",
    "gimbal"
})
public class Payload {

    @JsonProperty("camera")
    private Camera camera;
    @JsonProperty("gimbal")
    private Gimbal gimbal;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("camera")
    public Camera getCamera() {
        return camera;
    }

    @JsonProperty("camera")
    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    @JsonProperty("gimbal")
    public Gimbal getGimbal() {
        return gimbal;
    }

    @JsonProperty("gimbal")
    public void setGimbal(Gimbal gimbal) {
        this.gimbal = gimbal;
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

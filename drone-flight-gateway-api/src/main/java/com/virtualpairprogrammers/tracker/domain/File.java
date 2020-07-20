
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
    "creation_dtg",
    "logging_type",
    "filename"
})
public class File {

    @JsonProperty("creation_dtg")
    private String creationDtg;
    @JsonProperty("logging_type")
    private String loggingType;
    @JsonProperty("filename")
    private String filename;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("creation_dtg")
    public String getCreationDtg() {
        return creationDtg;
    }

    @JsonProperty("creation_dtg")
    public void setCreationDtg(String creationDtg) {
        this.creationDtg = creationDtg;
    }

    @JsonProperty("logging_type")
    public String getLoggingType() {
        return loggingType;
    }

    @JsonProperty("logging_type")
    public void setLoggingType(String loggingType) {
        this.loggingType = loggingType;
    }

    @JsonProperty("filename")
    public String getFilename() {
        return filename;
    }

    @JsonProperty("filename")
    public void setFilename(String filename) {
        this.filename = filename;
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


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
    "event_info",
    "event_timestamp",
    "event_type"
})
public class Event {

    @JsonProperty("event_info")
    private String eventInfo;
    @JsonProperty("event_timestamp")
    private String eventTimestamp;
    @JsonProperty("event_type")
    private String eventType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("event_info")
    public String getEventInfo() {
        return eventInfo;
    }

    @JsonProperty("event_info")
    public void setEventInfo(String eventInfo) {
        this.eventInfo = eventInfo;
    }

    @JsonProperty("event_timestamp")
    public String getEventTimestamp() {
        return eventTimestamp;
    }

    @JsonProperty("event_timestamp")
    public void setEventTimestamp(String eventTimestamp) {
        this.eventTimestamp = eventTimestamp;
    }

    @JsonProperty("event_type")
    public String getEventType() {
        return eventType;
    }

    @JsonProperty("event_type")
    public void setEventType(String eventType) {
        this.eventType = eventType;
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

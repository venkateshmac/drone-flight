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
    "exchange_type",
    "exchanger",
    "uploadingOrgUuid",
    "uploadingPilotUuid",
    "flight_session_id",
    "flight_id",
    "message"
})
public class DroneData {

    @JsonProperty("exchange_type")
    private String exchangeType;
    @JsonProperty("exchanger")
    private String exchanger;
    @JsonProperty("uploadingOrgUuid")
    private Object uploadingOrgUuid;
    @JsonProperty("uploadingPilotUuid")
    private String uploadingPilotUuid;
    @JsonProperty("flight_session_id")
    private String flightSessionId;
    @JsonProperty("flight_id")
    private String flightId;
    @JsonProperty("message")
    private Message message;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("exchange_type")
    public String getExchangeType() {
        return exchangeType;
    }

    @JsonProperty("exchange_type")
    public void setExchangeType(String exchangeType) {
        this.exchangeType = exchangeType;
    }

    @JsonProperty("exchanger")
    public String getExchanger() {
        return exchanger;
    }

    @JsonProperty("exchanger")
    public void setExchanger(String exchanger) {
        this.exchanger = exchanger;
    }

    @JsonProperty("uploadingOrgUuid")
    public Object getUploadingOrgUuid() {
        return uploadingOrgUuid;
    }

    @JsonProperty("uploadingOrgUuid")
    public void setUploadingOrgUuid(Object uploadingOrgUuid) {
        this.uploadingOrgUuid = uploadingOrgUuid;
    }

    @JsonProperty("uploadingPilotUuid")
    public String getUploadingPilotUuid() {
        return uploadingPilotUuid;
    }

    @JsonProperty("uploadingPilotUuid")
    public void setUploadingPilotUuid(String uploadingPilotUuid) {
        this.uploadingPilotUuid = uploadingPilotUuid;
    }

    @JsonProperty("flight_session_id")
    public String getFlightSessionId() {
        return flightSessionId;
    }

    @JsonProperty("flight_session_id")
    public void setFlightSessionId(String flightSessionId) {
        this.flightSessionId = flightSessionId;
    }

    @JsonProperty("message")
    public Message getMessage() {
        return message;
    }

    @JsonProperty("message")
    public void setMessage(Message message) {
        this.message = message;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

	public String getFlightId() {
		return flightId;
	}

	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}

}

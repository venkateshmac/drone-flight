
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
    "serial_number",
    "remaining_life",
    "discharges",
    "full_charge_volume",
    "cell_number",
    "firmware_version"
})
public class Battery {

    @JsonProperty("serial_number")
    private String serialNumber;
    @JsonProperty("remaining_life")
    private String remainingLife;
    @JsonProperty("discharges")
    private String discharges;
    @JsonProperty("full_charge_volume")
    private String fullChargeVolume;
    @JsonProperty("cell_number")
    private String cellNumber;
    @JsonProperty("firmware_version")
    private String firmwareVersion;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("serial_number")
    public String getSerialNumber() {
        return serialNumber;
    }

    @JsonProperty("serial_number")
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @JsonProperty("remaining_life")
    public String getRemainingLife() {
        return remainingLife;
    }

    @JsonProperty("remaining_life")
    public void setRemainingLife(String remainingLife) {
        this.remainingLife = remainingLife;
    }

    @JsonProperty("discharges")
    public String getDischarges() {
        return discharges;
    }

    @JsonProperty("discharges")
    public void setDischarges(String discharges) {
        this.discharges = discharges;
    }

    @JsonProperty("full_charge_volume")
    public String getFullChargeVolume() {
        return fullChargeVolume;
    }

    @JsonProperty("full_charge_volume")
    public void setFullChargeVolume(String fullChargeVolume) {
        this.fullChargeVolume = fullChargeVolume;
    }

    @JsonProperty("cell_number")
    public String getCellNumber() {
        return cellNumber;
    }

    @JsonProperty("cell_number")
    public void setCellNumber(String cellNumber) {
        this.cellNumber = cellNumber;
    }

    @JsonProperty("firmware_version")
    public String getFirmwareVersion() {
        return firmwareVersion;
    }

    @JsonProperty("firmware_version")
    public void setFirmwareVersion(String firmwareVersion) {
        this.firmwareVersion = firmwareVersion;
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

package org.example;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "district_id",
        "district_name"
})

public class District {

    @JsonProperty("district_id")
    private Integer districtId;
    @JsonProperty("district_name")
    private String districtName;

    /**
     * No args constructor for use in serialization
     *
     */
    public District() {
    }

    /**
     *
     * @param districtId
     * @param districtName
     */
    public District(Integer districtId, String districtName) {
        super();
        this.districtId = districtId;
        this.districtName = districtName;
    }

    @JsonProperty("district_id")
    public Integer getDistrictId() {
        return districtId;
    }

    @JsonProperty("district_id")
    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    @JsonProperty("district_name")
    public String getDistrictName() {
        return districtName;
    }

    @JsonProperty("district_name")
    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

}

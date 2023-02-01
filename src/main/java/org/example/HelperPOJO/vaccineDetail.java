package org.example.HelperPOJO;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import java.util.List;


@Getter @Setter
public class vaccineDetail {
    @JsonProperty("center_id")
    private Integer centerId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("address")
    private String address;
    @JsonProperty("state_name")
    private String stateName;
    @JsonProperty("district_name")
    private String districtName;
    @JsonProperty("block_name")
    private String blockName;
    @JsonProperty("pincode")
    private Integer pincode;
    @JsonProperty("from")
    private String from;
    @JsonProperty("to")
    private String to;
    @JsonProperty("lat")
    private Float lat;
    @JsonProperty("long")
    private Float _long;
    @JsonProperty("fee_type")
    private String feeType;
    @JsonProperty("session_id")
    private String sessionId;
    @JsonProperty("date")
    private String date;
    @JsonProperty("available_capacity")
    private Integer availableCapacity;
    @JsonProperty("available_capacity_dose1")
    private Integer availableCapacityDose1;
    @JsonProperty("available_capacity_dose2")
    private Integer availableCapacityDose2;
    @JsonProperty("fee")
    private String fee;

    @JsonProperty("allow_all_age")
    private boolean allowAllAge;

    @JsonProperty("min_age_limit")
    private Integer minAgeLimit;

    @JsonProperty("max_age_limit")
    private Integer maxAgeLimit;


    @JsonProperty("vaccine")
    private String vaccine;
    @JsonProperty("slots")
    private List<slot> slots;

}

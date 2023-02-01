package org.example.HelperPOJO;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter @Setter
public class district {

    @JsonProperty("district_id")
    private Integer districtId;

    @JsonProperty("district_name")
    private String districtName;

}

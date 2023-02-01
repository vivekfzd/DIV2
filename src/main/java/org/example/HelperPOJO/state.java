package org.example.HelperPOJO;
import lombok.Getter;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonProperty;


@Getter @Setter
public class state {

    @JsonProperty("state_id")
    private Integer stateId;

    @JsonProperty("state_name")
    private String stateName;

}

package org.example;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "state_id",
        "state_name"
})

public class State {

    @JsonProperty("state_id")
    private Integer stateId;
    @JsonProperty("state_name")
    private String stateName;

    /**
     * No args constructor for use in serialization
     *
     */
    public State() {
    }

    /**
     *
     * @param stateName
     * @param stateId
     */
    public State(Integer stateId, String stateName) {
        super();
        this.stateId = stateId;
        this.stateName = stateName;
    }

    @JsonProperty("state_id")
    public Integer getStateId() {
        return stateId;
    }

    @JsonProperty("state_id")
    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }

    @JsonProperty("state_name")
    public String getStateName() {
        return stateName;
    }

    @JsonProperty("state_name")
    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

}

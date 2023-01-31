package org.example;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "time",
        "seats"
})

public class Slot {

    @JsonProperty("time")
    private String time;
    @JsonProperty("seats")
    private Integer seats;

    /**
     * No args constructor for use in serialization
     *
     */
    public Slot() {
    }

    /**
     *
     * @param time
     * @param seats
     */
    public Slot(String time, Integer seats) {
        super();
        this.time = time;
        this.seats = seats;
    }

    @JsonProperty("time")
    public String getTime() {
        return time;
    }

    @JsonProperty("time")
    public void setTime(String time) {
        this.time = time;
    }

    @JsonProperty("seats")
    public Integer getSeats() {
        return seats;
    }

    @JsonProperty("seats")
    public void setSeats(Integer seats) {
        this.seats = seats;
    }

}
package org.example;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "districts",
        "ttl"
})

public class ListofDistrict {

    @JsonProperty("districts")
    private List<District> districts;
    @JsonProperty("ttl")
    private Integer ttl;

    /**
     * No args constructor for use in serialization
     *
     */
    public ListofDistrict() {
    }

    /**
     *
     * @param districts
     * @param ttl
     */
    public ListofDistrict(List<District> districts, Integer ttl) {
        super();
        this.districts = districts;
        this.ttl = ttl;
    }

    @JsonProperty("districts")
    public List<District> getDistricts() {
        return districts;
    }

    @JsonProperty("districts")
    public void setDistricts(List<District> districts) {
        this.districts = districts;
    }

    @JsonProperty("ttl")
    public Integer getTtl() {
        return ttl;
    }

    @JsonProperty("ttl")
    public void setTtl(Integer ttl) {
        this.ttl = ttl;
    }

}
package org.example;


import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "sessions"
})

public class VaccineDetail {

    @JsonProperty("sessions")
    private List<Session> sessions;

    /**
     * No args constructor for use in serialization
     *
     */
    public VaccineDetail() {
    }

    /**
     *
     * @param sessions
     */
    public VaccineDetail(List<Session> sessions) {
        super();
        this.sessions = sessions;
    }

    @JsonProperty("sessions")
    public List<Session> getSessions() {
        return sessions;
    }

    @JsonProperty("sessions")
    public void setSessions(List<Session> sessions) {
        this.sessions = sessions;
    }

}

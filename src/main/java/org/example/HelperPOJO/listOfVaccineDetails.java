package org.example.HelperPOJO;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Setter @Getter
public class listOfVaccineDetails {
    @JsonProperty("sessions")
    private List<vaccineDetail> sessions;
}

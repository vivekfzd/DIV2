package org.example.HelperResponse;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.example.HelperPOJO.listOfDistrict;
import org.example.HelperPOJO.listOfState;
import org.example.HelperPOJO.listOfVaccineDetails;
import org.example.URL.allURL;
import java.net.URL;

import static org.testng.Assert.assertEquals;

public class apiSetuHelper {

    public apiSetuHelper(){
        RestAssured.baseURI = allURL.BASE_URL;
    }
    public listOfState getAllState(){
        RequestSpecification httpRequest = RestAssured.given();
        Response res = httpRequest.get(allURL.GET_ALL_STATES);
        int statusCode = res.getStatusCode();
        assertEquals(statusCode, 200, "States has not been feteched properly");
        listOfState states = res.as(listOfState.class);
        return states;
    }

    public listOfDistrict getAllDistrictFromSpecificState(int stateId){
        RequestSpecification httpRequest = RestAssured.given().pathParams("state_id",stateId);
        Response res = httpRequest.get(allURL.GET_ALL_DISTRICTS);
        int statusCode = res.getStatusCode();
        assertEquals(statusCode, 200, "States has not been feteched properly");
        listOfDistrict districts = res.as(listOfDistrict.class);
        return districts;
    }

    public listOfVaccineDetails getAllVaccineDetail(int districtId, String date){
        RequestSpecification httpRequest = RestAssured.given()
                .queryParam("district_id",districtId)
                .queryParam("date",date);
        Response res = httpRequest.get(allURL.GET_ALL_HOSPITALS);
        int statusCode = res.getStatusCode();
        assertEquals(statusCode, 200, "All the Hospital data has not come");
        listOfVaccineDetails vc = res.as(listOfVaccineDetails.class);
        return vc;
    }
}

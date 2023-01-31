import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.example.District;
import org.example.ListofDistrict;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDistrict {

    @Test
    public static void StateCheck(){
        Response response = given()
                .contentType(ContentType.JSON)
                .when()
                .get("https://cdn-api.co-vin.in/api/v2/admin/location/districts/16");

        ListofDistrict d = response.getBody().as(ListofDistrict.class);

        //Q1
        for(District s: d.getDistricts()){

            if(s.getDistrictName().equals("Bangalore Urban")){
                Assert.assertEquals(s.getDistrictId(),265);
            }
//            System.out.println(s.getDistrictName());
        }



    }
}

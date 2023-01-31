import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.example.District;
import org.example.ListofDistrict;
import org.example.Session;
import org.example.VaccineDetail;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;


public class VaccinePriceTest {

    @Test
    public static void StateCheck(){
        Response response = given()
                .contentType(ContentType.JSON)
                .when()
                .get("https://cdn-api.co-vin.in/api/v2/appointment/sessions/public/findByDistrict?district_id=512&date=31-03-2021");

        VaccineDetail v = response.getBody().as(VaccineDetail.class);

        //Q4
        for(Session s: v.getSessions()){
            if(s.getName().equals("Springleaf Healthcare")){
                Assert.assertEquals(s.getStateName(),"Karnataka");
                Assert.assertEquals(s.getDistrictName(),"Bangalore Urban");
                int fee = Integer.parseInt(s.getFee());
                boolean check = false;
                if(fee>300)
                    check = true;

                Assert.assertEquals(check,true);

            }

        }

        boolean free = false;
        //Q5
        for(Session s: v.getSessions()){
            int fee = Integer.parseInt(s.getFee());

            if(fee==0){
                free = true;
            }

        }
        Assert.assertEquals(free,true);
    }
}

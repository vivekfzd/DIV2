import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.example.Example;
import org.example.State;

public class TestState {

    @Test
    public static void StateCheck(){
        Response response = given()
                .contentType(ContentType.JSON)
                .when()
                .get("https://cdn-api.co-vin.in/api/v2/admin/location/states");

        Example e = response.getBody().as(Example.class);

        //Q1
        for(State s: e.getStates()){

            if(s.getStateName().equals("Karnataka")){
                Assert.assertEquals(s.getStateId(),16);
            }
        }

        for(State s: e.getStates()){
            if(s.getStateName() != null){
                Assert.assertNotNull(s.getStateId());
            }
        }



    }
}

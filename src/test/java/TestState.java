import static org.testng.Assert.assertEquals;
import org.example.HelperPOJO.listOfState;
import org.example.HelperPOJO.state;
import org.example.HelperResponse.apiSetuHelper;
import org.testng.annotations.Test;

public class TestState {

    //Q1
    @Test
    public static void karnatakaStateIdTesting(){
        apiSetuHelper temp = new apiSetuHelper();
        listOfState e = temp.getAllState();

        boolean existsKarnataka = false;

        //check that karnataka is exists or not
        for(state s: e.getStates()){
            if(s.getStateName().equals("Karnataka")){
                existsKarnataka = true;
                assertEquals(s.getStateId(),16,"Karnataka State id has not matched");
            }
        }
        assertEquals(existsKarnataka,true,"Karnataka has not existed in Data");
    }

    //Q2
    @Test
    public static void checkAllStateId(){
        apiSetuHelper temp = new apiSetuHelper();
        listOfState e = temp.getAllState();

        boolean allStatesHasId = true;

        //check that karnataka is exists or not
        for(state s: e.getStates()){
            if(s.getStateName() != null){
                if(s.getStateId()==null) {
                    allStatesHasId = false;
                    break;
                }
            }
        }
        assertEquals(allStatesHasId,true,"Some states has no State Id");
    }
}

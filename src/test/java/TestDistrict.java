import static org.testng.Assert.assertEquals;
import org.example.HelperPOJO.district;
import org.example.HelperPOJO.listOfDistrict;
import org.example.HelperResponse.apiSetuHelper;
import org.testng.annotations.Test;

public class TestDistrict {

    @Test
    public static void testBangloreUrbanID(){

        apiSetuHelper temp = new apiSetuHelper();
        listOfDistrict d = temp.getAllDistrictFromSpecificState(16);

        boolean extistBangaloreUrban = false;

        //check that karnataka is exists or not
        for(district s: d.getDistricts()){
            if(s.getDistrictName().equals("Bangalore Urban")){
                extistBangaloreUrban = true;
                assertEquals(s.getDistrictId(),265,"Bangalore Urban district Id has not matched");
            }
        }
        assertEquals(extistBangaloreUrban,true,"Bangalore Urban has not existed in Data");
    }


}

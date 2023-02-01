import org.example.HelperPOJO.listOfVaccineDetails;
import org.example.HelperPOJO.vaccineDetail;
import org.example.HelperResponse.apiSetuHelper;
import org.testng.Assert;
import org.testng.annotations.Test;


public class VaccinePriceTest {

    @Test
    public void priceOfVaccineTestCase(){
        int districtId = 512;
        String date = "01-02-2023";
        apiSetuHelper temp = new apiSetuHelper();
        listOfVaccineDetails vc = temp.getAllVaccineDetail(districtId,date);
        float fee = 0.0F, threshold = 300.0F;
        String hospitalName = "Springleaf Healthcare";
        boolean springLeafHealthcareExist = false;
        boolean fessMorethanEqual300 = false;

        //Q4
        for(vaccineDetail v: vc.getSessions()){
            if(v.getName().equals("Springleaf Healthcare")){
                springLeafHealthcareExist = true;
                Assert.assertEquals(v.getStateName(),"Karnataka");
                Assert.assertEquals(v.getDistrictName(),"Bangalore Urban");
                if(Integer.parseInt(v.getFee())>=300){
                    fessMorethanEqual300 = true;
                }
            }
        }
        Assert.assertEquals(springLeafHealthcareExist,true,"Springleaf Hospital has not found");
        Assert.assertEquals(fessMorethanEqual300,true,"None of the vaccine is more than and equal to 300");
    }

    @Test
    public static void vaccineFreeTest(){
        int districtId = 512;
        String date = "01-02-2023";
        apiSetuHelper temp = new apiSetuHelper();
        listOfVaccineDetails vc = temp.getAllVaccineDetail(districtId,date);

        boolean free = false;
        //Q5
        for(vaccineDetail v: vc.getSessions()){
            if(v.getFeeType().equals("Free")){
                free = true;
            }

        }
        Assert.assertEquals(free,true,"None of the vaccine are free");
    }
}

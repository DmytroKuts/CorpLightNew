package correspondentsTests;


import libs.ConfigData;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import parrentTest.ParentTest;

public class OpenCorrMenuAndShowInfo extends ParentTest {

    @BeforeClass
    public  void loginAPP(){
        super.setUp();
        loginPage.loginUser(ConfigData.getUiMappingValue( "loginCorrect"), ConfigData.getUiMappingValue( "passwordCorrect"));
    }

    @Test
    public void openCorrMenuAndShowInfo() {
        mainPage.openCorrespondentsMenu();
        correspondentsPage.clickOnRecipientChevron();
        checkAC("Info is not present",correspondentsPage.ElementPresent(), true);
    }
}

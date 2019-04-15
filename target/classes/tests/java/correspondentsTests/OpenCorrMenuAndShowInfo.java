package correspondentsTests;


import libs.ConfigData;
import org.junit.Test;
import parrentTest.ParentTest;

public class OpenCorrMenuAndShowInfo extends ParentTest {


    @Test
    public void openCorrMenuAndShowInfo() {
        super.setUp();
        loginPage.loginUser(ConfigData.getUiMappingValue( "loginCorrect"), ConfigData.getUiMappingValue( "passwordCorrect"));
        mainPage.openCorrespondentsMenu();
        correspondentsPage.clickOnRecipientChevron();
        checkAC("Info is not present",correspondentsPage.ElementPresent(), true);
    }
}

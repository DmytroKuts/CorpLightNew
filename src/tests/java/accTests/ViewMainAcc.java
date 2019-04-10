package accTests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import pages.LoginPage;
import parrentTest.ParentTest;
import libs.ConfigData;
public class ViewMainAcc extends ParentTest{

    @BeforeClass
    public  void loginAPP(){
        super.setUp();
        loginPage.loginUser(ConfigData.getUiMappingValue( "loginCorrect"), ConfigData.getUiMappingValue( "passwordCorrect"));
    }

    @Test
    public void viewMainAccInUAHandUSD()  {
        mainPage.openAccountsMenu();
        checkAC("Accounts is not present",accPage.ElementPresent(), true);
    }




}

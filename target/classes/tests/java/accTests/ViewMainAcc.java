package accTests;


import org.junit.Test;
import parrentTest.ParentTest;
import libs.ConfigData;
public class ViewMainAcc extends ParentTest{




    @Test
    public void viewMainAccInUAHandUSD()  {
        super.setUp();
        loginPage.loginUser(ConfigData.getUiMappingValue( "loginCorrect"), ConfigData.getUiMappingValue( "passwordCorrect"));
        mainPage.openAccountsMenu();
        checkAC("Accounts is not present",accPage.ElementPresent(), true);
    }




}

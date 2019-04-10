package loginTests;


import libs.ConfigData;
import org.junit.Assert;
import org.testng.annotations.Test;
import parrentTest.ParentTest;


public class LoginTest extends ParentTest {


    @Test
    public void validLogin()  {
        super.setUp();
        loginPage.loginUser(ConfigData.getUiMappingValue( "loginCorrect"), ConfigData.getUiMappingValue( "passwordCorrect"));
        checkAC("Avatar is not present",mainPage.isAvatarPresent(), true);
    }

    @Test
    public void unValidLogin() {
        super.setUp();
        loginPage.loginUser("abr@ub.com","qwerty");
        Assert.assertTrue("Login Input does not dispalay", loginPage.isLoginInputDisplay());
    }

}


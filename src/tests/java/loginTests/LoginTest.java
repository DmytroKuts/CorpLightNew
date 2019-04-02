package loginTests;


import org.junit.Test;
import parrentTest.ParentTest;


public class LoginTest extends ParentTest {


    @Test
    public void validLogin() throws InterruptedException {
        loginPage.loginUser("brusov@ub.com", "qwerty");
        checkAC("Avatar is not present",mainPage.isAvatarPresent(), true);
    }

}


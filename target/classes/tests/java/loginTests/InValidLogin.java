package loginTests;

import org.junit.Assert;
import org.junit.Test;
import parrentTest.ParentTest;

public class InValidLogin extends ParentTest{
    @Test

    public void unValidLogin() throws InterruptedException {
        loginPage.loginUser("abr@ub.com","qwerty");
        Assert.assertTrue("Login Input does not dispalay", loginPage.isLoginInputDisplay());
    }
}

package accTests;


import org.junit.Test;
import parrentTest.ParentTest;

public class ViewMainAcc extends ParentTest{

    @Test
    public void viewMainAccInUAHandUSD() throws InterruptedException {
        loginPage.loginUser("test187@t.com", "qwerty");
        mainPage.openAccountsMenu();
        checkAC("Accounts is not present",accPage.ElementPresent(), true);
    }
}

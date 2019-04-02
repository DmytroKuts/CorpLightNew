package correspondentsTests;


import org.junit.Test;
import parrentTest.ParentTest;

public class OpenCorrMenuAndShowInfo extends ParentTest {

    @Test
    public void openCorrMenuAndShowInfo() {
        loginPage.loginUser("abrusovv@ub.com", "qwerty");
        mainPage.openCorrespondentsMenu();
        correspondentsPage.clickOnRecipientChevron();
        checkAC("Info is not present",correspondentsPage.ElementPresent(), true);
    }
}

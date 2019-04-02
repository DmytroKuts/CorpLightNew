package paymentsTests;

import org.junit.Test;
import parrentTest.ParentTest;

public class NewPaymentBetweenOwnAccounts extends ParentTest{

    @Test
    public void createNewPaymentsBetweenOwnAccounts() throws InterruptedException {
        loginPage.loginUser("brusov@ub.com", "qwerty");;
        checkAC("Avatar is not present",mainPage.isAvatarPresent(), true);
        mainPage.changeClient();
        mainPage.RNK98509901();
        mainPage.openPaymentsMenu();
        paymentsPage.newPayment();
        paymentsPage.enterTextIntoInputAmount("20");
        paymentsPage.enterTextIntoInputPurpose("New payment between accs by selenium");
        paymentsPage.clickOnButtonConfirm();
        paymentsPage.clickOnButtonYes();
        paymentsPage.clickOnButtonSavePayment();
        checkAC("Payment not saved",paymentsPage.isPaymentSavedSuccess(), true);
    }
}

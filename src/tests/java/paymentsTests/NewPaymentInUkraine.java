package paymentsTests;

import libs.ConfigData;
import org.junit.Test;
import pages.MainPage;
import pages.PaymentsPage;
import parrentTest.ParentTest;

public class NewPaymentInUkraine extends ParentTest {

    @Test
    public void createNewPaymentsInUkraine()  {
        super.setUp();
        loginPage.loginUser(ConfigData.getUiMappingValue( "loginCorrect"), ConfigData.getUiMappingValue( "passwordCorrect"));
        checkAC("Avatar is not present",mainPage.isAvatarPresent(), true);
        //mainPage.changeClient();
        //mainPage.RNK98509901();
        mainPage.openPaymentsMenu();
        paymentsPage.newPayment();
        paymentsPage.newPaymentInUkraine();
        paymentsPage.openDropDownWIthAccs();
        paymentsPage.chooseAccFromDropDown();
        paymentsPage.openCorrDictionary();
        paymentsPage.choseCorr();
        paymentsPage.enterTextIntoInputAmount("48.84");
        paymentsPage.enterTextIntoInputPurpose("New payment in Ukraine by selenium");
        paymentsPage.clickOnButtonConfirm();
        paymentsPage.clickOnButtonSavePayment();
        checkAC("Payment not saved",paymentsPage.isPaymentSavedSuccess(), true);

    }
}
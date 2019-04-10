package paymentsTests;

import libs.ConfigData;
import org.testng.annotations.Test;
import parrentTest.ParentTest;

/**
 * @author oleksandr.brusov
 * @date 18.06.2018.
 */
public class NewSwiftPayments extends ParentTest {

    @Test
    public void createNewSwiftPayment() throws InterruptedException {
        super.setUp();
        loginPage.loginUser(ConfigData.getUiMappingValue( "loginCorrect"), ConfigData.getUiMappingValue( "passwordCorrect"));
        checkAC("Avatar is not present",mainPage.isAvatarPresent(), true);
        //mainPage.changeClient();
        //mainPage.RNK98509901();
        mainPage.openPaymentsMenu();
        paymentsPage.newPayment();
        paymentsPage.newSwiftPayment();
        swiftPayment.openComDocReqMenu();
        swiftPayment.chooseCurrency();
        swiftPayment.chooseUSD();
        swiftPayment.enterSwiftAmount("100");
        swiftPayment.enterSwiftPurpose("14/14/1988 new swift by Selenium");
        swiftPayment.chooseBEN();
        swiftPayment.enterOther("Test SWIFT created by Selenium");
        swiftPayment.checkBoxIAgreeWith();
        swiftPayment.buttonNext1();
        paymentsPage.clickOnButtonYes();
        swiftPayment.openSwiftDdWithAccs();
        swiftPayment.chooseAcc260093011661USD();
        swiftPayment.clickIntermediary();
        swiftPayment.clickCheckBoxIntermediary();
        swiftPayment.enterTextclickIntermediary("Selenuum Bank Swift");
        swiftPayment.enterTextintermediaryBankSwift("Selenium #SWIFT");
        swiftPayment.enterTextIntermediaryBankLocation("Selenium Location Swift");
        swiftPayment.clickBeneficiary();
        swiftPayment.enterTextBeneficiaryAccountNumber("260454545454545454");
        swiftPayment.enterTextBenificiaryIBANNumber("UA8855300465260056565656");
        swiftPayment.enterTextBeneficiaryName("Benef Name Selenium ");
        swiftPayment.enterTextBeneficiaryLocation("Location Selenium");
        swiftPayment.enterTextBeneficiaryBankCorrAccount("SeleniumCorBank");
        swiftPayment.enterTextBeneficiaryBankName("ASSET ALLOCATION ADVISORS SA");
        swiftPayment.enterTextBeneficiaryBankSWIFT("AAADFRP1XXX");
        swiftPayment.enterTextBenificiaryBankLocation("FRANCE, PARIS, 3, AVENUE HOCHE CHEZ NSM CHEZ NSM 75008 PARIS");
        swiftPayment.clickBenificiaryBankLocation();
        swiftPayment.clickButtonNext4();
        swiftPayment.clickOnsign();
        swiftPayment.textSuccess();

    }
}
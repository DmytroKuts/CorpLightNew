package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static libs.ActionsWithOurElements.*;

/**
 * @author oleksandr.brusov
 * @date 18.06.2018.
 */
public class SwiftPayment extends PaymentsPage {

    @FindBy (xpath = "(.//div[contains(@class, 'panel-title ng-binding')])[1]")
    private WebElement CommonDocumentRequisites;

    @FindBy (name = "Amount")
    private WebElement Sum;

    @FindBy (xpath = "(.//*[contains(@class, 'ui-select-toggle')])[1]")
    private WebElement CurrencyDropDown;

    @FindBy (xpath = ".//*[@class= 'ng-binding'and text() = 'EUR']")
    private WebElement ChooseCurEUR;

    @FindBy (name = "Purpose")
    private WebElement Puprose;

    @FindBy (xpath = "//input[@value='BEN']")
    public WebElement BEN;

    @FindBy (name = "Other")
    private WebElement Other;

    @FindBy (xpath =".//input[@name='IAgreeWith']/..")
    private WebElement IAgreeWith;

    @FindBy (xpath = "(.//button[@type='submit'])[1]")
    private WebElement ButtonNext;

    @FindBy (xpath = "(.//div[contains(@class, 'panel-title ng-binding')])[2]")
    private WebElement Payer;

    @FindBy (xpath = "(.//*[@aria-label='Select box activate'])[2]")
    private WebElement DropDownWithAccs;

    @FindBy (xpath = ".//b[contains(@class, 'ng-binding') and text() = '26006301300598']")
    private WebElement ChooseAcc26006301300598;

    @FindBy (xpath ="(.//div[contains(@class, 'panel-title ng-binding')])[3]")
    private WebElement Intermediary;

    @FindBy (xpath ="//span[@data-translate = 'components.pay.swift.intermediaryBankPresent']")
    private WebElement CheckBoxIntermediary;

    @FindBy (xpath ="//input[@name= 'IntermediaryBankName']")
    private WebElement IntermediaryBankName;

    @FindBy (xpath ="//input[@name= 'IntermediaryBankSwift']")
    private WebElement IntermediaryBankSwift;

    @FindBy (xpath ="//input[@name= 'IntermediaryBankLocation']")
    private WebElement IntermediaryBankLocation;

    @FindBy (xpath ="(.//div[contains(@class, 'panel-title ng-binding')])[4]")
    private WebElement Beneficiary;

    @FindBy (xpath ="//input[@name= 'BeneficiaryAccountNumber']")
    private WebElement BeneficiaryAccountNumber;

    @FindBy (xpath ="//input[@name= 'BenificiaryIBANNumber']")
    private WebElement BenificiaryIBANNumber;

    @FindBy (xpath ="//input[@name= 'BeneficiaryName']")
    private WebElement BeneficiaryName;

    @FindBy (xpath ="//input[@name= 'BeneficiaryLocation']")
    private WebElement BeneficiaryLocation;

    @FindBy (xpath ="//input[@name= 'BeneficiaryBankCorrAccount']")
    private WebElement BeneficiaryBankCorrAccount;

    @FindBy (xpath ="//input[@name= 'BeneficiaryBankName']")
    private WebElement BeneficiaryBankName;

    @FindBy (xpath ="//input[@name= 'BeneficiaryBankSWIFT']")
    private WebElement BeneficiaryBankSWIFT;

    @FindBy (xpath ="//input[@name= 'BenificiaryBankLocation']")
    private WebElement BenificiaryBankLocation;

    @FindBy (xpath = "(.//button[@type='submit'])[4]")
    private WebElement ButtonNext4;

    @FindBy (xpath = ".//*[@class='ac-menu-item ng-scope']")
    private WebElement ChooseBenificiaryBankLocation;

    @FindBy (xpath = ".//*[contains(@ng-click, 'ONSIGN')]")
    private WebElement ClickOnsign;

    @FindBy (xpath = ".//span[text()[contains(.,'платіж успішно збережено')]]")
    private WebElement TextSuccess;


    public void openComDocReqMenu () {clickOnElement(CommonDocumentRequisites);}

    public void enterSwiftAmount (String amount){enterTextInToInput(Sum,amount);}

    public void chooseCurrency () {clickOnElement(CurrencyDropDown);}

    public void chooseUSD() {clickOnElement(ChooseCurEUR);}

    public void enterSwiftPurpose (String purpose) {enterTextInToInput(Puprose,purpose);}

    public void chooseBEN() {BEN.click();}

    public void enterOther(String other) {enterTextInToInput(Other, other);}

    public void checkBoxIAgreeWith (){setStateToCheckBox(IAgreeWith,"Checked");}

    public void buttonNext1 () {clickOnElement(ButtonNext);}

    public void openPayerMenu ()  {clickOnElement(Payer);}

    public void openSwiftDdWithAccs() {clickOnElement(DropDownWithAccs);}

    public void chooseAcc260093011661USD () {clickOnElement(ChooseAcc26006301300598);}

    public void clickIntermediary () {clickOnElement(Intermediary);}

    public void clickCheckBoxIntermediary () {clickOnElement(CheckBoxIntermediary);}

    public void enterTextclickIntermediary (String intermediaryBankName) {enterTextInToInput(IntermediaryBankName,intermediaryBankName);}

    public void enterTextintermediaryBankSwift (String intermediaryBankSwift) {enterTextInToInput(IntermediaryBankSwift,intermediaryBankSwift);}

    public void enterTextIntermediaryBankLocation (String intermediaryBankLocation) {enterTextInToInput(IntermediaryBankLocation,intermediaryBankLocation);}

    public void clickBeneficiary () {clickOnElement(Beneficiary);}

    public void enterTextBeneficiaryAccountNumber(String beneficiaryAccountNumber) {enterTextInToInput(BeneficiaryAccountNumber,beneficiaryAccountNumber);}

    public void enterTextBenificiaryIBANNumber (String benificiaryIBANNumber) {enterTextInToInput(BenificiaryIBANNumber,benificiaryIBANNumber);}

    public void enterTextBeneficiaryName (String beneficiaryName) {enterTextInToInput(BeneficiaryName,beneficiaryName);}

    public void enterTextBeneficiaryLocation (String beneficiaryLocation) {enterTextInToInput(BeneficiaryLocation,beneficiaryLocation);}

    public void enterTextBeneficiaryBankCorrAccount (String beneficiaryBankCorrAccount) {enterTextInToInput(BeneficiaryBankCorrAccount,beneficiaryBankCorrAccount);}

    public void enterTextBeneficiaryBankName(String beneficiaryBankName) {enterTextInToInput(BeneficiaryBankName,beneficiaryBankName);}

    public void enterTextBeneficiaryBankSWIFT (String beneficiaryBankSWIFT) {enterTextInToInput(BeneficiaryBankSWIFT,beneficiaryBankSWIFT);}

    public void enterTextBenificiaryBankLocation (String benificiaryBankLocation) {enterTextInToInput(BenificiaryBankLocation,benificiaryBankLocation);}

    public void clickBenificiaryBankLocation () {clickOnElement(ChooseBenificiaryBankLocation);}

    public void clickButtonNext4 () {clickOnElement(ButtonNext4);}

    public void clickOnsign () {clickOnElement(ClickOnsign);}

    public void textSuccess () {TextSuccess.isDisplayed();}



    public SwiftPayment(WebDriver webDriver) {
        super(webDriver);

    }
}

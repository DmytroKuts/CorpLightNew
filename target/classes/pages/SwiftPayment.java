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

    @FindBy (xpath = ".//*[@class= 'ng-binding'and text() = 'USD']")
    private WebElement ChooseCurUSD;

    @FindBy (name = "Purpose")
    private WebElement Puprose;

    @FindBy (xpath = "//input[@value='BEN']")
    public WebElement BEN;

    @FindBy (name = "Other")
    private WebElement Other;

    @FindBy (xpath =".//input[@name='IAgreeWith']")
    private WebElement IAgreeWith;

    @FindBy (xpath = "(.//button[@type='submit'])[1]")
    private WebElement ButtonNext;

    @FindBy (xpath = "(.//div[contains(@class, 'panel-title ng-binding')])[2]")
    private WebElement Payer;

    @FindBy (xpath = "(.//*[@aria-label='Select box activate'])[2]")
    private WebElement DropDownWithAccs;

    @FindBy (xpath = ".//b[contains(@class, 'ng-binding') and text() = '260093011661']")
    private WebElement ChooseAcc260093011661USD;

    @FindBy (xpath ="c")
    private WebElement UAclientName;

    @FindBy (xpath = "(.//*[@class='ui-select-match-text pull-left'])[3]")
    private WebElement DdWithCountry;

    @FindBy (xpath = ".//div[text()[contains(.,'Ірландія')]]")
    private WebElement ChoseIrelandCountry;

    @FindBy (xpath = ".//input[@name= 'SenderLocation'and value='Адреса клієнта RNK=98509901']")
    private WebElement TestLoc;






    public void openComDocReqMenu () {clickOnElement(CommonDocumentRequisites);}

    public void enterSwiftAmount (String amount){enterTextInToInput(Sum,amount);}

    public void chooseCurrency () {clickOnElement(CurrencyDropDown);}

    public void chooseUSD() {clickOnElement(ChooseCurUSD);}

    public void enterSwiftPurpose (String purpose) {enterTextInToInput(Puprose,purpose);}

    public void chooseBEN() {BEN.click();}

    public void enterOther(String other) {enterTextInToInput(Other, other);}

    public void checkBoxIAgreeWith (){setStateToCheckBox(IAgreeWith,"Checked");}

    public void buttonNext1 () {clickOnElement(ButtonNext);}

    public void openPayerMenu ()  {clickOnElement(Payer);}

    public void openSwiftDdWithAccs() {clickOnElement(DropDownWithAccs);}

    public void chooseAcc260093011661USD () {clickOnElement(ChooseAcc260093011661USD);}

    public void chooseUAclientName () {clickOnElement(UAclientName);}

    public void openDdWithCountry() {clickOnElement(DdWithCountry);}

    public void chooseIreland() {clickOnElement(ChoseIrelandCountry);}

    public void testLoc() {isElementPresent(TestLoc);}

    public SwiftPayment(WebDriver webDriver) {
        super(webDriver);

    }
}

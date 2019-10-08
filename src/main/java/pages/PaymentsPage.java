package pages;

import static libs.ActionsWithOurElements.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentsPage extends ParentPage{



    @FindBy (xpath = ".//a[@href='/payments/new/within-country/']")
    private WebElement CreateNewPayment;

    @FindBy (xpath = ".//a[@href='/payments/new/within-mfo/']")
    private WebElement CreateInnerPay;

    @FindBy (xpath = ".//a[@href='/payments/new/within-country/']")
    private WebElement PaymentInUkraine;

    @FindBy (xpath = ".//*[contains(@ui-sref, 'app.payments.create.swift')]")
    private WebElement SwiftPayment;

    @FindBy (xpath = ".//*[@class='ui-select-match-text pull-left']")
    private WebElement DropDownWithAccs;

    @FindBy (xpath = ".//span[contains(@class, 'ng-binding ng-scope') and text() = 'РАХУНОК 26250500949926 ']")
    private WebElement ChooseAcc260093011661UAH;

    @FindBy (xpath = ".//*[@class='btn ng-scope']")
    private WebElement CorrespondentsDictionary;

    @FindBy (xpath = ".//*[@class='ng-binding' and text() = '260013011065']")
    private WebElement ChooseCorrWithAcc260083011655;

    @FindBy (name = "Amount")
    private WebElement InputAmount;

    @FindBy (name = "purpose")
    private WebElement InputPurpose;

    @FindBy (xpath = ".//button[@data-translate='components.pay.confirm']")
    private WebElement ButtonConfirm;

    @FindBy (xpath = ".//button[@data-translate='shared.Yes']")
    private WebElement ButtonYes;

    @FindBy (xpath = ".//button[@data-translate='components.pay.save']")
    private WebElement ButtonSavePayment;

    @FindBy (xpath = ".//span[@data-translate='components.pay.paymentSavedSuccess']")
    private WebElement PaymentSavedSuccess;


    /**
     * Method open page, where you can create payment between yours accounts
     */
    public void newPayment(){clickOnElement(CreateNewPayment);}

    public void newInnerPay(){clickOnElement(CreateInnerPay);}

    public void newPaymentInUkraine(){clickOnElement(PaymentInUkraine);}

    public void newSwiftPayment(){clickOnElement(SwiftPayment);}

    public void openDropDownWIthAccs(){clickOnElement(DropDownWithAccs);}

    public void chooseAccFromDropDown(){clickOnElement(ChooseAcc260093011661UAH);}

    public void openCorrDictionary () {clickOnElement(CorrespondentsDictionary);}

    public void choseCorr() {clickOnElement(ChooseCorrWithAcc260083011655);}

    public void enterTextIntoInputAmount (String amount){enterTextInToInput(InputAmount,amount);}

    public void enterTextIntoInputPurpose (String purpose){
        enterTextInToInput(InputPurpose,purpose);
    }

    public void clickOnButtonConfirm (){clickOnElement(ButtonConfirm);}

    public void clickOnButtonYes(){clickOnElement(ButtonYes);}

    public void clickOnButtonSavePayment(){clickOnElement(ButtonSavePayment);}

    public boolean isPaymentSavedSuccess() {return isElementPresent(PaymentSavedSuccess);}

    public PaymentsPage(WebDriver webDriver) {super(webDriver, "/payments/incomings");}
}

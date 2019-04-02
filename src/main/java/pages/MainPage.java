package pages;

import static libs.ActionsWithOurElements.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends ParentPage {

    @FindBy(xpath = ".//*[@class='hidden-sm f-f-futura ng-binding']")
    private WebElement Avatar;

    @FindBy(xpath = ".//span[@data-translate='aside.nav.ACCOUNTS']")
    private WebElement Accounts;

    @FindBy(xpath = ".//span[@data-translate='aside.nav.CORRESPONDENTS']")
    private WebElement Correspondents;

    @FindBy(xpath = ".//*[@data-translate= 'aside.nav.DOCUMENTS']") //(.//a[@href='/payments/incomings'])[1]
    private WebElement Payments;

    @FindBy(xpath = ".//*[@class='dropdown-toggle hidden-folded']")
    private WebElement ChangeClient;

    //.//*[@class='nav left-navigation ng-scope']/ li[1]
    @FindBy(xpath = ".//a[text()[contains(.,'Клієнт RNK=98509901')]]")
    private WebElement ChooseClientWithRNK98509901;

    @FindBy(xpath = ".//*[@class='screen-loader-wrapper']")
    private WebElement loader;

    public MainPage(WebDriver webDriver) {
        super(webDriver, "/dashboard");
    }

    /**
     * Method open page with all accounts which have user
     */
    public void openAccountsMenu() {clickOnElement(Accounts);}
    /**
     * Method open menu with banks or firms, where you can see and change info about them
     */
    public void openCorrespondentsMenu(){clickOnElement(Correspondents);}
    /**
     * Method open payments menu
     */
    public void openPaymentsMenu() {clickOnElement(Payments);}
    /**
     * Method open dropdown where we can change client
     */
    public void changeClient() {clickOnElement(ChangeClient);}
    /**
     * Method chose client with rnk=98509901
     */
    public void RNK98509901() {clickOnElement(ChooseClientWithRNK98509901);}

    public boolean isAvatarPresent() {return isElementPresent(Avatar);}
}


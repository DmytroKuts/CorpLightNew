package pages;

import static libs.ActionsWithOurElements.*;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends ParentPage {

//  @FindBy(xpath = ".//div[contains(@class,'app-auth-tabs')]/ul/li[1]")
//  private WebElement linkByLogin;

    @FindBy(name = "login")
    private WebElement inputLogin;

    @FindBy(name = "loginpass")
    private WebElement inputPassword;

    @FindBy(xpath = ".//*[@id='app']/ul[2]/li/a")
    private WebElement frame;//  .//*[@class='dropdown-toggle ng-binding'];

    @FindBy(xpath = "//span[text()='цілодобовий доступ до ваших рахунків']")
    private WebElement textOnMainPage;

    @FindBy(xpath = ".//form[ contains(@class ,'ng-valid-email')]/button[contains(@class,'btn-login')]")
    private WebElement buttonSubmit;

    @FindBy(xpath = ".//*[@class='screen-loader-wrapper']")
    private WebElement loader;

    public LoginPage(WebDriver webDriver) {
        super(webDriver, "/auth/logon");
    }

    /**
     * Method open logon page of CL
     */
    public void openLoginPage() {
        try {
            webDriver.get(configProperties.base_url());
            logger.info("Login page was open");
        } catch (Exception e) {
            logger.error("Can not open url");
            Assert.fail("Can not open url");
        }
    }

    /**
     * Method open window where you can login with your email and pass
     */
//  public void openLinkByLogin() {clickOnElement(linkByLogin);}
    public void enterTextIntoInputLogin(String login) {
        enterTextInToInput(inputLogin, login);
    }

    public void enterTextIntoInputPass(String pass) {
        enterTextInToInput(inputPassword, pass);
    }


    public void clickOnSubmitButton() {
        WaitLoaderClosed();
        Actions actions = new Actions(webDriver);
        actions.moveToElement(buttonSubmit).click();
        clickOnElement(buttonSubmit);
    }

    public void WaitLoaderClosed() {
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.invisibilityOf(loader));
    }


    /**
     * Method contains all methods which witch you open CL and login
     */
    public void loginUser(String login, String pass) {
        openLoginPage();
//        textOnMainPage.isDisplayed();
        enterTextIntoInputLogin(login);
        enterTextIntoInputPass(pass);
        clickOnSubmitButton();
    }

    public boolean isLoginInputDisplay() {
        return isElementPresent(inputLogin);
    }
}
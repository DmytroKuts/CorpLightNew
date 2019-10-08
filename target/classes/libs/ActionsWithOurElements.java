package libs;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import static com.codeborne.selenide.Selenide.*;

import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.concurrent.TimeUnit;

public class ActionsWithOurElements {
    static WebDriver webdriver;
    static Logger logger;
    static WebDriverWait webDriverWait10;

    @FindBy(xpath = ".//*[@class='screen-loader-wrapper']")
    static WebElement loader;

    @FindBy(xpath = ".//*[contains(@uib-modal-window, 'modal-window']") //uib-modal-window="modal-window"
    static WebElement modalWindow;

    public ActionsWithOurElements(WebDriver webdriver, WebElement loader, WebElement modalWindow) {
        this.webdriver = webdriver;
        this.loader = loader;
        this.modalWindow = modalWindow;
        logger = Logger.getLogger("ActionsWithOurElements");
        webDriverWait10 = new WebDriverWait(webdriver, 20);
    }

    public static void WaitLoaderClosed() {
        WebDriverWait wait = new WebDriverWait(webdriver, 10);
        wait.until(ExpectedConditions.invisibilityOf(loader));
    }

    public static void WaitLoad(WebElement load) {
        WebDriverWait wait = new WebDriverWait(webdriver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(load));
    }

    public static void WaitModalWindowClosed() {
        WebDriverWait wait = new WebDriverWait(webdriver, 10);
        wait.until(ExpectedConditions.invisibilityOf(modalWindow));
    }

    /**
     * Method Enter text in to input and textArea
     *
     * @param input
     * @param text
     */
    public static void enterTextInToInput(WebElement input, String text) {
        try {
            //WaitLoad(input);
            //webdriver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
            if (!input.isDisplayed()) {
                ((JavascriptExecutor) webdriver).executeScript("arguments[0].scrollIntoView();", input);
            }
            $(input).shouldBe(Condition.visible).clear();
            $(input).sendKeys(text);
            logger.info(text + " was inputed in to input " + input);
        } catch (Exception e) {
            logErrorAndStopTest(e);
        }
    }

    /**
     * Method Click on elements on page
     *
     * @param element
     */

    public static void clickOnElement(WebElement element) {
        try {
//            webDriverWait10 = new WebDriverWait(webdriver, 10);
//            webDriverWait10.until(ExpectedConditions.elementToBeClickable(element));
            //element.click();
            $(element).shouldBe(Condition.visible).click();
            logger.info("Elemet was clicked " + element);
        } catch (Exception e) {

            logErrorAndStopTest(e);
        }
    }


    public static void clickOnElementWithModalW(WebElement element) {
        try {
            WaitModalWindowClosed();
            webDriverWait10.until(ExpectedConditions.elementToBeClickable(element));
            $(element).shouldBe(Condition.enabled).click();
            logger.info("Elemet was clicked " + element);
        } catch (Exception e) {
            logErrorAndStopTest(e);
        }
    }

    /**
     * Method Find elements on page for present them
     *
     * @param element
     * @return
     */
    public static boolean isElementPresent(WebElement element) {
        try {
            boolean tempState = element.isDisplayed() && element.isEnabled(); //&& - "и" - и отображается и активен (одно & - Если первый фолс,
            // то второй не проверяется, а возвращает фолс.
            logger.info("Is Element Present ? - " + tempState);
            return tempState;
        } catch (Exception e) {
            logger.info("Is Element Present ? - false");
            return false;
        }
    }


    /**
     * Method set needed state in CheckBox
     *
     * @param element
     * @param neededState (Can be only 'Checked' or 'Unchecked')
     */
    public static void setStateToCheckBox(WebElement element, String neededState) {
        final String CHECK_STATUS = "Checked";
        final String UNCHECK_STATUS = "Unchecked";
        ((JavascriptExecutor) webdriver).executeScript("arguments[0].scrollIntoView();", element);
        $(element).waitUntil(Condition.enabled, 20);
        if (!neededState.equals(CHECK_STATUS) && !neededState.equals(UNCHECK_STATUS)) {
            logger.error(neededState + " - Value of neededState is not expected ");
            Assert.fail(neededState + " - Value of neededState is not expected ");
        } else {
            try {
                if (neededState.equals(CHECK_STATUS) && !element.isSelected() ||
                        neededState.equals(UNCHECK_STATUS) && element.isSelected()) {
                    element.click();
                } else {
                    logger.info("CheckBox has " + neededState + " state already ");
                }
            } catch (Exception e) {
                logErrorAndStopTest(e);
            }
        }
    }

//
//    public static void selectOptionsInDropDown(WebElement selectDropDown, String textInDropDown){
//        try {
//            Select options = new Select(selectDropDown);
//            options.selectByVisibleText(textInDropDown); // Can do it with ByValue
//            logger.info(textInDropDown + " was selected in DD");
//        }catch (Exception e){
//            logErrorAndStopTest(e);
//        }
//    }

    /**
     * Method Stop test if some element was not found
     *
     * @param
     */
    private static void logErrorAndStopTest(Exception e) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        e.printStackTrace(pw);
        String sStackTrace = sw.toString();
        logger.error("Can not work with element");
        logger.error(sStackTrace);
        Assert.fail("Can not work with element");
    }
}

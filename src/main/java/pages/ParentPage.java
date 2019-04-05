package pages;

import libs.ActionsWithOurElements;
import libs.ConfigProperties;
import org.aeonbits.owner.ConfigFactory;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ParentPage {
    WebDriver webDriver;
    ActionsWithOurElements actionsWithOurElements;
    protected Logger logger;
    String expectedURL;

    @FindBy(xpath = ".//*[@class='screen-loader-wrapper']")
    private WebElement loader;

    @FindBy(xpath = ".//*[contains(@uib-modal-window, 'modal-window']")
    static WebElement modalWindow;

    public static ConfigProperties configProperties =
            ConfigFactory.create(ConfigProperties.class);

    public ParentPage(WebDriver webDriver, String expectedURL) {
        this.webDriver = webDriver;
        logger = Logger.getLogger(getClass());
        PageFactory.initElements(webDriver, this);
        actionsWithOurElements = new ActionsWithOurElements(webDriver, loader, modalWindow);
        this.expectedURL = configProperties.base_url() + expectedURL;
    }

    public void checkCurrentUrl() {
        try {
            Assert.assertEquals("Url is not expected",
                    webDriver.getCurrentUrl(), expectedURL);
        } catch (Exception e) {
            logger.error("Can not work get url");
            Assert.fail("Can not work get url");
        }
    }

//    public void waitSomeSec(int sec) {
//        try {
//            Thread.sleep(sec * 1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
}



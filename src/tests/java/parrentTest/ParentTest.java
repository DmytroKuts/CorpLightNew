package parrentTest;



import io.qameta.allure.Step;
import libs.ConfigData;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import pages.*;

import java.io.File;
import java.util.concurrent.TimeUnit;


public class ParentTest {
    public WebDriver webDriver;
    String browser = System.getProperty("browser");
    Logger log;
    protected MainPage mainPage;
    protected LoginPage loginPage;
    protected AccPage accPage;
    protected CorrespondentsPage correspondentsPage;
    protected PaymentsPage paymentsPage;
    protected SwiftPayment swiftPayment;
    protected ConfigData configData;


    @BeforeClass //анотиации junit-a
    public  void setUp(){
        log = Logger.getLogger(getClass());
        setBrowser();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        mainPage = new MainPage(webDriver);
        loginPage = new LoginPage(webDriver);
        accPage = new AccPage(webDriver);
        correspondentsPage = new CorrespondentsPage(webDriver);
        paymentsPage = new PaymentsPage(webDriver);
        swiftPayment = new SwiftPayment(webDriver);
        configData = new ConfigData();

    }

    private void setBrowser() {
        if (browser == null){
            browser = "chrome";
        }
        if ("chrome".equals(browser)) {
            System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
            webDriver = new ChromeDriver();
        } else if ("ie".equals(browser)) {
            log.info("IE will be started");
            File file1 = new File(".././drivers/IEDriverServer.exe");
            System.setProperty("webdriver.ie.driver", file1.getAbsolutePath());
            DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
            webDriver = new InternetExplorerDriver();
            log.info(" IE is started");

        } else {
            Assert.fail("Can not open browser" + browser);
        }
    }

   // @After
   // public void tearDown(){
    //    webDriver.quit();
   // }

    @Step
    protected void checkAC(String message, Boolean actual, Boolean expected) {
        Assert.assertEquals(message + "Browser - " + browser + " " ,  actual, expected);
    }

}

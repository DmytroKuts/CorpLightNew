package pages;

import static libs.ActionsWithOurElements.*;

import libs.ConfigData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AccPage extends ParentPage {


    @FindBy (xpath = ".//span[@class=\"font-bold ng-binding\" and  contains(text(),'265013011662')]")
    private WebElement accUAH;
    @FindBy (xpath = ".//span[@class=\"font-bold ng-binding\" and  contains(text(),'265013011662')]")
    private WebElement accUAH2;

    @FindBy (xpath = ".//span[@class=\"font-bold ng-binding\" and  contains(text(),'260063011390')]")
    private WebElement accUSDandUAH;


    public AccPage(WebDriver webDriver) {
        super(webDriver, "/acct/index");
    }

    public boolean ElementPresent(){
        return isElementPresent(accUSDandUAH);
    }
}

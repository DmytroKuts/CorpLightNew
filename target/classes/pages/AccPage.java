package pages;

import static com.codeborne.selenide.Selenide.$;
import static libs.ActionsWithOurElements.*;

import com.codeborne.selenide.SelenideElement;
import libs.ConfigData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AccPage extends ParentPage {


    @FindBy (xpath = ".//span[@class=\"font-bold ng-binding\" and  contains(text(),'26004303300598')]")
    private WebElement acc;
   // private SelenideElement acc = $(By.xpath(String.format(".//span[@class='font-bold ng-binding' and  contains(text(),'%s')]", ConfigData.getUiMappingValue("accUAH"))));


    public AccPage(WebDriver webDriver) {
        super(webDriver, "/acct/index");
    }

    public boolean ElementPresent(){
    return isElementPresent(acc);
    }
}

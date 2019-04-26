package pages;

import static libs.ActionsWithOurElements.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static libs.ActionsWithOurElements.isElementPresent;


public class CorrespondentsPage extends ParentPage {

    @FindBy (xpath = ".//*[@class='fa fa-chevron-right']")
    private WebElement infoAboutCorr;

    @FindBy (xpath = ".//*[@id='userDetailForm']")
    private WebElement corrForm;

    public CorrespondentsPage(WebDriver webDriver) {
        super(webDriver,"/payments/recipients");
    }

    /**
     * Method open detail info about Recipient
     */
    public void clickOnRecipientChevron(){
        clickOnElement(infoAboutCorr);

    }

    public boolean ElementPresent(){
        return isElementPresent(corrForm);
    }
}


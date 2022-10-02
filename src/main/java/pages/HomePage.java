package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends ParentPage {
    @FindBy(xpath = ".//div[@class='card mt-4 top-card'][2]")
    private WebElement elementFormCard;
    @FindBy(xpath = ".//div[@class='card mt-4 top-card'][1]")
    private WebElement elementsCard;
    @FindBy(xpath = ".//div[@class='card mt-4 top-card'][3]")
    private WebElement elementAlertFrameAndWindowsCard;

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    String getRelativeUrl() {
        return null;
    }

    public HomePage openHomePage() {
        webDriver.get(baseUrl);
        logger.info("Home page was opened");
        return this;
    }

    public FormsPage clickOnFormsCard() {
        clickOnElement(elementFormCard);
        return new FormsPage(webDriver);
    }

    public BookStoreApiPage openAuthorizePage() {
        webDriver.get("https://demoqa.com/swagger/");
        logger.info("Authorize page was opened");
        return new BookStoreApiPage(webDriver);
    }

    public ElementsPage clickOnElementsCard() {
        clickOnElement(elementsCard);
        return new ElementsPage(webDriver);
    }

    public AlertFrameAndWindowsPage clickOnAlertFrameAndWindowsCard() {
        clickOnElement(elementAlertFrameAndWindowsCard);
        logger.info("elementAlertFrameAndWindowsCard was clicked");
        return new AlertFrameAndWindowsPage(webDriver);
    }
}

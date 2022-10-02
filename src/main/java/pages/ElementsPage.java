package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementsPage extends ParentPage {
    @FindBy(xpath = ".//span[contains(text(),'Radio Button')]")
    private WebElement radioButtonCard;
    @FindBy(xpath = ".//label[@class='custom-control-label' and @for='yesRadio']")
    private WebElement radioButtonYes;
    @FindBy(xpath = ".//span[text()='Yes']")
    private WebElement youHaveSelectedYes;

    public ElementsPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    String getRelativeUrl() {
        return "/elements";
    }

    public ElementsPage clickOnRadioButtonCard() {
        clickOnElement(radioButtonCard);
        return this;
    }

    public ElementsPage clickOnRadioButtonYes() {
        clickOnElement(radioButtonYes);
        return this;
    }

    public ElementsPage checkTheTextYouHaveSelected(String text) {
        Assert.assertEquals("\"You have selected Yes\"",text,youHaveSelectedYes.getText());
        return this;
    }
}

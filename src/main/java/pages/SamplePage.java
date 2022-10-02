package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;

public class SamplePage extends ParentPage{
    @FindBy(xpath = ".//h1[text()='This is a sample page']")
    private WebElement messageThisIsASamplePage;

    public SamplePage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    String getRelativeUrl() {
        return "/sample";
    }

    public SamplePage checkTextOnSamplePage() {
        ArrayList<String> tabs = new ArrayList<> (webDriver.getWindowHandles());
        webDriver.switchTo().window(tabs.get(1));
        Assert.assertTrue(isElementDisplayed(messageThisIsASamplePage));
        return this;
    }

}

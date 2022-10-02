package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

abstract class ParentPage extends CommonActionWithElements {

    protected String baseUrl;

    public ParentPage(WebDriver webDriver) {
        super(webDriver);
        baseUrl = "https://demoqa.com";
    }

    abstract String getRelativeUrl();

    protected void checkUrl() {
        Assert.assertEquals("Invalid page "
                , baseUrl + getRelativeUrl()
                , webDriver.getCurrentUrl());
    }

}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AlertFrameAndWindowsPage extends ParentPage{
    @FindBy(xpath = ".//span[contains(text(),'Browser Windows')]")
    private WebElement buttonBrowserWindows;
    @FindBy(xpath = ".//button[@id='tabButton' and @class='btn btn-primary']")
    private WebElement buttonNewTab;
    @FindBy(xpath = ".//span[contains(text(),'Modal Dialogs')]")
    private WebElement buttonModalDialogs;
    @FindBy(xpath = ".//button[@class='mt-2 btn btn-primary']")
    private WebElement buttonLargeModal;
    @FindBy(xpath = ".//button[@class='btn btn-primary']")
    private WebElement buttonClose;

    public AlertFrameAndWindowsPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    String getRelativeUrl() {
        return "/alertsWindows";
    }

    public AlertFrameAndWindowsPage clickOnButtonBrowserWindows() {
        clickOnElement(buttonBrowserWindows);
        return this;
    }

    public SamplePage clickOnButtonNewTab() {
        clickOnElement(buttonNewTab);
        return new SamplePage(webDriver);
    }

    public AlertFrameAndWindowsPage clickOnButtonModalDialogs() throws InterruptedException {
//        Thread.sleep(3000);
        webDriverWait15.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//span[contains(text(),'Modal Dialogs')]")));
        logger.info("element ButtonModalDialogs is visible");
        clickOnElement(buttonModalDialogs);
        logger.info("buttonModalDialogs was clicked");
        return this;
    }

    public AlertFrameAndWindowsPage clickOnButtonLargeModal() throws InterruptedException {
//        Thread.sleep(3000);
        webDriverWait15.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//button[text()='Large modal']")));
        logger.info("element ButtonLargeModal is visible");
        clickOnElement(buttonLargeModal);
        logger.info("element ButtonLargeModal was clicked");
        return this;
    }

    public AlertFrameAndWindowsPage clickOnButtonToCloseLargeModal() throws InterruptedException {
        webDriverWait15.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//button[@class='btn btn-primary']")));
        logger.info("element ButtonToCloseLargeModal is visible");
//        Thread.sleep(2000);
        clickOnElement(buttonClose);
        return this;
    }
}

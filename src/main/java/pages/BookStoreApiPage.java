package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookStoreApiPage extends ParentPage {

    @FindBy(xpath = ".//button[@class='btn authorize unlocked']")
    private WebElement buttonAuthorize;
    @FindBy(xpath = ".//input[@name='username']")
    private WebElement inputUsername;
    @FindBy(xpath = ".//input[@type='password']")
    private WebElement inputPassword;
    @FindBy(xpath = ".//div[@class='auth-container' and .//h4[text()='Basic authorization']]//button[@type='submit' and @class='btn modal-btn auth authorize button']")
    private WebElement buttonAuthorizeCredentials;
    @FindBy(xpath = ".//div[@class='auth-container' and .//h4[text()='Basic authorization']]//button[@class='btn modal-btn auth btn-done button']")
    private WebElement buttonCloseCredentials;
    @FindBy(xpath = ".//h2[@class='title']")
    private WebElement titleBookStoreAPI;

    public BookStoreApiPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    String getRelativeUrl() {
        return "/swagger/";
    }

    public BookStoreApiPage clickOnButtonAuthorize() {
        clickOnElement(buttonAuthorize);
        return this;
    }

    public BookStoreApiPage enterTextIntoUsername(String text) {
        enterTextIntoElement(inputUsername, text);
        return this;
    }

    public BookStoreApiPage enterTextIntoPassword(String text) {
        enterTextIntoElement(inputPassword, text);
        return this;
    }

    public BookStoreApiPage clickOnButtonAuthorizeCredentials() {
        clickOnElement(buttonAuthorizeCredentials);
        return this;
    }

    public BookStoreApiPage clickOnButtonCloseCredentials() {
        clickOnElement(buttonCloseCredentials);
        return this;
    }

    public BookStoreApiPage checkWeSeeElementBookStoreAPIOnPage() {
        checkUrl();
        Assert.assertTrue("\"Book Store API\" don't loaded",
                isElementDisplayed(titleBookStoreAPI));
        return this;
    }
}

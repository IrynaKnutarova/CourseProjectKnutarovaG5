package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutomationPracticeFormPage extends ParentPage{
    @FindBy(xpath = ".//*[text()='Student Registration Form']")
    private WebElement titleStudentRegistrationForm;
    @FindBy(xpath = ".//input[@placeholder='First Name']")
    private WebElement inputFirstName;
    @FindBy(xpath = ".//input[@placeholder='Last Name']")
    private WebElement inputLastName;
    @FindBy(xpath = ".//input[@placeholder='name@example.com']")
    private WebElement inputEmail;
    @FindBy(xpath = ".//input[@autocomplete='off' and @pattern='\\d*']")
    private WebElement inputMobilePhone;
    @FindBy(xpath = ".//label[@for='gender-radio-2']")
    private WebElement radioButtonFemale;
    @FindBy(xpath = ".//textarea[@id='currentAddress']")
    private WebElement inputTextareaAddress;
    @FindBy(xpath = ".//div[@class='modal-content']")
    private WebElement submittingForm;

    public AutomationPracticeFormPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    String getRelativeUrl() {
        return "/automation-practice-form";
    }


    public AutomationPracticeFormPage enterTextInInputFirstName(String text) {
        enterTextIntoElement(inputFirstName, text);
        return this;
    }

    public AutomationPracticeFormPage enterTextInInputLastName(String text) {
        enterTextIntoElement(inputLastName, text);
        return this;
    }

    public AutomationPracticeFormPage enterTextIntoEmail(String text) {
        enterTextIntoElement(inputEmail, text);
        return this;
    }

    public AutomationPracticeFormPage clickOnRadioButtonFemale() {
        clickOnElement(radioButtonFemale);
        return this;
    }

    public AutomationPracticeFormPage enterNumbersInInputMobilePhone(String text) {
        enterTextIntoElement(inputMobilePhone, text);
        return this;
    }

    public AutomationPracticeFormPage enterTextInInputAddress(String text) {
        enterTextIntoElement(inputTextareaAddress, text);
        return this;
    }

    public AutomationPracticeFormPage checkWeSeeSubmittingForm() {
        checkUrl();
        Assert.assertTrue("\"Submitting form\" is not loaded",
                isElementDisplayed(submittingForm));
        return this;
    }

    public AutomationPracticeFormPage checkWeSeeElementThanksTheSubmittingFormOnPage() {
        checkUrl();
        Assert.assertTrue("\"Thanks the submitting the form\" is not loaded",
                isElementDisplayed(titleStudentRegistrationForm));
        return this;
    }

}

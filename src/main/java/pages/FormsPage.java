package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormsPage extends ParentPage {

    @FindBy(xpath = ".//div[@class='main-header']")
    private WebElement headerForms;
    @FindBy(xpath = ".//div[@class='element-list collapse show']")
    private WebElement buttonPracticeForm;
    @FindBy(xpath = ".//*[text()='Student Registration Form']")
    private WebElement titleStudentRegistrationForm;


    public FormsPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    String getRelativeUrl() {
        return "/forms";
    }

    public FormsPage checkIsRedirectToFormsPage() {
        checkUrl();
        Assert.assertTrue("Forms page is not loaded", isElementDisplayed(headerForms));
        return this;
    }

    public FormsPage clickOnButtonPracticeForm() {
        clickOnElement(buttonPracticeForm);
        return this;
    }

    public AutomationPracticeFormPage checkWeSeeStudentRegistrationForm(){
        Assert.assertTrue("Student Registration Form is not on display", isElementDisplayed(titleStudentRegistrationForm));
        return new AutomationPracticeFormPage(webDriver);
    }



}

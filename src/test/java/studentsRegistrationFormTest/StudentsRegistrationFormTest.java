package studentsRegistrationFormTest;

import baseTest.BaseTest;
import org.junit.Test;
import pages.AutomationPracticeFormPage;

public class StudentsRegistrationFormTest extends BaseTest {
    @Test
    public void TC_ATAM_G5_6_1042CP_checkStudentsRegistrationForm(){
        homePage
                .openHomePage()
                .clickOnFormsCard()
                .checkIsRedirectToFormsPage()
                .clickOnButtonPracticeForm()
                .checkWeSeeStudentRegistrationForm()
                .enterTextInInputFirstName("Susanna")
                .enterTextInInputLastName("Clarke")
                .enterTextIntoEmail("hghgfdhgg@ukr.net")
                .clickOnRadioButtonFemale()
                .enterNumbersInInputMobilePhone("2805897131")
                .enterTextInInputAddress("Hucknall Rd, Nottingham, United Kingdom")
                .usersPressesKeyTabTime(1);
                automationPracticeFormPage.usersPressesKeyEnterTime(1);
                automationPracticeFormPage.checkWeSeeSubmittingForm()
                .checkWeSeeElementThanksTheSubmittingFormOnPage()
        ;
    }
}

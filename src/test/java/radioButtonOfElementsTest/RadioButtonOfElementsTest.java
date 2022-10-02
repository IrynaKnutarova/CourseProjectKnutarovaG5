package radioButtonOfElementsTest;

import baseTest.BaseTest;
import org.junit.Test;

public class RadioButtonOfElementsTest extends BaseTest {
    @Test
    public void TC_ATAM_G5_6_827CP_checkTheRadioButtonOfElements(){
        homePage
                .openHomePage()
                .clickOnElementsCard()
                .clickOnRadioButtonCard()
                .clickOnRadioButtonYes()
                .checkTheTextYouHaveSelected("Yes")
        ;
    }
}

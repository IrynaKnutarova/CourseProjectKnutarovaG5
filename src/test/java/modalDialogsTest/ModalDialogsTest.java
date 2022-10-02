package modalDialogsTest;

import baseTest.BaseTest;
import org.junit.Test;

public class ModalDialogsTest extends BaseTest {
    @Test
    public void TC_ATAM_G5_6_631CP_checkModalDialogsInAlertFrameAndWindows() throws InterruptedException {
        homePage
                .openHomePage()
                .clickOnAlertFrameAndWindowsCard()
                .clickOnButtonModalDialogs()
                .clickOnButtonLargeModal()
                .clickOnButtonToCloseLargeModal()
        ;
    }
}

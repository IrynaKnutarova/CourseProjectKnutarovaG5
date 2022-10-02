package browserWindowsTest;

import baseTest.BaseTest;
import org.junit.Test;

public class BrowserWindowsTest extends BaseTest {
    @Test
    public void TC_ATAM_G5_6_838CP_checkBrowserWindowsOfAlertFrameAndWindows(){
        homePage
                .openHomePage()
                .clickOnAlertFrameAndWindowsCard()
                .clickOnButtonBrowserWindows()
                .clickOnButtonNewTab()
                .checkTextOnSamplePage()
        ;
    }
}

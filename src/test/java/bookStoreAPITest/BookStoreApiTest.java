package bookStoreAPITest;

import baseTest.BaseTest;
import org.junit.Test;

public class BookStoreApiTest extends BaseTest {

    @Test
    public void TC_ATAM_G5_6_650CP_checkBookStoreAPI(){
        homePage
                .openAuthorizePage()
                .clickOnButtonAuthorize()
                .enterTextIntoUsername("Inkognito")
                .enterTextIntoPassword("mn88iq")
                .clickOnButtonAuthorizeCredentials()
                .clickOnButtonCloseCredentials()
                .checkWeSeeElementBookStoreAPIOnPage()
        ;
    }
}

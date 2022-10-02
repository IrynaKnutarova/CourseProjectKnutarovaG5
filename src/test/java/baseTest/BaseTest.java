package baseTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.AutomationPracticeFormPage;
import pages.FormsPage;
import pages.HomePage;

import java.time.Duration;

public class BaseTest {
    WebDriver webDriver;
    Logger logger = Logger.getLogger(getClass());
    protected HomePage homePage;
    protected FormsPage formsPage;
    protected AutomationPracticeFormPage automationPracticeFormPage;

    @Before
    public void setUp() {
        logger.info("------"+testName.getMethodName()+"was started ---------");
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        logger.info("Browser was opened");
        homePage = new HomePage(webDriver);
        formsPage = new FormsPage(webDriver);
        automationPracticeFormPage = new AutomationPracticeFormPage(webDriver);
    }

    @Rule
    public TestName testName = new TestName();

    @After
    public void tearDown() {
        webDriver.quit();
        logger.info("Browser was closed");
        logger.info("-------"+testName.getMethodName()+" was ended ---------\n");
    }
}

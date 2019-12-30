
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.WelcomePage;

public class WelcomePageTest {

    private static WebDriver driver;

    public WelcomePageTest() {
        //System.setProperty("webdriver.gecko.driver", "geckodriver-mac");
        System.setProperty("webdriver.gecko.driver", "geckodriver-linux");
        //        System.setProperty("webdriver.gecko.driver", "geckodriver.exe");

        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void ourPassionTest() {
        WelcomePage welcomePage = new WelcomePage(driver);
        welcomePage.open();
        welcomePage.clickOurPassion();
    }

    @After
    public void cleanUp() {
        driver.manage().deleteAllCookies();
    }

    @AfterClass
    public static void tearDown() {
        driver.close();
    }

}

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.LetTalkTeaPage;

import java.util.concurrent.TimeUnit;

public class LetTalkTeaPageTest {

    private static WebDriver driver;

    public LetTalkTeaPageTest() {
        //System.setProperty("webdriver.gecko.driver", "geckodriver-mac");
        System.setProperty("webdriver.gecko.driver", "geckodriver-linux");
        //        System.setProperty("webdriver.gecko.driver", "geckodriver.exe");

        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void letTalkTeaTest() {
        LetTalkTeaPage letTalkTeaPage = new LetTalkTeaPage(driver);
        letTalkTeaPage.open();
        letTalkTeaPage.fillForm();
        letTalkTeaPage.clickSubmit();
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

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FuelTest {
    @Test
    public void fuilCountIsOk(){

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.calculator.net/fuel-cost-calculator.html");

        driver.findElement(By.xpath("//input[@name='tripdistance']")).clear();
        driver.findElement(By.xpath("//input[@name='tripdistance']")).sendKeys("324");
        driver.findElement(By.xpath("//input[@name='fuelefficiency']")).clear();
        driver.findElement(By.xpath("//input[@name='fuelefficiency']")).sendKeys("5.5");
        driver.findElement(By.xpath("//input[@name='gasprice']")).clear();
        driver.findElement(By.xpath("//input[@name='gasprice']")).sendKeys("1.8");

        driver.findElement(By.xpath("//input[@value='Calculate']")).click();

        WebElement loginInfo = driver.findElement(By.xpath("//div[@id='content']/p[2]"));
        String message = loginInfo.getText();

        driver.quit();

        Assert.assertEquals("This trip will require 17.8 liters of fuel, which amounts to a fuel cost of $32.08.", message);
    }
}

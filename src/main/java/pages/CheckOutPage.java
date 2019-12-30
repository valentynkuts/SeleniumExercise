package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckOutPage {
    private  WebDriver webDriver;

    public CheckOutPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    public void open() {
        webDriver.get("http://www.practiceselenium.com/check-out.html");
    }

    private By cardType =  By.id("card_type");
    private By cardNumber = By.id("card_number");
    private By cardholderName = By.id("cardholder_name");
    private By verificationCode = By.id("verification_code");
    private By placeOrderSubmit = By.className("form-actions");

    public void fillForm(){
        webDriver.findElement(cardNumber).sendKeys("card_number");
        webDriver.findElement(cardholderName).sendKeys("cardholder_name");
        webDriver.findElement(verificationCode).sendKeys("verification_code");
        new Select(webDriver.findElement(cardType)).selectByVisibleText("Visa");

    }

    public void clickSubmit() {
        webDriver.findElement(placeOrderSubmit).click();
    }
}

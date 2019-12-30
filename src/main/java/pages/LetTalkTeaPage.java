package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LetTalkTeaPage {
    private  WebDriver webDriver;

    public LetTalkTeaPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void open() {
        webDriver.get("http://www.practiceselenium.com/let-s-talk-tea.html");
    }

    private By name = By.name("name");
    private By email = By.name("email");
    private By subject = By.name("subject");
    private By message = By.name("message");
    private By submit = By.className("form-submit");

    public void fillForm(){
        webDriver.findElement(name).sendKeys("Name");
        webDriver.findElement(email).sendKeys("Email");
        webDriver.findElement(subject).sendKeys("Subject");
        webDriver.findElement(message).sendKeys("Message");
    }

    public void clickSubmit() {
        webDriver.findElement(submit).click();
    }
}

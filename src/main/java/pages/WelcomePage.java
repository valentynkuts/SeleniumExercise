package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
/*
* Zadanie 1:
Dokończ tworzyć Page Object Model dla WelcomePage. Zawrzyj wszystkie odnośniki do poszczególnych podstron.*/

public class WelcomePage {

    private WebDriver webDriver;

    private By ourPassionLink = By.linkText("Our Passion");
    private By menuLink = By.linkText("Menu");
    private By letTalkTeaLink = By.linkText("Let's Talk Tea");
    private By checkOutLink = By.linkText("Check Out");
    private By welcomeLink = By.linkText("Welkome");


    public WelcomePage(WebDriver driver) {
        webDriver = driver;
    }

    public void open() {
        webDriver.get("http://www.practiceselenium.com/welcome.html");
    }

    public void clickOurPassion() {
        webDriver.findElement(ourPassionLink).click();
    }

    public void clickmenu() {
        webDriver.findElement(menuLink).click();
    }
    public void clickOurletTalkTea() {
        webDriver.findElement(letTalkTeaLink).click();
    }
    public void clickOurcheckOut() {
        webDriver.findElement(checkOutLink).click();
    }
    public void clickWelcome() {
        webDriver.findElement(welcomeLink).click();
    }
}

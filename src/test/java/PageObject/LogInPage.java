package PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage {

    WebDriver driver;

    By emailField = By.id("email");
    By passwordField = By.id("password");
    By ContinueButton = By.xpath("//button[@type=\"submit\"]");


    public LogInPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String email, String password) {
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(ContinueButton).click();
    }
}



package StepDefinitions;


import PageObject.LogInPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;


    public class LoginStep {
        WebDriver driver;
        LogInPage logInPage;

        @Given("I am logged in as a standard user")
        public void i_am_logged_in_as_a_standard_user() {
            // Set up the driver and navigate to the login page
            driver = new ChromeDriver();
            driver.get("https://client-auth-dev.fanfix.dev/login");

            // Initialize page objects
            logInPage = new LogInPage(driver);

            // Perform login
            logInPage.login("testqa@mailinator.com", "123456789");
        }
    }


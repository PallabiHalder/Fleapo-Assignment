package StepDefinitions;

import PageFactory.HomePage;
import PageFactory.LogInPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class LoginStep {

    WebDriver driver;

    LogInPage logInPage;



    @Given("Open the browser.")
    public void openTheBrowser() {

        driver = new ChromeDriver();

        //   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //    driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);


    }


    @And("Enter the url.")
    public void enterTheUrl() {
      driver.get("https://client-auth-dev.fanfix.dev/login");

    }

    @And("Maximize the window.")
    public void maximizeTheWindow() throws InterruptedException {

        Thread.sleep(3000);

        driver.manage().window().maximize();

    }

    @When("Enter valid {string} and {string}")
    public void enter_valid_and(String email, String password) {

        logInPage = new LogInPage(driver);

        logInPage.Enterusername(email);
        logInPage.EnterPwd(password);


    }

    @And("Click on Continue button")
    public void clickOnContinueButton() throws InterruptedException {

        Thread.sleep(3000);

        logInPage.ClickContinue();



    }


    @Then("navigate to homepage")
    public void navigate_to_homepage() throws InterruptedException {

        HomePage homePage = new HomePage(driver);

        String Actual_title = driver.getTitle();

        String Expected_title = "Dashboard | FanFix";

        Assert.assertEquals(Actual_title, Expected_title);

        Thread.sleep(3000);


    }



}


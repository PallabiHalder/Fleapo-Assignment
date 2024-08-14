package StepDefinitions;

import PageFactory.HomePage;
import PageFactory.LogInPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class LoginStep {

    WebDriver driver;

    LogInPage logInPage;



    @BeforeTest


    @Given("Open the browser")
    public void open_the_browser() {

        driver = new ChromeDriver();

        //   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //    driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);


    }



    @Given("Enter the url")
    public void enter_the_url() {

        driver.get("https://client-auth-dev.fanfix.dev/login");

    }

    @Given("maximize the window")
    public void maximize_the_window() throws InterruptedException {

        Thread.sleep(3000);

        driver.manage().window().maximize();

    }

    @When("Enter valid {string} and {string}")
    public void enter_valid_and(String email, String password) {

        logInPage = new LogInPage(driver);

        logInPage.Enterusername(email);
        logInPage.EnterPwd(password);


    }

    @When("Click on LogIn button")
    public void click_on_log_in_button() throws InterruptedException {

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


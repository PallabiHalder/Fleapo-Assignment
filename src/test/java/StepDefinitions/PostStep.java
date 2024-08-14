package StepDefinitions;

import PageObject.PostPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;



public class PostStep {
    WebDriver driver;
    PostPage postPage;

    @When("I click on the \"New Post\" button")
    public void i_click_on_the_new_post_button() {
        postPage = new PostPage(driver);
        postPage.clickNewPost();
    }

    @When("I navigate to \"Free Post\"")
    public void i_navigate_to_free_post() {
        postPage.goToFreePost();
    }

    @When("I write a post with caption {string}")
    public void i_write_a_post_with_caption(String caption) {
        postPage.writePostCaption(caption);
    }

    @And("I select the custom date-time {string}")
    public void iSelectTheCustomDateTime(String datetime) throws InterruptedException {


        String[] dateTimeSplit = datetime.split(" ");
        String date = dateTimeSplit[0];
        String time = dateTimeSplit[1] + " " + dateTimeSplit[2];
        postPage.selectCustomTime(date, time);


    }

    @When("I post it to my profile")
    public void i_post_it_to_my_profile() {
        postPage.postToProfile();
    }

    @Then("I should see the post on my profile")
    public void i_should_see_the_post_on_my_profile() {
        // Verification steps would go here
    }


}

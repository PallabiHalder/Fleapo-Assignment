package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;


public class PostPage {
    WebDriver driver;

    By newPostButton = By.xpath("//button[@id=':r1:']") ;
    By freePostOption = By.xpath("//button[text()=\"Free Post\"]") ;
    By postCaptionField = By.id("post-caption");
    By customTimeDropdown = By.xpath("//p[text()=\"Custom Time\"]");
    By dateCalendar = By.xpath("//button[@aria-label='Choose date, selected date is Aug 14, 2024']//*[name()='svg']");
    By selectHour = By.xpath("//ul[@aria-label='Select hours']");

    By selectMinutes = By.xpath("//ul[@aria-label='Select minutes']") ;

    By selectMeridiem  = By.xpath("//ul[@aria-label='Select meridiem']");


    By okButton = By.xpath("//button[text()=\"OK\"]");
    By postToProfileButton = By.xpath("//p[text()= \"Post Caption\"] ") ;

    public PostPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickNewPost() {
        driver.findElement(newPostButton).click();
    }

    public void goToFreePost() {
        driver.findElement(freePostOption).click();
    }

    public void writePostCaption(String caption) {
        driver.findElement(postCaptionField).sendKeys(caption);
    }

    public void selectCustomTime(String date, String time) throws InterruptedException {
        driver.findElement(customTimeDropdown).click();

        // Wait for the calendar to be visible and select the date

       new WebDriverWait(driver, Duration.ofSeconds(10) ).until(
                ExpectedConditions.visibilityOfElementLocated(dateCalendar)
        ).click();


        // Assuming the date is selectable, this is a placeholder
        driver.findElement(By.xpath("//td[@data-date='" + date + "']")).click();


       //select time


        public void goHour ( int hour  ) {

            driver.findElement(selectHour).click();
        }

        public void goMinutes ( int minutes ) {

            driver.findElement(selectMinutes).click();
        }

        public void goMeridiem ( String  meridiem );
        {
            driver.findElement(selectMeridiem).click();
        }



    }



    public void postToProfile() {
        driver.findElement(okButton).click();
        driver.findElement(postToProfileButton).click();
    }
}
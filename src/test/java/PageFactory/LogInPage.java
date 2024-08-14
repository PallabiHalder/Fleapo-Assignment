package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {



    WebDriver driver ;

    public LogInPage( WebDriver driver) {

        this.driver = driver ;

        PageFactory.initElements(driver, this);


    }

    @FindBy(xpath = "//input[@id=\"email\"]")

    WebElement email ;


    @FindBy (xpath = "//input[@id=\"password\"]")

    WebElement  password ;


    @FindBy  (xpath = "//button[@type=\"button\"]")

    WebElement  Continue ;

    public void Enterusername (String user)

    {

        email.sendKeys(user);

    }

    public void EnterPwd (String pwd)

    {

        password.sendKeys(pwd);

    }

    public void ClickContinue ()

    {

        Continue.click();

    }
}

package CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/Feature/LogIn.feature",

        monochrome = true,

        glue = "StepDefinitions"  )

public class TestNGTestRunner extends AbstractTestNGCucumberTests {

}

package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.FormSubmitted;
import page.WebForm;

public class WebFormStepDefinitions {

    private static WebDriver driver;
    private WebForm webForm;
    public static FormSubmitted formSubmitted;

    @Before
    public void setup() {
        if (driver != null) driver.quit();
        driver = new ChromeDriver();
    }

    @After
    public void clean() {
        if (driver != null) driver.quit();
    }

    @Given("Web form page is opened")
    public void webFormPageIsOpened() {
        webForm = new WebForm(driver);
    }

    @When("Submit button is clicked")
    public void submitButtonIsClicked() {
        formSubmitted = webForm.clickSubmitButton();
    }

    @When("{string} is typed in text input")
    public void isTypedInTextInput(String text) {
        webForm.fillTextInput(text);
    }
}

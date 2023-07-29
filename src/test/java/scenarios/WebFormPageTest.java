package scenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.WebForm;

public class WebFormPageTest {

    private static WebDriver driver;

    @BeforeTest
    public void clean() {
        if (driver != null) driver.quit();
        driver = new ChromeDriver();
    }

    @Test
    public void successSendEmptyForm() {
        new WebForm(driver).clickSubmitButton()
                .assertFormSubmittedPageIsLoaded()
                .assertHeadingIsDisplayed();
    }

    @Test
    public void successSendFormWithInputText() {
        new WebForm(driver).fillTextInput("test")
                .clickSubmitButton()
                .assertFormSubmittedPageIsLoaded()
                .assertHeadingIsDisplayed()
                .assertTextInputValueIsReturnedInQueryParam("test");
    }
}

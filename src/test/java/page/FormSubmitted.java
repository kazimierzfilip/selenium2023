package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class FormSubmitted {

    private WebDriver driver;

    private String pageUrl = "web/submitted-form.html";

    @FindBy(tagName = "h1")
    private WebElement h1;


    public FormSubmitted(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public FormSubmitted assertFormSubmittedPageIsLoaded() {
        (new WebDriverWait(driver, Duration.ofSeconds(3)))
                .until((ExpectedCondition<Boolean>) d -> d.getCurrentUrl().contains(pageUrl));
        return this;
    }

    public FormSubmitted assertHeadingIsDisplayed() {
        assertTrue(h1.isDisplayed(), "Heading is not displayed");
        assertEquals(h1.getText(), "Form submitted", "Heading text is invalid");
        return this;
    }

    public void assertTextInputValueIsReturnedInQueryParam(String text) {
        assertTrue(driver.getCurrentUrl().contains(WebForm.getTextInputName() + "=" + text),
                "page url does not contain query parameter with value provided in form");
    }
}

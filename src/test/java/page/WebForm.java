package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebForm {

    private WebDriver driver;

    private String pageUrl = "https://www.selenium.dev/selenium/web/web-form.html";

    @FindBy(xpath = "//input[@name=\"my-text\"]")
    private WebElement textInput;

    @FindBy(xpath = "//button[@type=\"submit\"]")
    private WebElement submit;


    public WebForm(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        driver.get(pageUrl);
    }

    public FormSubmitted clickSubmitButton() {
        submit.click();
        return new FormSubmitted(driver);
    }

    public static String getTextInputName() {
        return "my-text";
    }

    public WebForm fillTextInput(String text) {
        textInput.click();
        textInput.sendKeys(text);
        return this;
    }
}

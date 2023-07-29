package scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class WebFormTest {
    private static WebDriver webDriver;

    @BeforeClass
    public static void init() {
        webDriver = new ChromeDriver();
    }

    @Test
    public void successSendEmptyForm() {
        webDriver.get("https://www.selenium.dev/selenium/web/web-form.html");

        webDriver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

        assertTrue(webDriver.findElements(By.tagName("h1")).size() > 0);
        assertEquals(webDriver.findElement(By.tagName("h1")).getText(), "Form submitted");
    }
}

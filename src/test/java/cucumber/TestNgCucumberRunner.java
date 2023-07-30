package cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "", features = {"src/test/resources/features"}, glue = {"steps"}, plugin = {})
public class TestNgCucumberRunner extends AbstractTestNGCucumberTests {

}

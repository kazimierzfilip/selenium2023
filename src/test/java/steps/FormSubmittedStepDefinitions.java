package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class FormSubmittedStepDefinitions {

    @Then("Form submitted page should open")
    public void formSubmittedPageShouldOpen() {
        WebFormStepDefinitions.formSubmitted.assertFormSubmittedPageIsLoaded();
    }

    @And("Heading should be visible")
    public void headingShouldBeVisible() {
        WebFormStepDefinitions.formSubmitted.assertHeadingIsDisplayed();
    }

    @And("Text {string} typed in text input should be returned in query param")
    public void textTypedInTextInputShouldBeReturnedInQueryParam(String text) {
        WebFormStepDefinitions.formSubmitted.assertTextInputValueIsReturnedInQueryParam(text);
    }
}

Feature: Online web form
  Online web form used for testing purposes.

  Scenario: Web form sent without data
    Given Web form page is opened
    When Submit button is clicked
    Then Form submitted page should open
    And Heading should be visible

  Scenario: Web form sent with text input data
    Given Web form page is opened
    When "test" is typed in text input
    And Submit button is clicked
    Then Form submitted page should open
    And Heading should be visible
    And Text "test" typed in text input should be returned in query param
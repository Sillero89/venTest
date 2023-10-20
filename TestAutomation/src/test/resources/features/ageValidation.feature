Feature: Age Validation

  I want to detect incorrect age data

  Scenario: Age negative data
    Given a web browser is at the Contact form page
    And the user enters a valid email
    And the user enters a message
    And the user enters "-1" into age
    When the user submit the form
    Then the form is not submitted

  @LastScenario
  Scenario: Age valid data
    Given Age incorrect data
    And the user enters a valid email
    And the user enters a message
    And the user enters "20" into age
    When the user submit the form
    Then the Result page shows the age "20"
@EmailFeature
Feature: Email Validation

  I want to detect incorrect email data

  Scenario: Email missing username data
    Given web browser is at the Contact form page
    And the user enters "@server.de" into email
    When the user submit the form
    Then element warning "Introduzca una dirección de correo." is shown

  Scenario: Email missing server data
    Given email missing username data
    And the user enters "user@.de" into email
    When the user submit the form
    Then element warning "Introduzca una dirección de correo." is shown

  Scenario: Email missing domain data
    Given email missing server data
    And the user enters "user@server" into email
    When the user submit the form
    Then element warning "Introduzca una dirección de correo." is shown

  Scenario: Email valid data
    Given email missing domain data
    And the user enters "user@server.de" into email
    When the user submit the form
    Then Result page shows "Error: Invalid data" message
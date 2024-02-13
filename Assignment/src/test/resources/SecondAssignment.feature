Feature: login for facebook
  Scenario: facebook login scenario
    Given user navigate to the fb page
    Then Verify that there is a Create an account section on the page
    Then fill all the text boxes
    And Update the date of birth in the dropdown
    And Select gender
    Then Click on Create an account
    Then Verify that the account is created successfully



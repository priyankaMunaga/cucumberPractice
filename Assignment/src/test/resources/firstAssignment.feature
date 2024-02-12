Feature: login for qatechhub
  Scenario: qatechhub login scenario
    Given user navigate to the qatechhub page
    Then Print the page title
    When the user navigate to the facebook page
    Then user navigate to the back page
    Then Print the URL of the current page
    When the user navigate to the forward page
    Then the user Reload the page
    Then  Close the Browser.

Feature: login fpr qatechhub
  Scenario: qatechhub login scenario
    Given user navigate to the qatechhub page
    Then Print the URL of the current page
    When the user navigate to the forward page
    Then the user Reload the page
    Then the user click the Close the Browser.

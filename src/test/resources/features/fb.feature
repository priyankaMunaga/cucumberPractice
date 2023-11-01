Feature:login feature for facebook

  Scenario: login scenario

    Given user is on fb page
    When user enter validating text
#And click on login button
#Then user should be enters valid name and password
  Scenario: Negative login scenario
    Given user is on fb page
    When the user enter the invalid text

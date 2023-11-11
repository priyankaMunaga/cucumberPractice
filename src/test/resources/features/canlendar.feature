Feature: validating the calendar

  Background:
    Given Navigating to home page

    Scenario: validating the boarding calendar
      Given Selecting the Calendar
      When select specif dates on the calendar
      Then the date should select

      Scenario: validating the calendar arrows
        Given Selecting the Calendar
        When user should select the future moth using the arrow
        And user should select the before month arrow
#        Then select the date on the calendar

  Scenario: validating the departure place
    Given user will select the departure
    Then the user will click the place
Feature: validating the calendar

  Background:
    Given Navigating to home page

    Scenario: validating the boarding calendar
      Given Selecting the Calendar
      When select specif dates on the calendar
      Then the date should select
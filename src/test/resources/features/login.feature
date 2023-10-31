Feature: login to google home page

  Background: validating the google home page
    Given user navigate to home page
    Then user should enter validating text


    Scenario: validating the search engine
      Given user should see the google icon
      Then user navigate to amazon website
      And user navigate to google webpage

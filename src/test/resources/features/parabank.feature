Feature: login for para bank
  Background:
    Given user navigates to para bank home page

  Scenario: para bank login scenario

    Given user should  be on login page
   When user will enter the wrong username and password

    Scenario: user is on register page
  Given user is on registration page
      Then user logged in

      Scenario: user will be on new account
      Given user is on new account page
      Then user will get the account details










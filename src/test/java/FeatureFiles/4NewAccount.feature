Feature: New Account Functionality
  Background:
    Given Navigate to ParaBank
    When User enter login information
    Then User should login successfully

    Scenario: User create a new bank account
      Given User click Open New Account button
      When User select the required information
      Then Success account creation message should be displayed
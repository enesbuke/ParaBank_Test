Feature: Login Functionality
  Background:
    Given Navigate to ParaBank

    Scenario: User should login success
      When User enter login information
      Then User should login successfully

Feature: Account Overview

  Background:
    Given Navigate to ParaBank
    When User enter login information
    Then User should login successfully
  @Regression
  Scenario: Accessing account details
    When clicks on Accounts Overview
    Then should see customer data details
    And click on an account number
    And should see activity list
    And click on credit, debit and All button
    And should see "Transaction Details" as mentioned in customer data
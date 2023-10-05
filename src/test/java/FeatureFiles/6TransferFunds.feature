Feature: Transfer Funds
  Background:
    Given Navigate to ParaBank
    When User enter login information
    Then User should login successfully

  Scenario: Money transfer between my accounts
    And Access to money transfer page
    When Transfer procedures and sending money
    Then Realised transver control
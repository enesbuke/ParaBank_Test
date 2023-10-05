Feature: Request Loan
  Background:
    Given Navigate to ParaBank
    When User enter login information
    Then User should login successfully

    Scenario: User loan request
      Given User click Request Loan button
      When User applies for high loan
      Then User should receives the warning message
      And User applies for the suitable loan
      And User should receives the information message
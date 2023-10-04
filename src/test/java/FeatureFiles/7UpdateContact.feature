Feature: Update contact info
  Background:
    Given Navigate to ParaBank
    When User enter login information
    Then User should login successfully

  Scenario: Updating contact detail
    When login to user information panel
    Then update and confirm user information
    And Update approval
    When User enter login information
    Then User should login successfully
    And login to user information panel
    Then User should update succesfully
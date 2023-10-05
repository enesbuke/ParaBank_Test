Feature: Update contact info
  Background:
    Given Navigate to ParaBank
    When User enter login information
    Then User should login successfully

  Scenario: Updating contact detail
    When Login to user information panel
    Then Update and confirm user information
    And Update approval
    When User enter login information
    Then User should login successfully
    And Login to user information panel
    When User should update succesfully
    Then Negative update

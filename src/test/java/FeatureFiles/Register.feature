Feature: Register Functionality
@SmokeTest
  Scenario: Create new account

    Given Navigate to ParaBank
    When Click register button
    Then User enter register information and click register button
    And Success message should be displayed
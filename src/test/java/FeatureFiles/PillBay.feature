Feature:Bill Pay Functionality

  Background:
    Given Navigate to ParaBank
    When User enter login information
    Then User should login successfully
  @Regression
  Scenario:Paying bills
    Given Go to bill payment page
    When Pay different types of bills
    Then Verify that it has been paid in full
    And Verifying whether account balance and paid invoices are up to date
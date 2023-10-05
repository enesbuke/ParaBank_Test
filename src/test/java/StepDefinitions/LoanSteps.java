package StepDefinitions;

import Pages.ElementsX;
import Pages.Parent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class LoanSteps {
    ElementsX xEl=new ElementsX();
    @Given("User click Request Loan button")
    public void userClickRequestLoanButton() {
        xEl.MyClick(xEl.RequestLoanButton);
    }

    @When("User applies for high loan")
    public void userAppliesForHighLoan() {
        xEl.mySendKeys(xEl.loanAmounth,"1000000");
        xEl.mySendKeys(xEl.downPayment,"10000");
        xEl.selectAction(xEl.selectFromAccount,2);
        xEl.MyClick(xEl.applyNowButton);

    }

    @Then("User should receives the warning message")
    public void userShouldReceivesTheWarningMessage() {
        xEl.textContainsAssert(xEl.loanErrorMessage,"You do not have sufficient funds");
    }

    @And("User applies for the suitable loan")
    public void userAppliesForTheSuitableLoan() {
        xEl.MyClick(xEl.RequestLoanButton);
        xEl.mySendKeys(xEl.loanAmounth,"2000");
        xEl.mySendKeys(xEl.downPayment,"400");
        xEl.selectAction(xEl.selectFromAccount,2);
        xEl.MyClick(xEl.applyNowButton);

    }

    @And("User should receives the information message")
    public void userShouldReceivesTheInformationMessage() {
        xEl.ElementDisplayedAssert(xEl.loanRequestBar);
        xEl.textContainsAssert(xEl.loanSuccessMessage,"Congratulations, your loan has been approved");
        xEl.MyClick(xEl.loanNewAccountID);
        xEl.textContainsAssert(xEl.noTransactText,"No transactions found");
        xEl.ElementDisplayedAssert(xEl.accountDetailBar);
    }
}

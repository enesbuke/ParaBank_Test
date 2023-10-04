package StepDefinitions;

import Pages.ElementsX;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.testng.AssertJUnit.assertTrue;


public class _05_AccountOverview {
    ElementsX pb = new ElementsX();

    @When("clicks on Accounts Overview")
    public void clicksOnAccountsOverview() {
        pb.MyClick(pb.accountOverviewButton);
    }

    @Then("should see customer data details")
    public void shouldSeeCustomerDataDetails() {
        System.out.println(pb.tdElements.getText());

    }
    @And("click on an account number")
    public void clickOnAnAccountNumber() {
        pb.MyClick(pb.AccountNumber);
    }

    @And("should see activity list")
    public void shouldSeeActivityList() {

        pb.MyAssert(pb.tdElements,"Account Number:");
        pb.MyAssert(pb.tdElements,"Account Type:");
        pb.MyAssert(pb.tdElements,"Balance:");
        pb.MyAssert(pb.tdElements,"Available:");
    }

    @And("click on credit, debit and All button")
    public void clickOnCreditDebitAndAllButton() {
        pb.MyClick(pb.AllButton);
        pb.MyClick(pb.CreditButton);
        pb.MyClick(pb.DebitButton);
    }

    @And("should see {string} as mentioned in customer data")
    public void shouldSeeAsMentionedInCustomerData(String arg0) {


        pb.MyAssert(pb.tableHeaders,"Date");
        pb.MyAssert(pb.tableHeaders,"Transaction");
        pb.MyAssert(pb.tableHeaders,"Debit (-)");
        pb.MyAssert(pb.tableHeaders,"Credit (+)");

    }

}

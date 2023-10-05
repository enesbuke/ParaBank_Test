package StepDefinitions;

import Pages.ElementsX;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class PillBaySteps {
    ElementsX elm = new ElementsX();

    @Given("Go to bill payment page")
    public void goToBillPaymentPage() {
        elm.MyClick(elm.PillBayButton);
    }

    @When("Pay different types of bills")
    public void payDifferentTypesOfBills() {
        elm.mySendKeys(elm.payaname, "Elektrik,Tedaş");
        elm.mySendKeys(elm.address, "mersin-silifke");
        elm.mySendKeys(elm.city, "mersin");
        elm.mySendKeys(elm.state, "Fatura");
        elm.mySendKeys(elm.zipcode, "7500");
        elm.mySendKeys(elm.phone, "11111111111");
        elm.mySendKeys(elm.account, "20670");
        elm.mySendKeys(elm.verifyaccount, "20670");
        elm.mySendKeys(elm.amount, "100");
        elm.MyClick(elm.sendbutton);
    }

    @Then("Verify that it has been paid in full")
    public void verifyThatItHasBeenPaidInFull() {
        elm.textContainsAssert(elm.verification, "Bill Payment to Elektrik,Tedaş in the amount");
    }

    @And("Verifying whether account balance and paid invoices are up to date")
    public void verifyingWhetherAccountBalanceAndPaidInvoicesAreUpToDate() {
        elm.MyClick(elm.accountOverviewButton);
        elm.MyClick(elm.bill);
        elm.textContainsAssert(elm.accountverification, "28551");
        elm.textContainsAssert(elm.transaction, "Bill Payment");

    }
}

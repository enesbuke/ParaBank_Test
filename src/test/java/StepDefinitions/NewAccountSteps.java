package StepDefinitions;

import Pages.ElementsX;
import Pages.Parent;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewAccountSteps {
    ElementsX xElm = new ElementsX();

    @Given("User click Open New Account button")
    public void userClickOpenNewAccountButton() {
        xElm.MyClick(xElm.openNewAccountButton);
    }

    @When("User select the required information")
    public void userSelectTheRequiredInformation() {
        int selectAccount = Parent.randomGenerator(2);
        xElm.selectAction(xElm.accountType, selectAccount);
        int selectChoose = Parent.randomGenerator(6);
        xElm.selectAction(xElm.slTransferFunds, selectChoose);
        xElm.MyClick(xElm.newAccountButton);
    }

    @Then("Success account creation message should be displayed")
    public void successAccountCreationMessageShouldBeDisplayed() {
        xElm.textContainsAssert(xElm.newAccSuccessText, "Congratulations, your account is now open");
    }
}

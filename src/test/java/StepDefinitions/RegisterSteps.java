package StepDefinitions;

import Pages.ElementsX;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterSteps {
    ElementsX x=new ElementsX();
    @Given("Navigate to ParaBank")
    public void navigateToParaBank() {
        GWD.getDriver().get("https://parabank.parasoft.com/parabank/index.htm");
    }

    @When("Click register button")
    public void clickRegisterButton() {
        x.MyClick(x.regButton);
    }

    @Then("User enter register information and click register button")
    public void userEnterRegisterInformationAndClickRegisterButton() {

    }

    @And("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
    }
}

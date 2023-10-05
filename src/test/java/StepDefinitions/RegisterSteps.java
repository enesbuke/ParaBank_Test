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
    x.mySendKeys(x.regFirstName,"Eaves");
    x.mySendKeys(x.regLastName,"Eavess");
    x.mySendKeys(x.regAddress, "Sancaktepe/kızılay cad.");
    x.mySendKeys(x.regCity,"Istanbul");
    x.mySendKeys(x.regState,"Turkey");
    x.mySendKeys(x.regZipCode,"23098");
    x.mySendKeys(x.regPhone,"+907679875184");
    x.mySendKeys(x.regSSN,"123");
    x.mySendKeys(x.regUsername,"Eaves1Y");
    x.mySendKeys(x.regPassword,"918273");
    x.mySendKeys(x.regConfirm, "918273");
    x.MyClick(x.regConfirmButton);
    }

    @And("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        x.textContainsAssert(x.regSuccessText, "Your account was created successfully");
    }
}

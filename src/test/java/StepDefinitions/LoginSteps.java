package StepDefinitions;

import Pages.ElementsX;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    ElementsX xElm=new ElementsX();
    @When("User enter login information")
    public void userEnterLoginInformation() {
        xElm.mySendKeys(xElm.usernameText,"Eaves1Y");
        xElm.mySendKeys(xElm.passwordText,"918273");
        xElm.MyClick(xElm.loginButton);
    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        xElm.textContainsAssert(xElm.homePageWelcomeText, "Welcome");
    }
}

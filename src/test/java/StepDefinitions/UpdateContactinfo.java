package StepDefinitions;

import Pages.ElementsX;
import io.cucumber.java.en.*;


public class UpdateContactinfo {
    ElementsX el=new ElementsX();
    @When("Login to user information panel")
    public void loginToUserInformationPanel() {
        el.MyClick(el.UpdateContactButton);
    }

    @Then("Update and confirm user information")
    public void updateAndConfirmUserInformation() {
        el.mySendKeys(el.regFirstName,"Can");
        el.mySendKeys(el.regCity,"Canistan");
        el.mySendKeys(el.regPhone,"0909090909");

        el.MyClick(el.updateButton);

    }

    @And("Update approval")
    public void updateApproval() {
    el.MyAssert(el.updateMsg,"added to the system.");
    el.MyClick(el.LogoutButton);
    }

    @When("User should update succesfully")
    public void userShouldUpdateSuccesfully() {

        el.MyAssertString(el.regFirstName.getText(),"Can");
        el.MyAssertString(el.regCity.getText(),"Canistan");
        el.MyAssertString(el.regPhone.getText(),"0909090909");
    }

    @Then("Negative update")
    public void negativeUpdate() {
        el.MyAssertString(el.regFirstName.getText(),"");
        el.MyAssertString(el.regCity.getText(),"");
        el.MyAssertString(el.regPhone.getText(),"");
        el.MyAssert(el.updateNgvMsg,"is required.");
    }
}

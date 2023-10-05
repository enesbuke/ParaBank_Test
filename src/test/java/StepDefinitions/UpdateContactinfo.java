package StepDefinitions;

import Pages.ElementsX;
import io.cucumber.java.en.*;


public class UpdateContactinfo {
    ElementsX el=new ElementsX();
    @When("login to user information panel")
    public void loginToUserInformationPanel() {
        el.MyClick(el.UpdateContactButton);
    }

    @Then("update and confirm user information")
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

    @Then("User should update succesfully")
    public void userShouldUpdateSuccesfully() {

        el.MyAssertString(el.regFirstName.getText(),"Can");
        el.MyAssertString(el.regCity.getText(),"Canistan");
        el.MyAssertString(el.regPhone.getText(),"0909090909");
    }
}

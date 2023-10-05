package StepDefinitions;


import Pages.ElementsX;
import io.cucumber.java.en.*;


public class TransferFunds {
    ElementsX el = new ElementsX();

    @And("Access to money transfer page")
    public void accessToMoneyTransferPage() {
        el.MyClick(el.TransferFundsButton);
    }

    @When("Transfer procedures and sending money")
    public void transferProceduresAndSendingMoney() {

        el.mySendKeys(el.amountTxt, "300");
        el.MyClick(el.toAccount);
        el.MyClick(el.newAccountNum);
        el.MyClick(el.transferBtn);
    }

    @Then("Realised transver control")
    public void realisedTransverControl() {

        el.Amountget.isEnabled();
        el.MyAssert(el.Amountget,"300");
        el.fromAccountId.isEnabled();
        System.out.println(el.fromAccountId.getText());
        el.toAccountId.isEnabled();
        System.out.println(el.toAccountId.getText());

        el.MyClick(el.accountOverviewButton);
        el.MyClick(el.transferAcount);
        el.lastListClick(el.lastTransfer);
        String transactionId = el.refList(el.transactionId);
        String amountcopy = el.refList(el.amountcopy);
        el.mySendKeys(el.transactionidText, el.transactionId.getText());
        el.MyClick(el.transactionButton);
        el.lastListClick(el.lastTransfer);

        el.MyAssert(el.amountcopy, amountcopy);
        el.MyAssert(el.transactionId, transactionId);

    }
}

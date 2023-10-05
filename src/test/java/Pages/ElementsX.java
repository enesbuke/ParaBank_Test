package Pages;

import Utilities.GWD;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ElementsX extends Parent{
    public ElementsX() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    //*regElements*
    @FindBy(xpath = "(//div[@id='loginPanel']//a)[2]")
    public WebElement regButton;
    @FindBy(xpath = "(//table[@class='form2']//input)[1]")
    public WebElement regFirstName;
    @FindBy(xpath = "(//table[@class='form2']//input)[2]")
    public WebElement regLastName;
    @FindBy(xpath = "(//table[@class='form2']//input)[3]")
    public WebElement regAddress;
    @FindBy(xpath = "(//table[@class='form2']//input)[4]")
    public WebElement regCity;
    @FindBy(xpath = "(//table[@class='form2']//input)[5]")
    public WebElement regState;
    @FindBy(xpath = "(//table[@class='form2']//input)[6]")
    public WebElement regZipCode;
    @FindBy(xpath = "(//table[@class='form2']//input)[7]")
    public WebElement regPhone;
    @FindBy(xpath = "(//table[@class='form2']//input)[8]")
    public WebElement regSSN;
    @FindBy(xpath = "(//table[@class='form2']//input)[9]")
    public WebElement regUsername;
    @FindBy(xpath = "(//table[@class='form2']//input)[10]")
    public WebElement regPassword;
    @FindBy(xpath = "(//table[@class='form2']//input)[11]")
    public WebElement regConfirm;
    @FindBy(xpath = "//input[@value='Register']")
    public WebElement regConfirmButton;
    @FindBy(xpath = "//div[@id='rightPanel']/p")
    public WebElement regSuccessText;
    //RegElements **

    //loginElements *
    @FindBy(xpath = "//input[@name='username']")
    public WebElement usernameText;
    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordText;
    @FindBy(xpath = "//input[@value='Log In']")
    public WebElement loginButton;
    @FindBy(xpath = "//p[@class='smallText']/b")
    public WebElement homePageWelcomeText;
    //loginElements**


    //HomePage leftPanel Elements*
    @FindBy(xpath = "(//div[@id='leftPanel']//li)[1]")
    public WebElement openNewAccountButton;
    @FindBy(xpath = "(//div[@id='leftPanel']//li)[2]")
    public WebElement accountOverviewButton;
    @FindBy(xpath = "(//div[@id='leftPanel']//li)[3]")
    public WebElement TransferFundsButton;
    @FindBy(xpath = "(//div[@id='leftPanel']//li)[4]")
    public WebElement PillBayButton;
    @FindBy(xpath = "(//div[@id='leftPanel']//li)[5]")
    public WebElement findTransactionsButton;
    @FindBy(xpath = "(//div[@id='leftPanel']//li)[6]")
    public WebElement UpdateContactButton;
    @FindBy(xpath = "(//div[@id='leftPanel']//li)[7]")
    public WebElement RequestLoanButton;
    @FindBy(xpath = "(//div[@id='leftPanel']//li)[8]")
    public WebElement LogoutButton;
    //HomePage leftPanel Elements**

    //OpenNewActionElements
    @FindBy(xpath = "//select[@id='type']")
    public WebElement accountType;
    @FindBy(xpath = "//select[@id='fromAccountId']")
    public WebElement slTransferFunds;
    @FindBy(xpath = "//input[@value='Open New Account']")
    public WebElement newAccountButton;
    @FindBy(xpath = "((//div[@class='ng-scope'])[2]/p)[1]")
    public WebElement newAccSuccessText;



    //AccountOverview
    @FindBy(xpath = "//a[starts-with(@href, 'activity.htm?id=')]")
    public WebElement AccountNumber;

    @FindBy(xpath = "(//tbody)[1]")
    public WebElement tdElements;


    @FindBy(xpath = "//*[@id='transactionType']/option[@value='All']")
    public WebElement AllButton;

    @FindBy(xpath = "//*[@id='transactionType']/option[@value='Credit']")
    public WebElement CreditButton;

    @FindBy(xpath = "//*[@id='transactionType']/option[@value='Debit']")
    public WebElement DebitButton;

    @FindBy(xpath = "(//tr)[8]")
    public WebElement tableHeaders;


    //TransferFunds and Update Contact
    @FindBy(xpath = "//input[@id='amount']")
    public WebElement amountTxt;
    @FindBy(xpath = "//select[@id='toAccountId']")
    public WebElement toAccount;
    @FindBy(xpath = "(//select[@id='toAccountId']/option)[2]")
    public WebElement newAccountNum;
    @FindBy(xpath = "//input[@class='button']")
    public WebElement transferBtn;
    @FindBy(xpath = "//span[@id='amount']")
    public WebElement Amountget;

    @FindBy(xpath = "//span[@id='fromAccountId']")
    public WebElement fromAccountId;
    @FindBy(xpath = "//span[@id='toAccountId']")
    public WebElement toAccountId;
    @FindBy(xpath = "(//a[@class='ng-binding'])[1]")
    public WebElement transferAcount;

    @FindBy(xpath = "(//tbody/tr[@class='ng-scope'])/td/a")
    public List<WebElement> lastTransfer;
    @FindBy(xpath = "//tr/td[2]")
    public WebElement transactionId ;
    @FindBy(xpath = "((//tbody/tr)/td)[10]")
    public WebElement amountcopy ;

    @FindBy(xpath = "//input[@id='criteria.transactionId']")
    public WebElement transactionidText ;
    @FindBy(xpath = "(//button[@class='button'])[1]")
    public WebElement transactionButton ;
    @FindBy(xpath = "//input[@class='button']")
    public WebElement updateButton;
    @FindBy(xpath = "(//div[@class='ng-scope'])/p")
    public WebElement updateMsg;

    //Loan Feature*
    @FindBy(xpath = "(//table[@class='form2']//input)[1]")
    public WebElement loanAmounth;
    @FindBy(xpath = "(//table[@class='form2']//input)[2]")
    public WebElement downPayment;
    @FindBy(xpath = "//table[@class='form2']//select")
    public WebElement selectFromAccount;
    @FindBy(xpath = "(//table[@class='form2']//input)[3]")
    public WebElement applyNowButton;
    @FindBy(xpath = "//p[@class='error ng-scope']")
    public WebElement loanErrorMessage;
    @FindBy(xpath = "//table[@class='form']")
    public WebElement loanRequestBar;
    @FindBy(xpath = "//div[@class='ng-scope']/p[1]")
    public WebElement loanSuccessMessage;
    @FindBy(xpath = "//a[@id='newAccountId']")
    public WebElement loanNewAccountID;
    @FindBy(xpath = "//p[@class='ng-scope']/b")
    public WebElement noTransactText;
    @FindBy(xpath = "(//div[@class='ng-scope'])[2]/table")
    public WebElement accountDetailBar;

}

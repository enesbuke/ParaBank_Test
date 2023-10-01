package Pages;

import Utilities.GWD;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElementsX {
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
    //RegElements **

    //loginElements *
    @FindBy(xpath = "//input[@name='username']")
    public WebElement usernameText;
    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordText;
    @FindBy(xpath = "//input[@value='Log In']")
    public WebElement loginButton;
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

}

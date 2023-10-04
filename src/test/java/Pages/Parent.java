package Pages;

import Utilities.GWD;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Parent {

    public WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));

    public void MyClick(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        element.click();

    }

    public void scrollToElement(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void mySendKeys(WebElement element, String yazi) {
        wait.until(ExpectedConditions.visibilityOf(element));
        scrollToElement(element);
        element.click();
        element.clear();
        element.sendKeys(yazi);
    }
    public void actionClick(WebElement element) {
        Actions actions = new Actions(GWD.getDriver());
        actions.moveToElement(element).click().perform();
    }
    public static int randomGenerator(int limit) {
        return (int) (Math.random() * limit);
    }
    public void actionHover(WebElement element) {
        Actions actions = new Actions(GWD.getDriver());
        Action action = actions.moveToElement(element).build();
        action.perform();
    }
    public void textContainsAssert(WebElement elm,String text){
        wait.until(ExpectedConditions.textToBePresentInElement(elm,text));
        Assert.assertTrue(elm.getText().toLowerCase().contains(text.toLowerCase()));

    }
    public void selectAction(WebElement elm,int index){
        Select selector=new Select(elm);
        MyClick(elm);
        selector.selectByIndex(index);

    }

    public String refList(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
        List<String> refList = new ArrayList<>();
        String ref=element.getText();
        refList.add(ref);
        return ref;
    }

    public void lastListClick(List<WebElement> elements){
        WebElement element = elements.get(elements.size()-1);
        MyClick(element);
    }

    public void MyAssert(WebElement element,String number){
        wait.until(ExpectedConditions.visibilityOf(element));
        scrollToElement(element);
        String text=element.getText();
        boolean countainsNumber=text.contains(number);

        Assert.assertTrue(countainsNumber,"Sayı yok");
    }

    public void MysizeAssert(List<WebElement> element, int number){
        int productsize = element.size();
        Assert.assertEquals(productsize,number,"beklenen sonuç la gelen sonuç doğru değil");
    }

    public void MyAssertElement(WebElement element,WebElement element2){
        wait.until(ExpectedConditions.visibilityOf(element));
        Assert.assertEquals(element,element2);
    }

    public void MyAssertString(String element,String element2){

        Assert.assertEquals(element,element2);
    }
}

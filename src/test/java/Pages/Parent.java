package Pages;

import Utilities.GWD;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

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

}

package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Parent {

    public WebDriverWait wait= new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));

}

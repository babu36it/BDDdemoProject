package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class WebReusability extends BaseClass{

//    wait=1000;

//    BaseClass baseClass= new BaseClass();

    public void waitUntilElementVisible(WebElement element){

        WebDriverWait wait = new WebDriverWait(driver, 100);

        wait.until(ExpectedConditions.visibilityOf(element));

    }

}

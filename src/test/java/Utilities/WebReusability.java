package Utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WebReusability extends BaseClass{

//    wait=1000;

//    BaseClass baseClass= new BaseClass();

    private String windowHandle;

    public void waitUntilElementVisible(WebElement element){

        WebDriverWait wait = new WebDriverWait(driver, 100);

        wait.until(ExpectedConditions.visibilityOf(element));

    }

    public void switchToNewWindow(){

        windowHandle= driver.getWindowHandle();

        Set<String> windowHandles=driver.getWindowHandles();

        for(String handle:windowHandles){

            if(!handle.equals(windowHandle)){

                System.out.println("The window reference is: "+handle);

                driver.switchTo().window(handle);

            }

        }

    }

    public void switchBackParentWindow(){

        driver.switchTo().window(windowHandle);

    }

    public void takeScreenshot(String expectedImageName) throws IOException {

        TakesScreenshot screenshot = (TakesScreenshot)driver;

        File source=screenshot.getScreenshotAs(OutputType.FILE);

        File fis= new File("src/test/java/Utilities/Screenshots/"+expectedImageName+".png");

        FileUtils.copyFile(source,fis);

    }


}

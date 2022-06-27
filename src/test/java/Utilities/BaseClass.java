package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

    public static WebDriver driver;

//    Driver initialization
    public static WebDriver initiateDriver(){

        System.setProperty("webdriver.chrome.driver","src/test/java/Utilities/chromedriver.exe");

        driver= new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.amazon.in");

        return driver;

    }

}

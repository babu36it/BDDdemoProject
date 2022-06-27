package PageClasses;

import PageObjects.HomePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static Utilities.BaseClass.driver;
import static Utilities.BaseClass.initiateDriver;

public class HomePage {

    HomePageObject homePageObject = new HomePageObject(driver);

    //    HomePageObject homePageObject= new HomePageObject(driver);


   /* @FindBy(xpath = "//header[@id=\"navbar-main\"]/div/div/div[3]/div/a[2]/div")
    public WebElement signIn;

    @FindBy(id="twotabsearchtextbox")
    public WebElement searchBar;*/



    //    We will be writing all the Java concepts and the Selenium concepts

    public void clickOnSignInButton(){

        try {
            homePageObject.signIn.click();
        }catch (Exception e){
            System.out.println("Unable to click on the element");
        }

    }

    public String enterValuesInUserName(String userName){
        try {
//            before entering any text into the text box we need to clear the text
            homePageObject.userName.clear();
            homePageObject.userName.sendKeys(userName);
            return "Harish";
        }catch (Exception e){

        }
        return "Suresh";
    }

    public void listOfElements(){
        List<WebElement> element=driver.findElements(By.xpath(""));

        for (WebElement element1:element){
            element1.sendKeys("");
            element1.click();
        }

    }

}

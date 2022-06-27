package PageClasses;

import PageObjects.HomePageObject;
import org.openqa.selenium.WebDriver;

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

}

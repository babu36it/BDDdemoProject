package PageClasses;

import PageObjects.SearchResultsObjects;
import Utilities.WebReusability;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.util.Set;

import static Utilities.BaseClass.driver;

public class SearchResultsPage {

    SearchResultsObjects SearchResultsObj = new SearchResultsObjects(driver);

    WebReusability webReusability = new WebReusability();

    public  void ClickIconSearchBtn() {
        ////Click on Login Button
        try {
            SearchResultsObj.SearchIconButton.click();

        }catch(Exception e) {

            System.out.println("Unable to Click on Search Icon Button");

        }

    }


    public void enterSearchKeyWord() {
        try {
            ///Clear the autofill textdata
            /////////Enter the values for  Textbox//////////////////
            SearchResultsObj.SearchTextBox.clear();
            SearchResultsObj.SearchTextBox.sendKeys("mobiles");
        }catch(Exception e) {

            System.out.println("Unable to find the search box");

        }

    }


    public  void ClickFirstProduct() {
        ////Click on Login Button
        try {
            SearchResultsObj.firstProduct.click();

        }catch(Exception e) {

            System.out.println("Unable to Click on first product");

        }

    }


    public boolean verifySearchResultsPageIsDisplayed(){
        try {
            SearchResultsObj.searchResults.isDisplayed();

            return true;
        }catch (Exception e){

        }
        return false;
    }

    public boolean verifyBuyNowButtonIsDisplayed(){
        try {
            webReusability.switchToNewWindow();
            String windowHandle= driver.getWindowHandle();

            SearchResultsObj.buyNow.isDisplayed();

//            webReusability.switchBackParentWindow();

//            driver.switchTo().window(windowHandle);

//            InterfaceName obj = new InterfaceName();

            webReusability.takeScreenshot("Screenshot");

            driver.close();

            return true;
        }catch (Exception e){

        }
        return false;
    }



}

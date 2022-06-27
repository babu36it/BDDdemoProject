package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class HomePageObject {
    WebDriver driver;

    public HomePageObject(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "ap_email")
    public WebElement userName;

    @FindBy(id = "")
    public WebElement password;

//    At least one of the locator has to match
    @FindBy(xpath = "//header[@id=\"navbar-main\"]/div/div/div[3]/div/a[2]/div")
    public WebElement signIn;

//    All the locator should match with the element identifier
    @FindBys({@FindBy(xpath = ""),
    @FindBy(id="")})
    public WebElement login;

}

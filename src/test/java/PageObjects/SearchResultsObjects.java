package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class SearchResultsObjects {

    WebDriver driver;
    //Constructor
    public SearchResultsObjects(WebDriver driver) {

        this.driver=driver;

        PageFactory.initElements(driver, this);

    }

    ///////////Search text box//////////////
    @FindBy(id="twotabsearchtextbox")
    public WebElement SearchTextBox;

    ///////////Search Icon button//////////////
    @FindBy(id="nav-search-submit-button")
    public WebElement SearchIconButton;

    ///////////Search Icon button//////////////
    @FindBy(xpath="//span[text()='RESULTS']")
    public WebElement searchResults;


    ///////////First Product//////////////
    @FindBy(xpath="//h2/a/span[1]")
    public WebElement firstProduct;

    @FindBy(id = "submit.buy-now")
    public WebElement buyNow;




}


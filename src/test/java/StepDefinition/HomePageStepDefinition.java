package StepDefinition;

import PageClasses.HomePage;
import PageClasses.SettingsPage;
import Utilities.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomePageStepDefinition extends BaseClass {
    HomePage homePage;

    @Given("^Launch the application$")
    public void launchApplication(){

        initiateDriver();

    }

    @When("^User clicks on SignIn$")
    public void userClicksOnSignIn() {
        homePage= new HomePage();
        homePage.clickOnSignInButton();
    }

    @And("^Enter valid username$")
    public void enterValidUserName(){

        homePage= new HomePage();
        homePage.enterValuesInUserName(testData().get("userName"));
        homePage.clickOnContinueButton();
        Assert.assertTrue("Password text box is not displayed/present",homePage.verifyPasswordTextBoxIsDisplayed());
    }

    @And("^Enter valid password$")
    public void enterValidPassword(){
        homePage= new HomePage();
        homePage.enterPasswordText(testData().get("password"));
        homePage.clickOnSignInButtonInLogin();
        Assert.assertTrue("",homePage.verifyUserHasLoggedIn());
    }

}

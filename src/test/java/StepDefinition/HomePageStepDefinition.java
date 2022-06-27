package StepDefinition;

import PageClasses.HomePage;
import PageClasses.SettingsPage;
import Utilities.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

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
        System.out.println(testData().get("password"));

        System.out.println(testData().get("value"));


    }

}

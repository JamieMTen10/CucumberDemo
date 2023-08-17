package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;

import static StepDefinitions.Hooks.driver;

public class HomeStepDefs {

    HomePage homePage = new HomePage(driver);

    @Given("I am on the HomePage")
    public void iAmOnTheHomePage(){
        homePage.navigateToHomePage();
        System.out.println("I am on the HomePage");
    }

    @Then("I can see the Home Page Message")
    public void iCanSeeTheHomePageMessage() {
        System.out.println("I can see the Home Page message");
        Assert.assertTrue(homePage.getHomePageIdentifier().contains(homePage.HOME_PAGE_MESSAGE()));
    }

    @When("I can click sign out")
    public void iCanClickSignOut() {
        System.out.println("I can click sign out");
        homePage.clickSignOut();

    }
    @Then("I can see {string} signed in at the bottom as signed in")
    public void iCanSeeUserSignedInAtTheBottomAsSignedIn(String user) {
        Assert.assertTrue(homePage.getUsername().contains(user));
        System.out.println("I can see " + user + " signed in at the bottom as signed in");
    }

    @When("I click the loan application button")
    public void iClickTheLoanApplicationButton() {
        System.out.println("I click the loan application button");
        homePage.clickLoanApplication();
    }
}

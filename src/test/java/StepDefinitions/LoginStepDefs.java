package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;

import static StepDefinitions.Hooks.driver;

public class LoginStepDefs {
    LoginPage loginPage = new LoginPage(driver);
    @Then("I can see the log in page")
    public void iCanSeeTheLogInPage() {
        System.out.println("I can see the log in page");

    }
    @Then("I can see the \"Please Sign In\" message")
    public void iCanSeeTheMessage() {
        System.out.println("I can see the \"Please Sign In\" message");
        Assert.assertTrue(loginPage.findSignInMessage().contains("Please Sign In"));
    }

    @When("I enter {string} as the username")
    public void iEnterAsTheUsername(String username) {
        System.out.println("I enter " + username + " as the username");
        loginPage.enterUsername(username);

    }

    @And("I enter {string} as the password")
    public void iEnterAsThePassword(String password) {
        System.out.println("I enter " + password + " as the password");
        loginPage.enterPassword(password);
    }

    @When("I click the sign in button")
    public void iClickTheSignInButton() {
        System.out.println("I click the sign in button");
        loginPage.clickSubmit();
    }
}

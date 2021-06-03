package com.task.test.userapp.bdd;
import com.task.test.userapp.SpringBaseTestNGTests;
import com.task.test.userapp.page.auth.LoginPage;
import com.task.test.userapp.util.ScreenshotUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.Assert;

import java.io.IOException;
@SpringBootTest
public class LoginStepDefinition  {
    @Autowired
    private LoginPage loginPage;

    @Given("I am on the log in screen")
    public void launchLoginPage() {
        this.loginPage.goTo();
    }

    @When("I enter {string}  as a username")
    public void enterUserName(String username) {
        this.loginPage.getTypeCredentials().typeUserName(username);
    }
    @And("I enter {string} as a password")
    public void enterPassword(String password) {
        this.loginPage.getTypeCredentials().typePassword(password);
    }
    @And("I click on the login button")
    public void clickLoginButton() {
        this.loginPage.getTypeCredentials().clickLogin();
    }

    @Then("I should be redirected to userprofile page")
    public void verifyingResults() throws IOException {
        Assert.assertTrue(this.loginPage.getUserProfile().isAt());
    }





}

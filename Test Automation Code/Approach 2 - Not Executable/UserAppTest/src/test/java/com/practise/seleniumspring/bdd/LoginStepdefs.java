package com.practise.seleniumspring.bdd;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginStepdefs {

    @Given("I am on the log in screen")
    public void launchLoginPage() {

    }

    @When("I enter {string} as a username")
    public void enterUsername(String arg0) {

    }

    @And("I enter {string} as a password")
    public void enterKeyword(String arg0) {

    }

    @And("I click on the login button")
    public void clickLoginButton() {

    }

    @Then("I should be redirected to userprofile page")
    public void verifyingResults() {

    }
}

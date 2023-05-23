package com.orangehrmlive.demo.cucumber.steps;

import com.orangehrmlive.demo.pages.DashBoardPage;
import com.orangehrmlive.demo.pages.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
    @Given("^I am on login page$")
    public void iAmOnLoginPage() {
    }

    @When("^I enter username \"([^\"]*)\" on login page$")
    public void iEnterUsernameOnLoginPage(String userName) {
        new LoginPage().enterUserName(userName);
    }

    @And("^I enter password \"([^\"]*)\" on login page$")
    public void iEnterPasswordOnLoginPage(String password) {
        new LoginPage().enterPassword(password);
    }

    @And("^I click on Login Button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("^I should verify Dashboard Message$")
    public void iShouldVerifyDashboardMessage() {

    }

    @When("^I launch the application$")
    public void iLaunchTheApplication() {
    }

    @Then("^I verify Logo is Displayed$")
    public void iVerifyLogoIsDisplayed() {
    }

    @When("^I login To The application$")
    public void iLoginToTheApplication() {
        new LoginPage().enterUserName("admin");
        new LoginPage().enterPassword("admin123");
        new LoginPage().clickOnLoginButton();
    }

    @And("^I click on User Profile logo$")
    public void iClickOnUserProfileLogo() {
       new DashBoardPage().clickOnUserProfileLogo();
    }

    @And("^I mouse hover on Logout and click$")
    public void iMouseHoverOnLogoutAndClick() {
      new DashBoardPage().mouseHoverOnLogoutAndClick();
    }

    @Then("^I verify the text Login Panel is displayed$")
    public void iVerifyTheTextLoginPanelIsDisplayed() {
    }


}

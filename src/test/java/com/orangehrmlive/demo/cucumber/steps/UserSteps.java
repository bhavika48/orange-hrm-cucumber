package com.orangehrmlive.demo.cucumber.steps;

import com.orangehrmlive.demo.pages.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

import java.util.concurrent.SynchronousQueue;

public class UserSteps {
    @Given("^I am on Login page$")
    public void iAmOnLoginPage() {

    }

    @When("^I click On Admin Tab$")
    public void iClickOnAdminTab() {
        new DashBoardPage().clickOnAdminTab();

    }

    @Then("^I  verify System Users Text$")
    public void iVerifySystemUsersText() {
        Assert.assertEquals(new AdminPage().getTextSystemUser(), "System Users");
    }

    @And("^I click On Add button$")
    public void iClickOnAddButton() {
        new AdminPage().clickOnAdminTab();
    }

    @Then("^I verify \"([^\"]*)\" Text$")
    public void iVerifyText(String text) {
        Assert.assertEquals(new AdminPage().getTextAddUser(), "Add User");
    }

    @And("^I select User Role Admin$")
    public void iSelectUserRoleAdmin() {
        new AdminPage().selectCustomerFromDropDown("Admin");
    }

    @And("^I enter Employee Name \"([^\"]*)\"$")
    public void iEnterEmployeeName(String empName) {
        new AdminPage().enterEmployeeName(empName);
    }

    @And("^I enter username \"([^\"]*)\"$")
    public void iEnter(String username) {
        new AdminPage().enterUserName(username);
    }


    @And("^I select status \"([^\"]*)\"$")
    public void iSelectStatus(String status) {
        new AdminPage().selectStatus(status);
    }

    @And("^I click On save Button$")
    public void iClickOnSaveButton() {
        new AdminPage().clickOnSaveButton();
    }

    @Then("^I should verify message successfully Saved$")
    public void iShouldVerifyMessageSuccessfullySaved() {
        Assert.assertEquals(new AdminPage().getTextSuccessfullySaved(), "Successfully Saved");
    }

    @When("^I Login to Application$")
    public void iLoginToApplication() {
        new LoginPage().enterUserName("admin");
        new LoginPage().enterPassword("admin123");
        new LoginPage().clickOnLoginButton();

    }

    @Then("^I should verify the User should be in Result list\\.$")
    public void iShouldVerifyTheUserShouldBeInResultList() {
        Assert.assertEquals(new SystemUserPage().getTextUser(), "Nina.Patel");
    }


    @Then("^I verify the User should be in Result list\\.$")
    public void iVerifyTheUserShouldBeInResultList() {
        Assert.assertEquals(new SystemUserPage().getTextUser(), "Ananya.Dash");
    }

    @And("^I click on Check box$")
    public void iClickOnCheckBox() {
        new SystemUserPage().clickOnCheckBox();
    }

    @And("^I click on Delete Button$")
    public void iClickOnDeleteButton() {
        new SystemUserPage().clickOnDeleteButton();
    }

    @And("^I Popup will display$")
    public void iPopupWillDisplay() {
        new SystemUserPage().getPopUpMessage();
    }

    @And("^I click on Ok Button on Popup$")
    public void iClickOnOkButtonOnPopup() {
        new SystemUserPage().clickOnPopUpMessage();
    }

    @And("^I verify message Successfully Deleted$")
    public void iVerifyMessageSuccessfullyDeleted() {
        Assert.assertEquals(new AdminPage().verifyUserInSearchResult(), "User not Deleted");
    }


    @And("^I Click on Search Button$")
    public void iClickOnSearchButton() {
        new AdminPage().clickOnSearchButton();
    }

    @Then("^I verify message No Records Found$")
    public void iVerifyMessageNoRecordsFound() {
        new HomePage().verifyUserNotFoundText();
    }


    @And("^I enter password \"([^\"]*)\" on admin page$")
    public void iEnterPassword(String password) {
       new  AdminPage().enterPassword(password);
    }

    @And("^I enter confirm password \"([^\"]*)\" on admin page$")
    public void iEnterConfirmPassword(String confirmPassword) {
       new  AdminPage().enterPassword(confirmPassword);
    }


    @And("^I select User Role \"([^\"]*)\"$")
    public void iSelectUserRole(String userRole) {
      new AdminPage().selectUserRoleFromDropDown(userRole);
    }


    @Given("^I am on admin page page$")
    public void iAmOnAdminPagePage() {
    }
}

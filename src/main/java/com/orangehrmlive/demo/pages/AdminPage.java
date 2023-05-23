package com.orangehrmlive.demo.pages;


import com.orangehrmlive.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage extends Utility {

    private static final Logger log = LogManager.getLogger(AdminPage.class.getName());

    public AdminPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h5[normalize-space()='System Users']")
    WebElement systemUserText;

    @CacheLookup
    @FindBy(xpath = "//i[@class='oxd-icon bi-plus oxd-button-icon']")
    WebElement addButton;

    @CacheLookup
    @FindBy(xpath = "//h6[normalize-space()='Add User']")
    WebElement addUserText;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement empNameTextBox;

    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-form-row']//div[@class='oxd-grid-2 orangehrm-full-width-grid']//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
    WebElement userNameField;

    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-grid-item oxd-grid-item--gutters user-password-cell']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']")
    WebElement confirmPasswordField;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Save']")
    WebElement saveButton;

    @CacheLookup
    @FindBy(xpath = "//body")
    WebElement sucessfulSave;


    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Search']")
    WebElement searchButton;

    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Admin')]")
    WebElement selectUser;

    @CacheLookup
    @FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[2]")
    WebElement statusDropDown;

    @CacheLookup
    @FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[1]")
    WebElement userRoleDropDown;

    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-table-card']//div[@role='row']")
    WebElement userInList;


    public String getTextSystemUser() {
        return getTextFromElement(systemUserText);
    }

    public void clickOnAdminTab() {
        log.info("Clicking on  admin tab " + addButton.toString());
        clickOnElement(addButton);
    }

    public String getTextAddUser() {
        log.info("Get text from " + getTextAddUser().toString());
        String message = getTextFromElement(addUserText);
        return message;
    }


    public void enterEmployeeName(String employeeName) {
        log.info("Enter Employee Name " + employeeName + " to employee field " + employeeName.toString());
        sendTextToElement(empNameTextBox, employeeName);
    }

    public void enterUserName(String userName) {
        log.info("Enter userName " + userName + " to user name field " + userNameField.toString());
        sendTextToElement(userNameField, userName);
    }

    public void enterPassword(String password) {
        log.info("Enter password " + password + " to password field " + passwordField.toString());
        sendTextToElement(passwordField, password);
    }

    public void enterConfirmPassword(String password) {
        log.info("Enter Confirm Password " + password + " to confirm Password field " + confirmPasswordField.toString());
        sendTextToElement(confirmPasswordField, password);
    }

    public void selectStatus(String visibleText) {
        log.info("Select status " + visibleText + statusDropDown.toString());
        selectByVisibleTextFromDropDown(statusDropDown, visibleText);
    }

    public void clickOnSaveButton() {
        log.info("Clicking on save button " + saveButton.toString());
        clickOnElement(saveButton);
    }

    public String getTextSuccessfullySaved() {
        log.info(" Get Text Successfully Saved " + sucessfulSave.toString());
        String message = getTextFromElement(sucessfulSave);
        return message;
    }

    public void clickOnSearchButton() {
        log.info("Clicking on search Button " + searchButton.toString());
        clickOnElement(searchButton);
    }

    public void selectCustomerFromDropDown(String text) {
        log.info("Select Customer From DropDown " + text + selectUser.toString());
        searchByVisibleTextFromDropDown(selectUser, text);
    }

    public void selectUserRoleFromDropDown(String visibleText) {
        log.info("Select User Role From DropDown " + visibleText + userRoleDropDown.toString());
        searchByVisibleTextFromDropDown(userRoleDropDown, visibleText);
    }

    public void selectStatusFromDropDown(String text) {
        log.info("Select status from dropdown" + text + statusDropDown.toString());
        searchByVisibleTextFromDropDown(statusDropDown, text);
    }

    public String verifyUserInSearchResult() {
        return getTextFromElement(userInList);
    }
}








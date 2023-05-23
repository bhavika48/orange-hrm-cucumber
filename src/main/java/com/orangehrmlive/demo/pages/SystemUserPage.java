package com.orangehrmlive.demo.pages;


import com.orangehrmlive.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SystemUserPage extends Utility {

    private static final Logger log = LogManager.getLogger(SystemUserPage.class.getName());

    public SystemUserPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Nina.Patel')]")
    WebElement userFoundInList;

    @CacheLookup
    @FindBy(xpath = "div[role='columnheader'] i[class='oxd-icon bi-check oxd-checkbox-input-icon']")
    WebElement checkBox;

    @CacheLookup
    @FindBy(xpath = "//i[@class='oxd-icon bi-trash']")
    WebElement deleteButton;

    public String getTextUser() {
        log.info("Get text from " + getTextFromElement(userFoundInList).toString());
        return getTextFromElement(userFoundInList);
    }

    public void clickOnCheckBox() {
        log.info("Clicking on check box " + checkBox.toString());
        clickOnElement(checkBox);
    }

    public void clickOnDeleteButton() {
        log.info("Clicking on dekete button " + deleteButton.toString());
        clickOnElement(deleteButton);
    }

    public String getPopUpMessage() {
        log.info("Clicking on popUp message " + getTextFromAlert().toString());
        return getTextFromAlert();
    }

    public void clickOnPopUpMessage() {
        acceptAlert();
    }

}

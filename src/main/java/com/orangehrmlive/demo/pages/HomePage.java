package com.orangehrmlive.demo.pages;


import com.orangehrmlive.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(linkText = "log in")
    WebElement loginLink;

    @CacheLookup
    @FindBy(linkText = "Register")
    WebElement registerLink;
    By userNotFoundText = By.xpath("//div[@id='oxd-toaster_1']");

    public void clickOnLoginLink() {
        log.info("Clicking on Login Link " + loginLink.toString());
        clickOnElement(loginLink);
    }

    public void registerLink() {
        log.info("Clicking on register Link " + registerLink.toString());
        clickOnElement(registerLink);
    }

    public String getBaseUrl() {
        return driver. getCurrentUrl();

    }

    public String verifyUserNotFoundText() {
        log.info("Get text from " + getTextFromElement(userNotFoundText).toString());
        String message= getTextFromElement(userNotFoundText);
        return message;
    }
}

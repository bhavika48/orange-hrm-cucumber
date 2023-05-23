package com.orangehrmlive.demo.pages;


import com.orangehrmlive.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage extends Utility {

    private static final Logger log = LogManager.getLogger(DashBoardPage.class.getName());

    public DashBoardPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//span[.='Admin']")
    WebElement adminTab;

    @CacheLookup
    @FindBy(xpath = "//h6[normalize-space()='Dashboard']")
    WebElement dashboard;

    @CacheLookup
    @FindBy(xpath = "//p[@class='oxd-userdropdown-name']")
    WebElement userProfileLogo;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Logout']")
    WebElement userProfileLogout;

    public void clickOnAdminTab() {
        log.info("Clicking on Admin Button " + adminTab.toString());
        clickOnElement(adminTab);
    }

    public String getTextDashboard() {
        log.info("Get Dashboard text from " + dashboard.toString());
        String message = getTextFromElement(dashboard);
        return getTextFromElement(dashboard);
    }

    public void clickOnUserProfileLogo() {
        log.info("Clicking on logo " + userProfileLogo.toString());
        clickOnElement(userProfileLogo);
    }

    public void mouseHoverOnLogoutAndClick() {
        log.info("MouseHover on Logout and click" + userProfileLogout.toString());
        mouseHoverToElementAndClick(userProfileLogout);
    }
}

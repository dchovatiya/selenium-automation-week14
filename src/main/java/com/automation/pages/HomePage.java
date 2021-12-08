package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage extends Utility {
    public HomePage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath ="//a[@title='Women']")   //a[@title='Women']
    WebElement womenLink;
    @FindBy(xpath = "//li[@class='sfHover']//a[@title='Dresses'][normalize-space()='Dresses']")
    WebElement dressLink;
    //li[@class='sfHover']//a[@title='Dresses'][normalize-space()='Dresses']
    @FindBy(xpath = "//li[@class='sfHover']//a[@title='T-shirts'][normalize-space()='T-shirts']")
    WebElement tShirtLink;
    //li[@class='sfHover']//a[@title='T-shirts'][normalize-space()='T-shirts']
    @FindBy(xpath = "//a[@title='Log in to your customer account']")     //a[@title='Log in to your customer account']
    WebElement signInLink;
    @FindBy(xpath = "//img[@alt='My Store']")   //img[@alt='My Store']
    WebElement logoLocator;
    //Reporter.log("Entering password :" +password+ " in the passwordField :" +password.toString() + "<br>");
//     Reporter.log("Get text Authentication" +authText.toString() +"<br>");
    public void clickOnWomenLink(){
        Reporter.log("Click on Women link" +womenLink.toString() +"<br>");
        clickOnElement(womenLink);
//        CustomListeners.test.log(Status.PASS,"Click on Women");
    }
    public void clickOnDressLink(){
        Reporter.log("Click on Dresses link" +dressLink.toString() +"<br>");
        clickOnElement(dressLink);
//        CustomListeners.test.log(Status.PASS,"Click on Dresses");
    }
    public void clickOnTShirtLink(){
        Reporter.log("Click on T-Shirts link" +tShirtLink.toString() +"<br>");
        clickOnElement(tShirtLink);
//        CustomListeners.test.log(Status.PASS,"Click on T-Shirts");
    }
    public void clickOnSignInLink(){
        mouseHoverToElement(signInLink);
        clickOnElement(signInLink);
        Reporter.log("Click on Login link" +signInLink.toString() +"<br>");
//        CustomListeners.test.log(Status.PASS,"Click on Login Link");
    }
    public String showSignInLink(){
        String signIn = getTextFromElement(signInLink);
        Reporter.log("Show Sign in link" +signIn.toString() +"<br>");
//        CustomListeners.test.log(Status.PASS,"Show Sign In Link");
        return signIn;
    }
    public void checkLogoLocator(){
        verifyThatElementIsDisplayed(logoLocator);
        Reporter.log("Show Logo locator" +logoLocator.isDisplayed() +"<br>");
//        CustomListeners.test.log(Status.PASS,"Logo Displays");
    }




}

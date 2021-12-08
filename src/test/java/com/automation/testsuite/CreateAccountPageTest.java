package com.automation.testsuite;

import com.automation.pages.CreateAccountPage;
import com.automation.pages.HomePage;
import com.automation.pages.SignInPage;
import com.automation.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountPageTest extends TestBase {
    HomePage homePage;
    CreateAccountPage createAccountPage;
    SignInPage signInPage;

    @BeforeMethod
    public void initiate() {
        homePage = new HomePage();
        signInPage = new SignInPage();
        createAccountPage= new CreateAccountPage();
    }

    @Test
    public void verifyThatUserShouldCreateAccountSuccessfully() throws InterruptedException {
        // Click on Sign in Link
        homePage.clickOnSignInLink();
        // Enter email address
        //signInPage.enterEmailCreate("Naresh12345@gmail.com");
        signInPage.enterEmailCreate();
        // Click on "Create an account" button
        signInPage.clickCreateButton();

        // Fill all mandatory fields
        Thread.sleep(5000);
        createAccountPage.getGender("Female");
        Thread.sleep(5000);
        createAccountPage.getCustomerFNM("Dimple");
        createAccountPage.getCustomerLNM("Patel");
        createAccountPage.getPassword("Java12345!");
        createAccountPage.getDays("3");
        createAccountPage.getMonths("5");
        createAccountPage.getYears("1983");
        createAccountPage.getFName("Dimple");
        createAccountPage.getLName("Patel");
        createAccountPage.getCompany("Glenwood Ltd");
        createAccountPage.getAddress1("14 Glenwood ");
        createAccountPage.getAddress2("Harrow");
        createAccountPage.getCity("Cardiff");
        createAccountPage.getState("Indiana");
        createAccountPage.getPostcode("12345");
        createAccountPage.getCountry("United States");
        createAccountPage.getOther("My details and information");
        createAccountPage.getPhone("+079856412345");
        createAccountPage.getMobileNo("+0794512368");
        createAccountPage.getAlias("My 1st Address");
        // Click on "Register" button
        createAccountPage.clickRegister();
        // Verify message "My Account"
        String myAcMsg= createAccountPage.textMyAc();
        Assert.assertEquals("My account",myAcMsg,"Show My account");

    }

}

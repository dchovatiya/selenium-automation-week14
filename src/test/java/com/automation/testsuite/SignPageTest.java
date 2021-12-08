package com.automation.testsuite;

import com.automation.pages.HomePage;
import com.automation.pages.SignInPage;
import com.automation.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;

public class SignPageTest extends TestBase {

    HomePage homePage;
    SignInPage signInPage;

    @BeforeMethod(groups = {"sanity","smoke","regression"})
    public void initiate() {
        homePage = new HomePage();
        signInPage = new SignInPage();
    }

    @Test(priority = 0,groups = {"smoke","regression"})           //1
    public void userShouldNavigateToSignInPageSuccessFully() throws InterruptedException {
        //Click on Sign In link
        homePage.clickOnSignInLink();
        //verify that "AUTHENTICATION" message is displayed
        Thread.sleep(5000);
        String authTx = signInPage.getAuthText();
        Assert.assertEquals("AUTHENTICATION", authTx, "AUTHENTICATION Not displayed");
        Thread.sleep(5000);
        Assert.assertEquals("AUTHENTICATION", signInPage.getAuthTexCls(), "AUTHENTICATION Not displayed");
    }

    @Test(dataProvider = "authentications",dataProviderClass = TestData.class,priority = 1,groups = {"sanity","regression"})         //2
    public void verifyTheErrorMessageWithInValidCredentials(String username, String password,String message) {
        //Click on Sign In link
        homePage.clickOnSignInLink();
        signInPage.enterEmailField(username);
        signInPage.enterPasswordField(password);
        signInPage.clickOnLoginButton();
        String authTx = signInPage.getAuthFailed();
        Assert.assertEquals(message, authTx, "Message: ");
    }

    @Test (priority = 2,groups ={"sanity","regression"} )
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials() {
        // Click on sign link
        homePage.clickOnSignInLink();
        // Enter EmailId
        signInPage.enterEmailField("dpatel123@yahoo.com");
        // Enter Password
        signInPage.enterPasswordField("Java12345!");
        // Click on Sign Button
        signInPage.clickOnLoginButton();
        // Verify that Sign out link is displayed
        String signOut = signInPage.getSignOut();
        Assert.assertEquals("Sign out", signOut, "Message: ");
    }

    @Test (priority = 3,groups = {"regression"})
    public void VerifyThatUserShouldLogOutSuccessFully() {
        // Click on sign link
        homePage.clickOnSignInLink();
        // Enter EmailId
        signInPage.enterEmailField("dpatel123@yahoo.com");
        // Enter Password
        signInPage.enterPasswordField("Java12345!");
        // Click on Sign Button
        signInPage.clickOnLoginButton();
        //Click on Sign out Link
        signInPage.setSignOut();
        // Verify that Sign In Link displayed
        String signInLnk = homePage.showSignInLink();
        Assert.assertEquals("Sign in", signInLnk, "Message: ");
    }


}

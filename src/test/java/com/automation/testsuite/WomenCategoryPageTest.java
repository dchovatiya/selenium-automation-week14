package com.automation.testsuite;

import com.automation.pages.*;
import com.automation.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;

public class WomenCategoryPageTest extends TestBase {
    HomePage homePage;
    CreateAccountPage createAccountPage;
    SignInPage signInPage;
    WomenCategoryPage womenCategoryPage;
    ProductPage productPage;

    @BeforeMethod
    public void initiate() {
        homePage = new HomePage();
        signInPage = new SignInPage();
        createAccountPage = new CreateAccountPage();
        womenCategoryPage = new WomenCategoryPage();
        productPage = new ProductPage();
    }

    @Test           //1
    public void verifyUserShouldNavigateToWomenCategoryPageSuccessfully() {
        // Click on WOMEN tab
        homePage.clickOnWomenLink();
        // Verify "WOMWN" text
        String titleP = womenCategoryPage.getWomenTitle();
    }

    @Test(dataProvider = "productdata", dataProviderClass = TestData.class)              //2
    public void verifyUserShouldAddProductToTheCartSuccessfully(String product, String qty, String size, String colour) throws InterruptedException {
        // Click on WOMEN tab
        homePage.clickOnWomenLink();
        productPage.selProduct(product);
        Thread.sleep(2000);
        productPage.selColour(colour);
        productPage.enterQtyAdd(qty);
        productPage.selectSize(size);
        productPage.clickAddCart();
        Thread.holdsLock(2000);
        productPage.getAddMes("Product successfully added to your shopping cart");
        Thread.sleep(2000);
        productPage.setCloseBtn();


    }


}

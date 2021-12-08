package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class WomenCategoryPage extends Utility {

    public WomenCategoryPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[@class='navigation_page']")  //span[@class='navigation_page'] //span[@class='navigation_page']
    WebElement womenTitle;
    //a[@title='Women']
    @FindBy(xpath = "//a[@title='Tops']") //a[@title='Tops']
    WebElement titleTop;
    @FindBy(xpath = "//li[@class='sfHover']//a[@title='Dresses'][normalize-space()='Dresses']") //li[@class='sfHover']//a[@title='Dresses'][normalize-space()='Dresses']
    WebElement dressLink;
    @FindBy(xpath = "//div[@class='block_content']//a[normalize-space()='Tops']")   //div[@class='block_content']//a[normalize-space()='Tops']
    WebElement topCatLink;
    @FindBy(xpath = "//div[@class='block_content']//a[normalize-space()='Dresses']")//div[@class='block_content']//a[normalize-space()='Dresses']
    WebElement dressCatLink;
    @FindBy(xpath = "//select[@id='selectProductSort']")    //select[@id='selectProductSort']
    WebElement sortBy;
    @FindBy(xpath = "//i[@class='icon-th-list']")   //i[@class='icon-th-list']
    WebElement listBy;
    @FindBy(xpath = "//label[@for='layered_category_4']//a[contains(text(),'Tops')]")   //label[@for='layered_category_4']//a[contains(text(),'Tops')]
    WebElement topCheck;
    @FindBy(xpath = "//label[@for='layered_category_8']//a[contains(text(),'Dresses')]")    //label[@for='layered_category_8']//a[contains(text(),'Dresses')]
    WebElement dressCheck;

    public String getWomenTitle() {
        Reporter.log("Page Tile Women " +womenTitle.toString() +"<br>");
        return getTextFromElement(womenTitle);
    }
    public void clickTitleTop() {
        Reporter.log("Click on Top link" + titleTop.toString() + "<br>");
        clickOnElement(titleTop);
    }
    public void clickDressLink() {
        Reporter.log("Click on Dresses link" + dressLink.toString() + "<br>");
        clickOnElement(dressLink);
    }
    public void clickTopCatLink(){
        Reporter.log("Click on Top Category link" +topCatLink.toString() +"<br>");
        clickOnElement(topCatLink);
    }
    public void clickDressCatLink(){
        Reporter.log("Click on Dresses Category link" +dressCatLink.toString() +"<br>");
        clickOnElement(dressCatLink);
    }

    public void clickSortBy(){
        Reporter.log("Click on Sort By " +sortBy.toString() +"<br>");
        clickOnElement(sortBy);
    }
    public void clickListBy(){
        Reporter.log("Click on List By " +listBy.toString() +"<br>");
        clickOnElement(listBy);
    }

    public void clickTopCheck(){
        Reporter.log("Click on Top Category check" +topCheck.toString() +"<br>");
        clickOnElement(topCheck);
    }
    public void clickDressCheck(){
        Reporter.log("Click on Dresses Category check" +dressCheck.toString() +"<br>");
        clickOnElement(dressLink);
    }


}

package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class CreateAccountPage extends Utility {
    public CreateAccountPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "uniform-id_gender1")    //input[@id='id_gender1'] ///label[@for='id_gender1'] //div[@id='uniform-id_gender1']
    WebElement genderM;
    @FindBy(xpath = "//label[@for='id_gender2']")     //label[@for='id_gender2']
    WebElement genderF;
    @FindBy(xpath = "//input[@id='customer_firstname']")  //input[@id='customer_firstname']
    WebElement customerFNM;
    @FindBy(xpath = "//input[@id='customer_lastname']")  //input[@id='customer_lastname']
    WebElement customerLNM;
    @FindBy(xpath = "//input[@id='email']")  //input[@id='email']
    WebElement email;
    @FindBy(xpath = "//input[@id='passwd']")  //input[@id='passwd']
    WebElement passwd;
    @FindBy(xpath = "//select[@id='days']")  ///select[@id='days']
    WebElement days;
    @FindBy(xpath = "//select[@id='months']")  //select[@id='months']
    WebElement months;
    @FindBy(xpath = "//select[@id='years']")  //select[@id='years']
    WebElement years;
    @FindBy(id = "firstname")    //input[@id='firstname']
    WebElement fName;
    @FindBy(id = "lastname")    //input[@id='lastname']
    WebElement lName;
    @FindBy(id = "company")    //input[@id='company']
    WebElement company;
    @FindBy(id = "address1")    //input[@id='address1']
    WebElement address1;
    @FindBy(id = "address2")    //input[@id='address2']
    WebElement address2;
    @FindBy(id = "city")    //input[@id='city']
    WebElement city;
    @FindBy(xpath = "//select[@id='id_state']") //select[@id='id_state']
    WebElement state;
    @FindBy(xpath = "//input[@id='postcode']") //input[@id='postcode']
    WebElement postcode;
    @FindBy(xpath = "//select[@id='id_country']")    //select[@id='id_country']
    WebElement country;
    @FindBy(xpath = "//textarea[@id='other']")  //textarea[@id='other']
    WebElement other;
    @FindBy(id = "phone")    //input[@id='phone']
    WebElement phone;
    @FindBy(id = "phone_mobile")    //input[@id='phone_mobile']
    WebElement mobileNo;
    @FindBy(id = "alias")    //input[@id='alias']
    WebElement alias;
    @FindBy(xpath = "//button[@id='submitAccount']") //button[@id='submitAccount']
    WebElement register;
    @FindBy(xpath = "//span[@class='navigation_page']")    //span[@class='navigation_page']  //h1[@class='page-heading']
    WebElement myAc;

    public void getGender(String gender) {


        if (gender.equalsIgnoreCase("Male")) {
            Reporter.log("Select option :" + gender + " from the genderM option :" + genderM.isSelected() + "<br>");
            setRadioElement(genderM);
        } else {
            Reporter.log("Select option :" + gender + " from the genderF option :" + genderF.isSelected() + "<br>");
            setRadioElement(genderF);
        }

    }

    public void getCustomerFNM(String custFNM) {
        Reporter.log("Entering Customer first name :" + custFNM + " in the customerFNM :" + customerFNM.toString() + "<br>");
        sendTextToElement(customerFNM, custFNM);
    }

    public void getCustomerLNM(String custLNM) {
        Reporter.log("Entering customer last name :" + custLNM + " in the customerLNM :" + customerLNM.toString() + "<br>");
        sendTextToElement(customerLNM, custLNM);
    }

    public void getEmail(String emailID) {
        Reporter.log("Entering email :" + emailID + " in the email :" + email.toString() + "<br>");
        sendTextToElement(email, emailID);
    }

    public void getPassword(String psWord) {
        Reporter.log("Entering password :" + psWord + " in the passwd :" + passwd.toString() + "<br>");
        sendTextToElement(passwd, psWord);
    }

    public void getDays(String day) {
        clickOnElement(days);
        Reporter.log("Selecting day :" + day + " in the days :" + days.toString() + "<br>");
        selectByValueFromDropDown(days, day);
    }

    public void getMonths(String mons) {
        clickOnElement(months);
        Reporter.log("Selecting month :" + mons + " in the months :" + months.toString() + "<br>");
        selectByValueFromDropDown(months, mons);
    }

    public void getYears(String year) {
        clickOnElement(years);
        Reporter.log("Selecting year :" + year + " in the year :" + years.toString() + "<br>");
        selectByValueFromDropDown(years, year);
    }

    public void getFName(String firstNM) {
        Reporter.log("Entering first name :" + firstNM + " in the fName :" + fName.toString() + "<br>");
        sendTextToElement(fName, firstNM);
    }

    public void getLName(String lastNM) {
        Reporter.log("Entering last name :" + lastNM + " in the lName :" + lName.toString() + "<br>");
        sendTextToElement(lName, lastNM);
    }

    public void getCompany(String comp) {
        Reporter.log("Entering company :" + comp + " in the company :" + company.toString() + "<br>");
        sendTextToElement(company, comp);
    }

    public void getAddress1(String add1) {
        Reporter.log("Entering address1 :" + add1 + " in the address1 :" + address1.toString() + "<br>");
        sendTextToElement(address1, add1);
    }

    public void getAddress2(String add2) {
        Reporter.log("Entering address2 :" + add2 + " in the address2 :" + address2.toString() + "<br>");
        sendTextToElement(address2, add2);
    }

    public void getCity(String cityN) {
        Reporter.log("Entering city :" + cityN + " in the city :" + city.toString() + "<br>");
        sendTextToElement(city, cityN);
    }

    public void getState(String stateN) {
        Reporter.log("Selecting state :" + stateN + " from the state :" + state.toString() + "<br>");
        clickOnElement(state);
        sendTextToElement(state, stateN);
    }

    public void getPostcode(String pCode) {
        Reporter.log("Entering postcode :" + pCode + " in the postcoe :" + postcode.toString() + "<br>");
        sendTextToElement(postcode, pCode);
    }

    public void getCountry(String countryNM) {
        Reporter.log("Selecting country :" + countryNM + " in the country :" + country.toString() + "<br>");
        clickOnElement(country);
        sendTextToElement(country, countryNM);
    }

    public void getOther(String others) {
        Reporter.log("Entering other :" + others + " in the other :" + other.toString() + "<br>");
        sendTextToElement(other, others);
    }

    public void getPhone(String phNo) {
        Reporter.log("Entering phone :" + phNo + " in the phone :" + phone.toString() + "<br>");
        sendTextToElement(phone, phNo);
    }

    public void getMobileNo(String mobNo) {
        Reporter.log("Entering mobile no :" + mobNo + " in the mobileNo :" + mobileNo.toString() + "<br>");
        sendTextToElement(mobileNo, mobNo);
    }

    public void getAlias(String aliasN) {
        Reporter.log("Entering alias :" + aliasN + " in the alias :" + alias.toString() + "<br>");
        sendTextToElement(alias, aliasN);
    }

    public void clickRegister() {
        Reporter.log("Click Register" + register.toString() + "<br>");
        clickOnElement(register);
    }

    public String textMyAc() {
        Reporter.log("Verify Sign Out" + myAc.toString() + "<br>");
        String myAccount = getTextFromElement(myAc);
        return myAccount;
    }
}

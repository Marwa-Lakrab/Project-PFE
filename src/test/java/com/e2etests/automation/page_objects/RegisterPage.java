package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.e2etests.automation.utils.Setup;

public class RegisterPage {

	/* @FindBy */
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'REGISTER')]")
	public static WebElement lienregister;
	
	@FindBy(how = How.NAME, using = "firstName")
	public static WebElement firstName;
	
	@FindBy(how = How.NAME, using = "lastName")
	public static WebElement lastName;
	
	@FindBy(how = How.NAME, using = "phone")
	public static WebElement phone;
	
	@FindBy(how = How.ID, using = "userName")
	public static WebElement userName;
	
	@FindBy(how = How.NAME, using = "address1")
	public static WebElement address1;
	
	@FindBy(how = How.NAME, using = "city")
	public static WebElement city;
	
	@FindBy(how = How.NAME, using = "state")
	public static WebElement state;
	
	@FindBy(how = How.NAME, using = "postalCode")
	public static WebElement postalCode;
	
	@FindBy(how = How.NAME, using = "country")
	public static WebElement country;
	
	@FindBy(how = How.ID, using = "email")
	public static WebElement email;
	
	@FindBy(how = How.NAME, using = "password")
	public static WebElement password;
	
	@FindBy(how = How.NAME, using = "confirmPassword")
	public static WebElement confirmPassword;
	
	@FindBy(how = How.NAME, using = "submit")
	public static WebElement btnsubmit;
	
	@FindBy(how = How.XPATH, using = "//b[contains(text(), 'Note: Your user name is')]")
	public static WebElement successMessage ;
	
	public RegisterPage() {
		PageFactory.initElements(Setup.getDriver(), this);
	}
	
	/* Create Method */
	
	public void clickRegistre() {
		lienregister.click();
	}
	
	public void fillFirstName(String fname) {
		firstName.sendKeys(fname);
	}
	
	public void fillLastName(String lname) {
		lastName.sendKeys(lname);	
	}
	
	public void fillPhone(String vphone) {
		phone.sendKeys(vphone);
	}
	
	public void fillUserName(String uname) {
		userName.sendKeys(uname);
	}
	
	public void fillAdresse(String adresse) {
		address1.sendKeys(adresse);
	}
	
	public void fillCity(String vcity) {
		city.sendKeys(vcity);
	}
	
	public void fillState(String vstate) {
		state.sendKeys(vstate);
	}
	
	public void fillCodePostal(String vpostalCode) {
		postalCode.sendKeys(vpostalCode);
	}
	public void choisieCountry (String vcountry) {
		Select dropdownlist = new Select(country);
		dropdownlist.selectByValue(vcountry);
	}
	public void fillEmail(String vemail) {
		email.sendKeys(vemail);
	}
	
	public void fillPassword(String vpassword) {
		password.sendKeys(vpassword);
	}
	
	public void fillConfirmPassword(String vconfirmPassword) {
		confirmPassword.sendKeys(vconfirmPassword);
	}
	
	public void ClickSubmitButton() {
		btnsubmit.click();
	}
}

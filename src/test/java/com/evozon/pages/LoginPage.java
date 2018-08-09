package com.evozon.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa3.dev.evozon.com/")

public class LoginPage extends PageObject{
	
	 @FindBy(css="a.skip-account span.icon")
	private WebElement accountIcon; 
	 
	 @FindBy(css="div.skip-content div.links li.last")
	 private WebElement loginDropdown;
	 
	 @FindBy(css="#email")
	 private WebElement emailField;
	 
	 @FindBy(css="#pass")
	 private WebElement passwordField;
	 
	 @FindBy(css="#send2")
	 private WebElement loginButton;
	 
	 @FindBy(css="#email")
	 private WebElement checkRequiredField;
	 
	 @FindBy(css="p.hello")
	 private WebElement successLoginMsg;
	 
	 public void clickAccountIcon() {
		 accountIcon.click();
	 }
	 
	 public void selectLogin() {
		 loginDropdown.click();
	 }
	 
	 public void setEmailField(String emailAddress) {
		 emailField.sendKeys(emailAddress);
	 }
	 
	public void setPasswordField(String password) {
		 passwordField.sendKeys(password);
	 }
	 
	 public void login() {
		 loginButton.click();
		 
	 }
	 
	 public void isUserLoggedIn(String userName) {
		 boolean aux;
		 Assert.assertTrue(successLoginMsg.getText().toLowerCase().contains(userName.toLowerCase()));
		 System.out.println("User is logged in");

	 }
	

}

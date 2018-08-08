package com.evozon.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa3.dev.evozon.com/customer/account/login/")

public class LoginPage extends PageObject{
	 
	
	 @FindBy(css="#email")
	 private WebElement emailField;
	 
	 @FindBy(css="#pass")
	 private WebElement passwordField;
	 
	 @FindBy(css="#send2")
	 private WebElement loginButton;
	 
	 @FindBy(css="#email")
	 private WebElement checkRequiredField;
	 
	 public void setEmailField(String emailAddress) {
		 emailField.sendKeys(emailAddress);
	 }
	 
	public void setPasswordField(String password) {
		 passwordField.sendKeys(password);
	 }
	 
	 public void login() {
		 loginButton.click();
		 
	 }
	

}

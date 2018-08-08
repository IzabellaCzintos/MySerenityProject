package com.evozon.pages;

import org.openqa.selenium.WebElement;

import junit.framework.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa3.dev.evozon.com/customer/account/create/")

public class RegisterPage extends PageObject{
	@FindBy(id="firstname")
	private WebElement firstNameField;
	
	@FindBy(id="middlename")
	private WebElement middleNameField;
	
	@FindBy(id="lastname")
	private WebElement lastNameField;
	
	@FindBy(id="email_address")
	private WebElement emailAddressField;
	
	@FindBy(id="password")
	private WebElement passwordField;
	
	@FindBy(id="confirmation")
	private WebElement confirmationPasswordField;
	
	@FindBy(css="button[title='Register']")
	private WebElement registerButton;
	
	@FindBy(css=".success-msg span")
	private WebElement successMsg;
	
	
	public void setFirstName(String firstName) {
		firstNameField.sendKeys(firstName);
	}
	
	public void setMiddleName(String middleName) {
		middleNameField.sendKeys(middleName);
	}
	
	public void setLastName(String lastName) {
		lastNameField.sendKeys(lastName);
	}
	
	public void setEmailAddress(String emailAddress) {
		emailAddressField.sendKeys(emailAddress);
	}
	
	public void setPassword(String password) {
		passwordField.sendKeys(password);
	}
	
	public void setConfirmationPassword(String confirmationPassword) {
		confirmationPasswordField.sendKeys(confirmationPassword);
	}
	
	public void registerUser() {
		registerButton.click();
	}
	
	public boolean verifyRegistered() {
		String text=successMsg.getText();
		String expectedText="Thank you for registering with Madison Island.";
		return text.equalsIgnoreCase(expectedText);
		
	}

}

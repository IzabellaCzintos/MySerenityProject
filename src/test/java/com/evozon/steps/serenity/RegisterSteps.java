package com.evozon.steps.serenity;

import org.openqa.selenium.WebElement;

import com.evozon.pages.RegisterPage;

import junit.framework.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class RegisterSteps extends ScenarioSteps{
	
	private RegisterPage registerPage;
	
	@Step
	public void openPage() {
		registerPage.open();
	}
	
	@Step
	public void insertFirstName(String firstName) {
		registerPage.setFirstName(firstName);
		
	}

	@Step
	public void insertMiddleName(String middleName) {
		registerPage.setMiddleName(middleName);
	}
	
	@Step
	public void insertLastName(String lastName) {
		registerPage.setLastName(lastName);	
	}
	
	@Step
	public void insertEmailAddress(String emailAddress) {
		registerPage.setEmailAddress(emailAddress);
		
	}
	
	@Step
	public void insertPassword(String password) {
		registerPage.setPassword(password);
		
	}
	
	@Step
	public void insertConfirmationPassword(String confirmationPassword) {
		registerPage.setConfirmationPassword(confirmationPassword);
		
	}
	
	public void registerUser() {
		registerPage.registerUser();
	}
	
	/*
	@Step
	public void verifyRegister() {
		String expectedMessage="Thank you for registering with Madison Island.";
		registerPage.assertTrue("User is not registered",successMsg.contentEquals(expectedMessage));

	}
*/

	
}

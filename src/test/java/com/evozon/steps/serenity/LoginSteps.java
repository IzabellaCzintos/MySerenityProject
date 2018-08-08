package com.evozon.steps.serenity;

import org.junit.Assert;

import com.evozon.pages.LoginPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginSteps extends ScenarioSteps{
	
	private LoginPage loginPage;
	
	
	@Step
	public void openPage() {
		loginPage.open();
	}
	
	@Step
	public void loginEmail(String email) {
		loginPage.setEmailField(email);	
	}
	
	@Step
	public void loginPass(String password) {
		loginPage.setPasswordField(password);
	}
	
	@Step
	public void submit() {
		loginPage.login();
	}


	@Step
	public void verifyLogin() {
		String expectedUrl="http://qa3.dev.evozon.com/customer/account/";
		Assert.assertEquals(getDriver().getCurrentUrl(), expectedUrl);
		
	}
	
	@StepGroup
	public void login(String email, String password){
		openPage();
		loginEmail(email);
		loginPass(password);
		submit();
	}

	
	
	
	
}

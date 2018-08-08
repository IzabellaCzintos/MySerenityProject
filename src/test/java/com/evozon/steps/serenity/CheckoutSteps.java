package com.evozon.steps.serenity;

import com.evozon.pages.CheckoutPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class CheckoutSteps extends ScenarioSteps{
	private CheckoutPage checkoutPage;
	
	
	@Step
	public void openPage() {
		checkoutPage.open();
	}
	
	@Step
	public void setBillingInformation() {
		checkoutPage.setBillingInformation();
	}
	
	@Step
	public void continueBillingInformation() {
		checkoutPage.continueBillingInformation();
	}
	
	@Step
	public void setShippingInformation() {
		checkoutPage.setShippingInformation();
	}
	
	@Step
	public void continueShippingInformation() {
		checkoutPage.continueShippingInformation();
	}
	
	@Step
	public void setShippingMethod() {
		checkoutPage.setShippingMethod();
	}
}

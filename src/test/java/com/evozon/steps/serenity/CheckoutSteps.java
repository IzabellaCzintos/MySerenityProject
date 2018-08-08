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
	public void setShippingInformation() throws InterruptedException {
		checkoutPage.setShippingInformation();
	}
	
	@Step
	public void continueShippingInformation() throws InterruptedException {
		checkoutPage.continueShippingInformation();
	}
	
	@Step
	public void setShippingMethod() {
		checkoutPage.setShippingMethod();
	}
	
	@Step
	public void selectShippingMethod() {
		checkoutPage.selectShippingMethod();
	}
	
	@Step
	public void continueShippingMethod() {
		checkoutPage.setShippingMethod();
	}
	
	@Step
	public void setPaymentInformation() {
		checkoutPage.setPaymentInformation();
	}
	
	@Step
	public void continuePaymentInformation() {
		checkoutPage.continuePaymentInformation();
	}
	
	@Step
	public void setOrderReview() {
		checkoutPage.setOrderReview();
	}
	
	@Step
	public void placeOrder() {
		checkoutPage.placeOrder();
	}
	
}


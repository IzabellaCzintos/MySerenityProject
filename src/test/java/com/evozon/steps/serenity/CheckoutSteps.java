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
	public void clickAccountIcon() {
		checkoutPage.clickAccountIcon();
	}
	
	@Step
	public void selectCheckout() {
		checkoutPage.selectCheckout();
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
	public void continueShippingInformation() throws InterruptedException  /*throws InterruptedException*/ {
		checkoutPage.continueShippingInformation();
	}
	
	@Step
	public void setShippingMethod() throws InterruptedException{
		checkoutPage.setShippingMethod();
	}
	
	@Step
	public void selectShippingMethod() throws InterruptedException{
		checkoutPage.selectShippingMethod();
	}
	
	@Step
	public void continueShippingMethod() throws InterruptedException{
		checkoutPage.setShippingMethod();
	}
	
	@Step
	public void setPaymentInformation() throws InterruptedException{
		checkoutPage.setPaymentInformation();
	}
	
	@Step
	public void continuePaymentInformation() throws InterruptedException{
		checkoutPage.continuePaymentInformation();
	}
	
	@Step
	public void setOrderReview() throws InterruptedException{
		checkoutPage.setOrderReview();
	}
	
	@Step
	public void placeOrder() throws InterruptedException{
		checkoutPage.placeOrder();
	}
	
}


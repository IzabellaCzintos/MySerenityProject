package com.evozon.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa3.dev.evozon.com/checkout/onepage/")
public class CheckoutPage extends PageObject{
	
	@FindBy(css=" .control .radio ")
	private WebElement billingAddress;
	
	@FindBy(css=".opc .buttons-set")
	private WebElement continueBillingInformation;
	
	@FindBy(id="opc-shipping")
	private WebElement shippingInformation;
	
	@FindBy(css=".opc .buttons-set button.button")
	private WebElement continueShippingInformation;
	
	@FindBy(css="#s_method_freeshipping_freeshipping")
	private WebElement setShippingMethod;
	
	
	public void setBillingInformation() {
		billingAddress.click();
	}
	
	public void continueBillingInformation() {
		continueBillingInformation.click();
	}

	public void setShippingInformation() {
		shippingInformation.click();
	}
	
	public void continueShippingInformation() {
		continueShippingInformation.click();
	}
	
	public void setShippingMethod() {
		setShippingMethod.click();
	}
}

package com.evozon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa3.dev.evozon.com/checkout/onepage/")
public class CheckoutPage extends PageObject{
	
	WebDriverWait wait = new WebDriverWait(getDriver(), 10);

	
	@FindBy(css=" .control .radio ")
	private WebElement setBillingAddress;
	
	@FindBy(css="#billing-buttons-container > button")
	private WebElement continueBillingInformation;
	
	@FindBy(css="#opc-shipping > div.step-title > h2")
	private WebElement setShippingInformation;
	
	@FindBy(css="#opc-shipping > div.step-title > a")
	private WebElement continueShippingInformation;
	
	@FindBy(css="#opc-shipping_method > div.step-title > h2")
	private WebElement setShippingMethod;
	
	@FindBy(css="#s_method_freeshipping_freeshipping")
	private WebElement selectShippingMethod;
	
	@FindBy(css="#shipping-method-buttons-container > button > span > span")
	private WebElement continueShippingMethod;
	
	@FindBy(css="#opc-payment > div.step-title > h2")
	private WebElement setPaymentInformation;
	
	@FindBy(css="#payment-buttons-container > button > span > span")
	private WebElement continuePaymentInformation;
	
	@FindBy(css="#opc-review > div.step-title > h2")
	private WebElement setOrderReview;
	
	@FindBy(css="#review-buttons-container > button > span > span")
	private WebElement placeOrder;
	
	public void setBillingInformation() {
		setBillingAddress.click();
	}
	
	public void continueBillingInformation() {
		continueBillingInformation.click();
	}

	public void setShippingInformation() throws InterruptedException {

		//WebElement element = wait.until(ExpectedConditions.elementToBeClickable(setShippingInformation));
		setShippingInformation.click();
	}
	
	public void continueShippingInformation() throws InterruptedException {
	//	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(setShippingInformation));
		continueShippingInformation.click();
	}
	
	public void setShippingMethod() {
		setShippingMethod.click();
	}
	
	public void selectShippingMethod() {
		selectShippingMethod.click();
	}
	
	public void continueShippingMethod() {
		continueShippingMethod.click();
	}
	
	public void setPaymentInformation() {
		setPaymentInformation.click();
	}
	
	public void continuePaymentInformation() {
		continuePaymentInformation.click();
	}
	
	public void setOrderReview() {
		setOrderReview.click();
	}
	
	public void placeOrder() {
		placeOrder.click();
	}
	
}

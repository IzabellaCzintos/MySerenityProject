package com.evozon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

//@DefaultUrl("http://qa3.dev.evozon.com/")
public class CheckoutPage extends PageObject{
	
	//WebDriverWait wait = new WebDriverWait(getDriver(), 10);
	
	@FindBy(css="a.skip-account span.icon")
	private WebElement accountIcon; 

	@FindBy(css="div.skip-content div.links li:nth-child(4)")
	private WebElement checkoutDropdown;
	 
	@FindBy(css=" .control .radio ")
	private WebElement setBillingAddress;
	
	@FindBy(css="#billing-buttons-container > button")
	private WebElement continueBillingInformation;
	
	@FindBy(css="#opc-shipping > div.step-title > span")
	private WebElement setShippingInformation;
	
	@FindBy(css="#shipping-buttons-container > button")
	private WebElement continueShippingInformation;
	
	@FindBy(css="#opc-shipping_method > div.step-title > h2")
	private WebElement setShippingMethod;
	
	@FindBy(css="#checkout-shipping-method-load > dl > dd:nth-child(4) > ul > li > label")
	private WebElement selectShippingMethod;
	
	@FindBy(css="#shipping-method-buttons-container > button")
	private WebElement continueShippingMethod;
	
	@FindBy(css="#opc-payment > div.step-title > h2")
	private WebElement setPaymentInformation;
	
	@FindBy(css="#payment-buttons-container > button")
	private WebElement continuePaymentInformation;
	
	@FindBy(css="#opc-review > div.step-title > h2")
	private WebElement setOrderReview;
	
	@FindBy(css="#review-buttons-container > button")
	private WebElement placeOrder;
	
	 public void clickAccountIcon() {
		 accountIcon.click();
	 }

	 public void selectCheckout() {
		 checkoutDropdown.click();
	 }
	
	public void setBillingInformation() {
		setBillingAddress.click();
	}
	
	public void continueBillingInformation() {
		continueBillingInformation.click();
	}

	public void setShippingInformation() throws InterruptedException  {
		WebDriverWait wait = new WebDriverWait(getDriver(), 100);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(setShippingInformation));
		//WebElement element = wait.until(ExpectedConditions.elementToBeClickable(setShippingInformation));
		element.click();
	}
	
	public void continueShippingInformation() throws InterruptedException 
	{
		WebDriverWait wait = new WebDriverWait(getDriver(), 100);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(setShippingInformation));
		//	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(continueShippingInformation));
		element.click();
	}
	
	public void setShippingMethod() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(getDriver(), 100);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(setShippingMethod));
		element.click();
	}
	
	public void selectShippingMethod() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(getDriver(), 100);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(selectShippingMethod));
		element.click();
		
	}
	
	public void continueShippingMethod() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(getDriver(), 100);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(continueShippingMethod));
		element.click();
		
	}
	
	public void setPaymentInformation() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(getDriver(), 100);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(setPaymentInformation));
		element.click();
		
	}
	
	public void continuePaymentInformation() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(getDriver(), 100);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(continuePaymentInformation));
		element.click();
	
	}
	
	public void setOrderReview() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(getDriver(), 100);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(setOrderReview));
		element.click();
	
	}
	
	public void placeOrder() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(getDriver(), 100);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(placeOrder));
		element.click();
		
	}
	
}

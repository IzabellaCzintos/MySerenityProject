package com.evozon.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa3.dev.evozon.com/")
public class AddToCartPage extends PageObject{
	
	
	@FindBy(css="nav#nav > ol > li")
	private List<WebElementFacade> categoryChoose; 
	
	@FindBy(css="li.level0.nav-3>ul>li")
	private List<WebElementFacade> subcategoryChoose;
	
	@FindBy(css=".products-grid .item")
	private List<WebElementFacade> productsOnPage;
	
	@FindBy(css="div.add-to-cart button.button ")
	private WebElement addToCartButton;
	
	@FindBy(css="td.a-right>span")
	private WebElement totalCartPrice;
	
	@FindBy(css="span.price")
	private WebElement priceOfProduct;
	
	@FindBy(css="div.add-to-cart .input-text")
	private WebElement quantityOfProduct;
	
	public void selectProductCategory(String categoryName) {
		for (WebElementFacade element : categoryChoose) {
			//if(element.getText().equalsIgnoreCase(categoryName))
			if(element.getText().toLowerCase().contains(categoryName.toLowerCase())){
				Actions builder = new Actions(getDriver());
				Actions hoverOverLocationSelector = builder.moveToElement(element);
				hoverOverLocationSelector.perform();
				break;		
			}
		}
	}
	
	public void selectProductSubcategory(String subcategoryName) {
		for(WebElementFacade element: subcategoryChoose) {
			//System.out.println(element);
			//if(element.getText().equalsIgnoreCase(subcategoryName)) 
			if(element.getText().toLowerCase().contains(subcategoryName.toLowerCase())){
				element.click();
				break;
			}
		}
		
	}
	
	public void selectProductFromPage(String productName) {
		for(WebElementFacade element: productsOnPage) {
			if(element.getText().toLowerCase().contains(productName.toLowerCase())) {				
				element.click();
				break;

				}
				
		}
	}
	
	public double calculateExpectedPrice() {
		WebElement price=getDriver().findElement(By.cssSelector("span.price"));
		double p=Integer.parseInt(price.getText());		
		WebElement quantity=getDriver().findElement(By.cssSelector("div.add-to-cart .input-text"));
		double q=Integer.parseInt(quantity.getText());	
		Double actualPriceFromWebsite=(p*q);		
		return actualPriceFromWebsite;
	}
	
	
	public void addSelectedProductToCart() {		
		addToCartButton.click();		

	}
	
	
	
	
	

}

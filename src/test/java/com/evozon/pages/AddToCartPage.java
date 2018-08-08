package com.evozon.pages;

import java.util.List;

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
	
	@FindBy(css="ul.products-grid")
	private List<WebElementFacade> productsOnPage;
	
	@FindBy(css="button.button btn-cart")
	private WebElement addToCartButton;
	
	
	public void selectProductCategory(String categoryName) {
		for (WebElementFacade element : categoryChoose) {
			if(element.getText().equalsIgnoreCase(categoryName)) {
				
				Actions builder = new Actions(getDriver());
				Actions hoverOverLocationSelector = builder.moveToElement(element);
				hoverOverLocationSelector.perform();
				break;		
			}
		}
	}
	
	public void selectProductSubcategory(String subcategoryName) {
		for(WebElementFacade element: subcategoryChoose) {
			if(element.getText().equalsIgnoreCase(subcategoryName)) {
				element.click();
				break;
			}
		}
		
	}
	
	public void selectProductFromPage(String productName) {
		
		for(WebElementFacade element: productsOnPage) {
			
			if(element.getText().equalsIgnoreCase(productName)) {
				element.click();
				break;
			}
			
		}
	}
	
	public void addSelectedProductToCart() {
		addToCartButton.click();
	}
	
	
	

}

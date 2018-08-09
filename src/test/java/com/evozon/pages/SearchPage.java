package com.evozon.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa3.dev.evozon.com/")

public class SearchPage extends PageObject{
	
	@FindBy(css="div.category-products ul.products-grid")
	private List<WebElementFacade> searchProducts; 
	
	@FindBy(id="search")
	private WebElementFacade searchField;
	
	@FindBy(css="div.input-box .search-button")
	private WebElementFacade searchIcon;
	
	public void setSearchField(String productSearch) {
		searchField.sendKeys(productSearch);
	}
	
	public void clickSearch() {
		searchIcon.click();
	}
	
	
	public void displayProductsFromPageVerify(String searchedItem) {
		
		for (WebElementFacade element : searchProducts) {
			Assert.assertTrue(element.getText().toLowerCase().contains(searchedItem.toLowerCase()));
			System.out.println("Items relevant to searched keyword!");
				
			
				
		}
		
}
}
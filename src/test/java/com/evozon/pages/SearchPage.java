package com.evozon.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa3.dev.evozon.com/")

public class SearchPage extends PageObject{
	
	@FindBy(css=".products-grid > li*")
	private List<WebElementFacade> searchProducts; 
	
	@FindBy(id="search")
	private WebElementFacade searchField;
	
	@FindBy(css="#search_mini_form > div.input-box > button")
	private WebElementFacade searchButton;
	
	public void setSearchField(String productSearch) {
		searchField.sendKeys(productSearch);
	}
	
	public void clickSearch() {
		searchButton.click();
	}
	
	
	public boolean displayProductsFromPage() {
		for (WebElementFacade element : searchProducts) {
			if(element.containsText("skirt"))
				return true;
		}
		List<WebElementFacade> elementCount=findAll("id=\'product-collection-image*\'");
		//return extract(elementCount, on(WebElement.class).getText());
		return false;
	}

}

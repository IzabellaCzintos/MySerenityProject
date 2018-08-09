package com.evozon.steps.serenity;

import org.junit.Assert;

import com.evozon.pages.SearchPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class SearchSteps extends ScenarioSteps{
	
	private SearchPage searchPage;
	
	@Step
	public void openPage() {
		searchPage.open();
	}
	
	@Step
	public void setSearchField(String productSearch) {
		searchPage.setSearchField(productSearch);
	}
	
	@Step
	public void searchProduct() {
		searchPage.clickSearch();
	}

	public void verifySearchPage() {
		String expectedUrl="http://qa3.dev.evozon.com/catalogsearch/result/?q=skirt";
		Assert.assertTrue(getDriver().getCurrentUrl().equals(expectedUrl));
		System.out.println("Actual URL same as Expected URL");
	}
	
	public void displayProductsFromPageVerify(String searchedItem) {
		searchPage.displayProductsFromPageVerify(searchedItem);
	}
}

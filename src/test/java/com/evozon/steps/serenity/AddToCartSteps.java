package com.evozon.steps.serenity;

import com.evozon.pages.AddToCartPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class AddToCartSteps extends ScenarioSteps{
	
	private AddToCartPage addToCartPage;
	
	@Step
	public void selectCategory(String categoryName) {
		addToCartPage.selectProductCategory(categoryName);
	}
	
	public void selectSubcategory(String subcategoryName) {
		addToCartPage.selectProductSubcategory(subcategoryName);
	}

	
	public void selectProductFromPage(String productName) {
		addToCartPage.selectProductFromPage(productName);
		
	}
	
	public void addSelectedProductToCart() {
		addToCartPage.addSelectedProductToCart();
	}
}

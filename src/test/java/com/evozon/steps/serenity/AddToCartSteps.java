package com.evozon.steps.serenity;

import com.evozon.pages.AddToCartPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;

public class AddToCartSteps extends ScenarioSteps{
	
	private AddToCartPage addToCartPage;
	
	@Step
	public void selectCategory(String categoryName) {
		addToCartPage.selectProductCategory(categoryName);
	}
	
	@Step
	public void selectSubcategory(String subcategoryName) {
		addToCartPage.selectProductSubcategory(subcategoryName);
	}

	@Step
	public void selectProductFromPage(String productName) {
		addToCartPage.selectProductFromPage(productName);
		
	}
	
	@Step
	public double calculateExpectedPrice() {
		 return addToCartPage.calculateExpectedPrice();
		 
	}
	
	@Step
	public void addSelectedProductToCart() {
		addToCartPage.addSelectedProductToCart();
	}
	
	
	
	@StepGroup
		public void addItemToCart(String product) {
		
		String categoryName="accessories";
		String subcategoryName="eyewear";
		selectCategory(categoryName);
		selectSubcategory(subcategoryName);
		selectProductFromPage(product);
		addSelectedProductToCart();
		addSelectedProductToCart();	
	}
	
	
}

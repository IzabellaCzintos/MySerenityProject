package com.evozon.steps.serenity;

import org.junit.Assert;

import com.evozon.pages.AddToCartPage;

//import junit.framework.Assert;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;

public class CartOperationSteps extends ScenarioSteps{
	
	private AddToCartPage addToCartPage;
	
	@Step
	public double totalExpectedPrice() {
		double expectedPrice=0.0;
		Double productPrice=0.0;
		productPrice=addToCartPage.calculateExpectedPrice();
		expectedPrice=expectedPrice+productPrice;
		return expectedPrice;
	}
	
	@Step 
	public void comparePrices() {
		Double expectedPrice=totalExpectedPrice();
		Double actualPrice=addToCartPage.calculateExpectedPrice();
		Assert.assertTrue(expectedPrice==actualPrice);
		System.out.println("Prices are equals");
	}


}

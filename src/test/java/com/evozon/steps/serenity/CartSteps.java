package com.evozon.steps.serenity;

import com.evozon.pages.CartPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class CartSteps extends ScenarioSteps{
	private CartPage cartPage;
	
	@Step
	public void openPage() {
		cartPage.open();
		
	}
	
	@Step
	public void chooseColor() {
		cartPage.chooseColorOfProduct();
	}
	
	@Step
	public void chooseSize() {
		cartPage.chooseSizeOfProduct();
	}
	
	@Step
	public void addToCart() {
		cartPage.addProductToCart();
	}
}

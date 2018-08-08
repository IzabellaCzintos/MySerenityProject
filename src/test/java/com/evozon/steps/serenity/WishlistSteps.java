package com.evozon.steps.serenity;

import com.evozon.pages.WishlistPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class WishlistSteps extends ScenarioSteps{
	private WishlistPage wishlistPage;
	
	@Step
	public void openPage() {
		wishlistPage.open();
	}
	
	@Step
	public void addProductToWishlist() {
		wishlistPage.addToWishlist();
	}
	
	

}

package com.evozon.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa3.dev.evozon.com/women/tops-blouses/tori-tank-494.html")

public class WishlistPage extends PageObject{
	@FindBy(className="link-wishlist")
	private WebElementFacade addToWishlistButton;
	
	public void addToWishlist() {
		addToWishlistButton.click();
	}

	
	

}

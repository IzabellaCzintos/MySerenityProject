package com.evozon.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa3.dev.evozon.com/women/tops-blouses/tori-tank-494.html")

public class CartPage extends PageObject{
	@FindBy(className="button btn-cart")
	private WebElement addToCartButton;

	@FindBy(id="swatch26")
	private WebElement chooseProductColor;
	
	@FindBy(id="swatch78")
	private WebElement chooseProductSize;
	
	public void chooseColorOfProduct() {
		chooseProductColor.click();
	}
	
	public void chooseSizeOfProduct() {
		chooseProductSize.click();
	}
	
	public void addProductToCart() {
		addToCartButton.click();
	}
}

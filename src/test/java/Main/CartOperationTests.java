package Main;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.evozon.steps.serenity.AddToCartSteps;
import com.evozon.steps.serenity.CartOperationSteps;
import com.evozon.steps.serenity.LoginSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)

public class CartOperationTests extends BaseTest{
	//@Managed(uniqueSession=true)
	//public WebDriver driver;
	
	@Before
	public void maxmise() {
		driver.manage().window().maximize();
	}
	
	String user="aaa@aaa.com";
	String pass="123456";
	String category="accessories";
	String subcategory="eyewear";
	String product1="aviator";
	String product2="jackie";
	String product3="retro";
	@Steps
	LoginSteps loginSteps;
	
	@Steps
	AddToCartSteps addToCartSteps;
	
	@Steps
	CartOperationSteps cartOperationSteps;
	
	@Test
	public void checkCart() {
		loginSteps.login(user,pass);
		addToCartSteps.addItemToCart(product1);
		addToCartSteps.addItemToCart(product2);
		addToCartSteps.addItemToCart(product3);
		cartOperationSteps.totalExpectedPrice();
		cartOperationSteps.comparePrices();

		
		
	}

}

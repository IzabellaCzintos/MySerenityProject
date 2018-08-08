package Main;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.evozon.steps.serenity.AddToCartSteps;
import com.evozon.steps.serenity.LoginSteps;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value=com.evozon.features.search.Constants.CSV_FILES_PATH+"CategoryOfProducts.csv")

public class AddToCartTest extends BaseTest{
	
	@Managed(uniqueSession=false)
	public WebDriver driver;
	
	public String user="aaa@aaa.com";
	public String pass="123456";
	
	@Before
	public void maximiseScreen() {
		driver.manage().window().maximize();
	}
	
	@Steps
	LoginSteps loginSteps;
	
	@Steps
	AddToCartSteps addToCartSteps;
	
	@Steps
	String category,subcategory;	
	
	
	
	@Test
	public void addProductToCart() {
		loginSteps.login(user, pass);
		
		addToCartSteps.selectCategory(category);
		addToCartSteps.selectSubcategory(subcategory);
		addToCartSteps.selectProductFromPage("AVIATOR SUNGLASSES");
		
	}
	

}

package Main;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.evozon.steps.serenity.LoginSteps;
import com.evozon.steps.serenity.SearchSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)


public class SearchTests {
	@Managed(uniqueSession=true)
	public WebDriver driver;
	
	@Before
	public void maxmise() {
		driver.manage().window().maximize();
	}
	@Steps
	SearchSteps searchSteps;
	
	@Test
	public void searchProduct() {
		String product="skirt";
		searchSteps.openPage();
		searchSteps.setSearchField(product);
		searchSteps.searchProduct();
		searchSteps.verifySearchPage();
		searchSteps.displayProductsFromPage();
	}

}

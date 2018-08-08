package Main;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.evozon.steps.serenity.CartSteps;
import com.evozon.steps.serenity.LoginSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)

public class CartTests extends BaseTest{
	
	@Managed(uniqueSession=true)
	public WebDriver driver;
	
	@Steps
	CartSteps cartSteps;
	
	@Test
	public void addToCart() {
		cartSteps.openPage();
		cartSteps.chooseColor();
		cartSteps.chooseSize();
		cartSteps.addToCart();
		
	}

}

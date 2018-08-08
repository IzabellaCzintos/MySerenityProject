package Main;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.evozon.steps.serenity.LoginSteps;
import com.evozon.steps.serenity.WishlistSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)

public class WishlistTests extends BaseTest{
	public String user="aaa@aaa.com";
	public String pass="123456";

	@Managed(uniqueSession=true)
	public WebDriver driver;
	
	@Steps
	WishlistSteps wishlistSteps;
	
	@Steps
	LoginSteps loginSteps;
	
	@Test
	public void addToWishlist() {
		
		loginSteps.login(user,pass);
		
		wishlistSteps.openPage();
		wishlistSteps.addProductToWishlist();
	}
}

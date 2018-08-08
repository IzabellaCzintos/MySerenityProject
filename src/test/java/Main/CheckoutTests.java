package Main;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.evozon.steps.serenity.CheckoutSteps;
import com.evozon.steps.serenity.LoginSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)

public class CheckoutTests extends BaseTest{
	
	public String user="aaa@aaa.com";
	public String pass="123456";

	@Managed(uniqueSession=true)
	public WebDriver driver;
	
	@Before
	public void maximiseScreen() {
		driver.manage().window().maximize();
	}
	
	
	@Steps
	CheckoutSteps checkoutSteps;
	@Steps
	LoginSteps loginSteps;
	
	@Test
	public void proceedToCheckout() throws InterruptedException {
		
		loginSteps.login(user, pass);	
		
		checkoutSteps.openPage();
		checkoutSteps.setBillingInformation();
		checkoutSteps.continueBillingInformation();
		checkoutSteps.setShippingInformation();
		checkoutSteps.continueShippingInformation();
		checkoutSteps.setShippingMethod();
		
	}
}

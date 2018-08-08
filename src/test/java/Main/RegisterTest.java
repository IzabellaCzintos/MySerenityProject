package Main;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.evozon.steps.serenity.LoginSteps;
import com.evozon.steps.serenity.RegisterSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)

public class RegisterTest extends BaseTest{
	public String firstName="aaa";
	public String middleName="aaa";
	public String lastName="aaa";
	public String emailAddress="aaa@aaa.com";
	public String password="123456";
	public String confirmationPassword="123456";
	
	
	@Managed(uniqueSession=true)
	public WebDriver driver;
	
	@Steps
	RegisterSteps registerSteps;
	
	@Test
	public void Register() {
		registerSteps.openPage();
		registerSteps.insertFirstName(firstName);
		registerSteps.insertMiddleName(middleName);
		registerSteps.insertLastName(lastName);
		registerSteps.insertEmailAddress(emailAddress);
		registerSteps.insertPassword(password);
		registerSteps.insertConfirmationPassword(confirmationPassword);
		registerSteps.registerUser();
		
		
		

}
}
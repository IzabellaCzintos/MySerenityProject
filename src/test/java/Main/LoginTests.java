package Main;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.evozon.steps.serenity.LoginSteps;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value=com.evozon.features.search.Constants.CSV_FILES_PATH+"Test01_Login.csv")
public class LoginTests extends BaseTest{
	
	
	
	@Steps
	LoginSteps loginSteps;
	
	@Steps
	String user,pass;
	
	@Test
	public void test01_Login() {
		loginSteps.openPage();
		loginSteps.clickAccountIcon();
		loginSteps.selectLogin();
		loginSteps.loginEmail(user);
		loginSteps.loginPass(pass);
		loginSteps.submit();
	//	loginSteps.verifyLogin();
		loginSteps.verifyLoginMsg("aaa");
	}

	
}

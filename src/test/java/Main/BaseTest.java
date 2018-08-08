package Main;

import org.junit.After;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class BaseTest {
	@Managed(uniqueSession = false)
	public WebDriver driver;

	@After
	public void tearDown() {
		driver.quit();
	}
}

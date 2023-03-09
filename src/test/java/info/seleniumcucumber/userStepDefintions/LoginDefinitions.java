package info.seleniumcucumber.userStepDefintions;


import info.seleniumcucumber.page.LoginPage;
import env.DriverUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginDefinitions {
	
protected WebDriver driver = DriverUtil.getDefaultDriver();

	public class LoginCorrectoDefinition {
		private String URL_TCT = "https://web-tct-staging.copec.cl/Login.aspx";
		private WebDriver driver;
		LoginPage loginPage;
		public LoginCorrectoDefinition(){
		}

		@Given("i am on login page")
		public void i_am_on_login_page() {
			driver.get(URL_TCT);
			loginPage = new LoginPage(driver);
		}

		@When("i enter {string} in username")
		public void i_enter_in_username(String string) {
			loginPage.clickUsr();
			loginPage.enterKeysUsr(string);
		}
		@When("i enter {string} in password")
		public void i_enter_in_password(String string) {
			loginPage.clickPwd();
			loginPage.enterKeysPwd(string);
		}

		@When("i click on loginBtn")
		public void i_click_on_login_btn() {
			loginPage.clickIngresar();
		}

		@Then("I shouldn't see {string}")
		public void i_shouldn_t_see(String string) {
			Assert.assertTrue(driver.getPageSource().contains(string));
		}
	}
}

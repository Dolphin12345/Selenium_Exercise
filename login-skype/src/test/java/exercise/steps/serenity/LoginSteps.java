package exercise.steps.serenity;

import org.junit.Assert;

import exercise.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginSteps extends ScenarioSteps {

	LoginPage loginPage;

	@Step
	public void open_home_page() {
		loginPage.open();
	}

	@Step
	public void enterUsr(String username) {
		loginPage.enterUsername(username);
	}

	@Step
	public void btnSignIn() {
		loginPage.clickSignIn();

	}

	@Step
	public void verify_pass_msg(String pass_msg) {
		String actualPassMsg= loginPage.getErrorPassMsg();
		Assert.assertEquals(pass_msg, actualPassMsg);
	}
	
	@Step
	public void enterPass(String password) {
		loginPage.enterPassword(password);
		
	}
	
	@Step
	public void verify_skype_name_msg(String name_msg) {
		String actualNameMsg= loginPage.getErrorNameMsg();
		Assert.assertEquals(name_msg, actualNameMsg);
		
	}
	
	@Step
	public void verify_name_pass_msg(String error_msg) {
		String actualErrorMsg= loginPage.getErrorMsg();
		Assert.assertEquals(error_msg, actualErrorMsg);
		
	}

	@Step
	public void verify_title_page(String title_page) {
		String actualTitle= loginPage.getTitle();
		Assert.assertEquals(title_page, actualTitle);
	}

}

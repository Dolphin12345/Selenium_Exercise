package exercise.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import exercise.steps.serenity.LoginSteps;
import net.thucydides.core.annotations.Steps;

public class DefinitionLogin {

	@Steps
	LoginSteps loginSteps;

	@Given("^Open Login skype page$")
	public void open_Login_skype_page() throws Throwable {
		loginSteps.open_home_page();
	}

	@When("^I am input username is \"([^\"]*)\"$")
	public void i_am_input_username_is(String username) throws Throwable {
	    loginSteps.enterUsr(username);
	}
	
	@When("^user click Signin button$")
	public void user_click_Signin_button() throws Throwable {
	    loginSteps.btnSignIn();
	}
	
	@Then("^I verify password is \"([^\"]*)\"$")
	public void i_verify_password_is(String pass_msg) throws Throwable {
	   // loginSteps.getErrorMsg();
	    loginSteps.verify_pass_msg(pass_msg);
	}
	
	@When("^I am input password is \"([^\"]*)\"$")
	public void i_am_input_password_is(String password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    loginSteps.enterPass(password);
	}
	
	@Then("^I verify skype name is \"([^\"]*)\"$")
	public void i_verify_skype_name_is(String name_msg) throws Throwable {
	    loginSteps.verify_skype_name_msg(name_msg);
	}
	
	@Then("^I verify the error message is \"([^\"]*)\"$")
	public void i_verify_the_error_message_is(String error_msg) throws Throwable {
	    loginSteps.verify_name_pass_msg(error_msg);
	}
	
	@Then("^I verify page title is \"([^\"]*)\"$")
	public void i_verify_page_title_is(String title_page) throws Throwable {
	    loginSteps.verify_title_page(title_page);
	}
}


package exercise1.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import exercise1.steps.serenity.LoginSteps;
import net.thucydides.core.annotations.Steps;

public class DefinitionLogin {
	
	@Steps
		LoginSteps loginStep;
	@Given("^Dolphin opens Login Rediffmail page$")
	public void dolphin_opens_Login_Rediffmail_page() throws Throwable {
	    loginStep.openPage();
	}
	
	@When("^She clicks on the Go button$")
	public void she_clicks_on_the_Go_button() throws Throwable {
	    loginStep.clickButton();
	}
	
	@Then("^The confirmation box should have been displayed \"([^\"]*)\"$")
	public void she_verifies_error_message_is(String blankError) throws Throwable {
	    loginStep.verifyBlankError(blankError);
	}

	@When("^She inputs \"([^\"]*)\" into the Username$")
	public void she_inputs_into_the_Username(String userName) throws Throwable {
	    loginStep.inputName(userName);
	}
	
	@When("^She inputs \"([^\"]*)\" into the Password$")
	public void she_inputs_into_the_Password(String pass) throws Throwable {
	    loginStep.inputPass(pass);
	}


}

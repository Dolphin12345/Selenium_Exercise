package exercise1.steps.serenity;

import exercise1.pages.LoginPage;
import junit.framework.Assert;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginSteps extends ScenarioSteps{
	
	@Steps
		LoginPage loginPage;

	@Step
	public void openPage() {
		loginPage.open();
		
	}
 
	@Step
	public void clickButton() {
		loginPage.clickButton();
		
	}

	@Step
	public void verifyBlankError(String blankError) {
		String actualMsg= loginPage.getBlankErrorMsg();
		Assert.assertEquals(actualMsg, blankError);
		
	}

	@Step
	public void inputName(String userName) {
		loginPage.inputName(userName);
		
	}

	@Step
	public void inputPass(String pass) {
		loginPage.inputPass(pass);
		
	}
	

}

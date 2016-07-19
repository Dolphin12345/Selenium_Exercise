package exercise.steps.serenity;

import exercise.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginSteps extends ScenarioSteps {
	
	LoginPage loginPage;

	@Step
	public void open_home_page() {
		loginPage.open();
	}

}

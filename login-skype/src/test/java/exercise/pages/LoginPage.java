package exercise.pages;

import java.util.concurrent.TimeUnit;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl ("https://login.skype.com/login")
public class LoginPage extends PageObject {
	
	private static final String SECONDS = null;
	@FindBy(id="username")
	public WebElementFacade usernameInput;
	
	public void enterUsername(String username) {
		usernameInput.type(username);
	}

	@FindBy(id="signIn")
	public WebElementFacade btnSignIn;
	
	public void clickSignIn() {
		btnSignIn.click();
		
	}
	
	@FindBy(css="div.messageBox.message_error > span")
	public WebElementFacade error_pass;
	
	public String getErrorPassMsg() {
//		return error_pass.waitUntilPresent().getText();
//		return error_pass.waitUntilVisible().getText();
//		error_pass.setImplicitTimeout(10,SECONDS);
//		return error_pass.getText();
		return withTimeoutOf(10, TimeUnit.SECONDS).waitFor(error_pass).getText();
	}
	
	@FindBy(id="password")
	public WebElementFacade passwordInput;
	
	public void enterPassword(String password) {
		passwordInput.type(password);
		
	}
	
	@FindBy(css="css=div.messageBox.message_error > span")
	public WebElementFacade error_name;
	
	public String getErrorNameMsg() {
//		return error_name.waitUntilPresent().getText();
//		return error_name.waitUntilVisible().getText();
		return withTimeoutOf(10, TimeUnit.SECONDS).waitFor(error_name).getText();
	}
	
	@FindBy(css="css=div.messageBox.message_error > span")
	public WebElementFacade error_msg;
	
	public String getErrorMsg() {
//		return error_msg.waitUntilPresent().getText();
//		return error_msg.waitUntilVisible().getText();
		return withTimeoutOf(10, TimeUnit.SECONDS).waitFor(error_msg).getText();
	}

	
}

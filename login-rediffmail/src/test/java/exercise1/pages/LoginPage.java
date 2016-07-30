package exercise1.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl ("https://mail.rediff.com/cgi-bin/login.cgi")
public class LoginPage extends PageObject{

	@FindBy(name="proceed")
	public WebElementFacade button;
	public void clickButton() {
		button.click();
		
	}
	
//	WebDriver verifyMsg;
//	public String getBlankErrorMsg() throws Exception {
//		Alert alert = verifyMsg.switchTo().alert();
//		String contentOfTerms= verifyMsg.getText();  
//		System.out.println(contentOfTerms);
//		return contentOfTerms;
//		
//	}
	
	WebDriver verifyMsg;

	public String getBlankErrorMsg() throws Exception {
		Alert alert = verifyMsg.switchTo().alert();
		String alert1 = alert.getText();
		return alert1;

	}
	

	@FindBy(id="login1")
	public WebElementFacade name;
	public void inputName(String userName) {
		name.type(userName);
		
	}
	
	@FindBy(id="password")
	public WebElementFacade password;
	public void inputPass(String pass) {
		password.type(pass);
		
	}

}

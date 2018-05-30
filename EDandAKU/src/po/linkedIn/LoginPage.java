package po.linkedIn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Nacho
 *
 */
public class LoginPage {
	
	WebDriver driver;
	
	//*********Web Elements*********
		@FindBy(id="login-email")
		private WebElement loginMail;
		
		@FindBy(id="login-password")
		private WebElement loginPassword;
		
		@FindBy(id="login-submit")
		private WebElement loginButton;
		
		
		public LoginPage (WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		public void login(String email, String password) {
			this.loginMail.sendKeys(email);
			this.loginPassword.sendKeys(password);
			this.loginButton.click();
			System.out.println("****************LOGIN****************");
			
		}
}



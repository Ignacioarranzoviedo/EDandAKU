package po.linkedIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Nacho
 *
 */
public class LoginPage {
	
	WebDriver driver;
	
	//*********Web Elements*********
		By loginMail=By.id("login-email");
		By loginPassword=By.id("login-password");
		By loginButton=By.id("login-submit");
		
		public LoginPage (WebDriver driver) {
			this.driver=driver;
		}
		
		public void login(String email, String password) {
			driver.findElement(loginMail).sendKeys(email);
			driver.findElement(loginPassword).sendKeys(password);
			driver.findElement(loginButton).click();
			System.out.println("****************LOGIN****************");
		}
}

package po.linkedIn;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Nacho
 *
 */

public class MainPage {

WebDriver driver;

	
	//*********Web Elements*********
	@FindBy(css="input:nth-child(1)")
	private WebElement findingField;
	
		public MainPage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
			public void lookingForMarketingJob(String job) {		
				this.findingField.sendKeys(job);
				this.findingField.sendKeys(Keys.ENTER);
				System.out.println("****************LOOKING FOR A JOB****************");	
			}
			
			public void onlyJobs2() {
				try {
					
				WebElement jobs = driver.findElement(By.xpath("//*[contains(text(), 'Empleos')]"));
				Thread.sleep(1000);
				jobs.click();
				}catch (Exception e){
				}
			}
		
}

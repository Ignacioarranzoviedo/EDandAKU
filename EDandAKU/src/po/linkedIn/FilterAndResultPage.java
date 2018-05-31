package po.linkedIn;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Nacho
 *
 */

public class FilterAndResultPage {

	WebDriver driver;
	
	//*********Web Elements*********
	
	static final JobsButton = //div[contains(text(), '" + text + "')];
	@FindBy(xpath= JobsButton)
	private WebElement jobs;
	
	@FindBy(xpath="/html/body/div[5]/div[6]/div[3]/div/div[1]/div/div/nav/div[1]/ul/li[2]")
	private WebElement location;
	
	public FilterAndResultPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	
	public void onlyJobs() {
		this.jobs.click();
	}
	
	public void setLocation(String city) {
		Actions action = new Actions(driver).doubleClick(location);
		action.build().perform();
		this.location.sendKeys(city);
		this.location.sendKeys(Keys.ENTER);
	}	
	
}

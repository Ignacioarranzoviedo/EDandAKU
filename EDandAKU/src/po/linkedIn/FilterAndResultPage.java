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
	@FindBy(css="li.search-vertical-filter__filter-item:nth-child(2) > button:nth-child(1)")
	private WebElement jobs;
	
	@FindBy(css="input:nth-child(1)")
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

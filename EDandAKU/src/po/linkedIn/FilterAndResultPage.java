package po.linkedIn;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
	
	
	
	@FindBy(css="input:nth-child(1)")
	private WebElement location;
	
	
	
	public FilterAndResultPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	
	public void onlyJobs() {
		try {
			
		WebElement jobs = driver.findElement(By.cssSelector("[data-vertical=JOBS]"));
		Thread.sleep(1000);
		jobs.click();
		}catch (Exception e){
		}
	}
	
	public void setLocationwihtDoubleClick(String city) {
		Actions action = new Actions(driver).doubleClick(location);
		action.build().perform();
		this.location.sendKeys(city);
		this.location.sendKeys(Keys.ENTER);
	}	
	
	public void wordJobs() {
		try {
		WebElement searchJobs = driver.findElement(By.xpath("//*[contains(text(), 'Buscar empleos')]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", searchJobs);
		
		Actions builder = new Actions(driver);
		builder.sendKeys(searchJobs, "Marketing")
				.perform();
		}catch (Exception e){
		}
		
	
	}
}


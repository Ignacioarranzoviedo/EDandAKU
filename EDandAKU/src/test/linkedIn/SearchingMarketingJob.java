package test.linkedIn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

/**
 * @author Nacho
 *
 */
public class SearchingMarketingJob {
	public static void main(String[] args) throws Throwable{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Nacho\\Desktop\\Automatización\\WEB-DRIVER-BOOK\\geckodriver.exe");
		//we instantiate the Firefox implementation of the WebDriver interface (subclass of the RemoteWebDriver class)
				
				WebDriver driver = new FirefoxDriver();
				EventFiringWebDriver eventFiringDriver = new EventFiringWebDriver(driver);
				IAmTheEventListener eventListener = new IAmTheEventListener();
				
				eventFiringDriver.register(eventListener);
				eventFiringDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				eventFiringDriver.get("https://www.linkedin.com");
				
				System.out.println("<LinkedIn main page");
	
	}

}

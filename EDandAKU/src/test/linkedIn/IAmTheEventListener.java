package test.linkedIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

/**
 * @author Nacho
 *
 */
public class IAmTheEventListener extends
AbstractWebDriverEventListener{
//////////NAVIGATION RELATED METHODS ////////////////
@Override
public void beforeNavigateTo(String url, WebDriver driver) {
System.out.println("IAmTheEventListener: Before Navigate To "+url +" and Current url is: "+driver.getCurrentUrl());
}
@Override
public void afterNavigateTo(String url, WebDriver driver) {
System.out.println("IAmTheEventListener: After Navigate To: "+url +" and Current url is: "+driver.getCurrentUrl());
}
@Override
public void beforeNavigateBack(WebDriver driver) {
System.out.println("IAmTheEventListener: Before Navigate Back. Right now I'm at"+driver.getCurrentUrl());
}
@Override
public void afterNavigateBack(WebDriver driver) {
System.out.println("IAmTheEventListener: After Navigate Back. Right now I'm at "+driver.getCurrentUrl());
}
@Override
public void beforeNavigateForward(WebDriver driver) {
System.out.println("IAmTheEventListener: Before Navigate Forward. Right now I'm at"+driver.getCurrentUrl());
}
@Override
public void afterNavigateForward(WebDriver driver) {
System.out.println("IAmTheEventListener: After Navigate Forward. Right now I'm at "+driver.getCurrentUrl());
}
/////////////////// FINDBY RELATED METHODS ///////////////
@Override
public void beforeFindBy(By by, WebElement element, WebDriver driver) {
System.out.println("IAmTheEventListener: Before find an element" +" "+by);
}
@Override
public void afterFindBy(By by, WebElement element, WebDriver
driver) {
System.out.println("IAmTheEventListener: After find an element" +" "+by);
}
////////////////////CLICKON RELATED METHODS ///////////////
@Override
public void beforeClickOn(WebElement element, WebDriver driver) {
System.out.println("IAmTheEventListener: Before click in "+element);
}
@Override
public void afterClickOn(WebElement element, WebDriver driver) {
System.out.println("IAmTheEventListener: After click in "+element);
}
///////////////// CHANGE OF VALUE RELATED METHODS //////////////
@Override
public void beforeChangeValueOf(WebElement element, WebDriver driver, java.lang.CharSequence[] keysToSend) {
System.out.println("IAmTheEventListener: Before change, the value is: "+element.getAttribute(""));
}
@Override
public void afterChangeValueOf(WebElement element, WebDriver driver, java.lang.CharSequence[] keysToSend) {
System.out.println("IAmTheEventListener: After change, the value is: " +element.getAttribute(""));
}

}

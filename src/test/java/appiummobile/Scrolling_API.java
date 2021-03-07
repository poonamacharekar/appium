package appiummobile;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Scrolling_API {

	AndroidDriver driver;
	@Test
	
	public void scroll() throws Throwable
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName","vivo 1907");
		cap.setCapability("automationName","Appium");
		cap.setCapability("platformName","10");
		cap.setCapability("UDID","F6VOMNOFOR9DOZVO");
		cap.setCapability("appPackage","io.appium.android.apis");
		cap.setCapability("appActivity", ".ApiDemos");
		cap.setCapability("noReset", true);
		URL url= new URL("http://localhost:4723/wd/hub");
		 driver= new AndroidDriver(url,cap);
		 
		 
		
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
	Thread.sleep(1000);
	

	
	WebElement ele = driver.findElementByAccessibilityId("Views");
	driver.tap(1, ele, 500);
	Thread.sleep(2000);
	scrolling("text", "Layouts");
	WebElement ele1=driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Layouts\"]");
	driver.tap(1, ele1, 500);
	}
	
	
	
	
	/* scrollinng*/
	
	public void scrolling(String an , String av)
	{
	driver.findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(" + an + "(\"" + av + "\"))");
	}
}

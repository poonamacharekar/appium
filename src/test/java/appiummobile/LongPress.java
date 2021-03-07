package appiummobile;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import appiummobile.genericutility.PropertyFile;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class LongPress {
	DesiredCapabilities cap = new DesiredCapabilities();
	  AndroidDriver driver;
 PropertyFile p = new PropertyFile();
	@Test
	public void longpresselement() throws Throwable
	{
		cap.setCapability("deviceName", p.getPropertykeyValue("deviceName"));
		cap.setCapability("automationName", p.getPropertykeyValue("automationName"));
		cap.setCapability("platformName", p.getPropertykeyValue("platformName"));
		cap.setCapability("platformVersion", p.getPropertykeyValue("platformVersion"));
		cap.setCapability("UDID", p.getPropertykeyValue("UDID"));
		cap.setCapability("appPackage", p.getPropertykeyValue("appPackage"));
		cap.setCapability("appActivity", p.getPropertykeyValue("appActivity"));
		//cap.setCapability("appPackage","com.android.bbkcalculator");
		//cap.setCapability("appActivity", ".Calculator");
		
		URL url= new URL("http://localhost:4723/wd/hub");
	driver = new AndroidDriver(url,cap);
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	TouchAction ta= new TouchAction(driver);
	 MobileElement btn3=(MobileElement) driver.findElementById("com.android.bbkcalculator:id/digit3");
	
	 ta.longPress(btn3).waitAction(500).release().perform();
	

}
}

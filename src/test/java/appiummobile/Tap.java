package appiummobile;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Tap {
	
	GenericUtility g = new GenericUtility();
	DesiredCapabilities cap = new DesiredCapabilities();

	@Test
	
 public void Tap() throws Throwable {
	//DesiredCapabilities cap = new DesiredCapabilities();
	
	cap.setCapability("deviceName","vivo 1907");
	cap.setCapability("automationName","Appium");
	cap.setCapability("platformName","Android");
	cap.setCapability("platformVersion","10");
	cap.setCapability("UDID","F6VOMNOFOR9DOZVO");
	cap.setCapability("appPackage","com.android.bbkcalculator");
	cap.setCapability("appActivity", ".Calculator");
	
	URL url= new URL("http://localhost:4723/wd/hub");
	AndroidDriver driver= new AndroidDriver(url,cap);
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	//driver.findElementById(".android.bbkcalculator:id/digit6").click();
	 MobileElement btn5 = (MobileElement) driver.findElementById("com.android.bbkcalculator:id/digit5");
	 g.tapmethod(btn5, driver);
	 MobileElement btnpls=(MobileElement) driver.findElementById("com.android.bbkcalculator:id/plus");
	g.tapmethod(btnpls, driver);
	 MobileElement btn3=(MobileElement) driver.findElementById("com.android.bbkcalculator:id/digit3");
	g.tapmethod(btn3, driver);
	MobileElement bteql=(MobileElement) driver.findElementById("com.android.bbkcalculator:id/equal");
	g.tapmethod(bteql, driver);
	}
}




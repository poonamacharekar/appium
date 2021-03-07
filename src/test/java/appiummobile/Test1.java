package appiummobile;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import appiummobile.genericutility.PropertyFile;
import io.appium.java_client.android.AndroidDriver;

public class Test1 {
	//GenericUtility g = new GenericUtility();
	//DesiredCapabilities cap = new DesiredCapabilities();
	
	@Test
	
	public void Launch() throws Throwable
	{ 
		
		
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		PropertyFile p = new PropertyFile();
		
		cap.setCapability("deviceName", p.getPropertykeyValue("deviceName"));
		cap.setCapability("automationName", p.getPropertykeyValue("automationName"));
		cap.setCapability("platformName", p.getPropertykeyValue("platformName"));
		cap.setCapability("platformVersion", p.getPropertykeyValue("platformVersion"));
		cap.setCapability("UDID", p.getPropertykeyValue("UDID"));
		cap.setCapability("appPackage", p.getPropertykeyValue("appPackage"));
		cap.setCapability("appActivity", p.getPropertykeyValue("appActivity"));
		URL url= new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver= new AndroidDriver(url,cap);
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
			
	}
	
	
}

package appiummobile;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Orientation {

	@Test()
	
	
	public void orientation() throws MalformedURLException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName","vivo 1907");
		cap.setCapability("automationName","Appium");
		cap.setCapability("platformName","Android");
		cap.setCapability("platformVersion","10");
		cap.setCapability("UDID","F6VOMNOFOR9DOZVO");
		cap.setCapability("appPackage","com.android.bbkcalculator");
		cap.setCapability("appActivity", ".Calculator");
		
		URL url= new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver= new AndroidDriver(url,cap);
		
		System.out.println(driver.getOrientation());
		
		driver.rotate(ScreenOrientation.LANDSCAPE);
		
		System.out.println(driver.getOrientation());
		
		driver.rotate(ScreenOrientation.PORTRAIT);
		
	
	}
}

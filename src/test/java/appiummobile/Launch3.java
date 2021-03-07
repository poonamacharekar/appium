package appiummobile;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Launch3 {
	@Test
	
		public void launch3() throws MalformedURLException
		{
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability("deviceName","vivo 1907");
			cap.setCapability("automationName","Appium");
			cap.setCapability("platformName","10");
			cap.setCapability("UDID","F6VOMNOFOR9DOZVO");
			cap.setCapability("appPackage","com.myntra.android");
			cap.setCapability("appActivity", ".SplashActivity");
			
			URL url= new URL("http://localhost:4723/wd/hub");
			AndroidDriver driver= new AndroidDriver(url,cap);
			
			driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
			

	}
	}

	
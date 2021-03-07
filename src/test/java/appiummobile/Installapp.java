package appiummobile;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Installapp {
	
	@Test
	public void launchapp() throws Throwable {
		
	DesiredCapabilities cap = new DesiredCapabilities();
	
	cap.setCapability("deviceName","vivo 1907");
	cap.setCapability("automationName","Appium");
	cap.setCapability("platformName","10");
	cap.setCapability("UDID","F6VOMNOFOR9DOZVO");
	cap.setCapability("app","C:\\APK\\ApiDemos-debug.apk");
	//cap.setCapability("appActivity", ".ics.IcsEventInfoActivity");
	
	URL url= new URL("http://localhost:4723/wd/hub");
	AndroidDriver driver= new AndroidDriver(url,cap);
	
	driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
	

}
}




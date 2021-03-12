package appiummobile;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class CameraLaunch {
	
	@Test
	
	public void camera() throws Throwable {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName","vivo 1907");
		cap.setCapability("automationName","Appium");
		cap.setCapability("platformName","10");
		cap.setCapability("UDID","F6VOMNOFOR9DOZVO");
		cap.setCapability("appPackage","com.android.camera");
		cap.setCapability("appActivity", ".CameraActivity");
		cap.setCapability("noReset", true);
		
		URL url= new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver= new AndroidDriver(url,cap);
		
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
		
		
		/*inbuilt method to take photo*/
		//driver.pressKeyCode(AndroidKeyCode.KEYCODE_CAMERA);
		
		driver.findElementById("com.android.camera:id/shutter_button").click();
		
		driver.findElementById(".android.camera:id/camera_switch").click();
		Thread.sleep(1000);
		//driver.findElementById("com.android.camera:id/shutter_button").click();
		
		//driver.pressKeyCode(AndroidKeyCode.KEYCODE_CAMERA);
		
	//driver.pressKeyCode(AndroidKeyCode.KEYCODE_VOLUME_UP);	
	}

}

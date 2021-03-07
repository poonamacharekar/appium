package appiummobile;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class TouchScreenLaunch {
	@Test
	public void TouchScreen() throws Throwable {
		
	
DesiredCapabilities cap = new DesiredCapabilities();
	
	cap.setCapability("deviceName","vivo 1907");
	cap.setCapability("automationName","Appium");
	cap.setCapability("platformName","10");
	cap.setCapability("UDID","F6VOMNOFOR9DOZVO");
	cap.setCapability("appPackage","jp.rallwell.siriuth.touchscreentest");
	cap.setCapability("appActivity", ".TouchScreenTestActivity");
	
	URL url= new URL("http://localhost:4723/wd/hub");
	AndroidDriver driver= new AndroidDriver(url,cap);
	
	//driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
	/* to swipe horizontaly*/
	//driver.swipe(118, 1010, 994, 1010, 500);
	/* to swipe vertically*/
	//driver.swipe(487, 2027, 487, 214 ,500);
	/*to swipe in L shape */
	//driver.swipe(155, 342, 162, 2032, 500);
	//driver.swipe(162, 2032, 957, 2034, 0);
	
	/* generic method for swipe */
	
	Dimension d = driver.manage().window().getSize();
	int ht = d.getHeight();
	System.out.print("height=" + ht);
	int wd = d.getWidth();
	System.out.print("width=" + wd);
	
	// swipe horizontal
	int startx = (int) (wd*0.2);
	int starty = (int) (ht*0.5);
	int endx = (int) (wd*0.8);
	int endy = (int) (ht*0.5);
	driver.swipe(startx, starty, endx, endy, endy);
	
	
	
}
}

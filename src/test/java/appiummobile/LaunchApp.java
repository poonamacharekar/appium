package appiummobile;


import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class LaunchApp {
	
	@Test
	
 public void Launch() throws Throwable {
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
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	//driver.findElementById(".android.bbkcalculator:id/digit6").click();
	driver.findElementById("com.android.bbkcalculator:id/digit5").click();
	Thread.sleep(1000);
	driver.findElementById("com.android.bbkcalculator:id/plus").click();
	
	driver.findElementById("com.android.bbkcalculator:id/digit3").click();
	driver.findElementById("com.android.bbkcalculator:id/equal").click();
	
	TakesScreenshot t = (TakesScreenshot)driver;
	File src = t.getScreenshotAs(OutputType.FILE);
	File dest = new File("./pic/cal.png");
	FileUtils.copyFile(src, dest);
	
	
	
}
}

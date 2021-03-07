package appiummobile;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import appiummobile.genericutility.PropertyFile;
import io.appium.java_client.android.AndroidDriver;

public class General_Stores_scroll {
	AndroidDriver driver;
	@Test
	public void generalstorescroll() throws Throwable
	{
		
	
	DesiredCapabilities cap = new DesiredCapabilities();
	
	cap.setCapability("deviceName","vivo 1907");
	cap.setCapability("automationName","Appium");
	cap.setCapability("platformName","10");
	cap.setCapability("UDID","F6VOMNOFOR9DOZVO");
	cap.setCapability("appPackage","com.androidsample.generalstore");
	cap.setCapability("appActivity", ".SplashActivity");
	cap.setCapability("noReset", true);
	URL url= new URL("http://localhost:4723/wd/hub");
	 driver= new AndroidDriver(url,cap);
	 Thread.sleep(3000);
	 driver.findElementByXPath("//android.widget.EditText[@text='Enter name here']").sendKeys("poonam");
	 driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();
	 
	 
		Thread.sleep(2000);
		scrolling("text", "PG 3");
		WebElement ele1=driver.findElementByXPath("//android.widget.EditText[@text='PG 3']");
		driver.tap(1, ele1, 500);
		}
		
		
		
		
		/* scrollinng*/
		
		public void scrolling(String an , String av)
		{
		driver.findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(" + an + "(\"" + av + "\"))");
		}
	

	 
	 
	 
	 
	 
	 
	 
	

}


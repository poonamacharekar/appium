package appiummobile;

import org.openqa.selenium.remote.DesiredCapabilities;

public class All_Packge_activity {
	
	DesiredCapabilities cap = new DesiredCapabilities();
	
	public void calculator()
	{
		
		cap.setCapability("appPackage","com.android.bbkcalculator");
		cap.setCapability("appActivity", ".Calculator");
	}
	
	
	public void calender()
	{
		cap.setCapability("appPackage","com.bbk.calendar");
		cap.setCapability("appActivity", ".ics.IcsEventInfoActivity");
	}
	
	public void myntra()
	{
		
	}

}

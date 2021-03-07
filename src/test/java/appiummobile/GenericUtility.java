package appiummobile;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class GenericUtility {
	
	
	public void tapmethod(MobileElement element , AndroidDriver driver )
	{
		driver.tap(1, element, 500);
	}

}

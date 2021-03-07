package appiummobile.genericutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertyFile {
	
	public String getPropertykeyValue(String Key) throws Throwable
	{
	FileInputStream fis = new FileInputStream("./desiredcapability.properties")	;
	Properties pobjet= new Properties();
	pobjet.load(fis);
	String value = pobjet.getProperty(Key);
	return value;
	
}


}

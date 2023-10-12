package GenericLibrairy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Propertyfile {
	
	public String getpropertyData(String key) throws Throwable {
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream(iPathConstant.propertyfilePath);
		p.load(fis);
		return p.getProperty(key);
	}

}

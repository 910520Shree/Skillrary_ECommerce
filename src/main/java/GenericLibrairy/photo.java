package GenericLibrairy;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class photo {
	
	public void getPhoto(WebDriver driver,String name) throws Throwable {
	
	TakesScreenshot ts = (TakesScreenshot) driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dest = new File(iPathConstant.photoPath+name+".png");
	FileUtils.copyFile(src, dest);
	
	}

}

package scripts;

import org.testng.annotations.Test;

import GenericLibrairy.baseClass;
import POM.DemoSkillraryAppPage;
import POM.TestingPage;
import POM.skillrarayHomwPage;

public class TestCase1 extends baseClass{
	@Test
	public void tc1() throws Throwable {
		skillrarayHomwPage s= new skillrarayHomwPage(driver);
		s.gearsbutton();
		s.skillrarydemoapplink();
		utilities.childBrowser(driver);
		DemoSkillraryAppPage ds =new DemoSkillraryAppPage(driver);
		utilities.dropDowns(ds.getSelectDd(), pdata.getpropertyData("coursedd"));
		TestingPage tp = new TestingPage(driver);
		utilities.scrollBar(driver, tp.getFbIcon());
		tp.fbIconWebElement();
	}

}

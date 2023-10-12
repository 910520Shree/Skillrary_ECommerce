package scripts;

import org.testng.annotations.Test;

import GenericLibrairy.baseClass;
import POM.DemoSkillraryAppPage;
import POM.invoicePage;
import POM.skillrarayHomwPage;

public class TestCase2 extends baseClass{
	@Test
	public void tc2() {
		skillrarayHomwPage s= new skillrarayHomwPage(driver);
		s.gearsbutton();
		s.skillrarydemoapplink();
		utilities.childBrowser(driver);
		DemoSkillraryAppPage ds =new DemoSkillraryAppPage(driver);
		ds.feedBackButton();
		invoicePage ip = new invoicePage(driver);
		ip.InvoiceButton();
	}

}
//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 --->token of github

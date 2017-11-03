package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapWrappers;

public class ViewLeadPage extends LeafTapWrappers {

	public ViewLeadPage(RemoteWebDriver driver,ExtentTest test)
	{
		this.driver=driver;
		this.test=test;
		 if(!verifyTitle("View Lead | opentaps CRM"))
		 {
				logSteps("PASS","this is  a login");
				
		 }
	}
			public EditLead clickeditbutton()
			{
				clickByLink("Edit");
				return new EditLead(driver,test);
			}
public Deletelead clickdeletebutton()
{
	clickByLink("Delete");
	return new Deletelead(driver,test);
}
	/*public DuplicateLead clickdupllead()
	{
		clickByLink("Duplicate Lead");
		return new DuplicateLead(driver,test);
	}
	*/
}


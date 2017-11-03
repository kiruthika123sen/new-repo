package pages;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapWrappers;

public class MyLeads extends LeafTapWrappers {

	public MyLeads(RemoteWebDriver driver,ExtentTest test)
	{
		this.driver=driver;
		this.test=test;
		 if(!verifyTitle("My Leads | opentaps CRM"))
		 {
				logSteps("PASS","this is a login");
				
		 }
	

	}
	
	public CreateLead clickmylead()
	{
		clickByLink("Create Lead");
		return new CreateLead(driver,test);
	}
	
	public FindBy clickfindlead()
	{
		clickByLink("Find Leads");
		return new FindBy(driver,test);
	}
	public Mergelead clickmergelead()
	{
		clickByLink("Merge Leads");
		return new Mergelead(driver,test);
	}

}

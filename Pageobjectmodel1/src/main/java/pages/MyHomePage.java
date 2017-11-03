package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapWrappers;

public class MyHomePage extends LeafTapWrappers {

	public  MyHomePage(RemoteWebDriver driver,ExtentTest test) 
	{
		this.driver=driver;
		this.test=test;
		 if(!verifyTitle("My Home | opentaps CRM"))
		 {
				logSteps("PASS","this is a login");
				
		 }

	}

	public MyLeads clickLead()
	{
		clickByLink("Leads");
		return new MyLeads(driver,test);
	}
}

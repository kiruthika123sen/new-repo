package pages;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapWrappers;

public class EditLead extends LeafTapWrappers {

	public EditLead(RemoteWebDriver driver,ExtentTest test)
	{
		this.driver=driver;
		this.test=test;
		 if(!verifyTitle(" opentaps CRM"))
		 {
				logSteps("PASS","this is a login");
				
		 }
	}

	
	
		 public EditLead updatename(String updtcompanyname)
		 {
			 enterById("updateLeadForm_companyName",updtcompanyname);
			 return this;
		 }
		 
		 public ViewLeadPage clickupdate()
		 {
				clickByClassName("smallSubmit");
				return new ViewLeadPage(driver,test);
		 }
}
	
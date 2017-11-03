package pages;

import org.openqa.selenium.remote.RemoteWebDriver;


import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapWrappers;


public class CreateLead extends LeafTapWrappers {
	
	

	public CreateLead(RemoteWebDriver driver,ExtentTest test) 
	{
		this.driver=driver;
		this.test=test;
		 
		 if(!verifyTitle("Create Lead | opentaps CRM"))
		 {
				logSteps("PASS","this is  a login");
				
		 }
	}

	public CreateLead entercompanyname(String data)
	{
		enterById("createLeadForm_companyName",data);
		return this;
	}
	
   public CreateLead enterfirstname(String data)
   {
	   enterById("createLeadForm_firstName",data);
	   return this;
   }
public CreateLead enterlastname(String data)
{
	enterById("createLeadForm_lastName",data);
	return this;
}
public ViewLeadPage clickcreatelead()
{
	clickByClassName("smallSubmit");
	return new ViewLeadPage(driver,test);
}


}

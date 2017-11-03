package pages;

import org.openqa.selenium.remote.RemoteWebDriver;


import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapWrappers;


public class Deletelead extends LeafTapWrappers {
	
	

	public Deletelead(RemoteWebDriver driver,ExtentTest test) 
	{
		this.driver=driver;
		this.test=test;
		 
		 if(!verifyTitle("Create Lead | opentaps CRM"))
		 {
				logSteps("PASS","this is  a login");
				
		 }
	}
	
}
	
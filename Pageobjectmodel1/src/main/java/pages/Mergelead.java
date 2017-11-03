package pages;

import org.openqa.selenium.remote.RemoteWebDriver;


import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapWrappers;


public class Mergelead extends LeafTapWrappers {
	
	

	public Mergelead(RemoteWebDriver driver,ExtentTest test) 
	{
		this.driver=driver;
		this.test=test;
		 
		 if(!verifyTitle("Merge Leads | opentaps CRM"))
		 {
				logSteps("PASS","this is  a login");
				
		 }
	}
	public Mergelead enterfromlead()
	{
		 clickByXpath("(//img[@alt='Lookup'])[1]");
		 return this;
	}

public void switchtonextwindow()
{
	
}
}
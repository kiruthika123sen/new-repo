package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapWrappers;

public class HomePage extends LeafTapWrappers {
	 public HomePage(RemoteWebDriver driver,ExtentTest test)
	 {
		 this.driver=driver;
		 this.test=test;
		 if(!verifyTitle("Opentaps Open Source ERP + CRM"))
		 {
				logSteps("PASS","this is a login");
				
		 }
	 }
	 
public MyHomePage clickcrmsfa()
{
	clickByLink("CRM/SFA");
          return new MyHomePage(driver,test);   
}
	public LoginPage clicklogout()
	{
		clickByClassName("decorativeSubmit");
		return new LoginPage(driver,test);
	}

}



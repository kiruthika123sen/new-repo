package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapWrappers;

public class LoginPage extends LeafTapWrappers {

	public LoginPage(RemoteWebDriver driver,ExtentTest test)
	{
		this.driver=driver;
		this.test=test;
	if(!verifyTitle("Opentaps Open Source ERP + CRM"))	
	{
		logSteps("PASS","thIS IS login");
	}

	}


public LoginPage typeUsername(String data)
{
	enterById("username",data);
	return this;
}
public LoginPage typePassword(String data)
{
	enterById("password",data);
	return this;
}
public HomePage clickLogin()
{
	clickByClassName("decorativeSubmit");
	return new HomePage(driver,test);
}
}


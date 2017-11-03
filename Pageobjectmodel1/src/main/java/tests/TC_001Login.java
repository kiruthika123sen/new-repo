package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.LeafTapWrappers;

public class TC_001Login extends LeafTapWrappers {
	

	
	@BeforeClass
	public void beforeclass()
	{

		excelname="loginn";
		Testcasename="login";
		tcdesc="login succes";
		author="kiki";
		category="smoke";
		
	}
	
@Test(dataProvider="fetchexceldata")
	
	
	public void login(String username,String password)
	{
	// invokeApp("chrome", "http://leaftaps.com/opentaps");
		new LoginPage(driver,test)
		.typeUsername(username)
		.typePassword(password)
		.clickLogin();
		
	}		
	}




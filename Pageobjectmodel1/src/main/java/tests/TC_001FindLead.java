package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.CreateLead;
import pages.HomePage;
import pages.LoginPage;
import pages.MyHomePage;
import pages.MyLeads;
import wrappers.LeafTapWrappers;

public class TC_001FindLead extends LeafTapWrappers {
	@BeforeClass
	public void beforeclass()
	{

		excelname="TC_001";
		Testcasename="login";
		tcdesc="login succes";
		author="kiki";
		category="smoke";
		
	}
@Test(dataProvider="fetchexceldata")
	
	public void FindBy(String username,String password,String firstname,String lastname)
	{
		LoginPage lp=new LoginPage(driver,test);
		lp.typeUsername(username)
		.typePassword(password)
		.clickLogin()
		. clickcrmsfa()
		.clickLead()
		.clickfindlead()
		.enterfirstname(firstname)
		.enterlastname(lastname)
		.clickfindleadbutton();
		
	} 
		

	
}

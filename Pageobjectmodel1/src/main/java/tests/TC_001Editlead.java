package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.CreateLead;
import pages.HomePage;
import pages.LoginPage;
import pages.MyHomePage;
import pages.MyLeads;
import wrappers.LeafTapWrappers;

public class TC_001Editlead extends LeafTapWrappers {
	@BeforeClass
	public void beforeclass()
	{

		
		Testcasename="login";
		tcdesc="login succes";
		author="kiki";
		category="smoke";
		
	}
@Test(dataProvider="fetchexceldata")
	
	public void toEditLead(String username,String password,String companyname,String firstname,String lastname,String updtcompanyname)
			
	{
		LoginPage lp=new LoginPage(driver,test);
		lp.typeUsername(username)
		.typePassword(password)
		.clickLogin()
		. clickcrmsfa()
		.clickLead()
		.clickfindlead()
		.enterfirstname(firstname)
		.clickfindleadbutton()
		.clickfirstlinkname()
		.clickeditbutton()

	.updatename(updtcompanyname)
	. clickupdate();
		
		
		
	} 
		

	
}

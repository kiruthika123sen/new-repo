package pages;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapWrappers;

public class FindBy extends LeafTapWrappers {

	public FindBy(RemoteWebDriver driver,ExtentTest test)
	{
		this.driver=driver;
		this.test=test;
		 if(!verifyTitle("Find Leads | opentaps CRM"))
		 {
				logSteps("PASS","this is a login");
				
		 }
	

	}

	public FindBy clickphone()
	{
		clickByXpath("(//span[@class='x-tab-strip-text '])[2]");
		return this;
	}
	public FindBy enterareacode()
	{
		enterByXpath("//input[@name='phoneAreaCode']","91");
		return this;
	}
	public FindBy enterphoneno()
	{
		enterByXpath("//input[@name='phoneNumber']","98676546");
		return this;
	}
public FindBy clickemailbutton()
{
	clickByXpath("(//span[@class='x-tab-strip-text '])[3]");
	return this;
	
}
	public ViewLeadPage clickfirstlink()
	{
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		return new ViewLeadPage(driver,test);
	}
	public FindBy enterfirstname(String firstname)
	{
		enterByXpath("(//input[@name='firstName'])[3]",firstname);
		return this;
	}
	
	public FindBy enterlastname(String lastname)
	{
		enterByXpath("(//input[@name='lastName'])[3]",lastname);
		return this;
	}

	public FindBy clickfindleadbutton()
	{
		clickByXpath("//button[text()='Find Leads']");
		return this;
	}
	
 public ViewLeadPage clickfirstlinkname()
 {
	 clickByLink("sasvihaa11");
		return new ViewLeadPage(driver,test);
 }


	}



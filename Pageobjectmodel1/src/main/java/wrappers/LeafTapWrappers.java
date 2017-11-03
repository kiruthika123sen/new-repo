package wrappers;


import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import utils.DataInputProvider;

public class LeafTapWrappers extends GenericWrappers {
	public String Testcasename;
	public String tcdesc;
	public String author;
	public String category;
	public String username;
	public String password;
	public String companyname;
	public String firstname;
	public String lastname;
	public String excelname;

	
	@BeforeSuite
	public void Beforesuite()
	{
		createReport();
	}


	@Parameters
	@BeforeMethod

	public void Login()
	{

		createTestReport(Testcasename,tcdesc,author,category);
		invokeApp("chrome", "http://leaftaps.com/opentaps");


	}
	@AfterMethod
	public void Close()
	{
		closeBrowser();
		closeTestReports();
	}
	@AfterSuite
	public void afterSuite()
	{
		saveReport();
	}

	@DataProvider(name="fetchexceldata")


	public Object[][] getCreateLeadData() throws InvalidFormatException, IOException
	{


		DataInputProvider re=new  DataInputProvider();
		Object[][] data= re.readExcel(excelname);
		return data;

	}
	
	

}


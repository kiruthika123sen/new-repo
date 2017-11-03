package utils;

import java.io.File;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Reporter {
	public static ExtentReports report;
	public static ExtentTest test;
	public void createReport()
	{
	    report=new ExtentReports("./report/result.html",false);
		report.loadConfig(new File("./extent.xml"));
	}
	public void createTestReport(String Testcasename,String tcdesc,String author,String category)
	{
	    test=report.startTest(Testcasename,tcdesc);
		test.assignAuthor(author);
		test.assignCategory(category);
	}
	public void logSteps(String status,String desc)
	{
		if(status.equalsIgnoreCase("pass"))
		{
		test.log(LogStatus.PASS,desc );
		}
		else 
		{
		test.log(LogStatus.FAIL, desc);
		}
	
	}
	public void closeTestReports()
	{
		report.endTest(test);
	}
	public void saveReport()
	{
		report.flush();
	}

}

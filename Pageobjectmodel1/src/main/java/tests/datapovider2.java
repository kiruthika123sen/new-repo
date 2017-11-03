package tests;	

import java.io.IOException;


import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils.DataInputProvider;
import wrappers.LeafTapWrappers;


		public class datapovider2 extends LeafTapWrappers
		{
			

@BeforeClass

public void beforeclass()
{
	Testcasename="login";
	tcdesc="loggged in successfully";
	author="kiki";
	category="smoke";
}

		
				
			@Test(dataProvider="fetchexceldata")
				public void createlead(String username,String password,String companyName,String firstname,String lastname)
			{
					
					
				//login();
			   //  invokeApp("chrome", "http://leaftaps.com/opentaps");
			        enterById("username", username);
					
					//Enter the Password
					enterById("password", password);

					//Click on Login Button
					clickByClassName("decorativeSubmit");
					clickByLink("CRM/SFA");
					clickByLink("Create Lead");
				    enterById("createLeadForm_companyName",companyName);
					enterById("createLeadForm_firstName",firstname);
					enterById("createLeadForm_lastName",lastname);

	}

	@DataProvider(name="fetchexceldata")
			
			
			public Object[][] getCreateLeadData() throws InvalidFormatException, IOException
			{
			
				      
				 DataInputProvider re=new  DataInputProvider();
				     Object[][] data= re.readExcel(excelname);
				    // re.
			
			
				return data;
				
			}
			}
		
			
		

	




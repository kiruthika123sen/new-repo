package wait;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class FindLeads {
	
	

	public static void main(String[] args) throws InterruptedException {	
			
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		
		
		
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("n");
		driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
		
		WebDriverWait wait=new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")));
		
		
		List<WebElement> table=driver.findElements(By.xpath("//table[@class='x-grid3-row-table']"));
		System.out.println(table.size());
		List<WebElement> rows=table.get(0).findElements(By.tagName("tr"));
		System.out.println(rows.size());
		List<WebElement> cols=table.get(0).findElements(By.tagName("td"));
		System.out.println(cols.size());
		


	//	driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();		
	}
}

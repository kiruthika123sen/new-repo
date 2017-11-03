package homewrk;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.format.DateTimeFormatter;
/*public class weatherreport {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();	
		driver.get("http://leaftaps.com:3000/");
		WebElement lastCellInFirstRow = driver.findElement(By.xpath("table[@class='hour']//tr[1]//td[last()]"));
		WebElement lastCellInLastRow = driver.findElement(By.xpath("table[@class='dataTable']//tr[last()]//td[last()]"));

		driver.findElementByClassName("name").click();

Object d1;
Object d2;
long diffMs = d1.getTime() - d2.getTime();
long diffSec = diffMs / 1000;
long min = diffSec / 60;
long sec = diffSec % 60;
System.out.println("The difference is "+min+" minutes and "+sec+" seconds.");
	}

}*/
import java.util.Calendar;
import java.util.Date;
 
public class weatherreport
{
    public static void main(String[] args)
    {
    	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();	
		driver.get("http://leaftaps.com:3000/");
		driver.findElementByXPath("//span[text()='Sat']").click();
		WebElement time1 = driver.findElementByXPath("//span[text()='0230']");
		WebElement time2 = driver.findElementByXPath("//span[text()='0530']");
		
		//if(driver.findElementByXPath("//span[text()='0230']")>=driver.findElementByXPath("//span[text()='0530']"))
		
		System.out.println(time1);
		System.out.println(time2);
		/*int difference=Integer.parseInt()-Integer.parseInt(time1);
		System.out.println("difference is"+difference);
		*/
		//int src1=Integer.parseInt(time1);
	  
		//int src2=Integer.parseInt(time2);
		
		/*if(src1>=src2)
		{
			int difference = src1-src2;
		}
		
		else
		{
			int difference=src2-src1;
		}
*/
		
		/*
        //Date1
        Calendar cal1 = Calendar.getInstance();
        cal1.set(1995, 04, 3, 5, 0, 0);
        Date date1 = cal1.getTime();
 
        //Date2
        Calendar cal2 = Calendar.getInstance();
        cal2.set(2011, 07, 4, 6, 1, 1);
        Date date2 = cal2.getTime();
 
 
        //Time Difference Calculations Begin
        long milliSec1 = date1.getTime();
        long milliSec2 = date2.getTime();
 
        long timeDifInMilliSec;
        if(milliSec1 >= milliSec2)
        {
            timeDifInMilliSec = milliSec1 - milliSec2;
        }
        else
        {
            timeDifInMilliSec = milliSec2 - milliSec1;
        }
 
        long timeDifSeconds = timeDifInMilliSec / 1000;
        long timeDifMinutes = timeDifInMilliSec / (60 * 1000);
        long timeDifHours = timeDifInMilliSec / (60 * 60 * 1000);
        long timeDifDays = timeDifInMilliSec / (24 * 60 * 60 * 1000);
 
        System.out.println("Time differences expressed in various units are given below");
        System.out.println(timeDifInMilliSec + " Milliseconds");
        System.out.println(timeDifSeconds + " Seconds");
        System.out.println(timeDifMinutes + " Minutes");
        System.out.println(timeDifHours + " Hours");
        System.out.println(timeDifDays + " Days");*/
    }
}

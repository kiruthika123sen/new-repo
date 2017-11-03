
package wait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Table {

	@Test
	public void frame(String value) throws InterruptedException, MalformedURLException {
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("MicrosoftEdge");
		dc.setPlatform(Platform.WINDOWS);
		

		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();	
		
		/*RemoteWebDriver driver = new RemoteWebDriver(
				new URL("http://192.168.1.56:4444/wd/hub"), dc);*/
		
		//Load the URL
		//driver.get("http://jqueryui.com/draggable/");
		driver.get("http://jqueryui.com/datepicker/");
		
		WebElement demo = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(demo);
		
       /*WebElement drag=driver.findElementByXPath("//*[@id='draggable']");
		Actions builder=new Actions(driver);
		builder.dragAndDropBy(drag, 100, 100).build().perform();
		*/
		
		
		WebElement dragdate=driver.findElementByXPath("//*[@id='datepicker']");

		Actions builder1=new Actions(driver);
		builder1.click(dragdate).sendKeys("10/31/2017").build().perform();
	
	


		
		// come out frame
		driver.switchTo().defaultContent();
		
	
		
		
		
	}
}

package wrappers;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;



import org.apache.commons.io.FileUtils;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import utils.Reporter;


public class GenericWrappers extends Reporter implements Wrappers{

	public RemoteWebDriver driver;
	int i = 1;

	public void invokeApp(String browser, String url) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		logSteps("pass","The browser "+browser+" launched successfully");
		System.out.println("The browser "+browser+" launched successfully");
		takeSnap();

	}

	public void enterById(String idValue, String data) {
		
		try {
			WebElement eleId = driver.findElementById(idValue);
			eleId.clear();
			eleId.sendKeys(data);
			logSteps("pass","The text field with id " + idValue + " entered with data " + data + " successfully");
			System.out.println("The text field with id " + idValue + " entered with data " + data + " successfully.");
			takeSnap();
		} catch (NoSuchElementException e) {
			logSteps("fail","The text field with id " + idValue + " entered with data " + data + " successfully");
			System.err.println("The text field with id " + idValue + " entered with data " + data + " successfully");
		}


	}

	public void enterByName(String nameValue, String data) {
		try {
			driver.findElementByName(nameValue).sendKeys(data);
			System.out.println("The text field with name" + nameValue + "entered with data   " + data + "");
			takeSnap();
		} catch (NoSuchElementException e) {
			System.err.println("The text field with name " + nameValue + " entered with data " + data + " is not found");
		}

	}

	public void enterByXpath(String xpathValue, String data) {
	
		try {
			driver.findElementByXPath(xpathValue).sendKeys(data);
			System.out.println("The text field with name" + xpathValue + "entered with data" + data + "");
			takeSnap();
		} 
		catch (NoSuchElementException e) 
		{
			System.err.println("The text field with name " + xpathValue + " entered with data " + data + " is not found");
		}


	}

	public boolean verifyTitle(String title) {
		String src=driver.getTitle();
		logSteps("pass",src);
		System.out.println(src);
		if(src.equalsIgnoreCase(title))
		{
			logSteps("pass","title exists");
			System.out.println("title exists");
		}
		return false;
	}
	public boolean verifyTextById(String id, String text) {
		// TODO Auto-generated method stub
		return false;
	}

	public void verifyTextByXpath(String xpath, String text) {
		// TODO Auto-generated method stub

	}

	public void verifyTextContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub

	}
	public void clickById(String id) {
		try {
			driver.findElementById(id).click();
			System.out.println("The button with class " + id + " is clicked");
			takeSnap();
		} catch (Exception e) {
			System.err.println("exception found for id");
		}
	}

	public void clickByClassName(String classVal) {
		try {
			driver.findElementByClassName(classVal).click();
			logSteps("pass","The button with class " + classVal + " is clicked");
			System.out.println("The button with class " + classVal + " is clicked");
			takeSnap();
		} catch (Exception e) {
			logSteps("fail","exception found for classname");
			System.err.println("exception found for classname");
		}
	}

	public void clickByName(String name) {
		try {
			driver.findElementByName(name).click();
			System.out.println("the create lead" + name + "is clicked");
		} catch (Exception e) {
			System.err.println("exception found for clickbyname");
		}
		

	}

	public void clickByLink(String name) {
		try 
		{
			driver.findElementByLinkText(name).click();
			System.out.println("the link text is" + name + "is clicked");
			takeSnap();
		} 
		catch (Exception e)
		{
			System.err.println("exception found for clickbyLink");
		
		}



	}

	public void clickByLinkNoSnap(String name) {
		// TODO Auto-generated method stub

	}

	public void clickByXpath(String xpathVal) {
		try
		{
			driver.findElementByXPath(xpathVal).click();
			System.out.println("The button with xpath " + xpathVal + " is clicked");
			takeSnap();
			
		} 
		catch (Exception e) 
		{
			System.err.println("exception found for clickbyxpath");
		}
	}

	public void clickByXpathNoSnap(String xpathVal) {
		// TODO Auto-generated method stub

	}

	public String getTextById(String idVal) {
	try {
		driver.findElementById(idVal).getText();
		System.out.println("the text for id" + idVal + "is");
	
	} catch (Exception e) {
		System.err.println("exception found for getTextbyid");
	
	}
	return idVal;
	}

	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		return null;
	}

	public void selectVisibileTextById(String id, String value) {
		try {
			WebElement src = driver.findElementById(id);
			Select dropDown = new Select(src);
			dropDown.selectByVisibleText(value);
			System.out.println("the options" + id + " selected is" + value + "");
			takeSnap();
		} catch (Exception e) {
			
			System.err.println("exception found for selectVisibleTextbyid");
			
		}

	}

	public void selectIndexById(String id, int value) {
		// TODO Auto-generated method stub

	}

	public void switchToParentWindow() {
		try {
			Set<String> allWindows = driver.getWindowHandles();
			System.out.println(allWindows.size());
			System.out.println("***************");
			for (String eachWindow : allWindows) {
				System.out.println(eachWindow);
				// lets move to window
				driver.switchTo().window(eachWindow);
				break;
			} 
		} catch (Exception e) {
			System.err.println("exception found for switchToParentWindow");
		}

	}

	public void switchToLastWindow() {
		
			Set<String> allWindows = driver.getWindowHandles();
			System.out.println(allWindows.size());
			System.out.println("***************");
			for (String eachWindow : allWindows) {
				System.out.println(eachWindow);
				// lets move to window
				driver.switchTo().window(eachWindow);
			 
		} 
	
		}
		

	

	public void acceptAlert()
	{
driver.switchTo().alert().accept();
System.out.println("alert is accepted");

	}

	public void dismissAlert() {
		driver.switchTo().alert().dismiss();
		System.out.println("alert is dismissed");

	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		return null;
	}

	public void takeSnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./snaps/snap"+i+".jpg");
		i++;
		try {
			FileUtils.copyFile(src, destFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void closeBrowser() {
	driver.close();
	logSteps("pass","browser closed successfully");
	System.out.println("browser closed successfully");
	}

	public void closeAllBrowsers() {
		driver.quit();
		logSteps("pass","all browser closed successfully");
		System.out.println("all browsers are closed successfully");

	}


		
	

	

}

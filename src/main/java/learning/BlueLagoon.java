package learning;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class BlueLagoon {
	@Test
	public void blueLag () {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//System.setProperty("webDriver.chrome.driver","./drivers/chromedriver.exe");
		//to launch chrome
		ChromeDriver driver = new ChromeDriver();
		//to maximise and minimise
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//to load url
		driver.get(" https://acme-test.uipath.com/account/login");
		//enter username
		driver.findElementByXPath("//input[@id='email']").sendKeys("kumar.testleaf@gmail.com",Keys.TAB);
		driver.findElementByXPath("//input[@id='password']").sendKeys("leaf@12");
		driver.findElementByXPath("//button[text()='Log In']").click();
		driver.findElementByXPath("//i[@class='fa fa-truck']/parent::button").click();
		driver.findElementByXPath("//a[text()='Search for Vendor']").click();
		driver.findElementByXPath("//input[@id='vendorName']").sendKeys("Blue Lagoon");
		driver.findElementByXPath("//button[text()='Search']").click();
		//table
		WebElement table = driver.findElementByXPath("//table[@class='table']");
		List<WebElement> allRows = table.findElements(By.tagName("tr"));
		
			WebElement secondRow = allRows.get(1);
			List<WebElement> allCols = secondRow.findElements(By.tagName("td"));
			//System.out.println(allCols.size());
			String text = allCols.get(4).getText();
			System.out.println(text);
			driver.findElementByLinkText("Log Out");
			driver.close();
			
		
		
		
		
		
		
		
	}

}

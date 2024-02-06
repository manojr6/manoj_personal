package tdAssessment;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class amazonApp 

{

	WebDriver driver;
	baseClass base = new baseClass();
	amazonImplementation amazonImplementation = new amazonImplementation();


	@BeforeTest
	public void beforeTest() throws IOException {



		FileInputStream stream= new FileInputStream("config.properties"); 
		Properties properties= new Properties(); 
		properties.load(stream); 
		String browser=properties.getProperty("browser"); 
		String driverLocation=properties.getProperty("DriverLocation");


		if(browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",driverLocation); 
			driver = new ChromeDriver(); 
			//driver.manage().window().maximize(); 
			String url=properties.getProperty("url"); 
			driver.get(url); 
			}


	}




	@Test

	public void Test() throws IOException {

		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		base.impliciWait(driver, 15, TimeUnit.SECONDS);
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("")));
		
		


		PageFactory.initElements(driver, amazonPageObjects.class);



		amazonImplementation.setText(amazonPageObjects.searchBox, "fossil bq2365");

		amazonImplementation.click(amazonPageObjects.searchButton);
		String currentTab = amazonImplementation.getSingleWindow(driver);

		amazonImplementation.click(amazonPageObjects.Item);

		Set<String> allTabs = amazonImplementation.getMultipleWindows(driver);
		for (String newTab : allTabs) {
			if (newTab != currentTab) {
				driver.switchTo().window(newTab);
			}
		}

		amazonImplementation.click(amazonPageObjects.addButton);
		String cartCount = amazonImplementation.getText(amazonPageObjects.cartCountButton);
		Assert.assertEquals(cartCount, "1");
		System.out.println("item added successfully");
		base.takeScreenShot(driver, "./target/itemAdded.png");
		/*
		 * TakesScreenshot ss=(TakesScreenshot) driver; File
		 * sourceFile=ss.getScreenshotAs(OutputType.FILE); File destFile= new
		 * File("./target/itemAdded.png"); FileHandler.copy(sourceFile, destFile);
		 */
		amazonImplementation.click(amazonPageObjects.gotoCartButton);
		amazonImplementation.click(amazonPageObjects.deleteButton);

		String cartCount1 = amazonImplementation.getText(amazonPageObjects.cartCountButton);

		Assert.assertEquals(cartCount1, "0");
		System.out.println("item removed successfully");

		base.takeScreenShot(driver, "./target/itemRemoved.png");
		base.extentReport();

		/*
		 * TakesScreenshot ss1=(TakesScreenshot) driver; File
		 * sourceFile1=ss1.getScreenshotAs(OutputType.FILE); File destFile1= new
		 * File("./target/itemRemoved.png"); FileHandler.copy(sourceFile1, destFile1);
		 */

	}

	@AfterTest
	public void afterTest() {
		base.tearDown(driver);
		//driver.quit();
	}
}

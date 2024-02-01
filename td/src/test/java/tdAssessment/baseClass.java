package tdAssessment;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;



public class baseClass
{




	/*
	 * public static WebDriver driver; public static Properties properties=new
	 * Properties(); public static String fileReader;
	 * 
	 * public void setUp() throws IOException { if (driver==null) { FileReader
	 * fileReader=new FileReader("./target/chromedriver.exe");
	 * properties.load(fileReader); }
	 * 
	 * if (properties.getProperty("browser").equalsIgnoreCase("chrome")) {
	 * System.getProperty("webdriver.chrome.driver",fileReader); driver=new
	 * ChromeDriver(); // driver.manage().window().maximize(); String
	 * url=properties.getProperty("url"); driver.get(url); } }
	 */

	
	/*
	 * public void setUp(WebDriver driver) throws IOException {
	 * //System.setProperty("webdriver.http.factory", "jdk-http-client");
	 * FileInputStream stream= new FileInputStream("config.properties"); Properties
	 * properties= new Properties(); properties.load(stream); String
	 * browser=properties.getProperty("browser"); String
	 * driverLocation=properties.getProperty("DriverLocation");
	 * 
	 * 
	 * if(browser.equalsIgnoreCase("Chrome")) {
	 * System.setProperty("webdriver.chrome.driver",driverLocation); driver=new
	 * ChromeDriver(); // driver.manage().window().maximize(); String
	 * url=properties.getProperty("url"); driver.get(url);
	 * 
	 * }
	 * 
	 * }
	 */
	 
	 public void extentReport() {
		ExtentSparkReporter extentSparkReporter  = new ExtentSparkReporter("./testExtentReport.html");
		ExtentReports extentReports = new ExtentReports();
		extentReports.attachReporter(extentSparkReporter);
		
		ExtentTest extentTest = extentReports.createTest("TC-001 -- Amazon App");
		extentTest.pass("Product added");
		extentTest.pass("Product removed");
		extentReports.flush();
		
	}



	public  void impliciWait(WebDriver driver,int timeValue, TimeUnit timeUnit) throws IOException {



		driver.manage().timeouts().implicitlyWait(timeValue, timeUnit); 
		}


	public  void takeScreenShot(WebDriver driver,String destFileLoc) throws IOException {

		TakesScreenshot ss=(TakesScreenshot) driver;
		File sourceFile=ss.getScreenshotAs(OutputType.FILE);
		File destFile= new File(destFileLoc);
		FileHandler.copy(sourceFile, destFile);
		
		
	}
	
	
	  public void tearDown(WebDriver driver) 
	  { 
		  driver.quit(); 
		  }
	 

}

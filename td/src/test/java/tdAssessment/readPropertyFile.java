package tdAssessment;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class readPropertyFile {

	public void  readProperty(WebDriver driver) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream stream= new FileInputStream("config.properties"); 
		Properties properties= new Properties(); 
		properties.load(stream); 
	String browser=	properties.getProperty("browser"); 
	String driverLocation	=properties.getProperty("DriverLocation");
	
		if(browser.equalsIgnoreCase("Chrome")) {
			 System.setProperty("webdriver.chrome.driver",driverLocation); 
			 driver=new ChromeDriver(); 
			 // driver.manage().window().maximize(); 
			 String url=properties.getProperty("url"); 
			 driver.get(url);



	}

}
}

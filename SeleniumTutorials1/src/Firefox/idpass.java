package Firefox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Firefox {

	public static void main(String[] args)  
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\user\\Downloads\\Selenium\\Firefox driver\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		WebDriver d1 = new FirefoxDriver();
		
		d1.get("http://www.google.com");
	   d1.findElement(By.linktext("gmail")).click();
	    
		
			}

	}


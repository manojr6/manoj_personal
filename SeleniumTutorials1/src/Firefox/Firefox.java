package Firefox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Firefox {

	public static void main(String[] args)  
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\user\\Downloads\\Selenium\\Firefox driver\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		WebDriver d1 = new FirefoxDriver();
		
		d1.get("https://ess.kagamierp.com/KagamiAuthService/auth/loginPage#?continue=http:%2F%2Fess.kagamierp.com%2Fkagami-generated_HRMS_GROUP%2Fapi%2Fauth%2Fredirect");
		d1.findElement(By.name("username")).sendKeys("joseph.t");
		d1.findElement(By.name("password")).sendKeys("joseph.t");
		d1.findElement(By.id("login();")).click();


		 
		
	    	}

	}


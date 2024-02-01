package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;



public class SeleniumTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ess.kagamierp.com/KagamiAuthService/auth/loginPage#?continue=http:%2F%2Fess.kagamierp.com%2Fkagami-generated_HRMS_GROUP%2Fapi%2Fauth%2Fredirect");
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("KGMIN017");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("test@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//*[@ng-bind='item.name']")).click();
		driver.findElement(By.xpath("//*[@id=\"menu\"]/section/div[2]/ul/li[5]/ul/li/a/span[contains(text(),'Time & Attendance')]")).click();
				
	}

}

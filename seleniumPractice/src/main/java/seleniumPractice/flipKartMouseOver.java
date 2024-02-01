package seleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipKartMouseOver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium chromedriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		//Thread.sleep(20000);
	
		//WebElement closeButton = driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
		//closeButton.click();
		
		
		
		
		WebElement electronicsButton= driver.findElement(By.xpath("//div[contains(text(),'Electronics')]"));
		
		//*[@id=\"container\"]/div/div[2]/div/div/div[4]/a/div[2]/div/div
		
		  //div[contains(text(),'Electronics')] 
		Actions actions=new Actions(driver);
		  actions.moveToElement(electronicsButton).build().perform();
		  actions.click(electronicsButton); 
		 // WebElement audioButton = driver.findElement(By.xpath("//span[contains(text(),'more in Audio')]"));
		 // WebElement soundBarButton = driver.findElement(By.xpath("//span[contains(text(),'more in Audio')]/following::a[6]"));
		 // actions.moveToElement(audioButton).build().perform();
		 // actions.moveToElement(soundBarButton).build().perform();
		  //actions.click(audioButton); 
		 // soundBarButton.click();
		 	}

}

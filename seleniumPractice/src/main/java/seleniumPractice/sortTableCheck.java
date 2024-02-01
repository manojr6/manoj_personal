package seleniumPractice;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sortTableCheck {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","E:\\Selenium chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/howto/howto_js_sort_table.asp");
		Thread.sleep(10000);
		//driver.findElement(By.xpath("//*[@id=\"main\"]/button")).click();

		List<WebElement> values=	driver.findElements(By.xpath("//*[@id=\"myTable\"]/tbody/tr/td[1]"));
		int length=values.size();
		//System.out.println("no.of values:"+ length);

		String str[]= new String[length];
     
		for (int i = 0; i < length; i++) {
			str[i]=values.get(i).getText();
		}
		boolean sorted=true;
		   outer:
		for (int i = 0; i < length;i++) {
			for (int j = i+1; j < length;j++) {
				int result=str[j].compareTo(str[i]);
				if (result<0) {
					//System.out.println("not sorted");
					sorted=false;
					break outer;
				} else 
				{
					
				}
			}
			

		}
		  // System.out.println("sorted");


if (sorted==true) {
	System.out.println("sorted functionality is fine");
} else {
	System.out.println("soretd functionality is not fine");
}

Thread.sleep(5000);
driver.quit();
	}
	
}

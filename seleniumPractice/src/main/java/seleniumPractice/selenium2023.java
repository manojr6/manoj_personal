package seleniumPractice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selenium2023 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium chromedriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(5000);
		driver.get("https://www.leafground.com/select.xhtml;jsessionid=node0147zv9i21wdw61g1dtmq2xt9qd341831.node0");
		Thread.sleep(5000);
		
		Select select=new Select(driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[1]/div[1]/div/div/select")));
		List<WebElement> options= select.getOptions();
		int length=options.size();
		System.out.println("poda"+ options.get(2).getText());
		
		select.selectByIndex(3);
		
		for (WebElement webElement : options) {
			System.out.println(webElement.getText());
		}
		
		Map<Integer, String> hmap = new HashMap<Integer, String>();
		for (int i = 0; i < length; i++) {
		if (!(hmap.containsValue(options.get(i).getText()))) {
			hmap.put(i, options.get(i).getText());
		}
		
			
		}
			System.out.println("map options are:" +hmap);
		
	}

}

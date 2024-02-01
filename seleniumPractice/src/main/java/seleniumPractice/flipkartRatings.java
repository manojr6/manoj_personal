package seleniumPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.MoveMouseAction;
import org.openqa.selenium.support.ui.WebDriverWait;

public class flipkartRatings {

	// private static WebElement[] allMobiles;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium chromedriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.flipkart.com/search?q=mobile&sid=tyy%2C4io&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_1_3_na_na_na&otracker1=AS_QueryStore_OrganicAutoSuggest_1_3_na_na_na&as-pos=1&as-type=RECENT&suggestionId=mobile%7CMobiles&requestId=7d259442-2633-4eb1-9843-d09bbfdcce69&as-searchtext=mob");
		WebElement filterButton = driver
				.findElement(By.xpath("//div[contains(text(),'4★ & above')]/preceding-sibling::div"));

		WebElement nextButton = driver.findElement(By.xpath("//a/span[contains(text(),'Next')]"));
		filterButton.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		for (int i = 0; i <= 8; i++) {
			List<WebElement> ratings = driver.findElements(By.xpath("//img[@loading='eager']//following::div[8]"));

			try {

				for (WebElement webElement : ratings) {
					/*
					 * List<WebElement> allMobiles= new ArrayList<WebElement>();
					 * allMobiles.addAll(ratings);
					 */

					{

						System.out.println(webElement.getText());
					}

					/*
					 * WebElement nextButton=
					 * driver.findElement(By.xpath("//a/span[contains(text(),'Next')]"));
					 * 
					 * Actions action= new Actions(driver); action.moveToElement(nextButton);
					 * 
					 * nextButton.click();
					 */

				}
			} catch (Exception StaleElementReferenceException) {
				// TODO: handle exception

			}
			// driver.quit();

		}

	}
}

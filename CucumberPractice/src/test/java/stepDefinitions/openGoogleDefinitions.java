package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class openGoogleDefinitions {
	
	WebDriver driver;

@Given("that I have gone to the Google page")
public void thatIHaveGoneToTheGooglePage() {
	System.setProperty("webdriver.chrome.driver","E:\\Selenium chromedriver\\chromedriver.exe");
  driver= new ChromeDriver();
  
  driver.get("https://www.google.com/");
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
}  
@When("I add {string} to the search box")
public void iAddToTheSearchBox(String string) {
    driver.findElement(By.name("q")).sendKeys(string);
}
@When("click the Search Button")
public void clickTheSearchButton() {
   driver.findElement(By.name("btnK")).click();
}
@Then("{string} should be mentioned in the results")
public void shouldBeMentionedInTheResults(String string) {
   driver.findElement(By.partialLinkText(string)).isDisplayed();
   driver.quit();
}

}

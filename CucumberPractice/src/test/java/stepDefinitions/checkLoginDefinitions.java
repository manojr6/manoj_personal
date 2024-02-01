package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class checkLoginDefinitions {

	WebDriver driver;

	@Given("that I have gone to the OPENHRM page")
	public void thatIHaveGoneToTheOPENHRMPage() {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium chromedriver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


	}
	@When("I give username as {string}")
	public void iGiveUsernameAs(String string) {
		driver.findElement(By.name("username")).sendKeys(string);

	}
	@When("I give password as {string}")
	public void iGivePasswordAs(String string) {
		driver.findElement(By.name("password")).sendKeys(string);

	}
	@When("click the Submit Button")
	public void clickTheSubmitButton() {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

	}


	@Then("login should happen and {string} should get fecthed correctly in the page")
	public void loginShouldHappenAndShouldGetFecthedCorrectlyInThePage(String expectedURL) {
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(expectedURL,actualUrl);
		driver.quit();
	}
}




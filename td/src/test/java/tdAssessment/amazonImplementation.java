package tdAssessment;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class amazonImplementation implements amazonInterface  {
	public void setText(WebElement element, String text) {
		// TODO Auto-generated method stub
		element.sendKeys(text);
	}

	public void click(WebElement element) {
		// TODO Auto-generated method stub
		element.click();
	}



	public String getText(WebElement element) {
		// TODO Auto-generated method stub
		return element.getText();
	}
	public String getSingleWindow(WebDriver driver) {
		// TODO Auto-generated method stub
		return driver.getWindowHandle();
	}

	public Set<String> getMultipleWindows(WebDriver driver) {
		// TODO Auto-generated method stub
		return driver.getWindowHandles();
	}

}

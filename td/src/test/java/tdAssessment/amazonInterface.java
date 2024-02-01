package tdAssessment;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface amazonInterface {

	public void setText(WebElement element,String text);
	public void click(WebElement element);
	public String getText(WebElement element);
	public String getSingleWindow(WebDriver driver);
	public Set<String> getMultipleWindows(WebDriver driver);

}

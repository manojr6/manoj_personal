package tdAssessment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class amazonPageObjects {
	@FindBy(id="twotabsearchtextbox")	
	public static WebElement searchBox;

	@FindBy(id="nav-search-submit-button")	
	public static WebElement searchButton;

	@FindBy(partialLinkText="BQ2365")	
	public static WebElement Item;
	
	@FindBy(id ="add-to-cart-button")	
	public static WebElement addButton;
	
	@FindBy(id ="nav-cart-count")	
	public static WebElement cartCountButton;
	
	@FindBy(xpath ="//span[@id='sw-gtc']//a")	    //*[@id=\"sw-gtc\"]/span/a
	public static WebElement gotoCartButton;
	
	@FindBy(xpath ="//input[@value='Delete']") //input[@value='Delete']	 //*/div[4]/div/div[2]/div[1]/span[2]/span/input        //span[@class='a-button-inner'])[6]//following::span[@data-action='delete']    
	public static WebElement deleteButton;

}

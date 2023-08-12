package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class EbayHomePageLocators {

	// Search text Box
	@FindBy(xpath="//input[@placeholder='Search for anything']")
	public WebElement txtbxSearch;
	
	//search Button 
	@FindBy (xpath="//*[@id='gh-btn']")
	public WebElement btnSearch;
// ami sakir er baap
}

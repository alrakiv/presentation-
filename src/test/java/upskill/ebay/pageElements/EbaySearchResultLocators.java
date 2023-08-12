package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbaySearchResultLocators {
	
	   //Validate Shoe Item 
		@FindBy (xpath="//span[contains(text(), 'shoes')]")
		public WebElement txtShoes;

	
}

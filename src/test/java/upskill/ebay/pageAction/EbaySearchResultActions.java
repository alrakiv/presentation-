package upskill.ebay.pageAction;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import upskill.ebay.pageElements.EbayHomePageLocators;
import upskill.ebay.pageElements.EbaySearchResultLocators;
import upskill.utilities.SetupDrivers;

public class EbaySearchResultActions {
	
	EbaySearchResultLocators EbaySearchResultLocatorsobj;
	
	public EbaySearchResultActions() {
		 
		EbaySearchResultLocatorsobj = new EbaySearchResultLocators();
		 
		 PageFactory.initElements(SetupDrivers.driver,EbaySearchResultLocatorsobj);
	 }
	public void verifyShoesItems() {
		
		// option 1
		Assert.assertTrue(EbaySearchResultLocatorsobj.txtShoes.isDisplayed());
		
		// option 2
		
		Assert.assertEquals("Shoes", EbaySearchResultLocatorsobj.txtShoes.getText());
		 
		//option 3
		
		 EbaySearchResultLocatorsobj.txtShoes.isDisplayed();
		
		
	  }
	
	}




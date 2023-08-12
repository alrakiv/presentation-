package upskill.ebay.pageAction;
import org.openqa.selenium.support.PageFactory;

import upskill.ebay.pageElements.EbayHomePageLocators;
import upskill.utilities.SetupDrivers;

public class EbayHomepageActions {
	
	EbayHomePageLocators EbayHomePageLocatorsobj;
	
	
 public EbayHomepageActions() {
	 
	 EbayHomePageLocatorsobj = new EbayHomePageLocators();
	 
	 PageFactory.initElements(SetupDrivers.driver,EbayHomePageLocatorsobj);
 }
 
 public void searchShoes() {
	 
	 EbayHomePageLocatorsobj.txtbxSearch.sendKeys("shoes");
	 
	 EbayHomePageLocatorsobj.btnSearch.click();
 
   }
 }

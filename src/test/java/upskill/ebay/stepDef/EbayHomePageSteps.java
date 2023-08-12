package upskill.ebay.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.EbayHomepageActions;
import upskill.ebay.pageAction.EbaySearchResultActions;

public class EbayHomePageSteps {
	
	EbayHomepageActions EbayHomepageActionsobj = new EbayHomepageActions();
	
	@Given("^Open Ebay Homepage$")
	public void open_Ebay_Homepage() throws Throwable {
		Thread.sleep(2000);
	    	}

	@When("^Search for shoes$")
	public void search_for_shoes() throws Throwable {
	    
		EbayHomepageActionsobj.searchShoes();
		Thread.sleep(2000);
	}
	

}

package pages;


import org.junit.Assert;

import net.serenitybdd.core.pages.PageObject;


public class Dashboard_BC extends PageObject{
	
	public void verify_Dashboard_page_is_displayed() {

		String current_Url = getDriver().getCurrentUrl();
		Assert.assertTrue(current_Url.contains("dashboard"));
	}

}

package tests;



import org.apache.log4j.Logger;

import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import steps.Dashboard_Steps;
import utility.LoggerHelper;

public class Dashboard_SD {
	
	Logger log = LoggerHelper.getLogger(Dashboard_SD.class);
	
	
	@Steps
	Dashboard_Steps dashboard_Steps;
	
	@Then("Verify Dashboard page is displayed")
	public void verify_Dashboard_page_is_displayed() {
		dashboard_Steps.verify_Dashboard_page_is_displayed();
		log.info("verify_Dashboard_page_is_displayed");
	}

}

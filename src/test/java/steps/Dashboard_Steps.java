package steps;

import net.thucydides.core.annotations.Step;
import pages.Dashboard_BC;

public class Dashboard_Steps {
	
	Dashboard_BC dashboard_Page;
	
	@Step("Verify Dashboard page is displayed")
    public void verify_Dashboard_page_is_displayed() {
		dashboard_Page.verify_Dashboard_page_is_displayed();
    }

}

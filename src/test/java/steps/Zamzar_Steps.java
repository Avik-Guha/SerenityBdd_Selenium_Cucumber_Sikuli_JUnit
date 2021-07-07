package steps;


import org.sikuli.script.FindFailed;

import net.thucydides.core.annotations.Step;
import pages.Zamzar_BC;

public class Zamzar_Steps {
	
	Zamzar_BC zamzar_Page;
	
	
	@Step("Click on Add Files button and then add a file")
    public void click_on_Add_Files_button_and_then_add_a_file() throws FindFailed {
		zamzar_Page.add_file();
    }

}

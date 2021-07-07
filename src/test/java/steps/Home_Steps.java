package steps;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import org.json.simple.parser.ParseException;

import net.thucydides.core.annotations.Step;
import pages.Home_BC;

public class Home_Steps {
	
	Home_BC homePage;
	
	@Step("Open Orange HRM login page")
    public void open_Orange_HRM_login_page() {
		//homePage.open();
		homePage.open_Orange_HRM_login_page();
		
    }
	
	@Step("Enter Username And Password")
    public void enter_Username_and_Password() throws FileNotFoundException, IOException, ParseException, SQLException {
		
		//homePage.enter_Username_and_Password_from_json_file();
		homePage.enter_Username_and_Password_from_jdbc_sqlServer();
    }

}

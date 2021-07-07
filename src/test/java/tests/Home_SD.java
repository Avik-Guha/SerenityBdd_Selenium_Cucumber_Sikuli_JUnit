package tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import org.json.simple.parser.ParseException;

import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;
import steps.Home_Steps;


public class Home_SD {
	
	@Steps
    Home_Steps homePage;


	@Given("Launch Application")
	public void launch_Application() {
	    
		homePage.open_Orange_HRM_login_page();
	}
	
	@Given("Login as Admin")
	public void login_as_Admin() throws FileNotFoundException, IOException, ParseException, SQLException {
	    
		homePage.open_Orange_HRM_login_page();
		homePage.enter_Username_and_Password();
	}

}

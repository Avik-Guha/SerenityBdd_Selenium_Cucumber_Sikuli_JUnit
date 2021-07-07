package tests;

import org.openqa.selenium.WebDriver;
import org.sikuli.script.FindFailed;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import steps.Zamzar_Steps;

public class Zamzar_SD {
	
	@Managed
	WebDriver driver;
	
	@Steps
	Zamzar_Steps zamzar_Steps;
	
	@Given("Launch Zamzar application")
	public void launch_Zamzar_application() {
		driver.navigate().to("https://www.zamzar.com/");
	}
	
	@Then("Click on Add Files button and then add a file")
	public void click_on_Add_Files_button_and_then_add_a_file() throws FindFailed {
		zamzar_Steps.click_on_Add_Files_button_and_then_add_a_file();
	}

}

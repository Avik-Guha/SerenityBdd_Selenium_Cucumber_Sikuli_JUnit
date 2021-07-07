package tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.sikuli.script.FindFailed;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.AutomationDemoSite_Register_Steps;

public class AutomationDemoSite_Register {
	
	@Steps
	AutomationDemoSite_Register_Steps automationDemoSite_Register_Steps;
	
	@Given("Launch Automation Demo Site Register page")
	public void launch_Automation_Demo_Site_Register_page() {
	    
		automationDemoSite_Register_Steps.Launch_Automation_Demo_Site_Register_page();
	}
	
	@Then("Verify Title of the page is {string}")
	public void verify_Title_of_the_page_is(String expected_title) {
	    
		automationDemoSite_Register_Steps.verify_Title_of_the_page_is(expected_title);
	}
	
	@When("User enters text in {string} field in Register page")
	public void user_enters_text_in_field_in_Register_page(String field_Name) throws FileNotFoundException, IOException, ParseException {
	    
		automationDemoSite_Register_Steps.user_enters_text_in_field_in_Register_page(field_Name);
	}
	
	@Then("Verify minimum length in Password field is {int}")
	public void verify_minimum_length_in_Password_field_is(Integer expected_length) {
	    
		automationDemoSite_Register_Steps.verify_minimum_length_in_Password_field_is(expected_length);
	}
	
	@When("User checks on {string} checkbox in Register page")
	public void user_checks_on_checkbox_in_Register_page(String checkbox_name) {
		automationDemoSite_Register_Steps.user_checks_on_checkbox_in_Register_page(checkbox_name);
	}

	@When("User unchecks on {string} checkbox in Register page")
	public void user_unchecks_on_checkbox_in_Register_page(String checkbox_name) {
		automationDemoSite_Register_Steps.user_unchecks_on_checkbox_in_Register_page(checkbox_name);
	}
	
	@Then("Verify {string} checkbox in Register page is in Checked status")
	public void verify_checkbox_in_Register_page_is_in_Checked_status(String checkbox_name) {
		automationDemoSite_Register_Steps.verify_checkbox_in_Register_page_is_in_Checked_status(checkbox_name);
	}

	@Then("Verify {string} checkbox in Register page is in Unchecked status")
	public void verify_checkbox_in_Register_page_is_in_Unchecked_status(String checkbox_name) {
		automationDemoSite_Register_Steps.verify_checkbox_in_Register_page_is_in_Unchecked_status(checkbox_name);
	}
	
	@When("User checks on {string} radio button in Register page")
	public void user_checks_on_radio_button_in_Register_page(String element_name) {
		automationDemoSite_Register_Steps.user_checks_on_radio_button_in_Register_page(element_name);
	}
	
	@When("User selects {string} value in {string} dropdown field in Register page")
	public void user_selects_value_in_dropdown_field_in_Register_page(String value_to_select, String element) {
		automationDemoSite_Register_Steps.user_selects_value_in_dropdown_field_in_Register_page(value_to_select, element);
	}
	
	@When("User selects {string} and {string} value in Languages dropdown field in Register page")
	public void user_selects_and_value_in_Languages_dropdown_field_in_Register_page(String dropdown_value_1, String dropdown_value_2) {
		automationDemoSite_Register_Steps.user_selects_and_value_in_Languages_dropdown_field_in_Register_page(dropdown_value_1, dropdown_value_2);
	}
	
	@Given("Launch Automation Demo Site WebTable page")
	public void launch_Automation_Demo_Site_WebTable_page() {
		automationDemoSite_Register_Steps.launch_Automation_Demo_Site_WebTable_page();
	}
	
	@Then("Fetch record of user with email as {string} in Data Table in Web Table page")
	public void fetch_record_of_user_with_email_as_in_Data_Table_in_Web_Table_page(String value) throws InterruptedException {
		automationDemoSite_Register_Steps.fetch_record_of_user_with_email_as_in_Data_Table_in_Web_Table_page(value);
	}
	
	@Given("Launch Herokuapp Dynamic Loading Wait page")
	public void launch_Herokuapp_Dynamic_Loading_Wait_page() {
		automationDemoSite_Register_Steps.launch_Herokuapp_Dynamic_Loading_Wait_page();
	}
	
	@Then("Verify Implicit Wait Time")
	public void verify_Implicit_Wait_Time() {
		automationDemoSite_Register_Steps.verify_Implicit_Wait_Time();
	}
	
	@Then("Verify Hello World text is displayed")
	public void verify_Hello_World_text_is_displayed() {
		automationDemoSite_Register_Steps.verify_Hello_World_text_is_displayed();
	}
	
	@When("User sets Implicit Wait Time")
	public void user_sets_Implicit_Wait_Time() {
		automationDemoSite_Register_Steps.user_sets_Implicit_Wait_Time();
	}
	
	@When("User clicks on Start button")
	public void user_clicks_on_Start_button() {
		automationDemoSite_Register_Steps.user_clicks_on_Start_button();
	}
	
	@Given("Launch Herokuapp File Uploading page")
	public void launch_Herokuapp_File_Uploading_page() {
		automationDemoSite_Register_Steps.launch_Herokuapp_File_Uploading_page();
	}
	
	@Given("Launch Herokuapp Alerts page")
	public void launch_Herokuapp_Alerts_page() {
		automationDemoSite_Register_Steps.launch_Herokuapp_Alerts_page();
	}
	
	@Then("User is able to handle Regular alert")
	public void user_is_able_to_handle_Regular_alert() {
		automationDemoSite_Register_Steps.user_is_able_to_handle_Regular_alert();
	}
	
	@Then("User is able to handle Confirm alert")
	public void user_is_able_to_handle_Confirm_alert() {
		automationDemoSite_Register_Steps.user_is_able_to_handle_Confirm_alert();
	}
	
	@Then("User is able to handle Prompt alert")
	public void user_is_able_to_handle_Prompt_alert() {
		automationDemoSite_Register_Steps.user_is_able_to_handle_Prompt_alert();
	}
	
	@Given("Launch Herokuapp Mouse Hover page")
	public void launch_Herokuapp_Mouse_Hover_page() {
		automationDemoSite_Register_Steps.launch_Herokuapp_Mouse_Hover_page();
	}
	
	@Then("User is able to perform mouse hover")
	public void user_is_able_to_perform_mouse_hover() {
		automationDemoSite_Register_Steps.user_is_able_to_perform_mouse_hover();
	}
	
	@Given("Launch Herokuapp Drag and Drop page")
	public void launch_Herokuapp_Drag_and_Drop_page() {
		automationDemoSite_Register_Steps.launch_Herokuapp_Drag_and_Drop_page();
	}

	@Then("User is able to perform drag and drop")
	public void user_is_able_to_perform_drag_and_drop() {
		automationDemoSite_Register_Steps.user_is_able_to_perform_drag_and_drop();
	}
	
	@Given("Launch Herokuapp Checkbox page")
	public void launch_Herokuapp_Checkbox_page() {
		automationDemoSite_Register_Steps.launch_Herokuapp_Checkbox_page();
	}

	@Then("Verify count of checkbox in Herokuapp Checkbox page")
	public void verify_count_of_checkbox_in_Herokuapp_Checkbox_page() {
		automationDemoSite_Register_Steps.verify_count_of_checkbox_in_Herokuapp_Checkbox_page();
	}
	
	@Then("Verify {string} dropdown field in Register page contains {string} value")
	public void verify_dropdown_field_in_Register_page_contains_value(String field_name, String field_value) {
		automationDemoSite_Register_Steps.verify_dropdown_field_in_Register_page_contains_value(field_name, field_value);
	}
	
	@Then("Verify total number of values in {string} dropdown field in Register page")
	public void verify_total_number_of_values_in_dropdown_field_in_Register_page(String field_name) {
		automationDemoSite_Register_Steps.verify_total_number_of_values_in_dropdown_field_in_Register_page(field_name);
	}
	
	@Given("Launch DemoAutomationTesting File Upload application")
	public void launch_DemoAutomationTesting_File_Upload_application() {
		automationDemoSite_Register_Steps.launch_DemoAutomationTesting_File_Upload_application();
	}
	
	@Then("Click on Browse button and then add a file")
	public void click_on_Browse_button_and_then_add_a_file() throws FindFailed {
		automationDemoSite_Register_Steps.click_on_Browse_button_and_then_add_a_file();
	}
	
	@Then("Hover mouse over SwitchTo tab")
	public void hover_mouse_over_SwitchTo_tab() throws FindFailed {
		automationDemoSite_Register_Steps.hover_mouse_over_SwitchTo_tab();
	}

}

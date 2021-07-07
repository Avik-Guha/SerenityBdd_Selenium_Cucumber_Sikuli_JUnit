package steps;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.sikuli.script.FindFailed;

import net.thucydides.core.annotations.Step;
import pages.AutomationDemoSite_Register_BC;

public class AutomationDemoSite_Register_Steps {
	
	AutomationDemoSite_Register_BC automationDemoSite_Register_Page;
	
	@Step("Launch Automation Demo Site Register page")
    public void Launch_Automation_Demo_Site_Register_page() {
		automationDemoSite_Register_Page.open();
    }
	
	@Step
	public void verify_Title_of_the_page_is(String expected_title) {
		automationDemoSite_Register_Page.verify_Title_of_the_page_is(expected_title);
		
	}

	@Step
	public void user_enters_text_in_field_in_Register_page(String field_Name) throws FileNotFoundException, IOException, ParseException {
		automationDemoSite_Register_Page.user_enters_text_in_field_in_Register_page(field_Name);
	}

	@Step
	public void verify_minimum_length_in_Password_field_is(Integer expected_length) {
		automationDemoSite_Register_Page.verify_minimum_length_in_Password_field_is(expected_length);
	}

	@Step
	public void user_checks_on_checkbox_in_Register_page(String checkbox_name) {
		automationDemoSite_Register_Page.user_checks_on_checkbox_in_Register_page(checkbox_name);
	}

	@Step
	public void user_unchecks_on_checkbox_in_Register_page(String checkbox_name) {
		automationDemoSite_Register_Page.user_unchecks_on_checkbox_in_Register_page(checkbox_name);
	}

	@Step
	public void verify_checkbox_in_Register_page_is_in_Checked_status(String checkbox_name) {
		automationDemoSite_Register_Page.verify_checkbox_in_Register_page_is_in_Checked_status(checkbox_name);
	}

	@Step
	public void verify_checkbox_in_Register_page_is_in_Unchecked_status(String checkbox_name) {
		automationDemoSite_Register_Page.verify_checkbox_in_Register_page_is_in_Unchecked_status(checkbox_name);
	}

	@Step
	public void user_checks_on_radio_button_in_Register_page(String element_name) {
		automationDemoSite_Register_Page.user_checks_on_radio_button_in_Register_page(element_name);
	}

	@Step
	public void user_selects_value_in_dropdown_field_in_Register_page(String value_to_select, String element) {
		automationDemoSite_Register_Page.user_selects_value_in_dropdown_field_in_Register_page(value_to_select, element);
	}

	@Step
	public void user_selects_and_value_in_Languages_dropdown_field_in_Register_page(String dropdown_value_1,
			String dropdown_value_2) {
		automationDemoSite_Register_Page.user_selects_and_value_in_Languages_dropdown_field_in_Register_page(dropdown_value_1, dropdown_value_2);
	}

	@Step
	public void launch_Automation_Demo_Site_WebTable_page() {
		automationDemoSite_Register_Page.launch_Automation_Demo_Site_WebTable_page();
	}

	@Step
	public void fetch_record_of_user_with_email_as_in_Data_Table_in_Web_Table_page(String value) throws InterruptedException {
		automationDemoSite_Register_Page.fetch_record_of_user_with_email_as_in_Data_Table_in_Web_Table_page(value);
	}

	@Step
	public void launch_Herokuapp_Dynamic_Loading_Wait_page() {
		automationDemoSite_Register_Page.launch_Herokuapp_Dynamic_Loading_Wait_page();
	}

	@Step
	public void verify_Implicit_Wait_Time() {
		automationDemoSite_Register_Page.verify_Implicit_Wait_Time();
	}

	@Step
	public void verify_Hello_World_text_is_displayed() {
		automationDemoSite_Register_Page.verify_Hello_World_text_is_displayed();
	}

	@Step
	public void user_sets_Implicit_Wait_Time() {
		automationDemoSite_Register_Page.user_sets_Implicit_Wait_Time();
	}

	@Step
	public void user_clicks_on_Start_button() {
		automationDemoSite_Register_Page.user_clicks_on_Start_button();
	}

	@Step
	public void launch_Herokuapp_File_Uploading_page() {
		automationDemoSite_Register_Page.launch_Herokuapp_File_Uploading_page();
	}

	@Step
	public void launch_Herokuapp_Alerts_page() {
		automationDemoSite_Register_Page.launch_Herokuapp_Alerts_page();
	}

	@Step
	public void user_is_able_to_handle_Regular_alert() {
		automationDemoSite_Register_Page.user_is_able_to_handle_Regular_alert();
	}

	@Step
	public void user_is_able_to_handle_Confirm_alert() {
		automationDemoSite_Register_Page.user_is_able_to_handle_Confirm_alert();
	}

	@Step
	public void user_is_able_to_handle_Prompt_alert() {
		automationDemoSite_Register_Page.user_is_able_to_handle_Prompt_alert();
	}

	@Step
	public void launch_Herokuapp_Mouse_Hover_page() {
		automationDemoSite_Register_Page.launch_Herokuapp_Mouse_Hover_page();
	}

	@Step
	public void user_is_able_to_perform_mouse_hover() {
		automationDemoSite_Register_Page.user_is_able_to_perform_mouse_hover();
	}

	@Step
	public void launch_Herokuapp_Drag_and_Drop_page() {
		automationDemoSite_Register_Page.launch_Herokuapp_Drag_and_Drop_page();
	}

	@Step
	public void user_is_able_to_perform_drag_and_drop() {
		automationDemoSite_Register_Page.user_is_able_to_perform_drag_and_drop();
	}

	@Step
	public void launch_Herokuapp_Checkbox_page() {
		automationDemoSite_Register_Page.launch_Herokuapp_Checkbox_page();
	}

	@Step
	public void verify_count_of_checkbox_in_Herokuapp_Checkbox_page() {
		automationDemoSite_Register_Page.verify_count_of_checkbox_in_Herokuapp_Checkbox_page();
	}

	@Step
	public void verify_dropdown_field_in_Register_page_contains_value(String field_name, String field_value) {
		automationDemoSite_Register_Page.verify_dropdown_field_in_Register_page_contains_value(field_name, field_value);
	}

	@Step
	public void verify_total_number_of_values_in_dropdown_field_in_Register_page(String field_name) {
		automationDemoSite_Register_Page.verify_total_number_of_values_in_dropdown_field_in_Register_page(field_name);
	}

	@Step
	public void launch_DemoAutomationTesting_File_Upload_application() {
		automationDemoSite_Register_Page.launch_DemoAutomationTesting_File_Upload_application();
	}

	@Step
	public void click_on_Browse_button_and_then_add_a_file() throws FindFailed {
		automationDemoSite_Register_Page.click_on_Browse_button_and_then_add_a_file();
	}

	@Step
	public void hover_mouse_over_SwitchTo_tab() throws FindFailed {
		automationDemoSite_Register_Page.hover_mouse_over_SwitchTo_tab();
	}

	

}

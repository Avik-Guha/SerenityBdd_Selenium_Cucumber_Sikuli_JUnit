package pages;

import static org.junit.Assert.fail;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//import java.math.BigDecimal;
import java.util.List;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.sikuli.script.FindFailed;

import com.github.javafaker.Faker;

import static java.time.temporal.ChronoUnit.SECONDS;

//import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.components.Dropdown;
import net.thucydides.core.pages.components.HtmlTable;
//import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.webelements.Checkbox;
import net.thucydides.core.webelements.RadioButtonGroup;
import objects.AutomationDemoSite_Register_OB;
import utility.CommonFunctions;

//@DefaultUrl("http://demo.automationtesting.in/Register.html")
public class AutomationDemoSite_Register_BC extends AutomationDemoSite_Register_OB {
	
	CommonFunctions commonFunctions = new CommonFunctions();

	File register_details_json = new File("src\\test\\resources\\testData\\Register_Details.json");
	JSONParser parser = new JSONParser();

	public void verify_Title_of_the_page_is(String expected_title) {

		String actual_Title = getDriver().getTitle();
		Assert.assertTrue(actual_Title.matches("Register"));
	}

	public void user_enters_text_in_field_in_Register_page(String field_Name)
			throws FileNotFoundException, IOException, ParseException {

		// *******this section reads data from json
		JSONObject object = (JSONObject) parser.parse(new FileReader(register_details_json));
		String first_name = (String) object.get("FirstName");
		//String last_name = (String) object.get("LastName");
		
		Faker faker = new Faker();
		String last_name = faker.name().lastName();

		switch (field_Name) {
		case "First Name":
			first_name_ob.type(first_name);
			break;

		case "Last Name":
			last_name_ob.type(last_name);
			break;

		default:
			fail("************Error: Please enter correct Element name; Method: user_enters_text_in_field_in_Register_page***********");
		}
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void verify_minimum_length_in_Password_field_is(Integer expected_length) {

		Integer actual_length = Integer.parseInt(password_ob.getAttribute("minlength"));
		Assert.assertEquals(expected_length, actual_length);
	}

	public void user_checks_on_checkbox_in_Register_page(String checkbox_name) {

		switch (checkbox_name) {
		case "Cricket":
			Checkbox checkbox_Cricket = new Checkbox(cricket_checkbox_ob);
			cricket_checkbox_ob.shouldBeVisible();
			checkbox_Cricket.setChecked(true);
			break;

		case "Movies":
			Checkbox checkbox_Movies = new Checkbox(movies_checkbox_ob);
			movies_checkbox_ob.shouldBeVisible();
			checkbox_Movies.setChecked(true);
			break;

		case "Hockey":
			Checkbox checkbox_Hockey = new Checkbox(hockey_checkbox_ob);
			hockey_checkbox_ob.shouldBeVisible();
			checkbox_Hockey.setChecked(true);
			break;

		default:
			fail("************Error: Please enter correct Checkbox name; Method: user_checks_on_checkbox_in_Register_page***********");
		}
	}

	public void user_unchecks_on_checkbox_in_Register_page(String checkbox_name) {

		switch (checkbox_name) {
		case "Cricket":
			Checkbox checkbox_Cricket = new Checkbox(cricket_checkbox_ob);
			cricket_checkbox_ob.shouldBeVisible();
			checkbox_Cricket.setChecked(false);
			break;

		case "Movies":
			Checkbox checkbox_Movies = new Checkbox(movies_checkbox_ob);
			movies_checkbox_ob.shouldBeVisible();
			checkbox_Movies.setChecked(false);
			break;

		case "Hockey":
			Checkbox checkbox_Hockey = new Checkbox(hockey_checkbox_ob);
			hockey_checkbox_ob.shouldBeVisible();
			checkbox_Hockey.setChecked(false);
			break;

		default:
			fail("************Error: Please enter correct Checkbox name; Method: user_checks_on_checkbox_in_Register_page***********");
		}
	}

	public void verify_checkbox_in_Register_page_is_in_Checked_status(String checkbox_name) {

		switch (checkbox_name) {
		case "Cricket":
			Checkbox checkbox_Cricket = new Checkbox(cricket_checkbox_ob);
			cricket_checkbox_ob.shouldBeVisible();
			Assert.assertTrue(checkbox_Cricket.isChecked());
			break;

		case "Movies":
			Checkbox checkbox_Movies = new Checkbox(movies_checkbox_ob);
			movies_checkbox_ob.shouldBeVisible();
			Assert.assertTrue(checkbox_Movies.isChecked());
			break;

		case "Hockey":
			Checkbox checkbox_Hockey = new Checkbox(hockey_checkbox_ob);
			hockey_checkbox_ob.shouldBeVisible();
			Assert.assertTrue(checkbox_Hockey.isChecked());
			break;

		default:
			fail("************Error: Please enter correct Checkbox name; Method: verify_checkbox_in_Register_page_is_in_Checked_status***********");
		}
	}

	public void verify_checkbox_in_Register_page_is_in_Unchecked_status(String checkbox_name) {

		switch (checkbox_name) {
		case "Cricket":
			Checkbox checkbox_Cricket = new Checkbox(cricket_checkbox_ob);
			cricket_checkbox_ob.shouldBeVisible();
			Assert.assertFalse(checkbox_Cricket.isChecked());
			break;

		case "Movies":
			Checkbox checkbox_Movies = new Checkbox(movies_checkbox_ob);
			movies_checkbox_ob.shouldBeVisible();
			Assert.assertFalse(checkbox_Movies.isChecked());
			break;

		case "Hockey":
			Checkbox checkbox_Hockey = new Checkbox(hockey_checkbox_ob);
			hockey_checkbox_ob.shouldBeVisible();
			Assert.assertFalse(checkbox_Hockey.isChecked());
			break;

		default:
			fail("************Error: Please enter correct Checkbox name; Method: verify_checkbox_in_Register_page_is_in_Unchecked_status***********");
		}
	}

	// This method demonstrates 2 ways to handle Radio buttons in Serenity framework
	// using RadioButtonGroup class

	public void user_checks_on_radio_button_in_Register_page(String element_name) {

		switch (element_name) {
		case "Male":
			inRadioButtonGroup("radiooptions").selectByValue("Male");
			String selected_value = inRadioButtonGroup("radiooptions").getSelectedValue().get();
			Assert.assertEquals("Male", selected_value);
			break;

		case "FeMale":
			List<WebElement> radioButtons = radio_buttons_ob;

			RadioButtonGroup group = new RadioButtonGroup(radioButtons);
			group.selectByValue(element_name);
			Assert.assertEquals(element_name, group.getSelectedValue().get());
			break;

		default:
			fail("************Error: Please enter correct Radio button name; Method: user_checks_on_radio_button_in_Register_page***********");
		}
	}

	public void user_selects_value_in_dropdown_field_in_Register_page(String value_to_select, String element) {

		switch (element) {
		case "Skills":
			Dropdown.forWebElement(skills_dropdown_ob).select(value_to_select); // to select by text
			// Dropdown.forWebElement(skills_dropdown_ob).selectByValue(value_to_select);
			// //to select by value attribute
			Assert.assertEquals(value_to_select, getSelectedLabelFrom(skills_dropdown_ob));
			break;

		case "Country":
			selectFromDropdown(countries_dropdown_ob, value_to_select); // this method selects value by displayed text
			Assert.assertEquals(value_to_select, getSelectedValueFrom(countries_dropdown_ob));
			break;

		default:
			fail("************Error: Please enter correct Dropdown name; Method: user_selects_value_in_dropdown_field_in_Register_page***********");
		}
	}

	public void user_selects_and_value_in_Languages_dropdown_field_in_Register_page(String dropdown_value_1,
			String dropdown_value_2) {

		languages_dropdown_ob.click();
		Dropdown.forWebElement(languages_dropdown_values_ob).selectMultipleItems(dropdown_value_1, dropdown_value_2); // this
																														// method
																														// will
																														// fail
																														// here
	}

	public void launch_Automation_Demo_Site_WebTable_page() {
		// getDriver().get("http://demo.automationtesting.in/WebTable.html");
		getDriver().get("https://the-internet.herokuapp.com/tables");
	}

	public void fetch_record_of_user_with_email_as_in_Data_Table_in_Web_Table_page(String value)
			throws InterruptedException {
		// HtmlTable.filterRows(dataTable_ob, the("Email", ));
		// Thread.sleep(6000);
		/*
		 * List<WebElementFacade> rows =
		 * webTable_body_ob.thenFindAll(By.cssSelector("#table1 > tbody > tr"));
		 * System.out.println("********************************* "+rows.size());
		 * 
		 * for (WebElementFacade row : rows) { System.out.println(row.getText()); }
		 */

		HtmlTable table = new HtmlTable(webTable_ob);

		List<String> headers = table.getHeadings();

		for (String header : headers) {
			System.out.println("********************************* " + header);
		}

		List<WebElement> rows = table.getRowElements();

		for (WebElement row : rows) {
			System.out.println("********************************* " + row.getText());
		}
	}

	public void launch_Herokuapp_Dynamic_Loading_Wait_page() {
		getDriver().get("https://the-internet.herokuapp.com/dynamic_loading/2");
	}

	public void verify_Implicit_Wait_Time() {
		long implicitWait = getImplicitWaitTimeout().toMillis();
		System.out.println("**********Implicit wait time: " + implicitWait + " seconds************");
	}

	public void verify_Hello_World_text_is_displayed() {

		//waitForAbsenceOf("Loading", loading_loader_ob).waitFor(helloWorld_text_ob).shouldBeVisible();
		waitForAbsenceOf("Loading", loading_loader_ob).waitFor(helloWorld_text_ob).shouldBeVisible();

		String actual_text = helloWorld_text_ob.getText();
		Assert.assertEquals("Hello World!", actual_text);
	}

	public void user_sets_Implicit_Wait_Time() {

		// setWaitForElementTimeout(8000);

		setImplicitTimeout(1, SECONDS);
	}

	public void user_clicks_on_Start_button() {
		// start_button_ob.waitUntilClickable().click();
		// start_button_ob.withTimeoutOf(15, SECONDS).click();
		waitForTitleToAppear("The Internet").waitFor(start_button_ob).click();
	}

	public void launch_Herokuapp_File_Uploading_page() {
		
		getDriver().get("https://the-internet.herokuapp.com/upload");
		
		String filePath = System.getProperty("user.dir") + File.separator + "Joker&HarleyQueen.jpeg";
		upload(filePath).to(chooseFile_button_ob);
		upload_button_ob.click();
		fileUploaded_text_ob.waitUntilVisible();
	}

	public void launch_Herokuapp_Alerts_page() {
		
		getDriver().get("https://the-internet.herokuapp.com/javascript_alerts");
	}

	public void user_is_able_to_handle_Regular_alert() {
		
		regular_alert_button_ob.waitUntilClickable().click();
		
		String actual_alert_Text = getAlert().getText();
		Assert.assertEquals("I am a JS Alert", actual_alert_Text);
		
		getAlert().accept();
	}

	public void user_is_able_to_handle_Confirm_alert() {
		
		confirm_alert_button_ob.waitUntilClickable().click();
		
		String actual_alert_Text = getAlert().getText();
		Assert.assertEquals("I am a JS Confirm", actual_alert_Text);
		
		getAlert().dismiss();
		
		confirm_alert_button_ob.waitUntilClickable().click();
		
		getAlert().accept();
	}

	public void user_is_able_to_handle_Prompt_alert() {
		
		prompt_alert_button_ob.waitUntilClickable().click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String actual_alert_Text = getAlert().getText();
		Assert.assertEquals("I am a JS prompt", actual_alert_Text);
		
		getAlert().sendKeys("This is a prompt alert !!!!!!!!");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		getAlert().accept();
		
		String actual_result_Text = alert_result_ob.getText();
		Assert.assertEquals("You entered: This is a prompt alert !!!!!!!!", actual_result_Text);
	}

	public void launch_Herokuapp_Mouse_Hover_page() {
		
		getDriver().get("https://the-internet.herokuapp.com/hovers");
	}

	public void user_is_able_to_perform_mouse_hover() {
		
		withAction().moveToElement(hover_user1_ob).build().perform();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Assert.assertEquals("name: user1", hover_user1_name_ob.getText());
		
		hover_user1_viewProfile_ob.waitUntilClickable().click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void launch_Herokuapp_Drag_and_Drop_page() {
		
		getDriver().get("http://testautomationpractice.blogspot.com/");
	}

	public void user_is_able_to_perform_drag_and_drop() {
		
		withAction().dragAndDrop(draganddrop_A_ob, draganddrop_B_ob).build().perform();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void launch_Herokuapp_Checkbox_page() {
		
		getDriver().get("https://the-internet.herokuapp.com/checkboxes");
	}

	public void verify_count_of_checkbox_in_Herokuapp_Checkbox_page() {
		
		Integer checkbox_size = herokuapp_checkbox_ob.size();
		Assert.assertEquals("2", checkbox_size.toString());
	}

	public void verify_dropdown_field_in_Register_page_contains_value(String field_name, String expected_value) {
		
		switch (field_name) {
		case "Skills":
			commonFunctions.verify_value_in_dropdown(skills_dropdown_ob, expected_value);
			break;

		case "Country":
			commonFunctions.verify_value_in_dropdown(countries_dropdown_ob, expected_value);
			break;

		default:
			fail("************Error: Please enter correct Dropdown name; Method: verify_dropdown_field_in_Register_page_contains_value***********");
		}
	}

	public void verify_total_number_of_values_in_dropdown_field_in_Register_page(String field_name) {
		
		switch (field_name) {
		case "Skills":
			commonFunctions.verify_total_number_of_values_in_dropdown(skills_dropdown_ob, 78);
			break;

		case "Country":
			commonFunctions.verify_total_number_of_values_in_dropdown(countries_dropdown_ob, 251);
			break;

		default:
			fail("************Error: Please enter correct Dropdown name; Method: verify_total_number_of_values_in_dropdown_field_in_Register_page***********");
		}
	}

	public void launch_DemoAutomationTesting_File_Upload_application() {
		getDriver().get("http://demo.automationtesting.in/FileUpload.html");
	}

	public void click_on_Browse_button_and_then_add_a_file() throws FindFailed {
		browse_button_ob.waitUntilVisible();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		commonFunctions.attach_File_using_Sikuli();
		//commonFunctions.hover_mouse_using_Sikuli("sample.png");
	}

	public void hover_mouse_over_SwitchTo_tab() throws FindFailed {
		commonFunctions.hover_mouse_using_Sikuli("SwitchTo.png");
	}

	

}

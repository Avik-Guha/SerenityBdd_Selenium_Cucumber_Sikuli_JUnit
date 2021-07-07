package objects;

import java.util.List;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class AutomationDemoSite_Register_OB extends PageObject {
	
	@FindBy(css = "#basicBootstrapForm > div:nth-child(1) > div:nth-child(2) > input")
	public static WebElementFacade first_name_ob;
	
	@FindBy(css = "#basicBootstrapForm > div:nth-child(1) > div:nth-child(3) > input")
	public static WebElementFacade last_name_ob;
	
	@FindBy(css = "#firstpassword")
	public static WebElementFacade password_ob;
	
	@FindBy(css = "#checkbox1")
	public static WebElementFacade cricket_checkbox_ob;
	
	@FindBy(css = "#checkbox2")
	public static WebElementFacade movies_checkbox_ob;
	
	@FindBy(css = "#checkbox3")
	public static WebElementFacade hockey_checkbox_ob;
	
	@FindBy(css = "#Skills")
	public static WebElementFacade skills_dropdown_ob;
	
	@FindBy(css = "#countries")
	public static WebElementFacade countries_dropdown_ob;
	
	@FindBy(css = "#msdd")
	public static WebElementFacade languages_dropdown_ob;
	
	@FindBy(css = "#basicBootstrapForm > div:nth-child(7) > div > multi-select > div:nth-child(2) > ul")
	public static WebElementFacade languages_dropdown_values_ob;
	
	@FindBy(css = "#table1")
	public static WebElementFacade webTable_ob;
	
	@FindBy(css = "#table1 > tbody")
	public static WebElementFacade webTable_body_ob;
	
	@FindBy(css = "#finish > h4")
	public static WebElementFacade helloWorld_text_ob;
	
	@FindBy(css = "#start > button")
	public static WebElementFacade start_button_ob;
	
	@FindBy(css = "#content > div > #loading")
	public static WebElementFacade loading_loader_ob;
	
	@FindBy(css = "#file-upload")
	public static WebElementFacade chooseFile_button_ob;
	
	@FindBy(css = "#file-submit")
	public static WebElementFacade upload_button_ob;
	
	@FindBy(css = "#content > div > h3")
	public static WebElementFacade fileUploaded_text_ob;
	
	@FindBy(css = "#content > div > ul > li:nth-child(1) > button")
	public static WebElementFacade regular_alert_button_ob;
	
	@FindBy(css = "#content > div > ul > li:nth-child(2) > button")
	public static WebElementFacade confirm_alert_button_ob;
	
	@FindBy(css = "#content > div > ul > li:nth-child(3) > button")
	public static WebElementFacade prompt_alert_button_ob;
	
	@FindBy(css = "#result")
	public static WebElementFacade alert_result_ob;
	
	@FindBy(css = "#content > div > div:nth-child(3) > img")
	public static WebElementFacade hover_user1_ob;
	
	@FindBy(css = "#content > div > div:nth-child(3) > div > h5")
	public static WebElementFacade hover_user1_name_ob;
	
	@FindBy(css = "#content > div > div:nth-child(3) > div > a")
	public static WebElementFacade hover_user1_viewProfile_ob;
	
	@FindBy(css = "#content > div > div:nth-child(4) > img")
	public static WebElementFacade hover_user2_ob;
	
	@FindBy(css = "#content > div > div:nth-child(5) > img")
	public static WebElementFacade hover_user3_ob;
	
	@FindBy(css = "#draggable")
	public static WebElementFacade draganddrop_A_ob;
	
	@FindBy(css = "#droppable")
	public static WebElementFacade draganddrop_B_ob;
	
	@FindBy(css = "body > section > div:nth-child(1) > div > div > div.file-input.file-input-new > div.btn.btn-primary.btn-file")
	public static WebElementFacade browse_button_ob;
	
	
	
	//****************List Elements*******************//
	
	@FindBy(css = "[type='radio']")
	public static List<WebElement> radio_buttons_ob;
	
	@FindBy(css = "[type='checkbox']")
	public static List<WebElementFacade> herokuapp_checkbox_ob;

}

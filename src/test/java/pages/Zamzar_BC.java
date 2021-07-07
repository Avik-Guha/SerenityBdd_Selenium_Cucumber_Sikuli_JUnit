package pages;

import org.openqa.selenium.Keys;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import net.serenitybdd.core.pages.PageObject;
import utility.CommonFunctions;

public class Zamzar_BC extends PageObject {
	
	CommonFunctions commonFunctions = new CommonFunctions();

	public void add_file() throws FindFailed {

		Screen screen = new Screen();
		
		String folder_Path = "C:\\Avik\\Automation\\Framework\\Eclipse\\SerenityCucumberBdd\\src\\test\\resources\\sikuli_Images\\Zamzar\\";

		Pattern img1 = new Pattern(folder_Path + "Add Files Button.png");
		Pattern addFilePathElement = new Pattern(folder_Path + "Add File Path.png");
		Pattern open_Button = new Pattern(folder_Path + "Open Button.png");

		withAction().sendKeys(Keys.PAGE_DOWN).build().perform();

		screen.click(img1);
		screen.type("C:\\Avik\\Automation\\Framework\\Eclipse\\SerenityCucumberBdd\\src\\test\\resources\\testData\\AttachFileDemo.txt");
		//screen.type(addFilePathElement, "C:\\Avik\\Automation\\Framework\\Eclipse\\SerenityCucumberBdd\\src\\test\\resources\\testData\\AttachFileDemo.txt");
		withAction().sendKeys(Keys.ENTER).build().perform();
		//screen.click(open_Button);

	}

}

package pages;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import net.serenitybdd.core.pages.PageObject;
import objects.Home_OB;

//@DefaultUrl("https://opensource-demo.orangehrmlive.com/")
public class Home_BC extends PageObject {

	File credential_json = new File("src\\test\\resources\\testData\\UserCred.json");
	JSONParser parser = new JSONParser();


	/*
	 * Methods
	 * 
	 */

	public void enter_Username_and_Password_from_json_file() throws FileNotFoundException, IOException, ParseException {

		// *******this section reads data from json
		JSONObject object = (JSONObject) parser.parse(new FileReader(credential_json));
		String cred_username = (String) object.get("username_Admin");
		String cred_password = (String) object.get("password_Admin");
		
		$(Home_OB.username).type(cred_username);
		$(Home_OB.password).typeAndEnter(cred_password);
	}
	
	public void enter_Username_and_Password_from_jdbc_sqlServer() throws SQLException {

		String host = "localhost";

		String port = "3306";

		Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/demologin", "root",
				"L09M@1nMyS9l@2o2o");
		System.out.println("Connection is successful");

		Statement s = con.createStatement();

		ResultSet rs = s.executeQuery("select * from credentials where role = 'admin'");


		while (rs.next())

		{
			String username = rs.getString("username");
			String password = rs.getString("password");

			$(Home_OB.username).type(username);
			$(Home_OB.password).typeAndEnter(password);

		}
	}

	public void open_Orange_HRM_login_page() {
		
		getDriver().get("https://opensource-demo.orangehrmlive.com/");
	}

}

package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features",
        glue = {"tests"},
        //dryRun = true,
        tags = { "@AutomationDemoSite_TestRadioButton_CheckRadioButton" }
)

public class TestRunner {

}

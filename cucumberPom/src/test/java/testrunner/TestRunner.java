
package testrunner;
import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/functionalTest",
				glue= {"stepdefinition"},
				dryRun = false,
				monochrome = true, 
				format = {"pretty", "html:TestReports", "json:TestReports/cucumber.json", "junit:TestReports/cucumber.xml"},
						plugin = {"com.cucumber.listener.ExtentCucumberFormatter:output/report.html"})
		
public class TestRunner {
	@AfterClass
	public static void teardown() {

		Reporter.loadXMLConfig(new File("output/extent-config.xml"));
		//Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
		Reporter.setSystemInfo("user", System.getProperty("user.name"));
		Reporter.setSystemInfo("os", "Windows");
		Reporter.setTestRunnerOutput("Sample test runner output message");
		
	}
	
}
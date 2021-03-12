package Tests;

import java.io.IOException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import reusableComponents.ExcelUtils;
import reusableComponents.ReadConfig;
import testBase.MyLogger;
import testBase.TestBase;

public class AppiumNativeApp extends TestBase {
	public static final String URL = "http://127.0.0.1:4724/wd/hub";
	public static String apkUkl = "D:\\rcworksp\\Appium-SaucelabProject\\WikipediaSample.apk";
	AndroidDriver<AndroidElement> driver;

	@BeforeSuite
	public void setup() throws Exception {

		DesiredCapabilities caps = new DesiredCapabilities();

		// Specify device and os_version for testing
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "7.0");

		// Set other BrowserStack capabilities
		caps.setCapability("build", "Java Android");
		caps.setCapability("deviceName", "emulator-5554");
		caps.setCapability("automationName", "UiAutomator2");
		caps.setCapability("noSign", "true");

		// Set URL of the application under test
		caps.setCapability("app", apkUkl);

		URL url = new URL(URL);

		driver = new AndroidDriver<AndroidElement>(url, caps);
	}

	@SuppressWarnings("deprecation")
	@Test
	public void launchAndSearchWikipediaApp() throws InterruptedException, IOException {
		ReadConfig readConfig=new ReadConfig("./Configuration/config.properties");
		String exlpath= readConfig.getValue("excelPath");
		String shName= readConfig.getValue("sheetName");
		ExcelUtils exObj=new ExcelUtils(exlpath,shName);
		AndroidElement searchElement = (AndroidElement) new WebDriverWait(driver, 30)
				.until(ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Search Wikipedia")));
		searchElement.click();
		AndroidElement insertTextElement = (AndroidElement) new WebDriverWait(driver, 30)
				.until(ExpectedConditions.elementToBeClickable(MobileBy.id("org.wikipedia.alpha:id/search_src_text")));
		//insertTextElement.sendKeys("Appium");
		insertTextElement.sendKeys(exObj.getDataBasedOnTCandAttribute("SearchTerm", "TC-1"));
		Thread.sleep(5000);
		System.out.println("Entering Search term 'Appium'");
		List<AndroidElement> allProductsName = driver.findElementsByClassName("android.widget.TextView");
		assert (allProductsName.size() > 0);
		System.out.println("Search Results "+allProductsName.size());
		Thread.sleep(5000);
	}

	@AfterSuite

	public void teardown() {
		if (driver != null) {
			driver.quit();
			System.out.println("Done");
		}
	}

	

}

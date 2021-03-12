package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import static org.junit.Assert.*;

import org.assertj.core.api.SoftAssertions;

import managers.FileReaderManager;


public class HomePage {
	WebDriver driver;
	String baseUrl;
	SoftAssertions softAssertions = new SoftAssertions();
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement searchBox;
	
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	private WebElement searchButton;
	
	public HomePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void verifyHomePageTitle() {
		System.out.println("Home page ---" + driver.getTitle());
		String homepageTitle = driver.getTitle();
		softAssertions.assertThat(homepageTitle.equals("sss"));
		
	}
	public void navigateTo_HomePage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
	}
	public void enterProduct(String product){
		searchBox.sendKeys(product);
	}
	
	public void clickOnSearchButton(){
		searchButton.click();
	}

	public void closeBrowser() {
		driver.close();
		driver.quit();
	}
}
	

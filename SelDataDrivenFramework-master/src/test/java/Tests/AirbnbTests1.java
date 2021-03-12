package Tests;

import java.io.IOException;
import java.text.ParseException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.SearchResultsPage;
import reusableComponents.ExcelUtils;
import reusableComponents.JSONutils;
import reusableComponents.ReadConfig;
import testBase.MyLogger;
import testBase.TestBase;




public class AirbnbTests1 extends TestBase {
	
	HomePage homePage = new HomePage();
	SearchResultsPage searchResultPage=new SearchResultsPage();
	
	@Test(enabled=true)
	public void test1() throws IOException, InterruptedException, ParseException {
		MyLogger.startTestCase(new Throwable().getStackTrace()[0].getMethodName());
		ReadConfig readConfig=new ReadConfig("./Configuration/config.properties");
		String exlpath= readConfig.getValue("excelPath");
		String shName= readConfig.getValue("sheetName");
		ExcelUtils exObj=new ExcelUtils(exlpath,shName);
		
		homePage.clickLocation();
		homePage.setLocation(exObj.getDataBasedOnTCandAttribute("Location", "TC-1"));
		homePage.clickCheckin();
		homePage.selectFromDate(exObj.getDataBasedOnTCandAttribute("FromDate", "TC-1"));
		homePage.selecttoDate(exObj.getDataBasedOnTCandAttribute( "ToDate", "TC-1"));
		homePage.clickGuestelm();
		homePage.addGuests("adults",Integer.parseInt(exObj.getDataBasedOnTCandAttribute("Adults", "TC-1")));
		homePage.addGuests("children", Integer.parseInt(exObj.getDataBasedOnTCandAttribute("Children", "TC-1")));
		homePage.clickSearch();
		Assert.assertEquals(searchResultPage.getMessage(), "Stays in Bengaluru");
		searchResultPage.clickLink();

	}
	
	@Test(enabled=true)
	public void test2() throws IOException, InterruptedException, ParseException {
		MyLogger.startTestCase(new Throwable().getStackTrace()[0].getMethodName());
		ReadConfig readConfig=new ReadConfig("./Configuration/config.properties");
		String exlpath= readConfig.getValue("excelPath");
		String shName= readConfig.getValue("sheetName");
		ExcelUtils exObj=new ExcelUtils(exlpath,shName);
		
		homePage.clickLocation();
		homePage.setLocation(exObj.getDataBasedOnTCandAttribute("Location", "TC-1"));
		homePage.clickCheckin();
		homePage.selectFromDate(exObj.getDataBasedOnTCandAttribute("FromDate", "TC-1"));
		homePage.selecttoDate(exObj.getDataBasedOnTCandAttribute( "ToDate", "TC-1"));
		homePage.clickGuestelm();
		homePage.addGuests("adults",Integer.parseInt(exObj.getDataBasedOnTCandAttribute("Adults", "TC-1")));
		homePage.addGuests("children", Integer.parseInt(exObj.getDataBasedOnTCandAttribute("Children", "TC-1")));
		homePage.clickSearch();
		Assert.assertEquals(searchResultPage.getMessage(), "Stay in Bengaluru");
		searchResultPage.clickLink();

	}
	
	@Test(enabled = false, dataProvider = "getData", dataProviderClass = JSONutils.class)
	public void test3(JSONutils data) throws InterruptedException, ParseException {
		
		homePage.clickLocation();
		homePage.setLocation(data.getLocation());
		homePage.clickCheckin();
		homePage.selectFromDate(data.getFromdate());
		homePage.selecttoDate(data.getTodate());
		homePage.clickGuestelm();
		homePage.addGuests("adults", Integer.parseInt(data.getAdults()));
		homePage.addGuests("children", Integer.parseInt(data.getChildren()));
		homePage.clickSearch();
		Assert.assertEquals(searchResultPage.getMessage(), "Stays in Bengaluru");
		searchResultPage.clickLink();
	}
	@Test(enabled=true)
	public void test4() throws IOException, InterruptedException, ParseException {
		MyLogger.startTestCase(new Throwable().getStackTrace()[0].getMethodName());
		ReadConfig readConfig=new ReadConfig("./Configuration/config.properties");
		String exlpath= readConfig.getValue("excelPath");
		String shName= readConfig.getValue("sheetName");
		ExcelUtils exObj=new ExcelUtils(exlpath,shName);
		
		homePage.clickLocation();
		homePage.setLocation(exObj.getDataBasedOnTCandAttribute("Location", "TC-1"));
		homePage.clickCheckin();
		homePage.selectFromDate(exObj.getDataBasedOnTCandAttribute("FromDate", "TC-1"));
		homePage.selecttoDate(exObj.getDataBasedOnTCandAttribute( "ToDate", "TC-1"));
		homePage.clickGuestelm();
		homePage.addGuests("adults",Integer.parseInt(exObj.getDataBasedOnTCandAttribute("Adults", "TC-1")));
		homePage.addGuests("children", Integer.parseInt(exObj.getDataBasedOnTCandAttribute("Children", "TC-1")));
		homePage.clickSearch();
		Assert.assertEquals(searchResultPage.getMessage(), "Stays in Bengaluru");
		searchResultPage.clickLink();

	}
	
	@Test(enabled=true)
	public void test5() throws IOException, InterruptedException, ParseException {
		MyLogger.startTestCase(new Throwable().getStackTrace()[0].getMethodName());
		ReadConfig readConfig=new ReadConfig("./Configuration/config.properties");
		String exlpath= readConfig.getValue("excelPath");
		String shName= readConfig.getValue("sheetName");
		ExcelUtils exObj=new ExcelUtils(exlpath,shName);
		
		homePage.clickLocation();
		homePage.setLocation(exObj.getDataBasedOnTCandAttribute("Location", "TC-1"));
		homePage.clickCheckin();
		homePage.selectFromDate(exObj.getDataBasedOnTCandAttribute("FromDate", "TC-1"));
		homePage.selecttoDate(exObj.getDataBasedOnTCandAttribute( "ToDate", "TC-1"));
		homePage.clickGuestelm();
		homePage.addGuests("adults",Integer.parseInt(exObj.getDataBasedOnTCandAttribute("Adults", "TC-1")));
		homePage.addGuests("children", Integer.parseInt(exObj.getDataBasedOnTCandAttribute("Children", "TC-1")));
		homePage.clickSearch();
		Assert.assertEquals(searchResultPage.getMessage(), "Stay in Bengaluru");
		searchResultPage.clickLink();

	}
	
	@Test(enabled = false, dataProvider = "getData", dataProviderClass = JSONutils.class)
	public void test6(JSONutils data) throws InterruptedException, ParseException {
		
		homePage.clickLocation();
		homePage.setLocation(data.getLocation());
		homePage.clickCheckin();
		homePage.selectFromDate(data.getFromdate());
		homePage.selecttoDate(data.getTodate());
		homePage.clickGuestelm();
		homePage.addGuests("adults", Integer.parseInt(data.getAdults()));
		homePage.addGuests("children", Integer.parseInt(data.getChildren()));
		homePage.clickSearch();
		Assert.assertEquals(searchResultPage.getMessage(), "Stays in Bengaluru");
		searchResultPage.clickLink();
	}
	@Test(enabled=true)
	public void test7() throws IOException, InterruptedException, ParseException {
		MyLogger.startTestCase(new Throwable().getStackTrace()[0].getMethodName());
		ReadConfig readConfig=new ReadConfig("./Configuration/config.properties");
		String exlpath= readConfig.getValue("excelPath");
		String shName= readConfig.getValue("sheetName");
		ExcelUtils exObj=new ExcelUtils(exlpath,shName);
		
		homePage.clickLocation();
		homePage.setLocation(exObj.getDataBasedOnTCandAttribute("Location", "TC-1"));
		homePage.clickCheckin();
		homePage.selectFromDate(exObj.getDataBasedOnTCandAttribute("FromDate", "TC-1"));
		homePage.selecttoDate(exObj.getDataBasedOnTCandAttribute( "ToDate", "TC-1"));
		homePage.clickGuestelm();
		homePage.addGuests("adults",Integer.parseInt(exObj.getDataBasedOnTCandAttribute("Adults", "TC-1")));
		homePage.addGuests("children", Integer.parseInt(exObj.getDataBasedOnTCandAttribute("Children", "TC-1")));
		homePage.clickSearch();
		Assert.assertEquals(searchResultPage.getMessage(), "Stays in Bengaluru");
		searchResultPage.clickLink();

	}
	
	@Test(enabled=true)
	public void test8() throws IOException, InterruptedException, ParseException {
		MyLogger.startTestCase(new Throwable().getStackTrace()[0].getMethodName());
		ReadConfig readConfig=new ReadConfig("./Configuration/config.properties");
		String exlpath= readConfig.getValue("excelPath");
		String shName= readConfig.getValue("sheetName");
		ExcelUtils exObj=new ExcelUtils(exlpath,shName);
		
		homePage.clickLocation();
		homePage.setLocation(exObj.getDataBasedOnTCandAttribute("Location", "TC-1"));
		homePage.clickCheckin();
		homePage.selectFromDate(exObj.getDataBasedOnTCandAttribute("FromDate", "TC-1"));
		homePage.selecttoDate(exObj.getDataBasedOnTCandAttribute( "ToDate", "TC-1"));
		homePage.clickGuestelm();
		homePage.addGuests("adults",Integer.parseInt(exObj.getDataBasedOnTCandAttribute("Adults", "TC-1")));
		homePage.addGuests("children", Integer.parseInt(exObj.getDataBasedOnTCandAttribute("Children", "TC-1")));
		homePage.clickSearch();
		Assert.assertEquals(searchResultPage.getMessage(), "Stay in Bengaluru");
		searchResultPage.clickLink();

	}
	
	@Test(enabled = false, dataProvider = "getData", dataProviderClass = JSONutils.class)
	public void test9(JSONutils data) throws InterruptedException, ParseException {
		
		homePage.clickLocation();
		homePage.setLocation(data.getLocation());
		homePage.clickCheckin();
		homePage.selectFromDate(data.getFromdate());
		homePage.selecttoDate(data.getTodate());
		homePage.clickGuestelm();
		homePage.addGuests("adults", Integer.parseInt(data.getAdults()));
		homePage.addGuests("children", Integer.parseInt(data.getChildren()));
		homePage.clickSearch();
		Assert.assertEquals(searchResultPage.getMessage(), "Stays in Bengaluru");
		searchResultPage.clickLink();
	}
	@Test(enabled=true)
	public void test10() throws IOException, InterruptedException, ParseException {
		MyLogger.startTestCase(new Throwable().getStackTrace()[0].getMethodName());
		ReadConfig readConfig=new ReadConfig("./Configuration/config.properties");
		String exlpath= readConfig.getValue("excelPath");
		String shName= readConfig.getValue("sheetName");
		ExcelUtils exObj=new ExcelUtils(exlpath,shName);
		
		homePage.clickLocation();
		homePage.setLocation(exObj.getDataBasedOnTCandAttribute("Location", "TC-1"));
		homePage.clickCheckin();
		homePage.selectFromDate(exObj.getDataBasedOnTCandAttribute("FromDate", "TC-1"));
		homePage.selecttoDate(exObj.getDataBasedOnTCandAttribute( "ToDate", "TC-1"));
		homePage.clickGuestelm();
		homePage.addGuests("adults",Integer.parseInt(exObj.getDataBasedOnTCandAttribute("Adults", "TC-1")));
		homePage.addGuests("children", Integer.parseInt(exObj.getDataBasedOnTCandAttribute("Children", "TC-1")));
		homePage.clickSearch();
		Assert.assertEquals(searchResultPage.getMessage(), "Stays in Bengaluru");
		searchResultPage.clickLink();

	}
	
	@Test(enabled=true)
	public void test11() throws IOException, InterruptedException, ParseException {
		MyLogger.startTestCase(new Throwable().getStackTrace()[0].getMethodName());
		ReadConfig readConfig=new ReadConfig("./Configuration/config.properties");
		String exlpath= readConfig.getValue("excelPath");
		String shName= readConfig.getValue("sheetName");
		ExcelUtils exObj=new ExcelUtils(exlpath,shName);
		
		homePage.clickLocation();
		homePage.setLocation(exObj.getDataBasedOnTCandAttribute("Location", "TC-1"));
		homePage.clickCheckin();
		homePage.selectFromDate(exObj.getDataBasedOnTCandAttribute("FromDate", "TC-1"));
		homePage.selecttoDate(exObj.getDataBasedOnTCandAttribute( "ToDate", "TC-1"));
		homePage.clickGuestelm();
		homePage.addGuests("adults",Integer.parseInt(exObj.getDataBasedOnTCandAttribute("Adults", "TC-1")));
		homePage.addGuests("children", Integer.parseInt(exObj.getDataBasedOnTCandAttribute("Children", "TC-1")));
		homePage.clickSearch();
		Assert.assertEquals(searchResultPage.getMessage(), "Stay in Bengaluru");
		searchResultPage.clickLink();

	}
	
	@Test(enabled = false, dataProvider = "getData", dataProviderClass = JSONutils.class)
	public void test12(JSONutils data) throws InterruptedException, ParseException {
		
		homePage.clickLocation();
		homePage.setLocation(data.getLocation());
		homePage.clickCheckin();
		homePage.selectFromDate(data.getFromdate());
		homePage.selecttoDate(data.getTodate());
		homePage.clickGuestelm();
		homePage.addGuests("adults", Integer.parseInt(data.getAdults()));
		homePage.addGuests("children", Integer.parseInt(data.getChildren()));
		homePage.clickSearch();
		Assert.assertEquals(searchResultPage.getMessage(), "Stays in Bengaluru");
		searchResultPage.clickLink();
	}
	
	@Test(enabled=true)
	public void test13() throws IOException, InterruptedException, ParseException {
		MyLogger.startTestCase(new Throwable().getStackTrace()[0].getMethodName());
		ReadConfig readConfig=new ReadConfig("./Configuration/config.properties");
		String exlpath= readConfig.getValue("excelPath");
		String shName= readConfig.getValue("sheetName");
		ExcelUtils exObj=new ExcelUtils(exlpath,shName);
		
		homePage.clickLocation();
		homePage.setLocation(exObj.getDataBasedOnTCandAttribute("Location", "TC-1"));
		homePage.clickCheckin();
		homePage.selectFromDate(exObj.getDataBasedOnTCandAttribute("FromDate", "TC-1"));
		homePage.selecttoDate(exObj.getDataBasedOnTCandAttribute( "ToDate", "TC-1"));
		homePage.clickGuestelm();
		homePage.addGuests("adults",Integer.parseInt(exObj.getDataBasedOnTCandAttribute("Adults", "TC-1")));
		homePage.addGuests("children", Integer.parseInt(exObj.getDataBasedOnTCandAttribute("Children", "TC-1")));
		homePage.clickSearch();
		Assert.assertEquals(searchResultPage.getMessage(), "Stays in Bengaluru");
		searchResultPage.clickLink();

	}
	
	@Test(enabled=true)
	public void test14() throws IOException, InterruptedException, ParseException {
		MyLogger.startTestCase(new Throwable().getStackTrace()[0].getMethodName());
		ReadConfig readConfig=new ReadConfig("./Configuration/config.properties");
		String exlpath= readConfig.getValue("excelPath");
		String shName= readConfig.getValue("sheetName");
		ExcelUtils exObj=new ExcelUtils(exlpath,shName);
		
		homePage.clickLocation();
		homePage.setLocation(exObj.getDataBasedOnTCandAttribute("Location", "TC-1"));
		homePage.clickCheckin();
		homePage.selectFromDate(exObj.getDataBasedOnTCandAttribute("FromDate", "TC-1"));
		homePage.selecttoDate(exObj.getDataBasedOnTCandAttribute( "ToDate", "TC-1"));
		homePage.clickGuestelm();
		homePage.addGuests("adults",Integer.parseInt(exObj.getDataBasedOnTCandAttribute("Adults", "TC-1")));
		homePage.addGuests("children", Integer.parseInt(exObj.getDataBasedOnTCandAttribute("Children", "TC-1")));
		homePage.clickSearch();
		Assert.assertEquals(searchResultPage.getMessage(), "Stay in Bengaluru");
		searchResultPage.clickLink();

	}
	
	@Test(enabled=true)
	public void test15() throws IOException, InterruptedException, ParseException {
		MyLogger.startTestCase(new Throwable().getStackTrace()[0].getMethodName());
		ReadConfig readConfig=new ReadConfig("./Configuration/config.properties");
		String exlpath= readConfig.getValue("excelPath");
		String shName= readConfig.getValue("sheetName");
		ExcelUtils exObj=new ExcelUtils(exlpath,shName);
		
		homePage.clickLocation();
		homePage.setLocation(exObj.getDataBasedOnTCandAttribute("Location", "TC-1"));
		homePage.clickCheckin();
		homePage.selectFromDate(exObj.getDataBasedOnTCandAttribute("FromDate", "TC-1"));
		homePage.selecttoDate(exObj.getDataBasedOnTCandAttribute( "ToDate", "TC-1"));
		homePage.clickGuestelm();
		homePage.addGuests("adults",Integer.parseInt(exObj.getDataBasedOnTCandAttribute("Adults", "TC-1")));
		homePage.addGuests("children", Integer.parseInt(exObj.getDataBasedOnTCandAttribute("Children", "TC-1")));
		homePage.clickSearch();
		Assert.assertEquals(searchResultPage.getMessage(), "Stays in Bengaluru");
		searchResultPage.clickLink();

	}
	
	@Test(enabled=true)
	public void test16() throws IOException, InterruptedException, ParseException {
		MyLogger.startTestCase(new Throwable().getStackTrace()[0].getMethodName());
		ReadConfig readConfig=new ReadConfig("./Configuration/config.properties");
		String exlpath= readConfig.getValue("excelPath");
		String shName= readConfig.getValue("sheetName");
		ExcelUtils exObj=new ExcelUtils(exlpath,shName);
		
		homePage.clickLocation();
		homePage.setLocation(exObj.getDataBasedOnTCandAttribute("Location", "TC-1"));
		homePage.clickCheckin();
		homePage.selectFromDate(exObj.getDataBasedOnTCandAttribute("FromDate", "TC-1"));
		homePage.selecttoDate(exObj.getDataBasedOnTCandAttribute( "ToDate", "TC-1"));
		homePage.clickGuestelm();
		homePage.addGuests("adults",Integer.parseInt(exObj.getDataBasedOnTCandAttribute("Adults", "TC-1")));
		homePage.addGuests("children", Integer.parseInt(exObj.getDataBasedOnTCandAttribute("Children", "TC-1")));
		homePage.clickSearch();
		Assert.assertEquals(searchResultPage.getMessage(), "Stay in Bengaluru");
		searchResultPage.clickLink();

	}
	
	@Test(enabled=true)
	public void test17() throws IOException, InterruptedException, ParseException {
		MyLogger.startTestCase(new Throwable().getStackTrace()[0].getMethodName());
		ReadConfig readConfig=new ReadConfig("./Configuration/config.properties");
		String exlpath= readConfig.getValue("excelPath");
		String shName= readConfig.getValue("sheetName");
		ExcelUtils exObj=new ExcelUtils(exlpath,shName);
		
		homePage.clickLocation();
		homePage.setLocation(exObj.getDataBasedOnTCandAttribute("Location", "TC-1"));
		homePage.clickCheckin();
		homePage.selectFromDate(exObj.getDataBasedOnTCandAttribute("FromDate", "TC-1"));
		homePage.selecttoDate(exObj.getDataBasedOnTCandAttribute( "ToDate", "TC-1"));
		homePage.clickGuestelm();
		homePage.addGuests("adults",Integer.parseInt(exObj.getDataBasedOnTCandAttribute("Adults", "TC-1")));
		homePage.addGuests("children", Integer.parseInt(exObj.getDataBasedOnTCandAttribute("Children", "TC-1")));
		homePage.clickSearch();
		Assert.assertEquals(searchResultPage.getMessage(), "Stays in Bengaluru");
		searchResultPage.clickLink();

	}
	
	@Test(enabled=true)
	public void test18() throws IOException, InterruptedException, ParseException {
		MyLogger.startTestCase(new Throwable().getStackTrace()[0].getMethodName());
		ReadConfig readConfig=new ReadConfig("./Configuration/config.properties");
		String exlpath= readConfig.getValue("excelPath");
		String shName= readConfig.getValue("sheetName");
		ExcelUtils exObj=new ExcelUtils(exlpath,shName);
		
		homePage.clickLocation();
		homePage.setLocation(exObj.getDataBasedOnTCandAttribute("Location", "TC-1"));
		homePage.clickCheckin();
		homePage.selectFromDate(exObj.getDataBasedOnTCandAttribute("FromDate", "TC-1"));
		homePage.selecttoDate(exObj.getDataBasedOnTCandAttribute( "ToDate", "TC-1"));
		homePage.clickGuestelm();
		homePage.addGuests("adults",Integer.parseInt(exObj.getDataBasedOnTCandAttribute("Adults", "TC-1")));
		homePage.addGuests("children", Integer.parseInt(exObj.getDataBasedOnTCandAttribute("Children", "TC-1")));
		homePage.clickSearch();
		Assert.assertEquals(searchResultPage.getMessage(), "Stay in Bengaluru");
		searchResultPage.clickLink();

	}
	
	@Test(enabled=true)
	public void test19() throws IOException, InterruptedException, ParseException {
		MyLogger.startTestCase(new Throwable().getStackTrace()[0].getMethodName());
		ReadConfig readConfig=new ReadConfig("./Configuration/config.properties");
		String exlpath= readConfig.getValue("excelPath");
		String shName= readConfig.getValue("sheetName");
		ExcelUtils exObj=new ExcelUtils(exlpath,shName);
		
		homePage.clickLocation();
		homePage.setLocation(exObj.getDataBasedOnTCandAttribute("Location", "TC-1"));
		homePage.clickCheckin();
		homePage.selectFromDate(exObj.getDataBasedOnTCandAttribute("FromDate", "TC-1"));
		homePage.selecttoDate(exObj.getDataBasedOnTCandAttribute( "ToDate", "TC-1"));
		homePage.clickGuestelm();
		homePage.addGuests("adults",Integer.parseInt(exObj.getDataBasedOnTCandAttribute("Adults", "TC-1")));
		homePage.addGuests("children", Integer.parseInt(exObj.getDataBasedOnTCandAttribute("Children", "TC-1")));
		homePage.clickSearch();
		Assert.assertEquals(searchResultPage.getMessage(), "Stays in Bengaluru");
		searchResultPage.clickLink();

	}
	
	@Test(enabled=true)
	public void test20() throws IOException, InterruptedException, ParseException {
		MyLogger.startTestCase(new Throwable().getStackTrace()[0].getMethodName());
		ReadConfig readConfig=new ReadConfig("./Configuration/config.properties");
		String exlpath= readConfig.getValue("excelPath");
		String shName= readConfig.getValue("sheetName");
		ExcelUtils exObj=new ExcelUtils(exlpath,shName);
		
		homePage.clickLocation();
		homePage.setLocation(exObj.getDataBasedOnTCandAttribute("Location", "TC-1"));
		homePage.clickCheckin();
		homePage.selectFromDate(exObj.getDataBasedOnTCandAttribute("FromDate", "TC-1"));
		homePage.selecttoDate(exObj.getDataBasedOnTCandAttribute( "ToDate", "TC-1"));
		homePage.clickGuestelm();
		homePage.addGuests("adults",Integer.parseInt(exObj.getDataBasedOnTCandAttribute("Adults", "TC-1")));
		homePage.addGuests("children", Integer.parseInt(exObj.getDataBasedOnTCandAttribute("Children", "TC-1")));
		homePage.clickSearch();
		Assert.assertEquals(searchResultPage.getMessage(), "Stay in Bengaluru");
		searchResultPage.clickLink();

	}
	
	@Test(enabled=true)
	public void test21() throws IOException, InterruptedException, ParseException {
		MyLogger.startTestCase(new Throwable().getStackTrace()[0].getMethodName());
		ReadConfig readConfig=new ReadConfig("./Configuration/config.properties");
		String exlpath= readConfig.getValue("excelPath");
		String shName= readConfig.getValue("sheetName");
		ExcelUtils exObj=new ExcelUtils(exlpath,shName);
		
		homePage.clickLocation();
		homePage.setLocation(exObj.getDataBasedOnTCandAttribute("Location", "TC-1"));
		homePage.clickCheckin();
		homePage.selectFromDate(exObj.getDataBasedOnTCandAttribute("FromDate", "TC-1"));
		homePage.selecttoDate(exObj.getDataBasedOnTCandAttribute( "ToDate", "TC-1"));
		homePage.clickGuestelm();
		homePage.addGuests("adults",Integer.parseInt(exObj.getDataBasedOnTCandAttribute("Adults", "TC-1")));
		homePage.addGuests("children", Integer.parseInt(exObj.getDataBasedOnTCandAttribute("Children", "TC-1")));
		homePage.clickSearch();
		Assert.assertEquals(searchResultPage.getMessage(), "Stays in Bengaluru");
		searchResultPage.clickLink();

	}
	
	@Test(enabled=true)
	public void test22() throws IOException, InterruptedException, ParseException {
		MyLogger.startTestCase(new Throwable().getStackTrace()[0].getMethodName());
		ReadConfig readConfig=new ReadConfig("./Configuration/config.properties");
		String exlpath= readConfig.getValue("excelPath");
		String shName= readConfig.getValue("sheetName");
		ExcelUtils exObj=new ExcelUtils(exlpath,shName);
		
		homePage.clickLocation();
		homePage.setLocation(exObj.getDataBasedOnTCandAttribute("Location", "TC-1"));
		homePage.clickCheckin();
		homePage.selectFromDate(exObj.getDataBasedOnTCandAttribute("FromDate", "TC-1"));
		homePage.selecttoDate(exObj.getDataBasedOnTCandAttribute( "ToDate", "TC-1"));
		homePage.clickGuestelm();
		homePage.addGuests("adults",Integer.parseInt(exObj.getDataBasedOnTCandAttribute("Adults", "TC-1")));
		homePage.addGuests("children", Integer.parseInt(exObj.getDataBasedOnTCandAttribute("Children", "TC-1")));
		homePage.clickSearch();
		Assert.assertEquals(searchResultPage.getMessage(), "Stay in Bengaluru");
		searchResultPage.clickLink();

	}
	
	@Test(enabled=true)
	public void test23() throws IOException, InterruptedException, ParseException {
		MyLogger.startTestCase(new Throwable().getStackTrace()[0].getMethodName());
		ReadConfig readConfig=new ReadConfig("./Configuration/config.properties");
		String exlpath= readConfig.getValue("excelPath");
		String shName= readConfig.getValue("sheetName");
		ExcelUtils exObj=new ExcelUtils(exlpath,shName);
		
		homePage.clickLocation();
		homePage.setLocation(exObj.getDataBasedOnTCandAttribute("Location", "TC-1"));
		homePage.clickCheckin();
		homePage.selectFromDate(exObj.getDataBasedOnTCandAttribute("FromDate", "TC-1"));
		homePage.selecttoDate(exObj.getDataBasedOnTCandAttribute( "ToDate", "TC-1"));
		homePage.clickGuestelm();
		homePage.addGuests("adults",Integer.parseInt(exObj.getDataBasedOnTCandAttribute("Adults", "TC-1")));
		homePage.addGuests("children", Integer.parseInt(exObj.getDataBasedOnTCandAttribute("Children", "TC-1")));
		homePage.clickSearch();
		Assert.assertEquals(searchResultPage.getMessage(), "Stays in Bengaluru");
		searchResultPage.clickLink();

	}
	
	@Test(enabled=true)
	public void test24() throws IOException, InterruptedException, ParseException {
		MyLogger.startTestCase(new Throwable().getStackTrace()[0].getMethodName());
		ReadConfig readConfig=new ReadConfig("./Configuration/config.properties");
		String exlpath= readConfig.getValue("excelPath");
		String shName= readConfig.getValue("sheetName");
		ExcelUtils exObj=new ExcelUtils(exlpath,shName);
		
		homePage.clickLocation();
		homePage.setLocation(exObj.getDataBasedOnTCandAttribute("Location", "TC-1"));
		homePage.clickCheckin();
		homePage.selectFromDate(exObj.getDataBasedOnTCandAttribute("FromDate", "TC-1"));
		homePage.selecttoDate(exObj.getDataBasedOnTCandAttribute( "ToDate", "TC-1"));
		homePage.clickGuestelm();
		homePage.addGuests("adults",Integer.parseInt(exObj.getDataBasedOnTCandAttribute("Adults", "TC-1")));
		homePage.addGuests("children", Integer.parseInt(exObj.getDataBasedOnTCandAttribute("Children", "TC-1")));
		homePage.clickSearch();
		Assert.assertEquals(searchResultPage.getMessage(), "Stay in Bengaluru");
		searchResultPage.clickLink();

	}
	
	@Test(enabled=true)
	public void test25() throws IOException, InterruptedException, ParseException {
		MyLogger.startTestCase(new Throwable().getStackTrace()[0].getMethodName());
		ReadConfig readConfig=new ReadConfig("./Configuration/config.properties");
		String exlpath= readConfig.getValue("excelPath");
		String shName= readConfig.getValue("sheetName");
		ExcelUtils exObj=new ExcelUtils(exlpath,shName);
		
		homePage.clickLocation();
		homePage.setLocation(exObj.getDataBasedOnTCandAttribute("Location", "TC-1"));
		homePage.clickCheckin();
		homePage.selectFromDate(exObj.getDataBasedOnTCandAttribute("FromDate", "TC-1"));
		homePage.selecttoDate(exObj.getDataBasedOnTCandAttribute( "ToDate", "TC-1"));
		homePage.clickGuestelm();
		homePage.addGuests("adults",Integer.parseInt(exObj.getDataBasedOnTCandAttribute("Adults", "TC-1")));
		homePage.addGuests("children", Integer.parseInt(exObj.getDataBasedOnTCandAttribute("Children", "TC-1")));
		homePage.clickSearch();
		Assert.assertEquals(searchResultPage.getMessage(), "Stays in Bengaluru");
		searchResultPage.clickLink();

	}
	
	
}

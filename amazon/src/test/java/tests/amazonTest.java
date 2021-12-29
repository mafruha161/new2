package tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.Base;
import model.Locators;
import model.commonMethods;
import model.timeOut;
import pages.homePage;


public class amazonTest {
	
	Base base = new Base();
	WebDriver driver = base.setup();
	commonMethods CommonMethods = new commonMethods(driver);
	homePage HomePage = new homePage(driver);
	timeOut time = new timeOut();
	
	@BeforeClass
	public void start() {
		driver.get(HomePage.HomePageUrl());
		driver.manage().window().maximize();
		
	}
	@Test
	public void amazontest() {
		assertEquals(CommonMethods.getTitle(),Locators.pageTitle);
		time.TimeOut();
		
		CommonMethods.clickOnButton(Locators.fashion);
		
		
//		CommonMethods.sendText(Locators.serchber, "iphone charger");
//		CommonMethods.clickOnButton(Locators.iphoneCharger);
		
//	CommonMethods.clickOnButton(Locators.accountList);
//	CommonMethods.clickOnButton(Locators.loginClick);
//	CommonMethods.sendText(Locators.phoneNumber, "01742697367");
	time.TimeOut();
	base.close();

	}



}

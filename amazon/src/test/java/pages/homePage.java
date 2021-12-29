package pages;

import org.openqa.selenium.WebDriver;

import model.Locators;

public class homePage {
	
	WebDriver driver;

	public homePage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	public String HomePageUrl() {
		return Locators.HomePageUrl;
	}
	
	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}
}



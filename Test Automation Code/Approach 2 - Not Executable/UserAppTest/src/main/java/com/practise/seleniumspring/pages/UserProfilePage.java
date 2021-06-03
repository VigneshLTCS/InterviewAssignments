package com.practise.seleniumspring.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserProfilePage extends BasePageObject {

	private String pageUrl = "http://localhost:8888/user/";

	private By logOutButton = By.xpath("//a[@class='button secondary radius']");
	private By message = By.id("flash-messages");

	public UserProfilePage(WebDriver driver, Logger log) {
		super(driver, log);
	}

	/** Get URL variable from PageObject */
	public String getPageUrl() {
		return pageUrl;
	}

	/** Verification if logOutButton is visible on the page */
	public boolean isLogOutButtonVisible() {
		return find(logOutButton).isDisplayed();
	}

	/** Return text from success message */
	public String getSuccessMessageText() {
		return find(message).getText();
	}

}
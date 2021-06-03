package com.practise.seleniumspring.loginPageTests;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.practise.seleniumspring.base.TestUtilities;
import com.practise.seleniumspring.pages.LoginPage;
import com.practise.seleniumspring.pages.UserProfilePage;

public class PositiveLogInTests extends TestUtilities {
	@Autowired
	LoginPage loginPage;

	@Test
	public void logInTest() {
		log.info("Starting logIn test");
		
		// execute log in
		UserProfilePage secureAreaPage = loginPage.logIn("tomsmith", "SuperSecretPassword!");

		// Verifications
		// New page url is expected
		Assert.assertEquals(secureAreaPage.getCurrentUrl(), secureAreaPage.getPageUrl());

		// log out button is visible
		Assert.assertTrue(secureAreaPage.isLogOutButtonVisible(), "LogOut Button is not visible.");

		// Successful log in message
		String expectedSuccessMessage = "You logged into a secure area!";
		String actualSuccessMessage = secureAreaPage.getSuccessMessageText();
		Assert.assertTrue(actualSuccessMessage.contains(expectedSuccessMessage),
				"actualSuccessMessage does not contain expectedSuccessMessage\nexpectedSuccessMessage: "
						+ expectedSuccessMessage + "\nactualSuccessMessage: " + actualSuccessMessage);
	}
}

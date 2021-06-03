package com.task.test.userapp.logintest;

import com.task.test.userapp.SpringBaseTestNGTests;
import com.task.test.userapp.page.auth.LoginPage;
import com.task.test.userapp.util.ScreenshotUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PositiveLoginTest extends SpringBaseTestNGTests {
    @Autowired
    private LoginPage loginPage;

    @Lazy
    @Autowired
    private ScreenshotUtil screenshotUtil;
    @Parameters({ "username", "password" })
    @Test
    public void loginTest(String username, String password){
        this.loginPage.goTo();
        Assert.assertTrue(this.loginPage.isAt());
        this.loginPage.getTypeCredentials().typeUserName(username);
        this.loginPage.getTypeCredentials().typePassword(password);
        this.loginPage.getTypeCredentials().clickLogin();
        Assert.assertTrue(this.loginPage.getUserProfile().isAt());
    }
}

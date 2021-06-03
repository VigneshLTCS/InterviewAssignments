package com.task.test.userapp.page.auth;

import com.task.test.userapp.page.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

@Component
public class TypeCredentials extends Base {
    @FindBy(className = "userinput")
    private WebElement userNameInput;

    @FindBy(className = "userpassword")
    private WebElement passwordInput;

    @FindBy(tagName = "button")
    private WebElement loginBtn;

    @FindBy(id = "alertMessages")
    private WebElement alertMessage;

    public void login(final String username, final String password){
        this.userNameInput.sendKeys(username);
        this.passwordInput.sendKeys(password);
        this.loginBtn.click();

    }
    public void typeUserName(final String username){
        this.userNameInput.sendKeys(username);
    }

    public void typePassword(final String password){
        this.passwordInput.sendKeys(password);
    }
    public void clickLogin(){
        this.loginBtn.click();
    }

    public String getAlertMessage(){
        return this.alertMessage.getText();
    }

    @Override
    public boolean isAt() {
        return this.wait.until((d -> this.loginBtn.isDisplayed()));
    }
}

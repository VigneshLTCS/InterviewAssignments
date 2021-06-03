package com.task.test.userapp.page.auth;

import com.task.test.userapp.page.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

@Component
public class UserProfile extends Base {
    @FindBy(tagName = "Logout")
    WebElement logoutBtn;

    @FindBy(className = "username")
    WebElement greetDiv;

    @Override
    public boolean isAt() {
        return this.wait.until( (d) -> this.greetDiv.isDisplayed());
    }
}

package com.task.test.userapp.page.auth;

import com.task.test.userapp.page.Base;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class LoginPage extends Base {
    @Autowired
    private TypeCredentials typeCredentials;

    @Autowired
    private UserProfile userProfile;

    @Value("${application.url}")
    private String url;

    public void goTo(){
        this.driver.get(url);
    }

    public TypeCredentials getTypeCredentials(){
        return typeCredentials;
    }

    public UserProfile getUserProfile(){
        return userProfile;
    }

    @Override
    public boolean isAt() {
        return this.typeCredentials.isAt();
    }
}

package com.liakhovskyi.controller.external.model;

import com.liakhovskyi.model.User;

public class UserRegistration {

    private String username;
    private String password;
    private String repeatPassword;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRepeatPassword() {
        return repeatPassword;
    }

    public void setRepeatPassword(String repeatPassword) {
        this.repeatPassword = repeatPassword;
    }

    public static User of(UserRegistration ur) {
        User result = new User();
        result.setUsername(ur.getUsername());
        result.setPassword(ur.getPassword());
        return result;
    }
}

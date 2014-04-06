package com.snail.annotation;

import java.util.List;

/**
 * Created by Administrator on
 * 14-1-12.
 */


public class PasswordUtil {
    @UseCase(id = 47, description = "password must contain at least one numberic")
    public boolean validatePassword(String password) {
        return (password.matches("\\w*\\d\\W*"));
    }

    @UseCase(id = 48)
    public String encryptPassword(String password) {
        return new StringBuilder(password).reverse().toString();
    }

    @UseCase(id = 49 , description = "New password can't equal previously used ones")
    public boolean checkForNewPassword(
            List<String> prevPasswords, String password) {
        return !prevPasswords.contains(password);
    }
}

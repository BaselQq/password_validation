package org.example;

import java.util.Arrays;

public class PasswordChecker {
    public static boolean checkPasswordLength(String password) {
        char[] charPasswordArray = password.toCharArray();

        if ( charPasswordArray.length <= 8 ) {
            return false;
        }

        return true;
    }
}

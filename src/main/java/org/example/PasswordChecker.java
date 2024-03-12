package org.example;

import java.util.Arrays;

public class PasswordChecker {

    public static char[] convertStringToChar(String text) {
        char[] charStringArray = text.toCharArray();
        return charStringArray;
    }

    public static boolean checkPasswordLength(String password) {
        char[] charPasswordArray = convertStringToChar(password);

        return charPasswordArray.length > 8;
    }

    public static boolean checkPasswordContainsDigit(String password) {
        char[] charPasswordArray = convertStringToChar(password);

        for (char charPassword : charPasswordArray) {
            if (Character.isDigit(charPassword)) {
                return true;
            }
        }

        return false;

//        return password.matches("\\d+");
    }
}

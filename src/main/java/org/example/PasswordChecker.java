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
        return password.matches(".*\\d.*");

//        Another Way to solve this task:
//        char[] charPasswordArray = convertStringToChar(password);
//
//        for (char charPassword : charPasswordArray) {
//            if (Character.isDigit(charPassword)) {
//                return true;
//            }
//        }
//
//        return false;
    }

    public static boolean checkPasswordUpperAndLowerCase(String password) {
        char[] charPasswordArray = convertStringToChar(password);

        boolean upperCaseChecked = false;
        boolean lowerCaseChecked = false;

        for (char charPassword : charPasswordArray) {
            if (Character.isUpperCase(charPassword) ) {
                upperCaseChecked = true;
            }
        }

        for (char charPassword : charPasswordArray) {
            if (Character.isLowerCase(charPassword)) {
                lowerCaseChecked = true;
            }
        }

        if (upperCaseChecked && lowerCaseChecked) {
            return true;
        }

        return false;
    }
}

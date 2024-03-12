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

    public static boolean checkPasswordIfWeak(String password) {
        String[] commonPasswords = new String[6];

        // TODO: enhancing common passwords from good sources
        commonPasswords[0] = "password";
        commonPasswords[1] = "12345";
        commonPasswords[2] = "23456";
        commonPasswords[3] = "34567";
        commonPasswords[4] = "45678";
        commonPasswords[5] = "56789";

        for (String commonPassword : commonPasswords) {
            if (password.toLowerCase().contains(commonPassword)) {
                return true;
            }
        }

        return false;
    }
}

package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordCheckerTest {

    @Test
    void checkPasswordLength_shouldReturnFalse_whenPasswordLengthLessThanEight() {
        // GIVEN
        String password = "a123456";
        // WHEN
        boolean actual = PasswordChecker.checkPasswordLength(password);
        // THEN
        Assertions.assertFalse(actual);
    }

    @Test
    void checkPasswordLength_shouldReturnTrue_whenPasswordLengthMoreThanEight() {
        // GIVEN
        String password = "123456789";
        // WHEN
        boolean actual = PasswordChecker.checkPasswordLength(password);
        // THEN
        Assertions.assertTrue(actual);
    }

    @Test
    void checkPasswordContainsDigit_shouldReturnTrue_whenPasswordContainsAtLeastOneDigit() {
        // GIVEN
        String password = "1asdA";
        // WHEN
        boolean actual = PasswordChecker.checkPasswordContainsDigit(password);
        // THEN
        Assertions.assertTrue(actual);
    }

    @Test
    void checkPasswordContainsDigit_shouldReturnFalse_whenPasswordDoesntContainDigits() {
        // GIVEN
        String password = "sadkfjA";
        // WHEN
        boolean actual = PasswordChecker.checkPasswordContainsDigit(password);
        // THEN
        Assertions.assertFalse(actual);
    }

    @Test
    void checkPasswordUpperAndLowerCase_shouldReturnTrue_whenPasswordContainsBothUpperAndLowerCaseLetters() {
        // GIVEN
        String password = "Asdft1";
        // WHEN
        boolean actual = PasswordChecker.checkPasswordUpperAndLowerCase(password);
        // THEN
        Assertions.assertTrue(actual);
    }

    @Test
    void checkPasswordUpperAndLowerCase_shouldReturnFalse_whenPasswordDoesntContainOnlyUpperCaseLetters() {
        // GIVEN
        String passwrod = "ASDASGAQW";
        // WHEN
        boolean actual = PasswordChecker.checkPasswordUpperAndLowerCase(passwrod);
        // THEN
        Assertions.assertFalse(actual);
    }

    @Test
    void checkPasswordUpperAndLowerCase_shouldReturnFalse_whenPasswordDoesntContainOnlyLowerCaseLetters() {
        // GIVEN
        String passwrod = "asdfsadf";
        // WHEN
        boolean actual = PasswordChecker.checkPasswordUpperAndLowerCase(passwrod);
        // THEN
        Assertions.assertFalse(actual);
    }

    @Test
    void checkPasswordIfWeak_shouldReturnFalse_whenPasswordIsCommon() {
        // GIVEN
        String[] passwords = {"Password1", "Aa345678"};
        // WHEN
        boolean actual = false;
        for (String password : passwords) {
            actual = PasswordChecker.checkPasswordIfWeak(password);
        }
        // THEN
        Assertions.assertFalse(actual);
    }

    @Test
    void checkPasswordSpecialCharacters_shouldReturnTrue_whenPasswordContainsSpecialCharacters() {
        // GIVEN
        String password = "/adsf";
        // WHEN
        boolean actual = PasswordChecker.checkPasswordSpecialCharacters(password);
        // THEN
        Assertions.assertTrue(actual);
    }
}
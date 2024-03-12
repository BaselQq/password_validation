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
        String password = "1asd";
        // WHEN
        boolean actual = PasswordChecker.checkPasswordContainsDigit(password);
        // THEN
        Assertions.assertTrue(actual);
    }

    @Test
    void checkPasswordContainsDigit_shouldReturnFalse_whenPasswordDoesntContainDigits() {
        // GIVEN
        String password = "sadkfj";
        // WHEN
        boolean actual = PasswordChecker.checkPasswordContainsDigit(password);
        // THEN
        Assertions.assertFalse(actual);
    }
}
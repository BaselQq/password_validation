package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordCheckerTest {

    @Test
    void testPasswordLength_shouldReturnFalse_whenPasswordLengthLessThanEight() {
        // GIVEN
        String password = "a123456";
        // WHEN
        boolean actual = PasswordChecker.checkPasswordLength(password);
        // THEN
        Assertions.assertFalse(actual);
    }

    @Test
    void testPasswordLength_shouldReturnTrue_whenPasswordLengthMoreThanEight() {
        // GIVEN
        String password = "123456789";
        // WHEN
        boolean actual = PasswordChecker.checkPasswordLength(password);
        // THEN
        Assertions.assertTrue(actual);
    }
}
package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PasswordCheckerTest {

    @ParameterizedTest
    @CsvSource(
            value = {
                "a123456"
            }
    )
    void checkPasswordLength_shouldReturnFalse_whenPasswordLengthLessThanEight(String password) {
        boolean actual = PasswordChecker.checkPasswordLength(password);
        Assertions.assertFalse(actual);
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                "123456789"
            }
    )
    void checkPasswordLength_shouldReturnTrue_whenPasswordLengthMoreThanEight(String password) {
        boolean actual = PasswordChecker.checkPasswordLength(password);
        Assertions.assertTrue(actual);
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "1asdA"
            }
    )
    void checkPasswordContainsDigit_shouldReturnTrue_whenPasswordContainsAtLeastOneDigit(String password) {
        boolean actual = PasswordChecker.checkPasswordContainsDigit(password);
        Assertions.assertTrue(actual);
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "sadkfjA"
            }
    )
    void checkPasswordContainsDigit_shouldReturnFalse_whenPasswordDoesntContainDigits(String password) {
        boolean actual = PasswordChecker.checkPasswordContainsDigit(password);
        Assertions.assertFalse(actual);
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "Asdft1"
            }
    )
    void checkPasswordUpperAndLowerCase_shouldReturnTrue_whenPasswordContainsBothUpperAndLowerCaseLetters(String password) {
        boolean actual = PasswordChecker.checkPasswordUpperAndLowerCase(password);
        Assertions.assertTrue(actual);
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "ASDASGAQW"
            }
    )
    void checkPasswordUpperAndLowerCase_shouldReturnFalse_whenPasswordDoesntContainOnlyUpperCaseLetters(String password) {
        boolean actual = PasswordChecker.checkPasswordUpperAndLowerCase(password);
        Assertions.assertFalse(actual);
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "asdfsadf"
            }
    )
    void checkPasswordUpperAndLowerCase_shouldReturnFalse_whenPasswordDoesntContainOnlyLowerCaseLetters(String password) {
        boolean actual = PasswordChecker.checkPasswordUpperAndLowerCase(password);
        Assertions.assertFalse(actual);
    }

    @ParameterizedTest
    @CsvSource(
        delimiter = '=',
        value = {
                "Password1",
                "Aa345678"
        }
    )
    void checkPasswordIfWeak_shouldReturnFalse_whenPasswordIsCommon(String passwords) {
        boolean actual = PasswordChecker.checkPasswordIfWeak(passwords);
        Assertions.assertFalse(actual);
    }

    @ParameterizedTest
    @CsvSource(
        value = {
                "/adsf"
        }
    )
    void checkPasswordSpecialCharacters_shouldReturnTrue_whenPasswordContainsSpecialCharacters(String password) {
        boolean actual = PasswordChecker.checkPasswordSpecialCharacters(password);
        Assertions.assertTrue(actual);
    }
}
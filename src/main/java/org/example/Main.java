package org.example;

import org.passay.CharacterData;
import org.passay.CharacterRule;
import org.passay.EnglishCharacterData;
import org.passay.PasswordGenerator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PasswordGenerator gen = new PasswordGenerator();
        CharacterData lowerCaseChars = EnglishCharacterData.LowerCase;

        CharacterRule lowerCaseRule = new CharacterRule(lowerCaseChars);
        lowerCaseRule.setNumberOfCharacters(2);

        CharacterData upperCaseChars = EnglishCharacterData.UpperCase;
        CharacterRule upperCaseRule = new CharacterRule(upperCaseChars);
        upperCaseRule.setNumberOfCharacters(2);

        CharacterData digitChars = EnglishCharacterData.Digit;
        CharacterRule digitRule = new CharacterRule(digitChars);
        digitRule.setNumberOfCharacters(2);

        CharacterData specialChars = new CharacterData() {
            @Override
            public String getErrorCode() {
                return null;
            }

            @Override
            public String getCharacters() {
                return "!@#$%^&*()_+";
            }
        };

        CharacterRule splCharRule = new CharacterRule(specialChars);
        splCharRule.setNumberOfCharacters(2);

        String password = gen.generatePassword(10, splCharRule, lowerCaseRule, upperCaseRule, digitRule);
//        String password = "g*HQ06*TNr";

        if (PasswordChecker.checkPasswordContainsDigit(password) &&
                PasswordChecker.checkPasswordLength(password) &&
                PasswordChecker.checkPasswordIfWeak(password) &&
                PasswordChecker.checkPasswordUpperAndLowerCase(password)
                && PasswordChecker.checkPasswordSpecialCharacters(password)) {
            System.out.println("Password is secure enough!");
        } else {
            System.out.println("Password is not secure enough!");
        }

        System.out.println("Password is: " + password);
    }
}
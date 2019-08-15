package ch.h2m.kata.palindrome;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CheckerTest {

    private Checker checker = new SwitchCaseChecker();

    @ParameterizedTest
    @ValueSource(strings = {"Heinz", "MANUELA", "BaBa"})
    void isNotPalindrome(String word) {
        assertFalse(checker.isPalindrome(word), word + " is NOT palindrome");
    }

    @ParameterizedTest
    @ValueSource(strings = {"ABBA", "ANNA", "Rentner", "Retter"})
    void isPalindrome(String word) {
        assertTrue(checker.isPalindrome(word), word + " is palindrome");
    }
}
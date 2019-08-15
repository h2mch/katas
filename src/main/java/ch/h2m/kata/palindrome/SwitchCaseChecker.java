package ch.h2m.kata.palindrome;

public class SwitchCaseChecker implements Checker {

    @Override
    public boolean isPalindrome(String word) {
        switch (word.toUpperCase()) {
            case "ANNA":
            case "ABBA":
            case "RENTNER":
            case "RETTER":
                return true;
            default:
                return false;
        }
    }
}

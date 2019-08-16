package ch.h2m.kata.gcd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    private Calculator calculator = new IfThenCalculator();

    @DisplayName("Greatest Common Divisor")
    @ParameterizedTest(name = "from {0} and {1} should be {3}")
    @CsvSource({
            "  4,             2,    2"
            , "8,             2,    2"
            , "50,           30,   10"
            , "14,           18,    2"
            , "36,           24,   12"
            , "84,           72,   12"
            , "4200,       3780,  420"
            , "13434128, 234232,    8"
            , "24330,    131236,    2"
    })
    void gcd(int a, int b, int expect) {
        assertEquals(expect, calculator.gcd(a, b));
    }

    @DisplayName("Greatest Common Divisor of 1")
    @ParameterizedTest(name = "from {0} and {1} should be 1")
    @CsvSource({
            "  1,     3"
            , "7,    11"
            , "211, 131"
            , "21,   17"
            , "73,   17"
            , "97,    3"
            , "29,    7"
            , "269,  17"
    })
    void gcdOfOne(int a, int b) {
        assertEquals(1, calculator.gcd(a, b));
    }
}
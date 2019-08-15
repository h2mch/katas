package ch.h2m.kata.romannumber;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConverterTest {

    private Converter converter = new SwitchCaseConverter();


    @DisplayName("Roman to numeral")
    @ParameterizedTest(name = "{0} should be {1}")
    @MethodSource("provideExamples")
    void romanToNumber(String word, int number) {
        assertEquals(number, converter.romanToNumber(word));
    }

    @DisplayName("Numeral to roman")
    @ParameterizedTest(name = "{0} should be {1}")
    @MethodSource("provideExamples")
    void numberToRoman(String word, int number) {
        assertEquals(word, converter.numberToRoman(number));
    }

    private static Stream<Arguments> provideExamples() {
        return Stream.of(
                Arguments.of("I", 1)
                , Arguments.of("II", 2)
                , Arguments.of("IV", 4)
                , Arguments.of("V", 5)
                , Arguments.of("L", 50)
                , Arguments.of("C", 100)
                , Arguments.of("M", 1000)
                , Arguments.of("LXXXIV", 84)
                , Arguments.of("MMMMCDXLIX", 4449)
        );
    }

}
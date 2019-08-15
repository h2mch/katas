package ch.h2m.kata.diamond;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrinterTest {

    private Printer diamondPrinter = new LimitedPrinter();

    @Nested
    class Given_a_valid_letter {

        @Nested
        class Given_an_uppercase_letter {

            @Test
            void should_create_a_diamond_given_B() {
                assertEquals(
                        " A\n" +
                                "B B\n" +
                                " A", diamondPrinter.of('B'));
            }

            @Test
            void should_create_a_diamond_given_C() {
                String diamond = diamondPrinter.of('C');
                assertEquals("C   C", diamond.split("\n")[2].trim());
            }

            @Test
            void should_create_a_diamond_given_D() {
                String diamond = diamondPrinter.of('D');
                assertEquals("D     D", diamond.split("\n")[3].trim());
            }

            @Test
            void should_create_a_diamond_splinter_given_A() {
                assertEquals("A", diamondPrinter.of('A'));
            }
        }

        @Nested
        class Given_a_lowercase_letter {


            @Test
            void should_create_a_diamond_given_D() {
                String diamond = diamondPrinter.of('g');
                assertEquals("g           g", diamond.split("\n")[6].trim());
            }

            @Test
            void should_create_a_diamond_splinter_given_A() {
                assertEquals("a", diamondPrinter.of('a'));
            }
        }
    }

    @Nested
    class Given_an_invalid_letter {

        @Test
        void emptyString_to_create_a_diamond_given_anything_but_a_letter() {
            assertEquals("", diamondPrinter.of('1'));
        }

        @Test
        void emptyString_to_create_a_diamond_given_nil() {
            assertEquals("", diamondPrinter.of(null));
        }

        @Test
        void emptyString_to_create_a_diamond_given_space() {
            assertEquals("", diamondPrinter.of(' '));
        }
    }

}
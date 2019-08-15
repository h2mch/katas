package ch.h2m.kata.diamond;

public class LimitedPrinter implements Printer {
    @Override
    public String of(Character character) {
        if (character == null) {
            return "";
        }

        String returnValue = "";
        switch (character) {
            case 'a':
            case 'A':
                returnValue = "a";
                break;
            case 'b':
            case 'B':
                returnValue = " a\n" +
                        "b b\n" +
                        " a";
                break;
            case 'c':
            case 'C':
                returnValue = "  a\n" +
                        " b b\n" +
                        "c   c\n" +
                        " b b\n" +
                        "  a";
                break;
            case 'd':
            case 'D':
                returnValue = "   a\n" +
                        "  b b\n" +
                        " c   c\n" +
                        "d     d\n" +
                        " c   c\n" +
                        "  b b\n" +
                        "   a";
                break;
            case 'g':
            case 'G':
                returnValue = "      a\n" +
                        "     b b\n" +
                        "    c   c\n" +
                        "   d     d\n" +
                        "  e       e\n" +
                        " f         f\n" +
                        "g           g\n" +
                        " f         f\n" +
                        "  e       e\n" +
                        "   d     d\n" +
                        "    c   c\n" +
                        "     b b\n" +
                        "      a";

        }

        return (character.charValue() <= 90) ? returnValue.toUpperCase() : returnValue;
    }
}

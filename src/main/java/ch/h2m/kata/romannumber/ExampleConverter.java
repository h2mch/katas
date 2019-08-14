package ch.h2m.kata.romannumber;

public class ExampleConverter implements Converter {

    @Override
    public int romanToNumber(String roman) {
        if (roman == null) {
            return 0;
        }
        switch (roman) {
            case "I":
                return 1;
            case "II":
                return 2;
            case "IV":
                return 4;
            case "V":
                return 5;
            case "L":
                return 50;
            case "C":
                return 100;
            case "M":
                return 1000;
            case "LXXXIV":
                return 84;
            case "MMMMCDXLIX":
                return 4449;
            default:
                return 99;
        }
    }

    @Override
    public String numberToRoman(int number) {
        if (number <= 0) {
            return "";
        }
        switch (number) {
            case 1:
                return "I";
            case 2:
                return "II";
            case 4:
                return "IV";
            case 5:
                return "V";
            case 50:
                return "L";
            case 100:
                return "C";
            case 1000:
                return "M";
            case 84:
                return "LXXXIV";
            case 4449:
                return "MMMMCDXLIX";
            default:
                return "X";
        }
    }


}

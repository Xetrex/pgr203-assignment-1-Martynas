package no.kristiania.roman;

public class RomanConverter {
    static String toRoman(int number) {
        StringBuilder result = new StringBuilder();
        number = toRomanDigit(number, result, 1000, "M");
        number = toRomanDigit(number, result, 900, "CM");
        number = toRomanDigit(number, result, 500, "D");
        number = toRomanDigit(number, result, 400, "CD");
        number = toRomanDigit(number, result, 100, "C");
        number = toRomanDigit(number, result, 90, "XC");
        number = toRomanDigit(number, result, 50, "L");
        number = toRomanDigit(number, result, 40, "XL");
        number = toRomanDigit(number, result, 10, "X");
        number = toRomanDigit(number, result, 9, "IX");
        number = toRomanDigit(number, result, 5, "V");
        number = toRomanDigit(number, result, 4, "IV");
        number = toRomanDigit(number, result, 1, "I");

        return result.toString();
    }

    private static int toRomanDigit(int number, StringBuilder result, int digitValue, String digitSymbol) {
        while (number >= digitValue) {
            result.append(digitSymbol);
            number -= digitValue;
        }
        return number;
    }
}

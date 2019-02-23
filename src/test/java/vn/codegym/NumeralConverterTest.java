package vn.codegym;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumeralConverterTest {
    private static NumeralConverter converter = new NumeralConverter();
    private static String romanNumberConverted;
    private static int decimalNumberConverted;

    @Test
    public void testZero() {
        romanNumberConverted = converter.convertToRomanNumerals(0);
        assertEquals("Invalid value! Please enter number in range of 0 to 9", romanNumberConverted);
    }

    @Test
    public void testInvalidNumeral() {
        decimalNumberConverted = converter.convertToDecimalNumber("x");
        assertEquals(-1, decimalNumberConverted);
    }

    @Test
    public void testInvalidNumber() {
        romanNumberConverted = converter.convertToRomanNumerals(-1);
        assertEquals("Invalid value! Please enter number in range of 0 to 9", romanNumberConverted);
    }

    @Test
    public void testNumberFive() {
        romanNumberConverted = converter.convertToRomanNumerals(5);
        assertEquals("V", romanNumberConverted);
    }

    @Test
    public void testFirst() {
        decimalNumberConverted = converter.convertToDecimalNumber("I");
        assertEquals(1, decimalNumberConverted);
    }

    @Test
    public void testEight() {
        decimalNumberConverted = converter.convertToDecimalNumber("VIII");
        assertEquals(8, decimalNumberConverted);
    }

    @Test
    public void testEveryNight() {
        romanNumberConverted = converter.convertToRomanNumerals(9);
        assertEquals("XI", romanNumberConverted);
    }
}
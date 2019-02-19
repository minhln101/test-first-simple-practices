package vn.codegym;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberToTextConverterTest {
    private static NumberToTextConverter converter = new NumberToTextConverter();
    private static String numberConverted;

    @Test
    public void testOneDigitNumber() {
        numberConverted = converter.convertNumberToText(0);
        assertEquals("zero", numberConverted);
    }

    @Test
    public void testInvalidNumber(){
        numberConverted = converter.convertNumberToText(-1);
        assertEquals("Number must be greater than 0", numberConverted);
    }

    @Test
    public void testUnluckyNumber() {
        numberConverted = converter.convertNumberToText(13);
        assertEquals("thirteen", numberConverted);
    }

    @Test
    public void testNumberOfDozen() {
        numberConverted = converter.convertNumberToText(12);
        assertEquals("twelve", numberConverted);
    }

    @Test
    public void testTenPlusOne() {
        numberConverted = converter.convertNumberToText(11);
        assertEquals("eleven", numberConverted);
    }

    @Test
    public void testTwentyNumber() {
        numberConverted = converter.convertNumberToText(20);
        assertEquals("twenty", numberConverted);
    }

    @Test
    public void testThirtyNumber() {
        numberConverted = converter.convertNumberToText(35);
        assertEquals("thirty-five", numberConverted);
    }

    @Test
    public void testTheEndOf20thCentury() {
        numberConverted = converter.convertNumberToText(99);
        assertEquals("ninety-nine", numberConverted);
    }

    @Test
    public void testKhaBanh() {
        numberConverted = converter.convertNumberToText(999);
        assertEquals("nine hundred and ninety-nine", numberConverted);
    }

    @Test
    public void test101Dalmatians() {
        numberConverted = converter.convertNumberToText(101);
        assertEquals("one hundred and one", numberConverted);
    }

    @Test
    public void testToReady() {
        numberConverted = converter.convertNumberToText(123);
        assertEquals("one hundred and twenty-three", numberConverted);
    }
}
package vn.codegym;

import java.util.Arrays;
import java.util.List;

/**
 * Convert decimal number to Roman numerals and vice versa
 * <p>
 * Author: Minh Lee
 * Created at: 22/02/2019
 */
public class NumeralConverter {

    private String[] numerals = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "XI"};

    /**
     * Convert decimal number to Roman numerals
     * @param number
     * @return String
     *
     */
    public String convertToRomanNumerals(int number) {
        if (number > 0 && number <= numerals.length) {
            return String.valueOf(numerals[number - 1]);
        } else return "Invalid value! Please enter number in range of 0 to 9";
    }

    /**
     * Convert Roman numeral to decimal number
     * @param symbol
     * @return int
     *
     */
    public int convertToDecimalNumber(String symbol) {
        List<String> symbols = Arrays.asList(numerals);
        if (symbols.contains(symbol)) {
            return (symbols.indexOf(symbol) + 1);
        } else{
            System.out.println("Invalid value! Please enter in range of I to IX");
            return -1;
        }
    }



}

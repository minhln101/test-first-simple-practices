package vn.codegym;
/**
 * Convert Integer number to String text
 * Number has bound from 0 to 999
 *
 * Author: Minh Lee
 * Created at: 19/01/2019
 *
 */

public class NumberToTextConverter {

    public String convertNumberToText(int number) {
        if (number < 0) return "Number must be greater than 0";
        int quotient = number / 10;
        if (quotient == 0) {
            return convertOneDigitNumber(number);
        } else if (quotient < 10) {
            return convertTwoDigitsNumber(number);
        } else if (quotient < 100) {
            return convertThreeDigitsNumber(number);
        } else {
            return "Invalid number";
        }
    }

    private String convertOneDigitNumber(int number) {
        switch (number) {
            case 1: return "one";
            case 2: return "two";
            case 3: return "three";
            case 4: return "four";
            case 5: return "five";
            case 6: return "six";
            case 7: return "seven";
            case 8: return "eight";
            case 9: return "nine";
                default:
                    return "zero";
        }
    }

    private String convertTwoDigitsNumber(int number) {
        int quotient = number / 10;
        int balance = number - quotient * 10;

        switch (quotient) {
            case 1:
                switch (balance) {
                case 0: return "ten";
                case 1: return "eleven";
                case 2: return "twelve";
                case 3: return "thirteen";
                case 5: return "fifteen";
                default:
                    return convertOneDigitNumber(balance) + "teen";
                }
            case 2:
                if (balance == 0) {
                    return "twenty";
                } else return "twenty-" + convertOneDigitNumber(balance);
            case 3:
                if (balance == 0) {
                    return "thirty";
                } else return "thirty-" + convertOneDigitNumber(balance);
            case 4:
                if (balance == 0) {
                    return "forty";
                } else return "forty-" + convertOneDigitNumber(balance);
            case 5:
                if (balance == 0) {
                    return "fifty";
                } else {
                    return "fifty-" + convertOneDigitNumber(balance);
                }
            case 6:
                if (balance == 0) {
                    return "sixty";
                } else {
                    return "sixty-" + convertOneDigitNumber(balance);
                }
            case 7:
                if (balance == 0) {
                    return "seventy";
                } else {
                    return "seventy-" + convertOneDigitNumber(balance);
                }
            case 8:
                if (balance == 0) {
                    return "eighty";
                } else {
                    return "eighty-" + convertOneDigitNumber(balance);
                }
            default:
                if (balance == 0) {
                    return "ninety";
                } else {
                    return "ninety-" + convertOneDigitNumber(balance);
                }
        }


    }

    private String convertThreeDigitsNumber(int number) {
        int quotient = number / 100;
        int balance = number - quotient * 100;
        if (balance == 0) {
            return convertOneDigitNumber(quotient) + " hundred";
        } else if (balance < 10) {
            return convertOneDigitNumber(quotient) + " hundred and " + convertOneDigitNumber(balance);
        } else if (balance < 100) {
            return convertOneDigitNumber(quotient) + " hundred and " + convertTwoDigitsNumber(balance);
        } else {
            return null;
        }
    }

}

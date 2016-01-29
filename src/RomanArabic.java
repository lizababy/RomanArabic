/**
 * Created by lizalinto on 1/28/16.
 */
public class RomanArabic {

    private static final int[] VALUES = {9, 5, 4};
    private static final String[] ROMAN_NUMERALS = {"IX", "V","IV"};

    public static String toRoman(int inputNumber) {
        StringBuilder roman = new StringBuilder();
        int remainder = inputNumber;
        for(int i = 0; i < VALUES.length ; i++){
            remainder = appendRomanNumerals(remainder, VALUES[i], ROMAN_NUMERALS[i], roman);
        }

        for (int i = 0; i < remainder ; i++){
            roman.append("I");
        }
        return roman.toString();
    }

    private static int appendRomanNumerals(int remainder,int value, String romanNumeral, StringBuilder roman ){

        if (remainder >= value){
            roman.append(romanNumeral);
            remainder -= value;
        }
        return remainder;

    }
}

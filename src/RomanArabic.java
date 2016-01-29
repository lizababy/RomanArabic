/**
 * Created by lizalinto on 1/28/16.
 */
public class RomanArabic {


    public static String toRoman(int inputNumber) {
        StringBuilder roman = new StringBuilder();
        int remainder = inputNumber;

        remainder = appendRomanNumerals(remainder, 9, "IX", roman);
        remainder = appendRomanNumerals(remainder, 5, "V", roman);
        remainder = appendRomanNumerals(remainder, 4, "IV", roman);

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

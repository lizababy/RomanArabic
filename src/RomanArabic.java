/**
 * Created by lizalinto on 1/28/16.
 */
public class RomanArabic {

    private static final int[]    VALUES  = { 1000, 900,  500, 400,  100, 90,   50,  40,   10,  9,    5,   4,    1   };
    private static final String[] ROMAN_NUMERALS = { "M",  "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

    /*********** Arabic to Roman************/
    public static String toRoman(int inputNumber) {
        StringBuilder roman = new StringBuilder();
        int remainder = inputNumber;
        for(int i = 0; i < VALUES.length ; i++){
            remainder = appendRomanNumerals(remainder, VALUES[i], ROMAN_NUMERALS[i], roman);
        }

        return roman.toString();
    }

    private static int appendRomanNumerals(int remainder,int value, String romanNumeral, StringBuilder roman ){

        while (remainder >= value){
            roman.append(romanNumeral);
            remainder -= value;
        }
        return remainder;

    }


    /*********** Roman to Arabic ************/
    public static int toArabic(String inputRoman) {

        int arabic = 0;
        int charPosition = 0;


        while (charPosition < inputRoman.length()){
            int number = romanNumeralToArabic(inputRoman.charAt(charPosition));

            charPosition++;
            if (charPosition == inputRoman.length()){

                arabic += number;
            }else{

                int nextNumber = romanNumeralToArabic(inputRoman.charAt(charPosition));

                if (nextNumber > number){

                    arabic += (nextNumber - number);
                    charPosition++;
                }else{

                    arabic += number;
                }
            }

        }

        return arabic;
    }

    private static int romanNumeralToArabic(char c) {
        switch (c){
            case 'I':  return 1;
            case 'V':  return 5;
            case 'X':  return 10;
            case 'L':  return 50;
            case 'C':  return 100;
            case 'D':  return 500;
            case 'M':  return 1000;
            default:   return -1;
        }
    }
}

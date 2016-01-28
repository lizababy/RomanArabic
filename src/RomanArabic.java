/**
 * Created by lizalinto on 1/28/16.
 */
public class RomanArabic {


    public static String toRoman(int inputNumber) {
        StringBuilder roman = new StringBuilder();
        int remainder = inputNumber;

        if (remainder == 4) {
            roman.append("IV");
            remainder -= 4;
        }
        if (remainder == 5) {
            roman.append("V");
            remainder -= 5;
        }
        for (int i = 0; i < remainder ; i++){
            roman.append("I");
        }
        return roman.toString();
    }
}

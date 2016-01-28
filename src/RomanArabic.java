/**
 * Created by lizalinto on 1/28/16.
 */
public class RomanArabic {


    public static String toRoman(int inputNumber) {
        StringBuilder roman = new StringBuilder();


        for (int i = 0; i < inputNumber ; i++){
            roman.append("I");
        }
        return roman.toString();
    }
}

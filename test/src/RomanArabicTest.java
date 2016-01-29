import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by lizalinto on 1/28/16.
 */
public class RomanArabicTest {
    @Test
    public void ArabicToRomanTest(){
        assertEquals("I", RomanArabic.toRoman(1));
        assertEquals("II", RomanArabic.toRoman(2));
        assertEquals("III", RomanArabic.toRoman(3));
        assertEquals("IV", RomanArabic.toRoman(4));
        assertEquals("V", RomanArabic.toRoman(5));
        assertEquals("VI", RomanArabic.toRoman(6));
        assertEquals("VII", RomanArabic.toRoman(7));
        assertEquals("VIII", RomanArabic.toRoman(8));
        assertEquals("IX", RomanArabic.toRoman(9));
        assertEquals("XII", RomanArabic.toRoman(12));
        assertEquals("MLXVI", RomanArabic.toRoman(1066));
        assertEquals("MCMLXXXIX", RomanArabic.toRoman(1989));

    }
}

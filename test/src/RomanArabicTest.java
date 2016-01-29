import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by lizalinto on 1/28/16.
 */
public class RomanArabicTest {
    @Test
    public void arabicToRomanTest(){
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
        assertEquals("MCMLIII", RomanArabic.toRoman(1953));
        assertEquals("MMMCCCIII", RomanArabic.toRoman(3303));
        assertEquals("MMMCMXCIX", RomanArabic.toRoman(3999));

    }
    @Test
    public void romanToArabicTest(){
        assertEquals(1, RomanArabic.toArabic("I"));
        assertEquals(2, RomanArabic.toArabic("II"));
        assertEquals(3, RomanArabic.toArabic("III"));
        assertEquals(4, RomanArabic.toArabic("IV"));
        assertEquals(5, RomanArabic.toArabic("V"));
        assertEquals(6, RomanArabic.toArabic("VI"));
        assertEquals(7, RomanArabic.toArabic("VII"));
        assertEquals(8, RomanArabic.toArabic("VIII"));
        assertEquals(9, RomanArabic.toArabic("IX"));
        assertEquals(12, RomanArabic.toArabic("XII"));
        assertEquals(1066, RomanArabic.toArabic("MLXVI"));
        assertEquals(1989, RomanArabic.toArabic("MCMLXXXIX"));
        assertEquals(1953, RomanArabic.toArabic("MCMLIII"));
        assertEquals(3303, RomanArabic.toArabic("MMMCCCIII"));
        assertEquals(3999, RomanArabic.toArabic("MMMCMXCIX"));


    }
}

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
        //assertEquals("IV", RomanArabic.toRoman(4));

    }
}

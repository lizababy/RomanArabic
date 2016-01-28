import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by lizalinto on 1/28/16.
 */
public class RomanArabicTest {
    @Test
    public void ArabicToRomanTest(){
        assertEquals("I", RomanArabic.toRoman(1));

    }
}

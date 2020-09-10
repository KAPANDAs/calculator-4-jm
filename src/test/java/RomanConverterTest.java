import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RomanConverterTest {

    @Test
    public void convFromIntToRoman(){
        assertEquals("V", RomanConverter.integerToRoman(5));
        assertEquals("I", RomanConverter.integerToRoman(1));
        assertEquals("XIV", RomanConverter.integerToRoman(14));
        assertEquals("LII", RomanConverter.integerToRoman(52));
        assertEquals("LXV", RomanConverter.integerToRoman(65));
    }

    @Test
    public void convFromRomanToInt(){
        assertEquals(5, RomanConverter.romanToInt("V"));
        assertEquals(4, RomanConverter.romanToInt("IV"));
        assertEquals(10, RomanConverter.romanToInt("X"));
        assertEquals(1, RomanConverter.romanToInt("I"));
        assertEquals(9, RomanConverter.romanToInt("IX"));
    }
}

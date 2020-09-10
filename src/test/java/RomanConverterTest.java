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
        assertEquals(RomanConverter.romanToInt("V"), 5);
        assertEquals(RomanConverter.romanToInt("I"), 1);
        assertEquals(RomanConverter.romanToInt("XIV"), 14);
        assertEquals(RomanConverter.romanToInt("LII"), 52);
        assertEquals(RomanConverter.romanToInt("LXV"), 65);

    }
}

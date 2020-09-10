import static org.junit.Assert.*;
import org.junit.Test;

public class RomanConverterTest {

    @Test
    public void convFromIntToRoman(){
        assertEquals(RomanConverter.integerToRoman(5), "V");
    }

    @Test
    public void convFromRomanToInt(){
        assertEquals(RomanConverter.romanToInt("V"), 5);
    }
}

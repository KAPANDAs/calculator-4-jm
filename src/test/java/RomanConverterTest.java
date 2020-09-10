import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class ArabianCalculatorTest {

    @Test
    public void multiplyTest(){
        assertEquals(8,ArabianCalculator.calculate(4, "*", 2));
        assertEquals(1,ArabianCalculator.calculate(1, "*", 1));
        assertEquals(42,ArabianCalculator.calculate(6 ,"*", 7));
    }

    @Test
    public void divisionTest(){
        assertEquals(2,ArabianCalculator.calculate(4, "/", 2));
        assertEquals(1,ArabianCalculator.calculate(1, "/", 1));
        assertEquals(0,ArabianCalculator.calculate(6 ,"/", 7));
    }

    @Test
    public void addingTest(){
        assertEquals(6,ArabianCalculator.calculate(4, "+", 2));
        assertEquals(2,ArabianCalculator.calculate(1, "+", 1));
        assertEquals(13,ArabianCalculator.calculate(6 ,"+", 7));
    }

    @Test
    public void subtractionTest(){
        assertEquals(2,ArabianCalculator.calculate(4, "-", 2));
        assertEquals(0,ArabianCalculator.calculate(1, "-", 1));
        assertEquals(-1,ArabianCalculator.calculate(6 ,"-", 7));
    }

    @Test
    public void testException(){
        assertThrows(IllegalArgumentException.class, () -> ArabianCalculator.calculate(0, "/s", 2));
    }
}

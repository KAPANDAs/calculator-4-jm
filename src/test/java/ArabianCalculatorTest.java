import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class ArabianCalculatorTest {

    @Test
    public void multiplyTest(){
        assertEquals(ArabianCalculator.calculate(4, "*", 2),8);
        assertEquals(ArabianCalculator.calculate(1, "*", 1),1);
        assertEquals(ArabianCalculator.calculate(6 ,"*", 7),42);
    }

    @Test
    public void divisionTest(){
        assertEquals(ArabianCalculator.calculate(4, "/", 2),2);
        assertEquals(ArabianCalculator.calculate(1, "/", 1),1);
        assertEquals(ArabianCalculator.calculate(6 ,"/", 7),0);
    }

    @Test
    public void addingTest(){
        assertEquals(ArabianCalculator.calculate(4, "+", 2),6);
        assertEquals(ArabianCalculator.calculate(1, "+", 1),2);
        assertEquals(ArabianCalculator.calculate(6 ,"+", 7),13);
    }

    @Test
    public void subtractionTest(){
        assertEquals(ArabianCalculator.calculate(4, "-", 2),2);
        assertEquals(ArabianCalculator.calculate(1, "-", 1),0);
        assertEquals(ArabianCalculator.calculate(6 ,"-", 7),-1);
    }

    @Test
    public void testException(){
        assertThrows(IllegalArgumentException.class, () -> ArabianCalculator.calculate(0, "/s", 2));
    }
}

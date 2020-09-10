import static org.junit.Assert.*;
import org.junit.Test;

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

//    @Test(expected = IllegalArgumentException.class)
//    public void testException() throws IllegalArgumentException{
//        ArabianCalculator.calculate(0, "/", 2);
//    }
}

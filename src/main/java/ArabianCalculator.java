public class ArabianCalculator{
    /**
     *
     * @param firstNum - first integer
     * @param operation - symbol of operation
     * @param secondNum - second integer
     * @return integer result of calculation
     */
    public static int calculate(int firstNum, String operation, int secondNum) throws IllegalArgumentException{
        switch (operation){
            case "/":
                return firstNum / secondNum;
            case "+":
                return firstNum + secondNum;
            case "-":
                return firstNum - secondNum;
            case "*":
                return firstNum * secondNum;
            default:
                throw new IllegalArgumentException();
        }
    }
}

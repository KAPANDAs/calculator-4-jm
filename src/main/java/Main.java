import java.util.Scanner;
import java.util.regex.PatternSyntaxException;

public class Main {

    static boolean isFirstArabic = false;
    static boolean isSecondArabic = false;
    static boolean isFirstRoman = false;
    static boolean isSecondRoman = false;


    public static void main(String[] args) throws PatternSyntaxException {
        try (Scanner sc = new Scanner(System.in)) {
            String[] input;
            input = sc.nextLine().split(" ");
            if (validate(input)) {
                if (isFirstArabic & isSecondArabic) {
                    System.out.println(ArabianCalculator.
                            calculate(Integer.parseInt(input[0]), input[1], Integer.parseInt(input[2])));
                } else {
                    System.out.println(RomanCalculator.calculateRoman(input));
                }
            } else {
                throw new IllegalArgumentException();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /***
     * Validating string input
     * @param inputStr - array of input data
     * @return true when input is correct, else - false
     */
    static boolean validate(String[] inputStr) {
        if (validateOperation(inputStr[1])) {
            isFirstArabic = isArabic(inputStr[0]);
            isSecondArabic = isArabic(inputStr[2]);
            if (isFirstArabic && isSecondArabic) {
                return true;
            }

            isFirstRoman = isRoman(inputStr[0]);
            isSecondRoman = isRoman(inputStr[0]);

            return isFirstRoman && isSecondRoman;
        } else {
            return false;
        }
    }

    /***
     * Checks if number is correct arabic
     * Correct means parsable, >0 and <= 10
     * @param input - input string with num
     * @return true - if correct, false if not
     */
    static boolean isArabic(String input) {
        int num;
        try {
            num = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return false;
        }

        return num <= 10 & num > 0;
    }

    /**
     * Checks if input in roman symbols
     * @param input string with input data
     * @return true - if Roman, false - if not
     */
    static boolean isRoman(String input) {
        String s = "IVX";
        char[] chars = input.toCharArray();
        boolean romanValid = false;
        for (char c : chars) {
            boolean b = s.contains(String.valueOf(c));
            if (b) {
                romanValid = true;
            } else {
                romanValid = false;
                break;
            }
        }
        if (romanValid) {
            return isArabic(Integer.toString(RomanConverter.romanToInt(input)));
        } else {
            return false;
        }
    }

    /**
     * Validating operation
     * @param input - string with operation
     * @return true - if operation valid, false if not
     */
    static boolean validateOperation(String input) {
        String s = "-+/*";
        return s.contains(input);
    }
}

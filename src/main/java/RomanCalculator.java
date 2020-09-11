    /*
     * I - 73 = 1
     * V - 86 = 5
     * X - 88 = 10 - max input
     * L = 50
     * C = 100 - max output
     */

    import java.awt.desktop.PrintFilesEvent;

    public class RomanCalculator {

        /**
         * Calculate roman numbers through arabic
         * @param args - string with
         * @return String with answer
         */
        public static String calculateRoman(String[] args) {
            int num = ArabianCalculator.calculate(RomanConverter.romanToInt(args[0]), args[1], RomanConverter.romanToInt(args[2]));
            if (num > 0) {
                return RomanConverter.integerToRoman(num);
            }
            else {
                return "-" + RomanConverter.integerToRoman(Math.abs(num));
            }

        }
    }

    class RomanConverter {


        /**
         * Converts roman number into standard decimal
         *
         * @param romanNumber - number like VI or IV
         * @return decimal integer
         */
        public static int romanToInt(String romanNumber) {
            char prevChar = 89; //Higher than X
            int outPutNum = 0;
            for (int i = 0; i < romanNumber.length(); i++) {
                char currentChar = romanNumber.charAt(i);
                if (currentChar <= prevChar) {
                    switch (currentChar) {
                        case 'I':
                            outPutNum += 1;
                            prevChar = currentChar;
                            continue;
                        case 'V':
                            outPutNum += 5;
                            prevChar = currentChar;
                            continue;
                        case 'X':
                            outPutNum += 10;
                            prevChar = currentChar;
                    }
                } else {
                    switch (currentChar) {
                        case 'V':
                            outPutNum += 3;
                            prevChar = currentChar;
                            continue;
                        case 'X':
                            outPutNum += 8;
                            prevChar = currentChar;

                    }
                }
            }
            return outPutNum;
        }

        /**
         * Convert decimal integer into roman number
         * To many ifs
         * @param number - decimal integer
         * @return string with roman number
         */
        public static String integerToRoman(int number) {
            StringBuilder outputString = new StringBuilder();
            while (number > 0 && number < 101) {
                if (number == 100) {
                    outputString.append("C");
                    number -= 100;
                }
                if (number >= 90) {
                    outputString.append("XC");
                    number -= 90;
                }
                if (number >= 50) {
                    outputString.append("L");
                    number -= 50;
                }
                if (number >= 40) {
                    outputString.append("XL");
                    number -= 40;
                }
                if (number >= 10) {
                    int d = number / 10;
                    outputString.append("X".repeat(d));
                    number %= 10;
                }
                if (number == 9) {
                    outputString.append("IX");
                    number -= 9;
                }
                if (number >= 5) {
                    outputString.append("V");
                    number -= 5;
                }
                if (number == 4) {
                    outputString.append("IV");
                    number -= 4;
                }
                if (number >= 1) {
                    outputString.append("I".repeat(number));
                    number = -1;
                }
            }
            if (number == 0 && outputString.toString().isEmpty()){
                outputString = new StringBuilder("0");
            }
            return outputString.toString();
        }
    }
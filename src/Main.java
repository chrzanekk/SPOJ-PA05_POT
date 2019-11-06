
import java.util.Scanner;



public class Main {
    private static int aPowerB(int number, int power){
        int lastNumber;
            if (number == 1)
                lastNumber = 1;

            else if (number == 2) {
                if (power % 4 == 1) {
                lastNumber = 2;

            }   else if (power % 4 == 2) {
                lastNumber = 4;

            }   else if (power % 4 == 3) {
                lastNumber = 8;

            }   else if (power % 4 == 0) {
                lastNumber = 6;

            }
        }
            else if (number == 3) {
                if (power % 4 == 1) {
                    lastNumber = 3;

                } else if (power % 4 == 2) {
                    lastNumber = 9;

                } else if (power % 4 == 3) {
                    lastNumber = 7;

                } else if (power % 4 == 0) {
                    lastNumber = 1;

                }
            }
            else if(number == 4) {
                if (power % 2 == 0)
                    lastNumber = 6;
                else
                lastNumber = 4;
            }
            else if(number == 5)
                lastNumber = 5;

            else if (number == 6)
                lastNumber = 6;
            else if (number ==7) {
                if (power % 4 == 1) {
                    lastNumber = 9;

                } else if (power % 4 == 2) {
                    lastNumber = 3;

                } else if (power % 4 == 3) {
                    lastNumber = 7;

                } else if (power % 4 == 0) {
                    lastNumber = 1;

                }
            }
            else if (number == 8) {
                if (power % 4 == 1) {
                    lastNumber = 8;

                } else if (power % 4 == 2) {
                    lastNumber = 4;

                } else if (power % 4 == 3) {
                    lastNumber = 2;

                } else if (power % 4 == 0) {
                    lastNumber = 6;
                }
            }
            else if(number == 9) {
                if (power % 2 == 0)
                    lastNumber = 1;
                else
                lastNumber = 9;
            }
            else if(number == 10)
            lastNumber = 0;

        return lastNumber;
        }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int tests;
        int num;
        int pow;
        tests = scanner.nextInt();
        for (int i = 0; i < tests; i++) {
            num = scanner.nextInt();
            pow = scanner.nextInt();
            String numString = Integer.toString(num);
            String powString = Integer.toString(pow);
            char lastNum = numString.charAt(numString.length()-1);
            char lastPow = powString.charAt(powString.length()-1);
            int lastUnitNumber = Character.getNumericValue(lastNum);
            int lastUnitPower = Character.getNumericValue(lastPow);
            if (lastUnitNumber == 0){
                lastUnitNumber+=10;
            }
            if (lastUnitPower == 0){
                lastUnitPower+= 10;
            }
            int lastDigitOfNumber = aPowerB(lastUnitNumber,lastUnitPower);
            System.out.println(lastDigitOfNumber);
            }

        }
    }


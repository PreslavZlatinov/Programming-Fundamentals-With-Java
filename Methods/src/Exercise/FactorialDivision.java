package Exercise;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

       calculateFactorials(firstNumber,secondNumber);
    }

    private static void calculateFactorials(int firstNumber, int secondNumber) {
        double firstSum = 1.0;
        double secondSum = 1.0;
        for (int i = firstNumber; i > 0 ; i--) {
            firstSum *= i;
        }

        for (int i = secondNumber; i > 0; i--) {
            secondSum *= i;
        }

        double diff = firstSum / secondSum;
        System.out.printf("%.2f",diff);
    }
}

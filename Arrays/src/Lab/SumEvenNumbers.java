package Lab;

import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numbers = scanner.nextLine();

        String [] numbersAsStrings = numbers.split("\\s+");

        int [] numbersAsInt = new int[numbersAsStrings.length];

        for (int i = 0; i < numbersAsInt.length; i++) {
            numbersAsInt[i] = Integer.parseInt(numbersAsStrings[i]);
        }

        int evenSum = 0;

        for (int j : numbersAsInt) {
            if (j % 2 == 0) {
                evenSum += j;
            }
        }

        System.out.println(evenSum);
    }
}

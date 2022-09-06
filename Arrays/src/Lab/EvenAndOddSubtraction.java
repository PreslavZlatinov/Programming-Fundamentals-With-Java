package Lab;

import java.util.Scanner;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numbersAsStrings = scanner.nextLine();

        String[] numbersAsArray = numbersAsStrings.split("\\s+");

        int[] numbersAsInt = new int[numbersAsArray.length];

        for (int i = 0; i < numbersAsInt.length; i++) {
            numbersAsInt[i] = Integer.parseInt(numbersAsArray[i]);
        }

        int evenSum = 0;
        int oddSum = 0;

        for (int i : numbersAsInt) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }

        System.out.printf("%d",evenSum-oddSum);

    }
}

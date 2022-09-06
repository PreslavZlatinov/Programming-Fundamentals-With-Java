package Lab;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstNumbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(value -> Integer.parseInt(value)).toArray();
        int[] secondNumbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(value -> Integer.parseInt(value)).toArray();

        int firstSum = 0;
        boolean isIdentical = true;

        for (int i = 0; i < firstNumbers.length; i++) {
            if (firstNumbers[i] == secondNumbers[i]) {
                firstSum += firstNumbers[i];
            } else {
                isIdentical = false;
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                break;
            }
        }
        if (isIdentical) {
            System.out.printf("Arrays are identical. Sum: %d", firstSum);
        }
    }
}

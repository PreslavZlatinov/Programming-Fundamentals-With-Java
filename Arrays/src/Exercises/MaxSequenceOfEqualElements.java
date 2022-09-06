package Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputLine = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(value -> Integer.parseInt(value)).toArray();

        int count = 1;
        int max = 0;
        int valueOnIndex = 0;

        for (int i = 1; i < inputLine.length; i++) {
            if (inputLine[i] == inputLine[i - 1]) {
                count++;

                if (count > max) {
                    max = count;
                    valueOnIndex = inputLine[i];
                }
            } else {
                count = 1;
            }
        }

        for (int i = 0; i < max; i++) {
            System.out.print(valueOnIndex + " ");
        }
    }
}

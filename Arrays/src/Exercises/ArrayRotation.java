package Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] arrayOfNumbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(value -> Integer.parseInt(value)).toArray();
        int rotations = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < rotations; i++) {
            int old = arrayOfNumbers[0];
            for (int j = 0; j < arrayOfNumbers.length; j++) {
                if(j==arrayOfNumbers.length-1) {
                    arrayOfNumbers[arrayOfNumbers.length - 1] = old;
                }else{
                    arrayOfNumbers[j] = arrayOfNumbers[j + 1];
                }
            }

        }
        for (int i : arrayOfNumbers) {
            System.out.print(i + " ");
        }

    }
}

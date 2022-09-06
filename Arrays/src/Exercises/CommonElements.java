package Exercises;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstLine = scanner.nextLine();
        String secondLine = scanner.nextLine();

        String[] firstArray = firstLine.split("\\s+");
        String[] secondArray = secondLine.split("\\s+");

        for (int i = 0; i <= secondArray.length - 1; i++) {
            for (int j = 0; j <= firstArray.length-1; j++) {
                if (secondArray[i].equals(firstArray[j])) {
                    System.out.printf("%s", secondArray[i] + " ");
                }
            }
        }
    }
}

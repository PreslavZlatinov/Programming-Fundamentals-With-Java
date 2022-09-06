package Exercise;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char symbolOne = scanner.nextLine().charAt(0);
        char symbolTwo = scanner.nextLine().charAt(0);

        getItemsBetween(symbolOne, symbolTwo);
    }

    private static void getItemsBetween(char symbolOne, char symbolTwo) {
        if (symbolOne < symbolTwo) {
            for (char i = (char) (symbolOne + 1); i < symbolTwo; i++) {
                System.out.print(i + " ");
            }
        }
        else {
            for (char i = (char) (symbolTwo + 1); i < symbolOne; i++) {
                System.out.print(i + " ");
            }
        }
    }
}

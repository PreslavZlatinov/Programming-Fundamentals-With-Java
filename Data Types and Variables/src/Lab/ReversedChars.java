package Lab;

import java.util.Scanner;

public class ReversedChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String concat = "";

        for (int i = 0; i < 3; i++) {
            char symbol = scanner.nextLine().charAt(0);

            concat += symbol;
        }

        for (int i = concat.length()-1; i >= 0; i--) {
            System.out.print(concat.charAt(i) + " ");
        }
    }
}

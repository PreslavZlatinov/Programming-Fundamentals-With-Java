package Lab;

import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            int n = word.length();

            for (int i = 0; i < n; i++) {
                sb.append(word);
            }
        }

        String print = sb.toString();
        System.out.print(print);
    }
}

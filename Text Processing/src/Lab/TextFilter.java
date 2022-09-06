package Lab;

import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bannedWords = scanner.nextLine().split(", ");

        String text = scanner.nextLine();

        for (int i = 0; i < text.length(); i++) {
            for (String word : bannedWords) {
                String asterix = "";
                for (int j = 0; j < word.length(); j++) {
                    asterix += '*';
                }
               text = text.replace(word,asterix);
            }
        }

        System.out.println(text);
    }
}

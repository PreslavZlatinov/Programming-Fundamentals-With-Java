package Exercise;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char newCharacter = (char) (text.charAt(i)+3);
            sb.append(newCharacter);
        }

        String textToPrint = sb.toString();

        System.out.println(textToPrint);
    }
}

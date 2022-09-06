package Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder letters = new StringBuilder();
        StringBuilder symbols = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);
            if(Character.isDigit(character)){
                System.out.print(character);
            }
            else if(Character.isLetter(character)){
                letters.append(character);
            }
            else{
                symbols.append(character);
            }
        }
        System.out.println();
        String lettersToString = letters.toString();
        System.out.println(lettersToString);

        String symbolsToString = symbols.toString();
        System.out.println(symbolsToString);
    }
}

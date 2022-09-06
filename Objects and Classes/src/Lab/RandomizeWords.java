package Lab;

import java.util.Random;
import java.util.Scanner;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();

        String[] inputToArray = inputLine.split("\\s+");

        Random rnd = new Random();

        for (int i = 0; i < inputToArray.length; i++) {
            int randomIndex = rnd.nextInt(inputToArray.length);
            String oldWord = inputToArray[i];
            String newWord = inputToArray[randomIndex];

            inputToArray[i] = newWord;
            inputToArray[randomIndex] = oldWord;
        }

        for (String s : inputToArray) {
            System.out.println(s);
        }

    }
}

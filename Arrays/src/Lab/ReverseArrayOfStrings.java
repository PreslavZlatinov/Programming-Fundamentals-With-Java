package Lab;

import java.util.Scanner;

public class ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();

        String [] lineAsString = inputLine.split("\\s+");

        for (int i = 0; i < lineAsString.length/2; i++) {
            String oldElement = lineAsString[i];

            lineAsString[i] = lineAsString[lineAsString.length-1-i];

            lineAsString[lineAsString.length-1-i] = oldElement;
        }

        for (String s : lineAsString) {
            System.out.printf("%s",s +" ");
        }

    }
}

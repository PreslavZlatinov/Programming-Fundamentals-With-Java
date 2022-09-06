package Exercise;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();

        printMiddleCharacter(inputLine);
    }

    private static void printMiddleCharacter(String inputLine) {
        if(inputLine.length()%2==0){
            System.out.print(inputLine.charAt(inputLine.length()/2-1));
            System.out.print(inputLine.charAt(inputLine.length()/2));
        }
        else{
            System.out.print(inputLine.charAt(inputLine.length()/2));
        }
    }
}

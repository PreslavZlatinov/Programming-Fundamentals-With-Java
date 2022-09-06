package Exercise;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();


        while (!(inputLine.equals("END"))){

            checkPalindrome(inputLine);
            inputLine = scanner.nextLine();
        }
    }

    private static void checkPalindrome(String inputLine){
        String reversedNumber = "";
        for (int i = inputLine.length()-1; i >= 0 ; i--) {
            reversedNumber += String.valueOf(inputLine.charAt(i));
        }

        if(inputLine.equals(reversedNumber)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}

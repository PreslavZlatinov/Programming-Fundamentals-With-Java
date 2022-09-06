package Lab;

import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Math.abs(Integer.parseInt(scanner.nextLine()));

        int result = getMultipleOfEvensAndOdds(input);
        System.out.println(result);
    }

    private static int getMultipleOfEvensAndOdds(int input) {
        int evenSum = getSumOfEvenDigits(input);
        int oddSum = getSumOfOddDigits(input);

        return evenSum * oddSum;
    }

    private static int getSumOfOddDigits(int input) {
        String numberAsString = "" + input;
        int oddSum = 0;
        for (int i = 0; i <numberAsString.length() ; i++) {
            int currentDigit = Integer.parseInt("" + numberAsString.charAt(i));
            if(currentDigit%2!=0){
                oddSum+=currentDigit;
            }
        }

        return oddSum;
    }

    private static int getSumOfEvenDigits(int input) {
        String numberAsString = "" + input;
        int evenSum = 0;
        for (int i = 0; i <numberAsString.length() ; i++) {
            int currentDigit = Integer.parseInt("" + numberAsString.charAt(i));
            if(currentDigit%2==0){
                evenSum+=currentDigit;
            }
        }

        return evenSum;
    }
}

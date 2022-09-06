package Exercise;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        getTopNumbers(number);
    }

    private static void getTopNumbers(int number) {
        for (int i = 1; i <= number ; i++) {
            int sumValue = 0;
            boolean divisibleByEight = false;
            boolean isOddDigit = false;
            String numberAsString = i + "";
            for (int j = 0; j < numberAsString.length(); j++) {
                int digit = Integer.parseInt(String.valueOf(numberAsString.charAt(j)));
                if(digit%2!=0){
                    isOddDigit = true;
                }
                sumValue += digit;
            }
            if(sumValue%8==0){
                divisibleByEight = true;
            }

            if(isOddDigit && divisibleByEight){
                System.out.println(i);
            }

        }

    }
}

package Exercises;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int number = Integer.parseInt(input);
        int temp = number;
        int sum = 0;

        for (int i = 0; i < input.length() ; i++) {
            int digit = temp%10;
            temp /= 10;
            int fact = 1;
            for (int j = 1; j <= digit ; j++) {
                fact*=j;
            }
            sum +=fact;
        }

        if(number==sum){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}

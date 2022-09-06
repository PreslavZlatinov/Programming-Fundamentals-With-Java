package Exercises;

import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int sum = 0;

        for (int i = n1; i <= n2 ; i++) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.printf("\nSum: %d",sum);


    }
}

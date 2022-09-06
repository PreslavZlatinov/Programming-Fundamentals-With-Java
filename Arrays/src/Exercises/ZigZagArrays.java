package Exercises;

import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int [] arrayOne = new int[n];
        int [] arrayTwo = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(count == 0) {
                arrayOne[i] = Integer.parseInt(scanner.next());
                arrayTwo[i] = Integer.parseInt(scanner.next());
                count++;
            }
            else{
                arrayTwo[i] = Integer.parseInt(scanner.next());
                arrayOne[i] = Integer.parseInt(scanner.next());
                count--;
            }
        }

        for (int i : arrayOne) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i : arrayTwo) {
            System.out.print(i + " ");
        }


    }
}

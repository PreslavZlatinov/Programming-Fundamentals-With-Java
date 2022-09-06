package Lab;

import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < input; i++) {
            printLine(1,i);
            System.out.println();
        }
        printLine(1,input);
        System.out.println();
        for (int i = input-1; i > 0 ; i--) {
            printLine(1,i);
            System.out.println();
        }
    }

    private static void printLine(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
    }
}

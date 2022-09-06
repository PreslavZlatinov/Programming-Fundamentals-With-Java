package Exercise;

import java.util.Scanner;

public class NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputLine = Integer.parseInt(scanner.nextLine());

        printMatrix(inputLine);
    }

    private static void printMatrix(int inputLine) {
        for (int i = 0; i < inputLine; i++) {
            for (int j = 0; j < inputLine; j++) {
                if(j == inputLine-1) {
                    System.out.print(inputLine);
                    System.out.println();
                }
                else{
                    System.out.print(inputLine + " ");
                }
            }
        }
    }
}

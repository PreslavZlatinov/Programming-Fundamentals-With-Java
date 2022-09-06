package Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] inputLine = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(value -> Integer.parseInt(value)).toArray();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < inputLine.length; i++) {
            for (int j = i+1; j < inputLine.length; j++) {
                if(inputLine[i]+inputLine[j]==n){
                    System.out.print(inputLine[i] + " " + inputLine[j]);
                    System.out.println();
                }
            }
        }
    }
}

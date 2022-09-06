package Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] inputLine = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(value -> Integer.parseInt(value)).toArray();
        boolean isBigger = false;

        for (int i = 0; i < inputLine.length; i++) {
            for (int j = i+1; j < inputLine.length; j++) {
                if(inputLine[i]>inputLine[j]){
                    isBigger = true;
                }
                else {
                    isBigger=false;
                    break;
                }
            }
            if(isBigger || i == inputLine.length-1){
                System.out.print(inputLine[i] + " ");
            }
        }
    }
}

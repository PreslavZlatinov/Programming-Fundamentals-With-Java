package Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] inputLine = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(value -> Integer.parseInt(value)).toArray();
        int rightSum = 0;
        int leftSum = 0;
        boolean isValid = false;


        for (int i = 0; i < inputLine.length; i++) {
            for (int j = i+1; j < inputLine.length  ; j++) {
                rightSum+=inputLine[j];
            }
            for (int j = i-1; j >= 0 ; j--) {
                leftSum+=inputLine[j];
            }

            if(rightSum==leftSum){
                System.out.println(i);
                rightSum=0;
                leftSum=0;
                isValid = true;
            }
            else {
                rightSum=0;
                leftSum=0;
            }
        }

        if(!isValid){
            System.out.println("no");
        }
    }
}

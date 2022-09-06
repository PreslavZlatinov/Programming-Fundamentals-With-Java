package Exercises;

import java.util.Scanner;

public class IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        for (int i = 1; i <= 4; i++) {
            int number = scanner.nextInt();
            if(i==1 || i==2){
                sum+=number;
            }
            else if(i==3){
                sum /=number;
            }
            else{
                sum *= number;
            }
        }

        System.out.println(sum);

    }
}

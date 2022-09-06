package Exercises;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());
        int days = 0;
        int total = 0;
        while(startingYield>=100){
            days++;
            total += startingYield - 26;
            startingYield -= 10;
        }

        if(total>=26) {
            int totalAfterAbandon = total - 26;
            System.out.println(days);
            System.out.print(totalAfterAbandon);
        }
        else{
            System.out.println(days);
            System.out.print(total);
        }


    }
}

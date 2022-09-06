package Lab;

import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int multiplier = scanner.nextInt();
        for (int i = multiplier; i <= 10; i++) {
            int sum = n * i;
            System.out.printf("%d X %d = %d", n,i,sum);
            System.out.println();
        }
        if (multiplier>10){
            int sum = n * multiplier;
            System.out.printf("%d X %d = %d",n,multiplier,sum);
        }
    }
}

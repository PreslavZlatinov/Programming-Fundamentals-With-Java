package Lab;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if(i%2!=0) {
                sum += i;
                System.out.println(i);
            }
            else{
                n++;
            }
        }
        /*for (int i = 0; i < n; i++) {
            System.out.println(2*i+1);
            sum+=2*i+1;
        }*/
        System.out.printf("Sum: %d",sum);
    }
}

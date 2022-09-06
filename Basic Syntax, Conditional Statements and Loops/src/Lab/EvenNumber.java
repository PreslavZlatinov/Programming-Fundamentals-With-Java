package Lab;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number= scanner.nextInt();

        while (!(number%2==0)){
            System.out.println("Please write an even number.");
            number = scanner.nextInt();
        }

        System.out.printf("The number is: %d",Math.abs(number));
    }
}

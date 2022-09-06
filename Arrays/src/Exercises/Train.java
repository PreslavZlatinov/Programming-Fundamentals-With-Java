package Exercises;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wagini = Integer.parseInt(scanner.nextLine());
        int [] people = new int[wagini];

        for (int i = 0; i < wagini; i++) {
            people[i] = Integer.parseInt(scanner.nextLine());
        }

        int peopleSum = 0;

        for (int i : people) {
            System.out.printf("%s",i + " ");
            peopleSum += i;
        }

        System.out.println();
        System.out.println(peopleSum);
    }
}

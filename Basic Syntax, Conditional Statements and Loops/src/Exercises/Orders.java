package Exercises;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ordersCount = Integer.parseInt(scanner.nextLine());
        double total = 0;
        for (int i = 1; i <=ordersCount ; i++) {
            double capsulePrice = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());

            //((daysInMonth * capsulesCount) * pricePerCapsule)
            double totalPrice = (days * capsulesCount) * capsulePrice;
            total +=totalPrice;

            System.out.printf("The price for the coffee is: $%.2f\n",totalPrice);
        }
        System.out.printf("Total: $%.2f",total);
    }
}

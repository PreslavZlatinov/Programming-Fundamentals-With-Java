package Lab;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        double finalPrice = 0.0;
        double price = 0.0;
        switch (product){
            case "coffee":
                price = 1.50;
                finalPrice = calcPrice(count, price);
                break;
            case "water":
                price = 1.00;
                finalPrice = calcPrice(count, price);
                break;
            case "coke":
                price = 1.40;
                finalPrice = calcPrice(count, price);
                break;
            case "snacks":
                price = 2.00;
                finalPrice = calcPrice(count, price);
                break;
        }

        System.out.printf("%.2f",finalPrice);
    }

    private static double calcPrice(int count, double price) {
        return price * count;
    }
}

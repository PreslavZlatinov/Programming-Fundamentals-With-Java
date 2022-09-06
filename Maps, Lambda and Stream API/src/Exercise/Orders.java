package Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();

        Map<String, Double> productPrice = new LinkedHashMap<>();
        Map<String, Integer> productQuantity = new LinkedHashMap<>();
        while (!(inputLine.equals("buy"))) {
            String[] inputToArray = inputLine.split("\\s+");

            String product = inputToArray[0];
            double price = Double.parseDouble(inputToArray[1]);
            int quantity = Integer.parseInt(inputToArray[2]);

            if (!(productPrice.containsKey(product))) {
                productPrice.put(product, price);
                productQuantity.put(product, quantity);
            } else if (productPrice.containsKey(product) && !(productPrice.containsValue(price))) {
                int quantityAtTheMoment = productQuantity.get(product);
                productPrice.put(product, price);
                productQuantity.put(product, quantity + quantityAtTheMoment);
            } else {
                int quantityAtTheMoment = productQuantity.get(product);
                productQuantity.put(product, quantity + quantityAtTheMoment);
            }

            inputLine = scanner.nextLine();
        }

        Map<String, Double> productList = new LinkedHashMap<>();

        for (Map.Entry<String, Integer> entry : productQuantity.entrySet()) {
            String product = entry.getKey();
            double price = entry.getValue() * productPrice.get(product);
            productList.put(product, price);
        }

        for (Map.Entry<String, Double> entry : productList.entrySet()) {
            System.out.printf("%s -> %.2f\n", entry.getKey(), entry.getValue());
        }


    }
}

package Exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("(>{2})(?<furniture>[A-Za-z]+)(<{2})(?<price>\\d.+)!(?<quantity>\\d+)");
        Matcher matcher = pattern.matcher(input);

        List<String> nikola = new LinkedList<>();
        double totalPrice = 0;

        while (!(input.equals("Purchase"))) {
            if(matcher.find()) {
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));

                nikola.add(matcher.group("furniture"));
                totalPrice += price * quantity;
            }
            input = scanner.nextLine();

            matcher = pattern.matcher(input);
        }

        System.out.println("Bought furniture:");
        for (String s : nikola) {
            System.out.println(s);
        }


        System.out.printf("Total money spend: %.2f", totalPrice);
    }
}

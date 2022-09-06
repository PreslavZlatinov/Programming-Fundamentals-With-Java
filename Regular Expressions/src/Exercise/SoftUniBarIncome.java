package Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("%(?<name>[A-Z][a-z]+)%[^|$%.]*?<(?<product>\\w+)>[^|$%.]*?\\|(?<count>\\d+)\\|[^|$%.]*?(?<price>\\d+\\.?\\d+\\$)");
        Matcher matcher = pattern.matcher(input);

        double totalIncome = 0;

        while (!(input.equals("end of shift"))){

            if(matcher.find()){
                String name = matcher.group("name");
                String product = matcher.group("product");
                String priceAsString = matcher.group("price");
                String onlyPrice = priceAsString.substring(0,priceAsString.length()-1);
                double price = Integer.parseInt(matcher.group("count")) * Double.parseDouble(onlyPrice);
                totalIncome += price;
                System.out.printf("%s: %s - %.2f\n",name,product,price);
            }

            input = scanner.nextLine();
            matcher = pattern.matcher(input);
        }

        System.out.printf("Total income: %.2f",totalIncome);
    }
}

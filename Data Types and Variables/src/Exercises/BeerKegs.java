package Exercises;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double max = 0.0;
        String model = "";
        for (int i = 0; i < n; i++) {
            String modelInput = scanner.nextLine();
            double radiusInput = Double.parseDouble(scanner.nextLine());
            int heightInput = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * (radiusInput*radiusInput) * heightInput;

            if(volume>max){
                max = volume;
                model = modelInput;
            }
        }

        System.out.printf("%s",model);
    }
}

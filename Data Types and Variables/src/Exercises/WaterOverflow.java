package Exercises;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int waterTank = 255;
        int litresInside = 0;
        for (int i = 0; i < n; i++) {
            int litresPour = Integer.parseInt(scanner.nextLine());
            if(waterTank>=litresPour){
                litresInside += litresPour;
                waterTank -= litresPour;
            }
            else{
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.print(litresInside);
    }
}

package Exercises;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokePower = Integer.parseInt(scanner.nextLine());
        int distanceBetween = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());
        double halfPower = pokePower * 0.50;
        int pokeCount = 0;

        while (pokePower>=distanceBetween){
            pokePower -=distanceBetween;
            pokeCount++;

            if(pokePower == halfPower && exhaustionFactor != 0){
                pokePower /= exhaustionFactor;
            }
        }
        System.out.println(pokePower);
        System.out.print(pokeCount);
//        int pokeCount = 0;
//        int remainingPower = pokePower;
//        while (remainingPower>=distanceBetween){
//            if(remainingPower==pokePower/2){
//                remainingPower /=exhaustionFactor;
//            }
//            else {
//                remainingPower = pokePower - distanceBetween;
//                pokeCount++;
//            }
//        }

//        System.out.println(remainingPower);
//        System.out.print(pokeCount);
    }
}

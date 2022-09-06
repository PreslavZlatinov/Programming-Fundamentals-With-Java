package Exercises;

import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double max = 0.0;
        double maxSnow = 0.0;
        double maxTime = 0.0;
        double maxQuality = 0.0;
        for (int i = 0; i < n; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            double snowballValue = Math.pow(snowballSnow / snowballTime,snowballQuality);

            if(snowballValue>max){
                maxSnow = snowballSnow;
                max = snowballValue;
                maxTime = snowballTime;
                maxQuality = snowballQuality;
            }
        }

        System.out.printf("%.0f : %.0f = %.0f (%.0f)",maxSnow,maxTime,max,maxQuality);
    }
}

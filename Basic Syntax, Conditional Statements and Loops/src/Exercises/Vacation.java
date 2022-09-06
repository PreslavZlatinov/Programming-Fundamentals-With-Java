package Exercises;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleCount = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String day = scanner.nextLine();

        double singlePrice = 0.0;

        switch (day){
            case "Friday":
                if(groupType.equals("Students")){
                    singlePrice = 8.45;
                }
                else if(groupType.equals("Business")){
                    singlePrice = 10.90;
                }
                else if(groupType.equals("Regular")){
                    singlePrice = 15;
                }
                break;
            case "Saturday":
                if(groupType.equals("Students")){
                    singlePrice = 9.80;
                }
                else if(groupType.equals("Business")){
                    singlePrice = 15.60;
                }
                else if(groupType.equals("Regular")){
                    singlePrice = 20;
                }
                break;
            case "Sunday":
                if(groupType.equals("Students")){
                    singlePrice = 10.46;
                }
                else if(groupType.equals("Business")){
                    singlePrice = 16;
                }
                else if(groupType.equals("Regular")){
                    singlePrice = 22.50;
                }
                break;
        }

        double totalPrice = singlePrice * peopleCount;

        if(groupType.equals("Students")&&peopleCount>=30){
            totalPrice = totalPrice* 0.85;
        }

        if(groupType.equals("Business")&&peopleCount>=100){
            totalPrice = totalPrice - singlePrice*10;
        }

        if(groupType.equals("Regular")&&peopleCount>=10 && peopleCount<=20){
            totalPrice = totalPrice * 0.95;
        }

        System.out.printf("Total price: %.2f",totalPrice);
    }
}

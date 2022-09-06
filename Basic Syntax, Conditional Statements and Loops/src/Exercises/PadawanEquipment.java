package Exercises;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //padawan - lightsabers, belts, and robes

        double amountOfMoney = Double.parseDouble(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        double saberPrice = Double.parseDouble(scanner.nextLine());
        double robesPrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());
        int freeBelts =0;
        //sabresPrice * (studentsCount + 10%) + robesPrice * (studentsCount) + beltsPrice * (studentsCount - freeBelts)

        for (int i = 1; i <= studentsCount; i++) {
            if(i%6==0){
                freeBelts++;
            }
        }
        
        double totalPrice = saberPrice * Math.ceil((studentsCount + studentsCount*0.1)) + (robesPrice * studentsCount) +
                (beltPrice * (studentsCount - freeBelts));

        double diff = totalPrice-amountOfMoney;

        if (totalPrice<=amountOfMoney){
            System.out.printf("The money is enough - it would cost %.2flv.",totalPrice);
        }
        else {
            System.out.printf("George Lucas will need %.2flv more.\n",diff);
        }
    }
}

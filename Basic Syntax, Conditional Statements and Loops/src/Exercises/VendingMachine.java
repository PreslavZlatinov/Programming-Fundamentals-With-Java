package Exercises;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String insert = scanner.nextLine();
        double moneyInside = 0;
        while (!insert.equals("Start")){
            double coins = Double.parseDouble(insert);
            if(coins==0.1 || coins==0.2 || coins==0.5 || coins==1 || coins==2){
                moneyInside += coins;
            }
            else{
                System.out.printf("\nCannot accept %.2f",coins);
            }
            insert = scanner.nextLine();
        }

        String insert1 = scanner.nextLine();
        while (!insert1.equals("End")){

            if (insert1.equals("Nuts")){
                if(moneyInside>=2.0){
                    moneyInside -= 2.0;
                    System.out.printf("Purchased %s\n",insert1);
                }
                else{
                    System.out.println("Sorry, not enough money");
                }
            }
            else if (insert1.equals("Water")){
                if(moneyInside>=0.7){
                    moneyInside -= 0.7;
                    System.out.printf("Purchased %s\n",insert1);
                }
                else{
                    System.out.println("Sorry, not enough money");
                }
            }
            else if(insert1.equals("Crisps")){
                if(moneyInside>=1.5){
                    moneyInside -= 1.5;
                    System.out.printf("Purchased %s\n",insert1);
                }
                else{
                    System.out.println("Sorry, not enough money");
                }
            }
            else if(insert1.equals("Soda")){
                if(moneyInside>=0.8){
                    moneyInside -= 0.8;
                    System.out.printf("Purchased %s\n",insert1);
                }
                else{
                    System.out.println("Sorry, not enough money");
                }
            }
            else if(insert1.equals("Coke")){
                if(moneyInside>=1.0){
                    moneyInside -= 1.0;
                    System.out.printf("Purchased %s\n",insert1);
                }
                else{
                    System.out.println("Sorry, not enough money");
                }
            }
            else{
                System.out.println("Invalid product");
            }
            insert1 = scanner.nextLine();
        }
        System.out.printf("Change: %.2f",moneyInside);
    }
}

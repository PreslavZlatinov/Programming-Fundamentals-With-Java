package Lab;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] daysOfWeek = new String [] {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        int dayNumber = Integer.parseInt(scanner.nextLine());

        if(dayNumber>=1 && dayNumber<=7){
            System.out.printf("%s",daysOfWeek[dayNumber-1]);
        }
        else{
            System.out.println("Invalid day!");
        }
        }
    }

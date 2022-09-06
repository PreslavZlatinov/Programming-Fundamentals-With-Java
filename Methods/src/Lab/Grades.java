package Lab;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());
        
        gradeWithWords(grade);
    }

    private static void gradeWithWords(double grade) {
        if(grade>=5.50 && grade<=6.00){
            System.out.print("Excellent");
        }
        else if(grade>=4.50 && grade <=5.49){
            System.out.print("Very good");
        }
        else if(grade>=3.50 && grade <=4.49){
            System.out.print("Good");
        }
        else if(grade>=3.00 && grade <=3.49){
            System.out.print("Poor");
        }
        else{
            System.out.print("Fail");
        }
    }
}

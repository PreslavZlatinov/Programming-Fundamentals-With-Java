package Exercise;

import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOne = Integer.parseInt(scanner.nextLine());
        int numberTwo = Integer.parseInt(scanner.nextLine());
        int numberThree = Integer.parseInt(scanner.nextLine());

       int theSmallest =  getSmallest(numberOne, numberTwo, numberThree);
        System.out.print(theSmallest);
    }

    private static int getSmallest(int numberOne, int numberTwo, int numberThree) {
        int smallest = 0;
        if(numberOne<numberTwo && numberOne<numberThree){
            smallest = numberOne;
        }
        else if(numberTwo<numberOne && numberTwo<numberThree){
            smallest = numberTwo;
        }
        else{
            smallest = numberThree;
        }

        return smallest;
    }
}

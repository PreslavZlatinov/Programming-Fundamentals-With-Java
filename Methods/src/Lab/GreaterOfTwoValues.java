package Lab;

import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputType = scanner.nextLine();


        switch (inputType){
            case "int":
                int first = Integer.parseInt(scanner.nextLine());
                int second = Integer.parseInt(scanner.nextLine());
                int resultInt = getMax(first, second);
                System.out.println(resultInt);
                break;
            case "char":
                char letterOne = scanner.nextLine().charAt(0);
                char letterTwo = scanner.nextLine().charAt(0);
                char resultChar = getMax(letterOne,letterTwo);
                System.out.println(resultChar);
                break;
            case "string":
                String strOne = scanner.nextLine();
                String strTwo = scanner.nextLine();
                String resultString = getMax(strOne,strTwo);
                System.out.println(resultString);
                break;
        }
    }

    private static int getMax(int first, int second) {
        if(first>second){
            return first;
        }

        return second;
    }

    private static char getMax(char first, char second) {
        if(first>second){
            return first;
        }

        return second;
    }

    private static String getMax(String first, String second) {
        if(first.compareTo(second)>=0){
            return first;
        }

        return second;
    }
}

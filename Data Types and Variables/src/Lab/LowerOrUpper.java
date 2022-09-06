package Lab;

import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char character = scanner.nextLine().charAt(0);

        if(Character.isLowerCase(character)){
            System.out.println("lower-case");
        }

        if(Character.isUpperCase(character)){
            System.out.println("upper-case");
        }

//        if(65 <= character && character <= 90){
//            System.out.println("upper-case");
//        }
//
//        if(97 <= character && character <= 122){
//            System.out.println("lower-case");
//        }
    }
}

package Exercise;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        System.out.print(subtractThirdFromSum(firstNumber, secondNumber, thirdNumber));
    }

    private static int subtractThirdFromSum(int firstNumber, int secondNumber, int thirdNumber) {
        return sumFirstTwo(firstNumber,secondNumber) - thirdNumber;
    }

    private static int sumFirstTwo(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}

package Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numberOne = Double.parseDouble(scanner.nextLine());
        String operator = scanner.nextLine();
        double numberTwo = Double.parseDouble(scanner.nextLine());

        double finalResult = calculcate(numberOne, operator, numberTwo);
        System.out.println(new DecimalFormat("0.####").format(finalResult));
    }

    private static double calculcate(double numberOne, String operator, double numberTwo) {
        double result = 0.0;

        switch (operator){
            case "/":
                result = numberOne / numberTwo;
                break;
            case "*":
                result = numberOne * numberTwo;
                break;
            case "+":
                result = numberOne + numberTwo;
                break;
            case "-":
                result = numberOne - numberTwo;
                break;
        }

        return result;
    }
}

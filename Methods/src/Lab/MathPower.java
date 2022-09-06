package Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numberOne = Double.parseDouble(scanner.nextLine());
        double numberTwo = Double.parseDouble(scanner.nextLine());

       double resultPrint = mathPower(numberOne, numberTwo);
        System.out.println(new DecimalFormat("0.####").format(resultPrint));
    }

    private static double mathPower(double numberOne, double numberTwo) {

        return Math.pow(numberOne,numberTwo);
    }
}

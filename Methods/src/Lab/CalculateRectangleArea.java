package Lab;

import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sideOne = Integer.parseInt(scanner.nextLine());
        int sideTwo = Integer.parseInt(scanner.nextLine());

        int area = calcArea(sideOne, sideTwo);

        System.out.println(area);
    }

    private static int calcArea(int sideOne, int sideTwo) {
        return sideOne * sideTwo;
    }
}

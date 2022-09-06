package Exercise;

import java.math.BigDecimal;
import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstNumber = scanner.nextLine();
        int normalNumber = Integer.parseInt(scanner.nextLine());

        StringBuilder sb = new StringBuilder();

        int digitNaum = 0;

        for (int i = firstNumber.length() - 1; i >= 0; i--) {
            int valueAtI = Integer.parseInt(String.valueOf(firstNumber.charAt(i)));
            int result = normalNumber * valueAtI + digitNaum;
            int digitToAdd = result % 10;
            sb.insert(0, digitToAdd);
            digitNaum = result / 10;
        }
        if (digitNaum > 0) {
            sb.insert(0, digitNaum);
        }

        while (sb.charAt(0) == 48 && sb.length() > 1) {
            sb.deleteCharAt(0);
        }
        System.out.println(sb);
    }
}

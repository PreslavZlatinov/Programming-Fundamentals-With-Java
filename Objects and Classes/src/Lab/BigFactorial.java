package Lab;

import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        BigInteger factorial = BigInteger.valueOf(n);

        for (int i = 1; i < n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(n-i));
        }

        System.out.println(factorial);
    }
}

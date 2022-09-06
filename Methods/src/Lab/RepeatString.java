package Lab;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputString = scanner.nextLine();
        int reps = Integer.parseInt(scanner.nextLine());

       String resultString = repeatInput(inputString, reps);

        System.out.println(resultString);
    }

    private static String repeatInput(String inputString, int reps) {
        String result = "";
        for (int i = 0; i < reps; i++) {
            result += inputString;
        }

        return result;
    }
}

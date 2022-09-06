package Exercise;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        validatePassword(password);
    }

    private static void validatePassword(String password) {
        int legitOne = checkLength(password);
        int legitTwo = checkForLettersAndDigits(password);
        int legitThree = countDigits(password);

        if (legitOne == legitTwo && legitTwo == legitThree && legitThree == 1) {
            System.out.println("Password is valid");
        }
    }

    private static int checkForLettersAndDigits(String password) {
        int legit = 0;
        int validDigits = 0;
        for (int i = 0; i < password.length(); i++) {
            char digit = password.charAt(i);
            if (Character.isLetter(digit) || Character.isDigit(digit)) {
                validDigits++;
            }
        }

        if (validDigits == password.length()) {
            legit = 1;
        } else {
            System.out.println("Password must consist only of letters and digits");
        }

        return legit;
    }

    private static int countDigits(String password) {
        int legit = 0;
        int digitCount = 0;
        for (int i = 0; i < password.length(); i++) {
            char digit = password.charAt(i);
            if (Character.isDigit(digit)) {
                digitCount++;
            }
        }
        if (digitCount >= 2) {
            legit++;
        } else {
            System.out.println("Password must have at least 2 digits");
        }

        return legit;
    }

    private static int checkLength(String password) {
        int legit = 0;
        if (password.length() >= 6 && password.length() <= 10) {
            legit++;
        } else {
            System.out.println("Password must be between 6 and 10 characters");
        }

        return legit;
    }
}

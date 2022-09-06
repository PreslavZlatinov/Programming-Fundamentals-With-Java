package Exercise;

import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] usernames = scanner.nextLine().split(", ");

        for (String username : usernames) {
            if (username.length() >= 3 && username.length() <= 16) {
                StringBuilder stringBuilder = new StringBuilder();
                for (int i = 0; i < username.length(); i++) {
                    char character = username.charAt(i);
                    if (Character.isLetterOrDigit(character) || character == '-' || character == '_') {
                        stringBuilder.append(character);
                    }
                }

                String user = stringBuilder.toString();

                if (user.equals(username)) {
                    System.out.println(user);
                }
            }
        }
    }
}

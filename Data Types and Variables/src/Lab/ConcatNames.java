package Lab;

import java.util.Scanner;

public class ConcatNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name1 = scanner.nextLine();
        String name2 = scanner.nextLine();
        String delimeter = scanner.nextLine();

        System.out.printf("%s%s%s",name1,delimeter,name2);
    }
}

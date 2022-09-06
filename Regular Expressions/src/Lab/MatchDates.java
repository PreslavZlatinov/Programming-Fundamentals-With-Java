package Lab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\b(?<day>\\d{2})([.\\-/])(?<month>[A-Z][a-z]{2})\\2(?<year>\\d{4})\\b");
        Matcher dateMatcher = pattern.matcher(input);

        while (dateMatcher.find()) {
            System.out.print("Day: " + dateMatcher.group("day") + ", ");
            System.out.print("Month: " + dateMatcher.group("month") + ", ");
            System.out.print("Year: " + dateMatcher.group("year") + "\n");
        }
    }
}

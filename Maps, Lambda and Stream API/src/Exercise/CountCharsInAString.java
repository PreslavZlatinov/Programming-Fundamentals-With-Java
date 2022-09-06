package Exercise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputLine = scanner.nextLine().split("\\s+");

        Map<Character, Integer> count = new LinkedHashMap<>();

        for (int i = 0; i < inputLine.length; i++) {
            String currentWord = inputLine[i];
            for (int j = 0; j < currentWord.length(); j++) {
                char currentChar = currentWord.charAt(j);
                if(!count.containsKey(currentChar)) {
                    count.put(currentChar, 0);
                }
                count.put(currentChar,count.get(currentChar)+1);
            }
        }

        for (Map.Entry<Character, Integer> entry : count.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}

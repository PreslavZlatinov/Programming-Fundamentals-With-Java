package Exercises;

import java.util.*;
import java.util.stream.Collectors;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();

        String[] arrays = inputLine.split("\\|");

        List<String> arraysToList = new ArrayList<>();
        for (int i = 0; i < arrays.length; i++) {
            arraysToList.add(arrays[i]);
        }

        Collections.reverse(arraysToList);

        for (String s : arraysToList) {
            String[] splitValues = s.split("\\s+");
            for (String value : splitValues) {
                if (value.equals("")) {
                    continue;
                }
                System.out.print(value + " ");
            }

        }

    }
}

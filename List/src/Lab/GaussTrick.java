package Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        List<String> lineToString = Arrays.stream(line.split("\\s+")).collect(Collectors.toList());
        List<Integer> lineToNumbers = new ArrayList<>();

        for (int i = 0; i < lineToString.size(); i++) {
            lineToNumbers.add(Integer.parseInt(lineToString.get(i)));
        }

        List<Integer> newList = new ArrayList<>();

        for (int i = 0; i < lineToNumbers.size(); i++) {
            if(i == lineToNumbers.size()-1){
                newList.add(lineToNumbers.get(i));
                break;
            }
            int sum = lineToNumbers.get(i) + lineToNumbers.get(lineToNumbers.size()-1);
            lineToNumbers.remove(lineToNumbers.size()-1);
            newList.add(sum);
        }

        for (Integer n : newList) {
            System.out.print(n + " ");
        }

    }
}

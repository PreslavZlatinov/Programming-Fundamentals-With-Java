package Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstLine = scanner.nextLine();
        String secondLine = scanner.nextLine();

        List<String> first = Arrays.stream(firstLine.split("\\s+")).collect(Collectors.toList());
        List<String> second = Arrays.stream(secondLine.split("\\s+")).collect(Collectors.toList());

        List<Integer> firstNumbers = new ArrayList<>();
        List<Integer> secondNumbers = new ArrayList<>();

        for (int i = 0; i < first.size(); i++) {
            firstNumbers.add(Integer.parseInt(first.get(i)));
        }

        for (int i = 0; i < second.size(); i++) {
            secondNumbers.add(Integer.parseInt(second.get(i)));
        }

        List<Integer> newNumbers = new ArrayList<>();

       int minSize = Math.min(firstNumbers.size(),secondNumbers.size());

        for (int i = 0; i < minSize; i++) {
            newNumbers.add(firstNumbers.get(i));
            newNumbers.add(secondNumbers.get(i));
        }

        if(firstNumbers.size()>secondNumbers.size()){
            newNumbers.addAll(firstNumbers.subList(minSize,firstNumbers.size()));
        }
        else{
            newNumbers.addAll(secondNumbers.subList(minSize,secondNumbers.size()));
        }

        for (Integer n : newNumbers) {
            System.out.print(n + " ");
        }

    }
    }

package Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String values = scanner.nextLine();

        List<Integer> valuesList = Arrays.stream(values.split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String bomb = scanner.nextLine();

        String [] bombInfo = bomb.split("\\s+");
        int specialNumber = Integer.parseInt(bombInfo[0]);
        int power = Integer.parseInt(bombInfo[1]);

        while(valuesList.contains(specialNumber)){
            int specialIndex = valuesList.indexOf(specialNumber);
            int start = specialIndex - power;
            int end = specialIndex + power;

            if(start<0){
                start = 0;
            }

            if(end > valuesList.size()){
                end = valuesList.size()-1;
            }

            for (int i = start; i <= end ; i++) {
                valuesList.remove(start);
            }
        }

        int sum = 0;
        for (Integer n : valuesList) {
            sum += n;
        }

        System.out.println(sum);
    }
}

package Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String values = scanner.nextLine();

        List<Integer> wagonCapacity = Arrays.stream(values.split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();

        while(!(command.equals("end"))){

            String [] commandSplit = command.split("\\s+");

            if(commandSplit[0].equals("Add")){
                wagonCapacity.add(Integer.parseInt(commandSplit[1]));
            }
            else{
                for (int i = 0; i < wagonCapacity.size(); i++) {
                    int newValue = wagonCapacity.get(i) + Integer.parseInt(commandSplit[0]);
                    if(newValue<=maxCapacity){
                        wagonCapacity.set(i,newValue);
                        break;
                    }
                }
            }

            command = scanner.nextLine();
        }

        for (Integer n : wagonCapacity) {
            System.out.print(n + " ");
        }

    }
}

package Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String values = scanner.nextLine();

        List<Integer> valuesList = Arrays.stream(values.split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while(!(command.equals("End"))){

            int value = 0;
            int index = 0;
            int count = 0;
            String [] commandSplit = command.split("\\s+");
            String commandForSwitch = commandSplit[0];

            switch (commandForSwitch){
                case "Add":
                    value = Integer.parseInt(commandSplit[1]);
                    valuesList.add(value);
                    break;
                case "Insert":
                    index = Integer.parseInt(commandSplit[2]);
                    if(index>valuesList.size() || index<0){
                        System.out.println("Invalid index");
                        break;
                    }
                    value = Integer.parseInt(commandSplit[1]);
                    valuesList.add(index,value);
                    break;
                case "Remove":
                    index = Integer.parseInt(commandSplit[1]);
                    if(index>valuesList.size() || index<0){
                        System.out.println("Invalid index");
                        break;
                    }
                    valuesList.remove(index);
                    break;
                case "Shift":
                    count = Integer.parseInt(commandSplit[2]);
                    if(command.contains("left")){
                        for (int i = 0; i < count; i++) {
                            valuesList.add(valuesList.get(0));
                            valuesList.remove(valuesList.get(0));
                        }
                    }
                    else{
                        for (int i = 0; i < count; i++) {
                            valuesList.add(0,valuesList.get(valuesList.size()-1));
                            valuesList.remove(valuesList.size()-1);
                        }
                    }
                    break;
            }

            command = scanner.nextLine();
        }

        for (Integer n : valuesList) {
            System.out.print(n + " ");
        }

    }
}

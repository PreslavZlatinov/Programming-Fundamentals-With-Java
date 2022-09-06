package Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String values = scanner.nextLine();

        List<Integer> listValues = Arrays.stream(values.split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while(!(command.equals("end"))){

            String [] splitCommand = command.split("\\s+");

            if(splitCommand[0].equals("Delete")) {
                for (int i = 0; i < listValues.size(); i++) {
                    if(listValues.get(i)==Integer.parseInt(splitCommand[1])){
                        listValues.remove(listValues.get(i));
                        i--;
                }
                }
            }
                else if(splitCommand[0].equals("Insert")){
                    listValues.add(Integer.parseInt(splitCommand[2]),Integer.valueOf(splitCommand[1]));
                }

            command = scanner.nextLine();
            }

        for (Integer value : listValues) {
            System.out.print(value + " ");
        }

    }
    }

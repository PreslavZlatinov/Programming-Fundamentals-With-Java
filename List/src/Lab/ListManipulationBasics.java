package Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String values = scanner.nextLine();
        List<Integer> items = Arrays.stream(values.split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while(!(command.equals("end"))){

            String [] splitCommand = command.split("\\s+");
            switch (splitCommand[0]){
                case "Add":
                    items.add(Integer.parseInt(splitCommand[1]));
                    break;
                case "Remove":
                    items.remove(Integer.valueOf(splitCommand[1]));
                    break;
                case "RemoveAt":
                    items.remove(items.get(Integer.parseInt(splitCommand[1])));
                    break;
                case "Insert":
                    items.add(Integer.parseInt(splitCommand[2]),Integer.valueOf(splitCommand[1]));
                    break;
                default:
                    break;
            }

            command = scanner.nextLine();
        }

        for (Integer n : items) {
            System.out.print(n + " ");
        }

    }
}

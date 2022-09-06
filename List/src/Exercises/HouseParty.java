package Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int commandCount = Integer.parseInt(scanner.nextLine());
        List<String> invitedPeople = new ArrayList<>();

        for (int i = 0; i < commandCount; i++) {
            String command = scanner.nextLine();
            String [] commandSplit = command.split("\\s+");
            String name = commandSplit[0];
            if(!(command.contains("not"))){
                if(invitedPeople.contains(name)){
                    System.out.printf("%s is already in the list!\n",name);
                }
                else{
                    invitedPeople.add(name);
                }
            }
            else{
                if(invitedPeople.contains(name)){
                    invitedPeople.remove(name);
                }
                else{
                    System.out.printf("%s is not in the list!\n",name);
                }
            }
        }

        for (String s : invitedPeople) {
            System.out.println(s);
        }

    }
}

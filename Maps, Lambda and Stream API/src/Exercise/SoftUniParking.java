package Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, String> registered = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine();
            String[] commandToArray = command.split("\\s+");

            if(command.contains("unregister")){
                boolean isRegistered = false;
                for (Map.Entry<String, String> entry : registered.entrySet()) {
                    if(commandToArray[1].equals(entry.getKey())){
                        isRegistered = true;
                    }
                }

                if(!isRegistered){
                    System.out.printf("ERROR: user %s not found\n",commandToArray[1]);
                }
                else{
                    System.out.printf("%s unregistered successfully\n",commandToArray[1]);
                    registered.remove(commandToArray[1]);
                }
            }
            else if(command.contains("register")){
                boolean exists = false;
                String existingRegPlate = "";
                for (Map.Entry<String, String> entry : registered.entrySet()) {
                    if(commandToArray[1].equals(entry.getKey())){
                        exists = true;
                        existingRegPlate = entry.getValue();
                    }
                }

                if(exists){
                    System.out.printf("ERROR: already registered with plate number %s\n",existingRegPlate);
                }
                else{
                    registered.put(commandToArray[1],commandToArray[2]);
                    System.out.printf("%s registered %s successfully\n",commandToArray[1],commandToArray[2]);
                }
            }
        }

        for (Map.Entry<String, String> entry : registered.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

    }
}

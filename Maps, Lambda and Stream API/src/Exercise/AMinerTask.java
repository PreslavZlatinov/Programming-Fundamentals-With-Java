package Exercise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String material = scanner.nextLine();

        Map<String, Integer> materialQuantity = new LinkedHashMap<>();

        while(!(material.equals("stop"))){

            int quantity = Integer.parseInt(scanner.nextLine());

            if(!(materialQuantity.containsKey(material))){
                materialQuantity.put(material,quantity);
            }
            else {
                materialQuantity.put(material, materialQuantity.get(material) + quantity);
            }

            material = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> entry : materialQuantity.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}

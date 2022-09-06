package Exercise;

import java.util.*;

public class LegendarnaFarmaciq {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> materialQuantity = new LinkedHashMap<>();
        materialQuantity.put("shards", 0);
        materialQuantity.put("fragments", 0);
        materialQuantity.put("motes", 0);
        boolean isCrafted = false;

        while (!isCrafted) {
            String[] materials = scanner.nextLine().split("\\s+");

            for (int i = 0; i < materials.length; i += 2) {
                String material = materials[i + 1].toLowerCase();
                int quantity = Integer.parseInt(materials[i]);

                if (!materialQuantity.containsKey(material)) {
                    materialQuantity.put(material, quantity);
                } else {
                    materialQuantity.put(material, materialQuantity.get(material) + quantity);
                }

                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                    if (materialQuantity.get(material) >= 250) {
                        if (material.equals("shards")) {
                            System.out.println("Shadowmourne obtained!");
                        } else if (material.equals("fragments")) {
                            System.out.println("Valanyr obtained!");
                        } else if (material.equals("motes")) {
                            System.out.println("Dragonwrath obtained!");
                        }

                        materialQuantity.put(material, materialQuantity.get(material) - 250);

                        isCrafted = true;
                        break;
                    }
                }
            }
        }
        materialQuantity.forEach((key, value) -> System.out.printf("%s: %d%n", key, value));
    }
}

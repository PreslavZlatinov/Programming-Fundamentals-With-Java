package Exercise;

import java.util.*;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> materialCount = new LinkedHashMap<>();

        String[] inputLine = scanner.nextLine().split("\\s+");

        boolean isObtained = false;

        while (true) {

            for (int i = 0; i < inputLine.length; i++) {
                int count = Integer.parseInt(inputLine[i]);
                String material = inputLine[i + 1];
                String materialToLowerCase = material.toLowerCase();

                if (!(materialCount.containsKey(materialToLowerCase))) {
                    materialCount.put(materialToLowerCase, count);
                } else {
                    materialCount.put(materialToLowerCase, materialCount.get(materialToLowerCase) + count);
                }

                for (Map.Entry<String, Integer> entry : materialCount.entrySet()) {
                    if (entry.getKey().equals("shards") && entry.getValue() >= 250) {
                        System.out.println("Shadowmourne obtained!");
                        materialCount.put(entry.getKey(), entry.getValue() - 250);
                        isObtained = true;
                        break;
                    } else if (entry.getKey().equals("fragments") && entry.getValue() >= 250) {
                        System.out.println("Valanyr obtained!");
                        materialCount.put(entry.getKey(), entry.getValue() - 250);
                        isObtained = true;
                        break;
                    } else if (entry.getKey().equals("motes") && entry.getValue() >= 250) {
                        System.out.println("Dragonwrath obtained!");
                        materialCount.put(entry.getKey(), entry.getValue() - 250);
                        isObtained = true;
                        break;
                    }
                }

                if (isObtained) {
                    break;
                }

                i++;
            }


            if (isObtained) {
                break;
            }

            inputLine = scanner.nextLine().split("\\s+");
        }

        String[] keyMaterials = new String[3];
        List<String> junk = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : materialCount.entrySet()) {
            if (entry.getKey().equals("shards")) {
                String materialCountCombined = entry.getKey() + ": " + entry.getValue();
                keyMaterials[0] = materialCountCombined;
            } else if (entry.getKey().equals("fragments")) {
                String materialCountCombined = entry.getKey() + ": " + entry.getValue();
                keyMaterials[1] = materialCountCombined;
            } else if (entry.getKey().equals("motes")) {
                String materialCountCombined = entry.getKey() + ": " + entry.getValue();
                keyMaterials[2] = materialCountCombined;
            } else {
                String materialCountCombined = entry.getKey() + ": " + entry.getValue();
                junk.add(materialCountCombined);
            }
        }

        if(keyMaterials[0]==null){
            keyMaterials[0] = "shards: 0";
        }

        if(keyMaterials[1]==null){
            keyMaterials[1] = "fragments: 0";
        }

        if(keyMaterials[2]==null){
            keyMaterials[2] = "motes: 0";
        }

        for (int i = 0; i < keyMaterials.length; i++) {
            System.out.println(keyMaterials[i]);
        }

        for (String s : junk) {
            System.out.println(s);
        }


    }
}

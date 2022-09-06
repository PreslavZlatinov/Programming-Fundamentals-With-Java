package Exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int messageCount = Integer.parseInt(scanner.nextLine());

        int attackCount = 0;
        int destructCount = 0;

        List<String> attackedPlanets = new ArrayList<>();
        List<String> destroyedPlanets = new ArrayList<>();

        for (int i = 0; i < messageCount; i++) {
            String input = scanner.nextLine();

            StringBuilder newInput = new StringBuilder();

            int charCount = 0;

            for (int j = 0; j < input.length(); j++) {
                char letter = Character.toLowerCase(input.charAt(j));
                if (letter == 's' || letter == 't' || letter == 'a' || letter == 'r') {
                    charCount++;
                }
            }

            for (int j = 0; j < input.length(); j++) {
                char toAdd = (char) (input.charAt(j) - charCount);
                newInput.append(toAdd);
            }

            Pattern pattern = Pattern.compile("[^@\\-!:>]*?@(?<name>[A-Z][a-z]+)[^@\\-!:>]*?:(?<population>\\d+)[^@\\-!:>]*?!(?<attack>[A|D])![^@\\-!:>]*?->(?<soldiers>\\d+)[^@\\-!:>]*?");
            Matcher matcher = pattern.matcher(newInput);

            if(matcher.find()) {
                String planetName = matcher.group("name");
                String attackType = matcher.group("attack");

                if (attackType.equals("A")) {
                    attackCount++;
                    attackedPlanets.add(planetName);
                } else if (attackType.equals("D")) {
                    destructCount++;
                    destroyedPlanets.add(planetName);
                }
            }
        }

        System.out.println("Attacked planets: " + attackedPlanets.size());
        Collections.sort(attackedPlanets);
        for (String planet : attackedPlanets) {
            System.out.println("-> " + planet);
        }

        System.out.println("Destroyed planets: " + destroyedPlanets.size());
        Collections.sort(destroyedPlanets);
        for (String planet : destroyedPlanets) {
            System.out.println("-> " + planet);
        }

    }
}

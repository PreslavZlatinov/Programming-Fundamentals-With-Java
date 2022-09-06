package Exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] participants = scanner.nextLine().split(", ");

        Map<String, Integer> participantKilometers = new LinkedHashMap<>();

        for (int i = 0; i < participants.length; i++) {
            participantKilometers.put(participants[i],0);
        }

        String input = scanner.nextLine();

        Pattern patternLetters = Pattern.compile("[A-Za-z]");
        Pattern patternDigits = Pattern.compile("[\\d]{1}");

        while (!(input.equals("end of race"))){

            StringBuilder sb = new StringBuilder();
            int kilometers = 0;

            Matcher matcherLetters = patternLetters.matcher(input);
            while(matcherLetters.find()){
                sb.append(matcherLetters.group());
            }

            Matcher matcherDigits = patternDigits.matcher(input);
            while (matcherDigits.find()){
                kilometers += Integer.parseInt(matcherDigits.group());
            }

            if(participantKilometers.containsKey(sb.toString())) {
                participantKilometers.put(sb.toString(), participantKilometers.get(sb.toString())+kilometers);
            }

            input = scanner.nextLine();
        }

        List<String> sorted = participantKilometers.entrySet().stream().sorted((a,b)->Integer.compare(b.getValue(), a.getValue()))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        for (int i = 1; i <= 3; i++) {
            if(i==1){
                System.out.printf("%dst place: %s\n",i,sorted.get(0));
            }
            else if(i==2){
                System.out.printf("%dnd place: %s\n",i,sorted.get(1));
            }
            else{
                System.out.printf("%drd place: %s\n",i,sorted.get(2));
            }
        }
    }
}

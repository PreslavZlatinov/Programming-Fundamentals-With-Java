package Lab;

import java.util.*;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> words = new LinkedHashMap<>();

        String[] inputLine = scanner.nextLine().split("\\s+");

        for (String s : inputLine) {
            String wordToLower = s.toLowerCase();
            if(!words.containsKey(wordToLower)){
                words.put(wordToLower,0);
            }
            words.put(wordToLower,words.get(wordToLower)+1);
        }

        List<String> odds = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : words.entrySet()) {
            if(!(entry.getValue()%2==0)){
                odds.add(entry.getKey());
            }
        }

        for (int i = 0; i < odds.size(); i++) {
            if(i==odds.size()-1){
                System.out.print(odds.get(i));
            }
            else{
                System.out.print(odds.get(i) + ", ");
            }
        }

    }
}

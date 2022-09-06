package Lab;

import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> words = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n ; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            if(!words.containsKey(word)){
                words.put(word,new ArrayList<>());
                words.get(word).add(synonym);
            }
            else{
                words.get(word).add(synonym);
            }
        }

        for (Map.Entry<String, List<String>> entry : words.entrySet()) {
            System.out.print(entry.getKey() + " - ");
            for (int i = 0; i < entry.getValue().size(); i++) {
                if(i == entry.getValue().size()-1){
                    System.out.print(entry.getValue().get(i));
                }
                else{
                    System.out.print(entry.getValue().get(i) + ", ");
                }
            }
            System.out.println();
        }


    }
}

package Lab;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String wordToRemove = scanner.nextLine();
        String words = scanner.nextLine();

        int index = words.indexOf(wordToRemove);

        while (index!=-1){
           words = words.replace(wordToRemove,"");
           index = words.indexOf(wordToRemove);
        }

        System.out.println(words);
    }
}

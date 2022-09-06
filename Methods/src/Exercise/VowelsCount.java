package Exercise;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();

        char [] vowels = new char[] {'A','E','I','O','U','a','e','i','o','u'};

        int vowelsCount = getCountVowels(inputLine, vowels);

        System.out.print(vowelsCount);
    }

    private static int getCountVowels(String inputLine, char[] vowels) {
        int count = 0;
        for (int i = 0; i < inputLine.length(); i++) {
            char letter = inputLine.charAt(i);
            for (char vowel : vowels) {
                if(letter==vowel){
                    count++;
                }
            }
        }

        return count;
    }
}

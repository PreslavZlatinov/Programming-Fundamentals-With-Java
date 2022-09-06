package Exercise;

import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(scanner.nextLine());

        for (int i = 0; i < sb.length()-1; i++) {
            char firstLetter = sb.charAt(i);
            char nextLetter = sb.charAt(i+1);
            if(firstLetter==nextLetter){
                sb.deleteCharAt(i);
                i--;
            }
        }

        System.out.println(sb);
    }
}

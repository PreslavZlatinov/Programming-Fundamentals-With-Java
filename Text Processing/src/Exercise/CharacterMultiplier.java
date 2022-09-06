package Exercise;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        System.out.println(getMultiplyCharacterValues(input[0],input[1]));
    }

    private static int getMultiplyCharacterValues(String first, String second) {
        int sum = 0;
        String biggerLength = "";
        String smallerLength = "";

        if (first.length()>second.length()){
            biggerLength = first;
            smallerLength = second;
        }
        else{
            biggerLength = second;
            smallerLength = first;
        }

        for (int i = 0; i < biggerLength.length(); i++) {
            if(i<=smallerLength.length()-1) {
                sum += biggerLength.charAt(i) * smallerLength.charAt(i);
            }
            else{
                sum+=biggerLength.charAt(i);
            }
        }
        return sum;
    }


}

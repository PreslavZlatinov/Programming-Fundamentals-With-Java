package Lab;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> saveList = new LinkedList<>();

        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("(\\+359)([ -])[2]\\2\\d{3}\\2\\d{4}\\b");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()){
            saveList.add(matcher.group());
        }

        for (int i = 0; i < saveList.size(); i++) {
            if(i == saveList.size()-1){
                System.out.print(saveList.get(i));
            }
            else{
                System.out.print(saveList.get(i) + ", ");
            }
        }

    }
}

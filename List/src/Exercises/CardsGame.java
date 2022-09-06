package Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputOne = scanner.nextLine();
        String inputTwo = scanner.nextLine();

        List<Integer> firstCards = Arrays.stream(inputOne.split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondCards = Arrays.stream(inputTwo.split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        int index = 0;
        while(!(firstCards.size()==0) || !(secondCards.size()==0)){

            if(secondCards.size()==0 || firstCards.size()==0){
                break;
            }

            if(firstCards.get(index)>secondCards.get(index)){
                firstCards.add(firstCards.get(index));
                firstCards.add(secondCards.get(index));
                firstCards.remove(index);
                secondCards.remove(index);
            }
            else if(firstCards.get(index)<secondCards.get(index)){
                secondCards.add(secondCards.get(index));
                secondCards.add(firstCards.get(index));
                secondCards.remove(index);
                firstCards.remove(index);
            }
            else if(Objects.equals(firstCards.get(index), secondCards.get(index))){
                secondCards.remove(index);
                firstCards.remove(index);
            }
        }

        int sum = 0;

        if(firstCards.size()==0){
            for (Integer n : secondCards) {
                sum += n;
            }
            System.out.printf("Second player wins! Sum: %d",sum);
        }
        else{
            for (Integer n : firstCards) {
                sum +=n;
            }
            System.out.printf("First player wins! Sum: %d",sum);
        }
    }
}

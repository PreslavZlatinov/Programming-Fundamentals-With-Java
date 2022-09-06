package Lab;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String values = scanner.nextLine();
        List<String> inputLine = Arrays.stream(values.split("\\s+")).collect(Collectors.toList());
        List<Double> numbers = new ArrayList<>();

        for (int i = 0; i < inputLine.size(); i++) {
                numbers.add(Double.parseDouble(inputLine.get(i)));
        }

        for (int i = 0; i <numbers.size()-1 ; i++) {
            if(numbers.get(i).equals(numbers.get(i+1))){
                numbers.set(i,numbers.get(i)+numbers.get(i+1));
                numbers.remove(i+1);
                i=-1;
            }
        }

        String output = "";
        for (Double number : numbers)
            output += (new DecimalFormat("0.#").format(number) + " ");

        System.out.println(output);
    }
}

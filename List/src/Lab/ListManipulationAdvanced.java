package Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String values = scanner.nextLine();
        List<Integer> valuesToList = Arrays.stream(values.split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!(command.equals("end"))) {

            String[] splitCommand = command.split("\\s+");

            switch (splitCommand[0]) {
                case "Contains":
                    boolean contains = valuesToList.contains(Integer.valueOf(splitCommand[1]));
                    if (contains) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    if (splitCommand[1].equals("even")) {
                        for (Integer n : valuesToList) {
                            if (n % 2 == 0) {
                                System.out.print(n + " ");
                            }
                        }
                        System.out.println();

                    } else if (splitCommand[1].equals("odd")) {
                        for (Integer n : valuesToList) {
                            if (n % 2 != 0) {
                                System.out.print(n + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "Get":
                    int sumOfAll = 0;
                    for (Integer n : valuesToList) {
                        sumOfAll += n;
                    }
                    System.out.println(sumOfAll);
                    break;
                case "Filter":
                    if (splitCommand[1].equals("<")) {
                        for (Integer n : valuesToList) {
                            if (n < Integer.parseInt(splitCommand[2])) {
                                System.out.print(n + " ");
                            }
                        }
                        System.out.println();
                    } else if (splitCommand[1].equals(">")) {
                        for (Integer n : valuesToList) {
                            if (n > Integer.parseInt(splitCommand[2])) {
                                System.out.print(n + " ");
                            }
                        }
                        System.out.println();
                    } else if (splitCommand[1].equals("<=")) {
                        for (Integer n : valuesToList) {
                            if (n <= Integer.parseInt(splitCommand[2])) {
                                System.out.print(n + " ");
                            }
                        }
                        System.out.println();
                    } else if (splitCommand[1].equals(">=")) {
                        for (Integer n : valuesToList) {
                            if (n >= Integer.parseInt(splitCommand[2])) {
                                System.out.print(n + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;
            }


            command = scanner.nextLine();
        }
    }
}

package Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OpinionPoll {
    static class Person {
        public String name;
        public int age;

        Person(){}

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return String.format("%s - %d", this.name, this.age);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Person> persons = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String personInfo = scanner.nextLine();
            String[] infoToArray = personInfo.split("\\s+");

            String name = infoToArray[0];
            int age = Integer.parseInt(infoToArray[1]);

            Person person = new Person(name, age);

            persons.add(person);
        }

        persons.stream()
                .sorted((p1, p2) -> p1.getName().compareTo(p2.getName()))
                .filter(person -> person.getAge() > 30)
                .forEach(p -> System.out.println(p.toString()));
    }
}

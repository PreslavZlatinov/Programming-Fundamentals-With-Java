package Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderByAge {
    static class Person{
        String name;
        String id;
        int age;

        public Person(String name, String id, int age) {
            this.name = name;
            this.id = id;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public String getId() {
            return id;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString(){
            return this.name + " with ID: " + this.id + " is " + this.age + " years old.";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> people = new ArrayList<>();

        String command = scanner.nextLine();

        while (!(command.equals("End"))){

            String[] commandToArray = command.split("\\s+");

            String name = commandToArray[0];
            String id = commandToArray[1];
            int age = Integer.parseInt(commandToArray[2]);
            Person person = new Person(name,id,age);

            people.add(person);

            command = scanner.nextLine();
        }

        people.stream()
                .sorted((p1,p2)->Integer.compare(p1.getAge(), p2.getAge()))
                .forEach(person -> System.out.println(person.toString()));
    }
}

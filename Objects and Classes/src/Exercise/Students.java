package Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {
    static class Student {
        String firstName;
        String lastName;
        double grade;


        public Student(String firstName, String lastName, double grade) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.grade = grade;
        }

        public double getGrade() {
            return grade;
        }

        @Override
        public String toString() {
            return String.format("%s %s: %.2f", this.firstName, this.lastName, this.grade);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> students = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] studentInfo = scanner.nextLine().split("\\s+");
            Student student = new Student(studentInfo[0], studentInfo[1], Double.parseDouble(studentInfo[2]));
            students.add(student);
        }


                students.stream()
                .sorted((s1, s2) -> s1.getGrade() > s2.getGrade() ? -1 :
                        s1.getGrade() < s2.grade ? 1 : 0)
                .forEach(s -> System.out.println(s.toString()));


//            students.stream()
//                    .sorted((s1,s2)->Double.compare(s2.getGrade(), s1.getGrade()))
//                    .forEach(s -> System.out.println(s.toString()));
    }
}

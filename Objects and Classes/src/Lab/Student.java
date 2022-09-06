package Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
    String firstName;
    String lastName;
    int age;
    String homeTown;

    public Student(String firstName, String lastName, int age, String homeTown) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.homeTown = homeTown;
    }

    public Student() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    private static boolean IsStudentExisting(List<Student> students, String firstName, String lastName) {
        for (Student s : students) {
            if (s.getFirstName().equals(firstName) && s.getLastName().equals(lastName)) {
                return true;
            }
        }
        return false;
    }

    private static Student getStudent(List<Student> students, String firstName, String lastName) {
        Student existingStudent = null;

        for (Student s : students) {
            if (s.getFirstName().equals(firstName) && s.getLastName().equals(lastName)) {
                existingStudent = s;
            }
        }
        return existingStudent;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> students = new ArrayList<>();

        String studentInfo = scanner.nextLine();

        while (!(studentInfo.equals("end"))) {

            String[] infoToArray = studentInfo.split("\\s+");

            String firstName = infoToArray[0];
            String lastName = infoToArray[1];
            int age = Integer.parseInt(infoToArray[2]);
            String town = infoToArray[3];

            if (IsStudentExisting(students, firstName, lastName)) {
                Student student = getStudent(students,firstName,lastName);

                student.setFirstName(firstName);
                student.setLastName(lastName);
                student.setAge(age);
                student.setHomeTown(town);

            }
            else{
                Student student = new Student();
                student.setFirstName(firstName);
                student.setLastName(lastName);
                student.setAge(age);
                student.setHomeTown(town);

                students.add(student);
            }

//            Lab.Student student = new Lab.Student();
//
//            student.setFirstName(firstName);
//            student.setLastName(lastName);
//            student.setAge(age);
//            student.setHomeTown(town);
//
//            students.add(student);

            studentInfo = scanner.nextLine();
        }

        String townToPrint = scanner.nextLine();

        for (Student s : students) {
            if (s.getHomeTown().equals(townToPrint)) {
                System.out.printf("%s %s is %d years old\n", s.getFirstName(), s.getLastName(), s.getAge(), s.getHomeTown());
            }
        }

    }
}

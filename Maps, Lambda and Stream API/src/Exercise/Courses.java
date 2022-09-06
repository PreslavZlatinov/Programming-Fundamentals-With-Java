package Exercise;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();

        Map<String, List<String>> courses = new LinkedHashMap<>();
        while (!(inputLine.equals("end"))){

            String[] inputToArray = inputLine.split(" : ");

            String courseName = inputToArray[0];
            String studentName = inputToArray[1];

            List<String> students = courses.get(courseName);
            if(students != null){
                students.add(studentName);
            }
            else{
                students = new ArrayList<>();
                courses.put(courseName,students);
                students.add(studentName);
            }

            inputLine = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : courses.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().size());
            for (String s : entry.getValue()) {
                System.out.println("-- " + s);
            }

        }

    }
}

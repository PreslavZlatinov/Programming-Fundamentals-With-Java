package Exercise;

import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> studentGrades = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String studentName = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            List<Double> grades = studentGrades.get(studentName);
            if(grades != null && studentGrades.containsKey(studentName)){
                grades.add(grade);
            }
            else{
                grades = new ArrayList<>();
                studentGrades.put(studentName,grades);
                grades.add(grade);
            }
        }

        for (Map.Entry<String, List<Double>> entry : studentGrades.entrySet()) {
            double gradeSum = 0;
            for (Double d : entry.getValue()) {
                gradeSum += d;
            }
            double averageGrade = gradeSum/entry.getValue().size();

            if(averageGrade>=4.50){
            System.out.print(entry.getKey() + " -> ");
            System.out.printf("%.2f\n", averageGrade);
            }
        }

    }
}

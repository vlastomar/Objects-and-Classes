package StudentPackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int countStudent = Integer.parseInt(scan.nextLine());
        ArrayList<Student> allSudents = new ArrayList<>();

        for (int i = 0; i <countStudent ; i++) {
            String[] input = scan.nextLine().split(" ");
            String firstN = input[0];
            String secondN = input[1];
            double grade = Double.parseDouble(input[2]);
            Student oneStudent = new Student(firstN, secondN, grade);
            allSudents.add(oneStudent);
        }
        allSudents
                .stream()
                .sorted(Comparator.comparingDouble(Student::getGrade).reversed())
                .forEach(p -> System.out.println(p));
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Students {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Student> students = new ArrayList<>();

        while (true){
            String[] tokens = scan.nextLine().split(" ");
            if ("end".equals(tokens[0])){
                String cityName = scan.nextLine();
                for(Student stu : students){
                    if (stu.getHomeTown().equals(cityName)){
                        System.out.printf("%s %s is %d years old%n", stu.getFirstName(),
                                stu.getLastName(),stu.getAge());
                    }
                }
                break;
            }
            String firstName = tokens[0];
            String lastName = tokens[1];
            int age = Integer.parseInt(tokens[2]);
            String city = tokens[3];

            Student student = new Student(firstName, lastName, age, city);

            students.add(student);
        }
    }
    static class Student {
        private String firstName;
        private String lastName;
        private int age;
        private String homeTown;

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getHomeTown() {
            return homeTown;
        }

        public void setHomeTown(String homeTown) {
            this.homeTown = homeTown;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public Student(String firstName, String lastName, int age, String homeTown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.homeTown = homeTown;

        }
    }

}

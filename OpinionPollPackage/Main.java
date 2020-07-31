package OpinionPollPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        List<Person> allPeople = new ArrayList<>();

        for (int i = 0; i < number ; i++) {
            String[] data = scan.nextLine().split(" ");
            String nameM = data[0];
            int ageM = Integer.parseInt(data[1]);
            Person newData = new Person(nameM, ageM);

            allPeople.add(newData);
        }

        allPeople
                .stream()
                .filter(p -> p.getAge() > 30)
                .sorted((p1 , p2) -> p1.getName().compareTo(p2.getName()))
                .forEach(p -> System.out.println(p));


    }
}

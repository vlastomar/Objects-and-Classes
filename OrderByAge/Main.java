package OrderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Order> data = new ArrayList<>();

        while (true){
            String[] input = scan.nextLine().split(" ");
            if ("End".equals(input[0])){
                data
                        .stream()
                        .sorted((Comparator.comparingInt(Order::getAge)))
                        .forEach(o -> System.out.println(o));

                break;
            }
            String nameM = input[0];
            String idM = input[1];
            int ageM = Integer.parseInt(input[2]);

            Order onePerson = new Order(nameM, idM, ageM);
            data.add(onePerson);
        }

    }

}

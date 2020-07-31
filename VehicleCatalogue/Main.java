package VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Car> cars = new ArrayList<>();
        List<Truck> trucks = new ArrayList<>();

        int carsHorsepower = 0;
        int trucksHorsepower = 0;
        /*ArrayList<Vehicle> vehicles = new ArrayList<>();
        double counterC = 0;
        double counterT = 0;
        double totalCar = 0;
        double totalTruck = 0;*/


        while (true){
            String[] input = scan.nextLine().split("\\s+");
            if ("End".equals(input[0])){
                break;
            }
            String type = input[0];
            String model = input[1];
            String color = input[2];
            int horsepower = Integer.parseInt(input[3]);
            if ("car".equals(type)){
                Car car = new Car(model,color,horsepower);
                carsHorsepower += car.getHorsepower();
                        cars.add(car);

                /*totalCar += horseP*1.0;
                counterC++;
                typeV = "Car";*/

            }else  if ("truck".equals(type)){
                Truck truck = new Truck(model, color, horsepower);
                trucksHorsepower += truck.getHorsepower();
                trucks.add(truck);
               /*totalTruck += horseP*1.0;
                counterT++;
                typeV = "Truck";*/
            }
            /*Vehicle veh = new Vehicle(typeV, modelV, colorV, horseP);
            vehicles.add(veh);*/
        }
        String input = scan.nextLine();
        while (!input.equals("Close the Catalogue")){
            boolean isFound = false;
            for(Car car : cars){
                if (car.getModel().equals(input)){
                    System.out.println(car);
                    isFound = true;
                    break;
                }
            }
            if (!isFound){
                for(Truck truck : trucks){
                    if (truck.getModel().equals(input)){
                        System.out.println(truck);
                        break;
                    }
                }
            }


            /*String input = scan.nextLine();
            if (input.equals("Close the Catalogue")){
                double averageC = totalCar / counterC * 1.00;
                double averageT = totalTruck / counterT * 1.00;
                System.out.printf("Cars have average horsepower of: %.2f.%n", averageC);
                System.out.printf("Trucks have average horsepower of: %.2f.", averageT);
                break;
            }
            vehicles.stream()
                    .filter(p -> p.getModel().equals(inputVeh))
                    .forEach(p -> System.out.println(p));*/
            input = scan.nextLine();
        }
            double avgCarsHorsepower = 0;
        if (cars.size() != 0){
            avgCarsHorsepower = carsHorsepower * 1.00 / cars.size();

        }
        System.out.printf("Cars have average horsepower of: %.2f.%n", avgCarsHorsepower);
        double avgrucksHorsepower = 0;
        if (trucks.size() != 0){
            avgrucksHorsepower = trucksHorsepower * 1.00 / trucks.size();

        }
        System.out.printf("Trucks have average horsepower of: %.2f.%n", avgrucksHorsepower);



    }
}
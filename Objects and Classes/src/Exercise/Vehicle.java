package Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vehicle {
    public String type;
    public String model;
    public String color;
    public int horsePower;

    public Vehicle(String type, String model, String color, int horsePower) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getHorsePower() {
        return horsePower;
    }

    @Override
    public String toString() {
        return "Type: " + this.type + "\nModel: " + this.model + "\nColor: " + this.color + "\nHorsepower: " + this.horsePower;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Vehicle> vehicles = new ArrayList<>();

        String firstInput = scanner.nextLine();

        while (!(firstInput.equals("End"))) {
            String[] inputToArray = firstInput.split("\\s+");

            String type = inputToArray[0];
            String typeToPrint = type.substring(0,1).toUpperCase() + type.substring(1);
            String model = inputToArray[1];
            String color = inputToArray[2];
            int horsePower = Integer.parseInt(inputToArray[3]);

            Vehicle vehicle = new Vehicle(typeToPrint, model, color, horsePower);

            vehicles.add(vehicle);

            firstInput = scanner.nextLine();
        }

        String secondInput = scanner.nextLine();

        while (!(secondInput.equals("Close the Catalogue"))) {

            String finalSecondInput = secondInput;
            vehicles.stream()
                    .filter(vehicle -> vehicle.getModel().equals(finalSecondInput))
                    .forEach(vehicle -> System.out.println(vehicle.toString()));

            secondInput = scanner.nextLine();
        }

        double averagePowerTrucks = 0;
        double averagePowerCars = 0;

        int carCount=0;
        int truckCount=0;

        for (Vehicle vehicle : vehicles) {
            if (vehicle.getType().equals("Truck")) {
                averagePowerTrucks += vehicle.getHorsePower();
                truckCount++;
            } else if (vehicle.getType().equals("Car")) {
                averagePowerCars += vehicle.getHorsePower();
                carCount++;
            }
        }

        if(carCount>0){
            System.out.printf("Cars have average horsepower of: %.2f.\n",averagePowerCars/carCount);
        }
        else{
            System.out.println("Cars have average horsepower of: 0.00.");
        }

        if(truckCount>0){
            System.out.printf("Trucks have average horsepower of: %.2f.",averagePowerTrucks/truckCount);
        }
        else{
            System.out.println("Trucks have average horsepower of: 0.00.");
        }

    }
}

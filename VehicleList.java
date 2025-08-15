package test;
import java.util.ArrayList;
import java.util.Scanner;

class Vehicle {
    String name;
    int wheels;
    int cc;

    Vehicle(String name, int wheels, int cc) {
        this.name = name;
        this.wheels = wheels;
        this.cc = cc;
    }
}

public class VehicleList {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Vehicle("Car", 4, 1500));
        vehicles.add(new Vehicle("Bike", 2, 150));
        vehicles.add(new Vehicle("Truck", 6, 5000));
        vehicles.add(new Vehicle("Scooter", 2, 125));
        vehicles.add(new Vehicle("Bus", 6, 7000));
        vehicles.add(new Vehicle("Auto", 3, 200));
        vehicles.add(new Vehicle("Bicycle", 2, 0));
        vehicles.add(new Vehicle("Tractor", 4, 2500));
        vehicles.add(new Vehicle("Van", 4, 1800));
        vehicles.add(new Vehicle("Quadbike", 4, 800));

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter vehicle name: ");
        String search = sc.nextLine();

        boolean found = false;
        for (Vehicle v : vehicles) {
            if (v.name.equalsIgnoreCase(search)) {
                System.out.println("Vehicle: " + v.name);
                System.out.println("Wheels: " + v.wheels);
                System.out.println("Engine CC: " + v.cc);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Vehicle not found in the list.");
        }

        sc.close();
    }
}

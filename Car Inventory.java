public class Car {
    private int id;
    private String make;
    private String model;
    private int year;
    private double price;

    // Constructors, getters, setters, toString, etc.
}

import java.util.ArrayList;
import java.util.List;

public class InventorySystem {
    private List<Car> cars;

    public InventorySystem() {
        this.cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        // Implementation to add a car to the inventory
    }

    public void removeCar(int carId) {
        // Implementation to remove a car from the inventory
    }

    public void displayInventory() {
        // Implementation to display the current inventory
    }

    // Other methods for managing the inventory
}

public class Main {
    public static void main(String[] args) {
        InventorySystem inventorySystem = new InventorySystem();

        // Sample car data
        Car car1 = new Car(1, "Toyota", "Corolla", 2020, 20000);
        Car car2 = new Car(2, "Honda", "Civic", 2019, 18000);

        // Add cars to the inventory
        inventorySystem.addCar(car1);
        inventorySystem.addCar(car2);

        // Display the inventory
        inventorySystem.displayInventory();
    }
}

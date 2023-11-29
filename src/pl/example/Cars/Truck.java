package pl.example.Cars;

public class Truck extends Vehicle implements InterfaceClass {
    protected double capacity;

    public Truck(String registrationNumber, String vinNumber, String color, double price,
                 double fuelConsumption, double tankCondition, double odometer, double tankCapacity, double capacity) {
        super(registrationNumber, vinNumber, color, price, fuelConsumption, tankCondition, odometer, tankCapacity);
        this.capacity = capacity;

    }

    //I used StringBuilder here
    public String toString() {
        return String.format("Motorcycle {%n" +
                "  Plates: %s,%n" +
                "  Vin: %s,%n" +
                "  Color: %s,%n" +
                "  Price: %.2f,%n" +
                "  Fuel Consumption: %.2f,%n" +
                "  Tank Condition: %.2f,%n" +
                "  Odometer: %.2f%n" +
                "}", registrationNumber, vinNumber, color, price, fuelConsumption, tankCondition, odometer);
    }

    @Override
    public void drive() {

    }

    @Override
    public void refuel() {

    }

    @Override
    public void loadCargo(double cargoWeight) {
        if (cargoWeight <= capacity) {
            // Implementacja ładowania ładunku dla ciężarówki
            System.out.println("Loading cargo: " + cargoWeight + " kg");
            capacity -= cargoWeight;
        } else {
            System.out.println("Cargo capacity exceeded. Cannot load.");
        }
    }

    @Override
    public void unloadCargo(double cargoWeight) {
        if (capacity + cargoWeight <= tankCapacity) {
            // Implementacja rozładowywania ładunku dla ciężarówki
            System.out.println("Unloading cargo: " + cargoWeight + " kg");
            capacity += cargoWeight;
        } else {
            System.out.println("Cargo capacity exceeded. Cannot unload.");
        }
    }

}

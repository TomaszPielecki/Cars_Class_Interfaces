package pl.example.Cars;

class Car extends Vehicle {
    protected int numberOfDoors;

    public Car(String registrationNumber, String vinNumber, String color, double price, double fuelConsumption,
               double tankCondition, double odometer, double tankCapacity, int numberOfDoors) {
        super(registrationNumber, vinNumber, color, price, fuelConsumption, tankCondition, odometer, tankCapacity);
        this.numberOfDoors = numberOfDoors;
    }

    public void loadCargo(double cargoWeight) {
        System.out.println("Loading cargo For Car");
    }

    public void unloadCargo(double cargoWeight) {
        System.out.println("Unloading cargo for Car");
    }

    //I used StringBuilder here
    public String toString() {
        return String.format("Car {%n" +
                "  Plates: %s,%n" +
                "  Vin: %s,%n" +
                "  Color: %s,%n" +
                "  Price: %.2f,%n" +
                "  Fuel Consumption: %.2f,%n" +
                "  Tank Condition: %.2f,%n" +
                "  Odometer: %.2f,%n" +
                "  Number of Doors: %d%n" +
                "}", registrationNumber, vinNumber, color, price, fuelConsumption, tankCondition, odometer, numberOfDoors);
    }

    @Override
    public void drive() {

    }

    @Override
    public void refuel() {

    }
}

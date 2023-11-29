package pl.example.Cars;


class Motorcycle extends Vehicle implements InterfaceClass {
    public Motorcycle(String registrationNumber, String vinNumber, String color, double price,
                      double fuelConsumption, double tankCondition, double odometer, double tankCapacity) {
        super(registrationNumber, vinNumber, color, price, fuelConsumption, tankCondition, odometer, tankCapacity);
    }

    public void drive() {

    }

    public void refuel() {

    }

    public void loadCargo(double cargoWeight) {
        // Implementacja ładowania dla motocykla
        System.out.println("Loading cargo for Motorcycle");
    }

    public void unloadCargo(double cargoWeight) {
        // Implementacja rozładowywania dla motocykla
        System.out.println("Unloading cargo for Motorcycle");
    }

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
}



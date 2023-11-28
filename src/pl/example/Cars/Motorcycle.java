package pl.example.Cars;


class Motorcycle extends Vehicle implements InterfaceClass {
    public Motorcycle(String registrationNumber, String vinNumber, String color, double price,
                      double fuelConsumption, double tankCondition, double odometer, double tankCapacity) {
        super(registrationNumber, vinNumber, color, price, fuelConsumption, tankCondition, odometer, tankCapacity);
    }
    //The use of string formatting in the new version is worth considering
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

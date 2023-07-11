package pl.example.Cars;


class Motorcycle extends Vehicle implements InterfaceClass {
    public Motorcycle(String registrationNumber, String vinNumber, String color, double price,
                      double fuelConsumption, double tankCondition, double odometer, double tankCapacity) {
        super(registrationNumber, vinNumber, color, price, fuelConsumption, tankCondition, odometer, tankCapacity);
    }


    public String toString() {
        return " Plate " + registrationNumber + " Vin " + vinNumber + " color " + color +
                ", price=" + price +
                ", fuelConsumption= " + fuelConsumption +
                ", tankCondition= " + tankCondition +
                ", tankCapacity= " + tankCapacity +
                ", odometer= " + odometer;
    }
}

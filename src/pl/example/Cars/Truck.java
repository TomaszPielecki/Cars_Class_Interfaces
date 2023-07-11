package pl.example.Cars;

public class Truck extends Vehicle implements InterfaceClass {
    protected double capacity;

    public Truck(String registrationNumber, String vinNumber, String color, double price,
                 double fuelConsumption, double tankCondition, double odometer, double tankCapacity, double capacity) {
        super(registrationNumber, vinNumber, color, price, fuelConsumption, tankCondition, odometer, tankCapacity);
        this.capacity = capacity;

    }

    public String toString() {
        return
                capacity + ", Plates= " + registrationNumber +
                        ", Vin= " + vinNumber +
                        ", color= " + color +
                        ", price= " + price +
                        ", fuelConsumption= " + fuelConsumption +
                        ", tankCondition= " + tankCondition +
                        ", tankCapacity= " + tankCapacity +
                        ", odometer= " + odometer;
    }
}

package pl.example.Cars;

public class Truck extends Vehicle implements InterfaceClass {
    protected double capacity;

    public Truck(String registrationNumber, String vinNumber, String color, double price,
                 double fuelConsumption, double tankCondition, double odometer, double tankCapacity, double capacity) {
        super(registrationNumber, vinNumber, color, price, fuelConsumption, tankCondition, odometer, tankCapacity);
        this.capacity = capacity;

    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Truck ");
        sb.append("capacity=").append(capacity);
        sb.append(", Plates=").append(registrationNumber);
        sb.append(", Vin=").append(vinNumber);
        sb.append(", color=").append(color);
        sb.append(", price=").append(price);
        sb.append(", fuelConsumption=").append(fuelConsumption);
        sb.append(", tankCondition=").append(tankCondition);
        sb.append(", tankCapacity=").append(tankCapacity);
        sb.append(", odometer=").append(odometer);
        sb.append("");

        return sb.toString();
    }
}

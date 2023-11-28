package pl.example.Cars;

class Car extends Vehicle implements InterfaceClass {
    protected int numberOfDoors;

    public Car(String registrationNumber, String vinNumber, String color, double price, double fuelConsumption,
               double tankCondition, double odometer, double tankCapacity, int numberOfDoors) {
        super(registrationNumber, vinNumber, color, price, fuelConsumption, tankCondition, odometer, tankCapacity);
        this.numberOfDoors = numberOfDoors;
    }

    //I used StringBuilder here
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Car");
        sb.append(" Plates=").append(registrationNumber);
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

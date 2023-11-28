package pl.example.Cars;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car("GKW 50012", "KL1Y12574UH33", "Black", 10000, 7.5, 70, 210000, 90, 5);
        Car car2 = new Car("GD 50014", "B1U339447481J", "Blue", 20099, 10.5, 90, 180000, 120, 2);
        // Calling the toString method
        String carStringRepresentation = car1.toString();
        String carTwoStringRepresentation = car2.toString();

        Truck truck1 = new Truck("WWE 48722", "V5H935377348", "Silver", 90000, 35, 1000, 1400000, 2000, 4000);
        Truck truck2 = new Truck("WWE 66321", "WH1UW9839238", "Yellow", 450000, 24, 1200, 540000, 1500, 8000);
        // Calling the toString method
        String truckStringRepresentation = truck1.toString();
        String truckTwoStringRepresentation = truck2.toString();

        Motorcycle motorcycle1 = new Motorcycle("GLS 30234", "KD0234109WW3", "Black", 14000, 6, 24, 400, 4000);
        Motorcycle motorcycle2 = new Motorcycle("GKW 333233", "FJ95679J493", "Yellow", 55000, 3, 35, 500, 5000);
        String motorBikeStringRepresentation = motorcycle1.toString();
        String motorBikeTwoStringRepresentation = motorcycle2.toString();

        System.out.println("-----------Exercise 6 Drive and Refuel-----------");
        car1.drive();
        car1.refuel();

        System.out.println("-----------Exercise 7 Calculate Remaining Range-----------");
        System.out.println("Vehicle with registration number " + car1.registrationNumber + " can still drive: " + car1.range() + " km.");

        System.out.println("-----------Exercise 8 Modify Drive Method-----------");
        System.out.println("Vehicle with registration number " + car1.registrationNumber + " has mileage: " + car1.odometer + " km and fuel level: " + car1.tankCondition + " liters (consumes 7.5 liters per 100 km)");
        car1.drive(100);
        System.out.println("Vehicle with registration number " + car1.registrationNumber + " has mileage: " + car1.odometer + " km and fuel level: " + car1.tankCondition + " liters");

        System.out.println("-----------Exercise 9 Modify Refuel Method-----------");
        System.out.println("Vehicle with registration number " + car1.registrationNumber + " has remaining fuel: " + car1.tankCondition + " liters");
        car1.refuel(20);
        System.out.println("Vehicle with registration number " + car1.registrationNumber + " has remaining fuel: " + car1.tankCondition + " liters");

        System.out.println("-----------Exercise 10 Modify Refuel to Full Method-----------");
        car1.refuel(140);
        System.out.println("Vehicle with registration number " + car1.registrationNumber + " has a full tank: " + car1.tankCondition + " liters");

        System.out.println("-----------Exercise 11 Change Car Color-----------");
        System.out.println("Color: " + car1.color + " Price: " + car1.price);
        car1.changeColor("Red");
        System.out.println("Color: " + car1.color + " Price: " + car1.price);

        System.out.println("-----------Exercise 12 Print Vehicles-----------");

        // Displaying the result with the new format
        System.out.println(carStringRepresentation);
        System.out.println(carTwoStringRepresentation);
        System.out.println(truckTwoStringRepresentation);
        System.out.println(truckStringRepresentation);
        System.out.println(motorBikeStringRepresentation);
        System.out.println(motorBikeTwoStringRepresentation);
    }
}

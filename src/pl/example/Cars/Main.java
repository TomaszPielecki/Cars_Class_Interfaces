package pl.example.Cars;


public class Main {

    public static void main(String[] args) {
        Car car1 = new Car("GKW 50012", "KL1Y12574UH33", "Black", 10000, 7.5, 70, 210000, 90, 5);
        Car car2 = new Car("GD 50014", "B1U339447481J", "Blue", 20099, 10.5, 90, 180000, 120, 2);

        Truck truck1 = new Truck("WWE 48722", "V5H935377348", "Silver", 90000, 35, 1000, 1400000, 2000, 4000);
        Truck truck2 = new Truck("WWE 66321", "WH1UW9839238", "Yellow", 450000, 24, 1200, 540000, 1500, 8000);

        Motorcycle motorcycle1 = new Motorcycle("GLS 30234", "KD0234109WW3", "Black", 14000, 6, 24, 400, 4000);
        Motorcycle motorcycle2 = new Motorcycle("GKW 333233", "FJ95679J493", "Yellow", 55000, 3, 35, 500, 5000);

        System.out.println("-----------Zadanie 6 Jedz i tankuj-----------");
        car1.drive();
        car1.refuel();

        System.out.println("-----------Zadanie 7 ile mozna jeszcze przejechac KM-----------");
        System.out.println("Pojazd o nr. rejestracyjnym " + car1.registrationNumber + " może przejechać jeszcze: " + car1.range() + " km.");

        System.out.println("-----------Zadanie 8 Zmodyfikowanie jedz-----------");
        System.out.println("Pojazd o nr. rejestracyjnym " + car1.registrationNumber + " ma przebieg: " + car1.odometer + " km oraz " + car1.tankCondition + " l paliwa (7,5 litra na 100 km spala)");
        car1.drive(100);
        System.out.println("Pojazd o nr. rejestracyjnym " + car1.registrationNumber + " ma przebieg: " + car1.odometer + " km oraz " + car1.tankCondition + " l paliwa");

        System.out.println("-----------Zadanie 9 Modyfikacja tankuj-----------");
        System.out.println("Pojazd o nr. rejestracyjnym " + car1.registrationNumber + " ma jeszcze: " + car1.tankCondition + " l paliwa");
        car1.refuel(20);
        System.out.println("Pojazd o nr. rejestracyjnym " + car1.registrationNumber + " ma jeszcze: " + car1.tankCondition + " l paliwa");

        System.out.println("-----------Zadanie 10 modyfikacja tankuj do pełna-----------");
        car1.refuel(140);
        System.out.println("Pojazd o nr. rejestracyjnym " + car1.registrationNumber + " ma pełny Back: " + car1.tankCondition + " l paliwa");

        System.out.println("-----------Zadanie 11 Zmaiana koloru samochodu-----------");
        System.out.println("kolor: " + car1.color + " cena: " + car1.price);
        car1.changeColor("Red");
        System.out.println("kolor: " + car1.color + " cena: " + car1.price);

        System.out.println("-----------Zadanie 12 wypisanie pojazdów-----------");

        System.out.println("Opis samochodu nr 1. " + car1);
        System.out.println("Opis samochodu nr 2. " + car2);
        System.out.println("Opis ciężarówki nr 1." + truck1);
        System.out.println("Opis ciężarowki nr 2." + truck2);
        System.out.println("Opis Motocykla nr 1." + motorcycle1);
        System.out.println("Opis motocykla nr 2" + motorcycle2);

    }
}

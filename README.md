# System Zarządzania Pojazdami

Ten projekt to prosty System Zarządzania Pojazdami zaimplementowany w języku Java, opierający się na zasadach SOLID, KISS i DRY. Obejmuje klasy reprezentujące samochody, ciężarówki i motocykle, z każdą z nich przedstawiającą różne typy pojazdów. System dostarcza podstawowych funkcji, takich jak jazda, tankowanie i zmiana koloru pojazdu.

## Funkcje

- **Klasa Car:** Reprezentuje standardowy samochód z cechami takimi jak numer rejestracyjny, numer VIN, kolor, cena, zużycie paliwa, stan baku, licznik, i pojemność baku.

- **Klasa Truck:** Reprezentuje ciężarówkę z dodatkowymi cechami, takimi jak ładowność.

- **Klasa Motorcycle:** Reprezentuje motocykl z podobnymi cechami do samochodu.

- **Klasa Vehicle:** Klasa abstrakcyjna, która służy jako baza dla klas Car, Truck i Motorcycle.

- **InterfaceClass:** Interfejs implementowany przez klasę Vehicle.

- **Klasa Main:** Zawiera przykładową aplikację demonstrującą funkcjonalność Systemu Zarządzania Pojazdami.

## Zasady Projektowe

Projekt kładzie nacisk na zasady projektowania oprogramowania, w tym zasady SOLID (Single Responsibility, Open/Closed, Liskov Substitution, Interface Segregation, Dependency Inversion),
KISS (Keep It Simple, Stupid) 
DRY (Don't Repeat Yourself).

## Użycie

Aby korzystać z Systemu Zarządzania Pojazdami, możesz tworzyć instancje klas Car, Truck i Motorcycle w swojej aplikacji Java i wykonywać różne operacje, takie jak jazda, tankowanie czy zmiana koloru.

Przykład:

```java
Car car = new Car("ABC123", "VIN123", "Blue", 20000.0, 8.5, 70.0, 150000.0, 80.0, 5);
car.drive(50);
car.refuel(20);
car.changeColor("Red");

System.out.println(car.toString());

##Licencja
Ten projekt jest licencjonowany na zasadach licencji MIT

Ten plik README.md przedstawia krótki opis projektu, jego funkcje, sposób użycia oraz zachęca do współpracy.
Możesz dostosować go do swojego projektu, dodając więcej informacji lub dostosowując do specyfiki projektu.

package Opgave04;

import java.util.HashSet;

public class App {
    public static void main(String[] args) {
        HashSet<Car> cars = new HashSet<>();
        cars.add(new Car("Ford", "Blue"));
        cars.add(new Car("VW", "Black"));
        cars.add(new Car("Audi", "White"));
        cars.add(new Car("Ferrari", "Red"));
        cars.add(new Car("Ferrari", "Blue"));
        cars.add(new Car("Lamborghini", "Black"));
        cars.add(new Car("Lamborghini", "Black"));
        System.out.println(cars);
        System.out.println("Contains Red Ferrari? " + cars.contains(new Car("Ferrari", "Red")));
    }
}

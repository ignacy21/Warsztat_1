package GENERICS.genericClass;

import java.util.function.Predicate;

public class CallingBag {

    public static void main(String[] args) {
//        Bag<String> bag = new Bag<>();
//        System.out.println(bag);
//        bag.pack("string element");
//        System.out.println(bag);
//        String empty = bag.empty();
//        System.out.println(bag);
//        System.out.println();
//
//        Bag<Car> car = new Bag<>();
//        System.out.println(car);
//        car.pack(new Car("red", "2022"));
//        System.out.println(car);
//        Car emptyCar = car.empty();
//        System.out.println(car);

        callingFilteringBag();
    }

    private static void callingFilteringBag() {
        Car car = new Car("red", 2022);
        FilteringBag<Car, Predicate<Car>, Predicate<Car>> filteringBag = new FilteringBag<>(
                c -> c.getColor().equals("red"),
                x -> x.getYear().equals(2022)
        );
        filteringBag.pack(car);
    }

    static class Car {
        private final String color;
        private final Integer year;

        public Car(String color, Integer year) {
            this.color = color;
            this.year = year;
        }

        public String getColor() {
            return color;
        }

        public Integer getYear() {
            return year;
        }

        @Override
        public String toString() {
            return "Car{" +
                    "color='" + color + '\'' +
                    ", year='" + year + '\'' +
                    '}';
        }
    }

}

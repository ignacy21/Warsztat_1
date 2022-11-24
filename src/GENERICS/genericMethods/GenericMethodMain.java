package GENERICS.genericMethods;

import java.util.Map;

public class GenericMethodMain {

    private static Map<String, Vehicle> vehicleMap = Map.of(
            "vehicle1", new Bike()
    );

    public static void main(String[] args) {
        call1(new Bike());
        call2(new Bike());

        String bike = GenericMethodMain.<Bike>call3().getName();

    }

    private static <T extends Vehicle> void call1(T element) {
        System.out.println(element);
    }
    private static <T extends Vehicle> T call2(T element) {
        System.out.println(element);
        return element;
    }
    private static <T> T call3() {
        return (T) vehicleMap.get("vehicle1");
    }


    static class Bike implements Vehicle {
        String getName() {
            return "bikeName";
        }

    }

    interface Vehicle {

    }
}

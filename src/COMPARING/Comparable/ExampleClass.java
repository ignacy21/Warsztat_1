package COMPARING.Comparable;

import java.util.*;

public class ExampleClass {

    public static void main(String[] args) {

        List<Dog> dogs = new ArrayList<>(Arrays.asList(
                new Dog("Franek", 2),
                new Dog("Michał", 4),
                new Dog("Leon", 1),
                new Dog("Kacper", 6),
                new Dog("Janek", 3),
                new Dog("Kornel", 5)
                ));


        System.out.println(dogs);
        Collections.sort(dogs);
        System.out.println(dogs);
    }
}

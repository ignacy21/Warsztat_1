package GENERICS.lowerBound_wildcard;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundsMain {

    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal());

        addFlyingDog(dogs);
        addFlyingDog(animals);
    }

    private static void addFlyingDog(List<? super Dog> list) {
        list.add(new FlyingDog());
    }


    static class Animal{}
    static class Dog extends Animal{}
    static class FlyingDog extends Dog{}
}

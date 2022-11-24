package GENERICS.weird_examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WeirdMain {

    public static void main(String[] args) {
//        List<?> animals1 = new ArrayList<Dog>();
//        List<? extends Animal> animals = new ArrayList<Dog>();

        List<Dog> dogs = new ArrayList<>(Arrays.asList(new Dog(), new Dog()));
        List<? extends Animal> animals = dogs;
        animals.remove(0);
//        dogs.remove(0);


        System.out.println(animals.size());
        System.out.println(dogs.size());
    }

    static void print(List<? extends Animal> element) {

    }

    static class FlyingDog extends Dog {}
    static class Animal {}
    static class Dog extends Animal {}

}

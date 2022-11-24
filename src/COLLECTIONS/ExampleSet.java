package COLLECTIONS;

import java.time.Duration;
import java.time.LocalTime;
import java.util.*;

public class ExampleSet {

    public static void main(String[] args) {
//        Set<Dog> dogss = new HashSet<>();
//        LocalTime before = LocalTime.now();
//        for (int i = 0; i < 1000000; i++) {
//            dogss.add(new Dog("dogggo" + 1/12));
//        }
//        System.out.println("Time: " + Duration.between(before, LocalTime.now()).toMillis());

//        Set<Dog> dogs = new LinkedHashSet<>();
//        dogs.add(new Dog("Romek"));
//        dogs.add(new Dog("Stefan"));
//        dogs.add(new Dog("Maniek"));
//        dogs.add(new Dog("Zbyszek"));
//        dogs.add(new Dog("Zbyszek"));
//        dogs.add(new Dog("Tomek"));
//        for (Dog dog : dogs) {
//            System.out.println(dog);
//        }

//        List<Integer> integersList = Arrays.asList(1, 2, 3, 35, 5, 26, 14, 16, 8, 1, 20, 41, 2, 7, 69);
//
//        Set<Integer> hashset = new HashSet<>(integersList);
//        Set<Integer> treeSet = new TreeSet<>(integersList);
//
//        System.out.println("Hash: " + hashset);
//        System.out.println("Tree: " + treeSet);

        Set<Dog> dogs = new TreeSet<>(Comparator.comparing(x -> x.name));
        dogs.add(new Dog("Romek"));
        dogs.add(new Dog("Stefan"));
        dogs.add(new Dog("Maniek"));
        dogs.add(new Dog("Zbyszek"));
        dogs.add(new Dog("Zbyszek"));
        dogs.add(new Dog("Tomek"));
        System.out.println(dogs);

        NavigableSet<Integer> navigableSet = new TreeSet();
        for (int i = 0; i <= 100; i++) {
            navigableSet.add(i);
        }
        navigableSet.lower(50);
        navigableSet.floor(50);
        navigableSet.ceiling(90);
        navigableSet.higher(90);

        navigableSet.ceiling(100);
        navigableSet.higher(100);
    }

    private static class Dog {
        private String name;

        public Dog(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Dog: " + name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Dog)) return false;

            Dog dog = (Dog) o;

            return name != null ? name.equals(dog.name) : dog.name == null;
        }

        @Override
        public int hashCode() {
            return name != null ? name.hashCode() : 0;
        }
    }
}

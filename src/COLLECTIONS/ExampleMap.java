package COLLECTIONS;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class ExampleMap {

    public static void main(String[] args) {
//        Map<String, String> someMap = new HashMap<>();
//        someMap.put("1", "ABC");
//        someMap.put("2", "DEF");
//        someMap.put("3", "GHI");
//        someMap.put("4", "JKL");
//        System.out.println(someMap);
//
//        for (String s : someMap.keySet()) {
//            System.out.print(s + ", ");
//        }
//        System.out.println();
//        for (String s : someMap.values()) {
//            System.out.print(s + ", ");
//        }
//        System.out.println();
//        for (Map.Entry<String, String> entry : someMap.entrySet()) {
//            System.out.println(entry);
//        }
//        Dog romek = new Dog("Romek");
//        Dog stefan1 = new Dog("Stefan");
//        Dog zbyszek = new Dog("Zbyszek");
//        Dog stefan2 = new Dog("Stefan");
//
//        Map<Dog, String> dogStringMap = new HashMap<>();
//        dogStringMap.put(romek, "ma swój domek");
//        dogStringMap.put(stefan1, "zajavka");
//        dogStringMap.put(zbyszek, "asdjaadsa");
//        dogStringMap.put(stefan2, "23kjhsda");
//
//        for (Map.Entry<Dog, String> dogStringEntry : dogStringMap.entrySet()) {
//            System.out.println(dogStringEntry);
//        }


        Map<Dog, Integer> dogMap = new TreeMap<>();
        dogMap.put(new Dog("Stefan", 5), 1);
        dogMap.put(new Dog("Marcin", 4), 2);
        dogMap.put(new Dog("Michał", 6), 3);
        dogMap.put(new Dog("Kuba", 8), 4);
        dogMap.put(new Dog("Jarek", 8), 5);
        dogMap.put(new Dog("Antek", 1), 5);

        for (Map.Entry<Dog, Integer> dogIntegerEntry : dogMap.entrySet()) {
            System.out.println(dogIntegerEntry);
        }
    }

    private static class Dog implements Comparable<Dog> {
        private final String name;
        private final Integer age;

        private Dog(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "Dog: " + age + " " + name + " ";
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Dog)) return false;

            Dog dog = (Dog) o;

            return getName() != null ? getName().equals(dog.getName()) : dog.getName() == null;
        }

        @Override
        public int hashCode() {
            return getName() != null ? getName().hashCode() : 0;
        }

        @Override
        public int compareTo(Dog dog) {
            int result = dog.age - this.age;
//            return result;
            if (this.age - dog.age != 0) {
                return result;
            }
            return this.name.compareTo(dog.name);
        }
    }
}


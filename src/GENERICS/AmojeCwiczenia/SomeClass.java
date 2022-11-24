package GENERICS.AmojeCwiczenia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SomeClass<T, U> {

    private final T element1;
    private final U element2;

    public SomeClass(T element1, U element2) {
        this.element1 = element1;
        this.element2 = element2;
    }

    public T getElement1() {
        return element1;
    }

    public U getElement2() {
        return element2;
    }

    @Override
    public String toString() {
        return "SomeClass{" +
                "element1=" + element1 +
                ", element2=" + element2 +
                '}';
    }

    public static void main(String[] args) {
        List<SomeClass<Integer, String>> mapList = new ArrayList<>();
        Map<Integer, SomeClass<Integer, String>> someClassMap = new HashMap<>();
        someClassMap.put(1, new SomeClass<>(348427, "Next Station"));
        someClassMap.put(2, new SomeClass<>(329235, "Rain On The Concrete"));
        someClassMap.put(3, new SomeClass<>(452943, "On Fridays I'm Not Leaving Bath"));

        for (int i = 1; i <= someClassMap.size(); i++) {
            mapList.add(someClassMap.get(i));
        }
        for (SomeClass someClass : mapList) {
            System.out.println(someClass);
        }

    }
}

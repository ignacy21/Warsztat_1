package COMPARING.Comparator;

import java.util.*;

public class ExampleClass {

    public static void main(String[] args) {
//        List<String> strings = new ArrayList<>();
        List<String> strings = Arrays.asList("a", "A", "1", "a", "Aa", "A1", "a1");
        System.out.println(strings);
        Comparator<String> comparator = Comparator.<String>naturalOrder().reversed();
        Collections.sort(strings);
        System.out.println(strings);

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat(1, "Roman"));
        cats.add(new Cat(6, "Zbyszek"));
        cats.add(new Cat(3, "Rafał"));
        cats.add(new Cat(2, "Stefan"));
        cats.add(new Cat(5, "Roman"));
        cats.add(new Cat(4, "Roman"));
        System.out.println(cats);

        Comparator<Cat> myFirstComparator = ((Comparator<Cat>) (o1, o2) -> o1.getName().compareTo(o2.getName()))
                .thenComparing((o1, o2) -> o1.getId() - o2.getId());

        cats.sort(myFirstComparator);
        System.out.println(cats);

        Comparator<Cat> myFirstComparator1 = ((Comparator<Cat>) (o1, o2) -> o1.getName().compareTo(o2.getName()));

    }
}

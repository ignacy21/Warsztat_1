package COLLECTIONS;

import java.util.*;

public class ExampleLists {

    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("a", "b", "c");
        List<String> list2 = List.of("a", "b", "c");
        List<String> list3 = Collections.singletonList("a");
        List<String> list4 = Collections.emptyList();
        List<String> list5 = new LinkedList<>();
        List<String> list6 = new ArrayList<>();
    }
}

package GENERICS.unbounded_wildcard;

import java.util.ArrayList;
import java.util.List;

public class UnboundedWildcardMain {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Java java learning!");

        List<Tuna> tunas = new ArrayList<>();
        tunas.add(new Tuna());

        print(strings);
        print(tunas);
    }

    private static void print(List<?> whateverList) {
        for (Object o : whateverList) {
            System.out.println(o);
        }
    }

    static class Tuna {

    }
}

package GENERICS.AmojeCwiczenia;

import java.util.function.Predicate;

public class CallingTea {

    public static void main(String[] args) {
        filteringTea();

    }

    private static void filteringTea() {
        Tea tea = new Tea("Melisa", "Apple");
        FilterTea<Tea, Predicate<Tea>, Predicate<Tea>> filterTea = new FilterTea<>(
                x -> x.getType().equals("Melisa"),
                y -> y.getFlavour().equals("Apple")
                );
        filterTea.filterThisTea(tea);
    }
}


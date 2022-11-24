package GENERICS.AmojeCwiczenia;

import java.util.function.Predicate;

public class FilterTea<T, U extends Predicate, V extends Predicate> {

    private T element;

    private final U filter1;
    private final V filter2;

    public FilterTea(U filter1, V filter2) {
        this.filter1 = filter1;
        this.filter2 = filter2;
    }

    public void filterThisTea(T element) {
        if (filter1.test(element) && filter2.test(element)) {
            this.element = element;
            System.out.println("Twoja herbatka: " + element);
        } else {
            throw new RuntimeException("No Tea for You!");
        }
    }
}

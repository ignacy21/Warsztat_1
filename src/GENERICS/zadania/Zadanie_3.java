package GENERICS.zadania;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class Zadanie_3 {

    public static void main(String[] args) {
//        ZADNAIE 1
        List<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        List<String> strings = new ArrayList<>(Arrays.asList("ikar łapał raki", "kot", "kok", "zakaz", "ulica", "palidrom"));
//        zadanie1(integers);
//        System.out.println();
//        zadanie01(strings);

        method1(integers, el -> el % 2 != 0);
    }


    private static <T extends Collection<Integer>> void zadanie1(T element) {
        int counter = 0;
        for (Integer o : element) {
            if (o % 2 == 0) {
                counter++;
            }
        }
        System.out.println("Number of even numbers in your list: " + counter);
    }
    private static <T extends Collection<String>> void zadanie01(T element) {
        List<String> st = new ArrayList<>();
        int counter = 0;
        for (String o : element) {
            StringBuilder x =  new StringBuilder(o);
            StringBuilder c = x.reverse();
            String s = c.toString();
            if (o.equalsIgnoreCase(s.trim())) {
                st.add(o);
                counter++;
            }
        }
        System.out.println("Number of palidroms in your list: " + counter);
        System.out.println("Palidromy: ");
        System.out.println(st);
    }
    private static <T> int method1(Collection<T> collection, Predicate<T> predicate) {
        int counter = 0;
        for (T element : collection) {
            if (predicate.test(element)) {
                counter++;
            }
        }
        return counter;
    }

}

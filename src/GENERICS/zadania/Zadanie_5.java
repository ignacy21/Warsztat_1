package GENERICS.zadania;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Zadanie_5 {

    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();

        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            ints.add(r.nextInt(25) + 1);
        }

        method(ints, 12, 9);

    }

    private static <T extends Number> boolean method(List<T> list, T x1, T x2) {
        if (x1.equals(x2)
                || (Integer) x1 < 0
                || (Integer) x2 < 0
                || (Integer) x1 > list.size()
                || (Integer) x2 > list.size()
        ) {
            System.out.println("Invalid input");
            return false;
        }
        List<T> list1 = new ArrayList<>();

        if ((Integer) x1 > (Integer) x2) {
            for (int i = 0; i < list.size(); i++) {
                if ((i >= (Integer) x2 && i <= (Integer) x1)) {
                    list1.add(list.get(i));
                }
            }
        } else {
            for (int i = 0; i < list.size(); i++) {
                if ((i <= (Integer) x2 && i >= (Integer) x1)) {
                    list1.add(list.get(i));
                }
            }
        }
        System.out.println("whole list: "+list);
        System.out.println("list parameters from index " + x1 + " to index " + x2 + ": " + list1);

        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list1.size() - 1; j++) {
                if ((Integer) list1.get(j) > (Integer) list1.get(j + 1)) {
                    T temp = list1.get(j);
                    list1.set(j, list1.get(j + 1));
                    list1.set(j + 1, temp);
                }
            }
        }
        System.out.println("sorted list: " + list1);
        System.out.println("the biggest number: "+list1.get(list1.size() - 1));
        return true;
    }
}

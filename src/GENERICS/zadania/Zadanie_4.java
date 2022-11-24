package GENERICS.zadania;

import java.util.Arrays;

public class Zadanie_4 {

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(arr));

        method(arr, 1, 5);

    }

    private static <T> T[] method(T[] arr, int x1, int x2) {
        T par1 = arr[x1];
        T par2 = arr[x2];

        arr[x1] = par2;
        arr[x2] = par1;

        System.out.println(Arrays.toString(arr));
        return arr;
    }
}

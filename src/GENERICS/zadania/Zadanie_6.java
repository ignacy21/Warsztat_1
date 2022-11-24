package GENERICS.zadania;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Zadanie_6 {
    public static void main(String[] args) {

        Stack<ItemOnTable> stack = new Stack<>();

        stack.put(new Book());
        stack.put(new Paper());
        stack.put(new Phone());
        stack.put(new Book());
        System.out.println(stack);
        System.out.println(stack.take().orElse(null));
        System.out.println(stack);
    }

    public static class Stack<T extends ItemOnTable> {

        private List<T> stack = new ArrayList<>();

        public void put(T element) {
            stack.add(element);
        }

        public Optional<T> take() {
            if (stack.size() == 0) {
                return Optional.empty();
            }
            return Optional.ofNullable(stack.remove(stack.size() - 1));
        }

        @Override
        public String toString() {
            return "Stack{" +
                    "stack=" + stack +
                    '}';
        }
    }

    static class Book implements ItemOnTable {
        @Override
        public String toString() {
            return "Book{}";
        }
    }
    static class Paper implements  ItemOnTable {
        @Override
        public String toString() {
            return "Paper{}";
        }
    }
    static class Phone implements ItemOnTable {
        @Override
        public String toString() {
            return "Phone{}";
        }
    }

    static interface ItemOnTable {}
}

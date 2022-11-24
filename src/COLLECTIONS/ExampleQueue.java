package COLLECTIONS;

import java.util.*;

public class ExampleQueue {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(
                1, 2, 5, 7, 3, 8, 5, 9, 8, 6, 2, 1, 9, 5
        ));
        Queue<Integer> queue = new ArrayDeque<>();
//        for (Integer integer : queue) {
//            System.out.println("queue peek: " + queue.peek());
//            System.out.println(queue);
//            System.out.println("queue poll: " + queue.poll());
//            System.out.println(queue);
//        }
//        System.out.println("QUEUE");
//        for (Integer integer : list) {
//            System.out.println(queue);
//            queue.add(integer);
//        }
//        System.out.println(queue);
        int size = queue.size();
//        for (int i = 0; i < size; i++) {
//            System.out.println(queue);
//            queue.remove();
//        }

//        for (int i = 0; i < size; i++) {
//            System.out.println(queue.element());
//        }

        System.out.println("DEQUEUE");
        Deque<Integer> deque = new ArrayDeque<>();
        System.out.println(deque);

        for (Integer integer : list) {
            System.out.println(deque);
            deque.add(integer);
        }
        System.out.println(deque);
        for (Integer integer : list) {
            System.out.println(deque);
            deque.remove(integer);
        }
        System.out.println(deque);
        for (Integer integer : list) {
            System.out.println(deque);
            deque.push(integer);
        }
        System.out.println(deque);
    }
}

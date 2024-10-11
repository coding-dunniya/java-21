import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {

    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.addFirst(1);
        deque.offerFirst(12);
        deque.offerLast(77);
        deque.offerLast(333);

        CollectionUtils.printItems(deque);

        System.out.println("poll head: " + deque.pollFirst());
        System.out.println("remove tail: " + deque.removeLast());
    }
}

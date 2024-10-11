import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();

        // add items
        System.out.println("add 1: " + queue.add(1));
        System.out.println("add 11: " + queue.add(11));
        System.out.println("add -1: " + queue.add(-1));
        System.out.println("add -11: " + queue.add(-11));
        System.out.println("add 21: " + queue.add(21));
        System.out.println("add 77: " + queue.add(77));
        System.out.println("add -100: " + queue.add(-100));

        CollectionUtils.printItemsInQueue(queue);

        // store strings

        Queue<String> stringQueue = new PriorityQueue<>();

        // add items
        System.out.println("add ritesh: " + stringQueue.add("ritesh"));
        System.out.println("add india: " + stringQueue.add("india"));
        System.out.println("add america: " + stringQueue.add("america"));
        System.out.println("add europe: " + stringQueue.add("europe"));

        CollectionUtils.printItemsInQueue(stringQueue);
    }
}

import java.io.File;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // add items
        System.out.println("add 1: " + queue.add(1));
        System.out.println("add 2: " + queue.add(2));
        System.out.println("offer 22: " + queue.offer(22));
        System.out.println("offer 222: " + queue.offer(222));

        CollectionUtils.printItems(queue);
    }
}

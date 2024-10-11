import java.util.PriorityQueue;
import java.util.Queue;

public class UserQueueDemo {

    public static void main(String[] args) {
        Queue<User> queue = new PriorityQueue<>();
        queue.add(new User(1, "ritesh"));
        queue.add(new User(2, "ritesh"));
        queue.add(new User(3, "ritesh"));
        queue.add(new User(4, "ritesh"));

        CollectionUtils.printItemsInQueue(queue);
    }
}

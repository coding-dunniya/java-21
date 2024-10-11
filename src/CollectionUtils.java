import java.util.Collection;
import java.util.Map;
import java.util.Queue;

public class CollectionUtils {

    // print items in the collection
    public static void printItems(Collection<?> collection) {
        System.out.print("Collection is: ");
        for (Object obj : collection) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    // print items in the queue
    public static void printItemsInQueue(Queue<?> queue) {
        System.out.print("Queue is: ");
        while (!queue.isEmpty()) {
            Object obj = queue.poll();
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    // print map items
    public static void printMapItems(Map<?, ?> map) {
        System.out.println("Map is: " + map.toString());
    }
}

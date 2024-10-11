import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ListDemo {

    public static void main(String[] args) {
        List<String> list = new LinkedList<>();

        System.out.println("Size: " + list.size());
        System.out.println("isEmpty: " + list.isEmpty());

        // add items
        System.out.println("Add ritesh: " + list.add("ritesh"));
        System.out.println("Add India: " + list.add("India"));
        System.out.println("Add America: " + list.add("America"));
        System.out.println("Add ritesh again: " + list.add("ritesh"));

        System.out.println("Size: " + list.size());
        System.out.println("isEmpty: " + list.isEmpty());

        CollectionUtils.printItems(list);

        // remote items

        System.out.println("remove ritesh: " + list.remove("ritesh"));
        System.out.println("remove Ritesh: " + list.remove("Ritesh"));

        CollectionUtils.printItems(list);

        // search items
        System.out.println("contains India: " + list.contains("India"));

        // bulk operations
        List<String> newList = new LinkedList<>();
        newList.add("ritesh again");
        newList.add("India again");
        newList.add("China");

        System.out.println("addAll: " + list.addAll(newList));

        CollectionUtils.printItems(list);

        System.out.println("containsAll: " + list.containsAll(newList));
        System.out.println("removeAll: " + list.removeAll(newList));

        CollectionUtils.printItems(list);

        // positional access methods
        list.add(0, "America");
        list.set(1, "Europe");
        System.out.println("remove index 3: " + list.remove(3));

        CollectionUtils.printItems(list);
    }
}

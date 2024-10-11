import java.util.*;

public class SetDemo {

    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();

        System.out.println("Size: " + set.size());
        System.out.println("isEmpty: " + set.isEmpty());

        // add items

        System.out.println("add 1: " + set.add(1));
        System.out.println("add 2: " + set.add(2));
        System.out.println("add 3: " + set.add(3));
        System.out.println("add 4: " + set.add(4));
        System.out.println("add 55: " + set.add(55));
        System.out.println("add 66: " + set.add(66));

        // duplicate items are not allowed
        System.out.println("add 1: " + set.add(1));
        System.out.println("add 1: " + set.add(1));

        System.out.println("Size: " + set.size());
        System.out.println("isEmpty: " + set.isEmpty());

        CollectionUtils.printItems(set);

        // remove items
        System.out.println("remove 3: " + set.remove(3));
        System.out.println("remove 1000: " + set.remove(1000));

        CollectionUtils.printItems(set);

        // search items
        System.out.println("contains 55: " + set.contains(55));
        System.out.println("contains 777: " + set.contains(777));

        // bulk operations
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(77);

        System.out.println("addAll: " + set.addAll(list));

        CollectionUtils.printItems(set);

        set.clear();    // clear all items

        System.out.println("Size: " + set.size());
    }
}

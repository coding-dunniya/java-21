import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {

    public static void main(String[] args) {
        SortedSet<Integer> set = new TreeSet<>();

        System.out.println("add 1: " + set.add(1));
        System.out.println("add 21: " + set.add(21));
        System.out.println("add -21: " + set.add(-21));
        System.out.println("add 35: " + set.add(35));
        System.out.println("add 45: " + set.add(45));
        System.out.println("add 77: " + set.add(77));
        System.out.println("add -77: " + set.add(-77));
        System.out.println("add 1000: " + set.add(1000));
        System.out.println("add -1000: " + set.add(-1000));

        CollectionUtils.printItems(set);

        // duplicate items are not allowed
        System.out.println("add 77: " + set.add(77));

        CollectionUtils.printItems(set);
    }
}

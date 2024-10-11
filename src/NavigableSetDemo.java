import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetDemo {

    public static void main(String[] args) {
        NavigableSet<Integer> set = new TreeSet<>();

        System.out.println("add 1: " + set.add(1));
        System.out.println("add 2: " + set.add(2));
        System.out.println("add 3: " + set.add(3));
        System.out.println("add 4: " + set.add(4));
        System.out.println("add 5: " + set.add(5));
        System.out.println("add 6: " + set.add(6));
        System.out.println("add 7: " + set.add(7));
        System.out.println("add 8: " + set.add(8));
        System.out.println("add 9: " + set.add(9));
        System.out.println("add 10: " + set.add(10));

        CollectionUtils.printItems(set);

        System.out.println("lower 27: " + set.lower(27));
        System.out.println("floor 27: " + set.floor(27));
        System.out.println("floor 5: " + set.floor(5));

        System.out.println("higher -10: " + set.higher(-10));
        System.out.println("higher 3: " + set.higher(3));

        System.out.println("ceiling 3: " + set.ceiling(3));
        System.out.println("ceiling -10: " + set.ceiling(-10));
    }
}

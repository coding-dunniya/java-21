import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorDemo {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(1);
        set.add(11);
        set.add(111);
        set.add(112);
        set.add(113);
        set.add(1114);

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            int e = iterator.next();
            System.out.println("Element: " + e);
            iterator.remove();
        }
        System.out.println("size: " + set.size());

        for (int e : set) {
            // for each version of looping elements
        }
    }
}

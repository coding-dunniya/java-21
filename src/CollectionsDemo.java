import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(-1);
        list.add(-11);
        list.add(11);
        list.add(-21);
        list.add(-31);

        CollectionUtils.printItems(list);
        Collections.sort(list);

        CollectionUtils.printItems(list);

        System.out.println("min: " + Collections.min(list));
        System.out.println("max: " + Collections.max(list));

        int index = Collections.binarySearch(list, 11);
        System.out.println("index of 11 is: " + index);
    }
}

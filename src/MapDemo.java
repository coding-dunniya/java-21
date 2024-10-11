import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        // add items
        System.out.println("put 1: " + map.put(1, "ritesh"));
        System.out.println("put 2: " + map.put(2, "india"));
        System.out.println("put 3: " + map.put(3, "china"));
        System.out.println("put 4: " + map.put(4, "europe"));
        System.out.println("put 5: " + map.put(5, "america"));

        System.out.println("size: " + map.size());

        System.out.println("containsKey 7: " + map.containsKey(7));

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }

        Set<Integer> keys = map.keySet();
        CollectionUtils.printItems(keys);

        Collection<String> values = map.values();
        CollectionUtils.printItems(values);

        System.out.println("remove 11: " + map.remove(11));

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }

        System.out.println("isEmpty: " + map.isEmpty());

        System.out.println("putIfAbsent: " + map.putIfAbsent(2, "korea"));
        System.out.println("putIfAbsent: " + map.putIfAbsent(22, "korea"));

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }

        System.out.println("put 2 again: " + map.put(2, "south america"));

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }

        map.clear();

        Map<User, String> newMap = new HashMap<>();
        newMap.put(new User(1, "ritesh"), "india");
        newMap.put(new User(1, "john"), "america");

        for (Map.Entry<User, String> entry : newMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }
    }
}

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

    public static void main(String[] args) {
        Map<Integer, String> map = new LinkedHashMap<>();

        System.out.println("put 1: " + map.put(1, "ritesh"));
        System.out.println("put 2: " + map.put(2, "india"));
        System.out.println("put 3: " + map.put(3, "china"));
        System.out.println("put 4: " + map.put(4, "europe"));
        System.out.println("put 5: " + map.put(5, "america"));

        System.out.println(map);
    }
}

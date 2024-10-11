import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CustomClassDemo {

    public static void main(String[] args) {
        Set<User> set = new HashSet<>();

        System.out.println("add user 1: " + set.add(new User(1, "ritesh")));
        System.out.println("add user 2: " + set.add(new User(2, "mohit")));
        System.out.println("add user 3: " + set.add(new User(3, "ravi")));
        System.out.println("add user 1: " + set.add(new User(1, "john")));

        CollectionUtils.printItems(set);

        List<User> list = new ArrayList<>();
        System.out.println("add list user 1: " + list.add(new User(1, "ritesh")));
        System.out.println("add list user 2: " + list.add(new User(2, "mohit")));
        System.out.println("add list user 3: " + list.add(new User(3, "ravi")));
        System.out.println("add list user 1: " + list.add(new User(1, "john")));

        CollectionUtils.printItems(list);
    }
}

import java.util.Comparator;

// a comparator to compare user objects and sort them according to their ids
public class UserComparator implements Comparator<User> {

    // compare two user objects and return an int
    // if u1 is less than u2 return negative value
    // if u2 is less than u1 return positive value
    // if both are equal return 0
    @Override
    public int compare(User u1, User u2) {
        if (u1.getId() < u2.getId()) {
            return -1;
        }
        if (u2.getId() < u1.getId()) {
            return 1;
        }
        return 0;
    }
}

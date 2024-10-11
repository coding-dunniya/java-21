import java.util.Objects;

// the user class
// currently to sort user objects we need a comparator which is implemented in UserComparator class
// we could also implement Comparable here directly and then it makes user objects comparable with each other
// essentially the meaning of implementing Comparable by a class is to make objects of that class comparable with each other
// we need comparision when we need to sort objects
public class User {

    // the id of user
    private final int id;

    // the name of user
    private final String name;

    // constructor
    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // get value of id
    public int getId() {
        return id;
    }

    // get value of name
    public String getName() {
        return name;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof User)) {
            return false;
        }
        User that = (User) obj;
        return this.id == that.id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        return Objects.hash(this.id);
        // return this.id
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

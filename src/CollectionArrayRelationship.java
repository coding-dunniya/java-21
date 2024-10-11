import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// simple class to show collection to array conversion
public class CollectionArrayRelationship {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ritesh");
        list.add("India");
        list.add("China");

        Object[] objArr = list.toArray();
        // cast this to string array
        String[] strArr = new String[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            strArr[i] = objArr[i].toString();
        }

        // change element in array
        objArr[1] = "europe";
        // here collection is not changed only array is changed
        // we can test it by printing both array and collection
        CollectionUtils.printItems(list);
        System.out.println("Array: " + Arrays.toString(objArr));

        String[] arr = list.toArray(new String[0]);
        arr[1] = "korea";
        CollectionUtils.printItems(list);
        System.out.println("Array: " + Arrays.toString(arr));
    }
}

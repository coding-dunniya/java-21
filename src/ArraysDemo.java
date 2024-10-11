import java.util.Arrays;

public class ArraysDemo {

    public static void main(String[] args) {
        // create a new array
        int[] arr = new int[]{1, -1, 11, -11, -21, -31};

        Arrays.sort(arr);

        // the key doesn't exist --> index will be negative if we do index -(index + 1)
        // we will get the index where key should be inserted to keep the sorted order
        // if key exists ---> index is positive telling the index at which key exists
        int index = Arrays.binarySearch(arr, 111);
        System.out.println("index of 111: " + index);
    }
}

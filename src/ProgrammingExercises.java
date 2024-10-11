import java.util.*;

public class ProgrammingExercises {

    public static void main(String[] args) {
        fill2DArray();
    }

    // reverse list and print items
    private static void reverseListPrintItems() {
        List<String> list = new ArrayList<>();
        list.add("ritesh");
        list.add("India");
        list.add("America");

        // reverse list
        Collections.reverse(list);
        CollectionUtils.printItems(list);
    }

    // sort strings descending order
    private static void sortListDescendingOrder() {
        List<String> list = new ArrayList<>();
        list.add("ritesh");
        list.add("India");
        list.add("America");

        Collections.sort(list, Collections.reverseOrder());
        CollectionUtils.printItems(list);
    }

    // swap elements in list
    private static void swapElements() {
        List<String> list = new ArrayList<>();
        list.add("ritesh");
        list.add("India");
        list.add("America");
        list.add("korea");

        int i1 = 2, i2 = 3;
        String one = list.get(i1);
        String two = list.get(i2);

        list.set(i1, two);
        list.set(i2, one);

        CollectionUtils.printItems(list);
    }

    // tasks processing queue
    private static void tasksProcessingQueue() {
        Queue<Task> queue = new PriorityQueue<>(new Comparator<Task>() {
            @Override
            public int compare(Task o1, Task o2) {
                if (o1.priority() > o2.priority()) {
                    return -1;
                }
                if (o1.priority() < o2.priority()) {
                    return 1;
                }
                return 0;
            }
        });

        queue.add(new Task(1));
        queue.add(new Task(11));
        queue.add(new Task(7));
        queue.add(new Task(17));

        while (!queue.isEmpty()) {
            Task e = queue.poll();
            System.out.println("Task: " + e);
        }
    }

    // count characters
    private static void countCharacters() {
        String input = "Hello world, My name is ritesh. This is the best java course on Youtube";
        Map<Character, Integer> map = new HashMap<>();
        char[] arr = input.toCharArray();
        for (char c : arr) {
            if (map.containsKey(c)) {
                int count = map.get(c);
                map.put(c, count + 1);
            } else {
                map.put(c, 1);
            }
        }
        System.out.println(map);
    }

    // fill array
    private static void fill2DArray() {
        int[][] arr = new int[5][5];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = 1;
            }
        }

        for (int[] a : arr) {
            Arrays.fill(a, 1);
        }
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }
    }
}

// simple record Task
// task is simple data structure representing a task with a priority
record Task(int priority) {
}
